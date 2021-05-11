import java.util.*;

public class PlayableMission {
    Game game;
    RuleCollector rc;

    public PlayableMission(Game game, RuleCollector rc) {
        this.game = game;
        this.rc = rc;
    }

    public boolean play() {
        ArrayList<String> players = new ArrayList<>(game.players.keySet());
        int maxTrick = 40 / game.mission.players;
        String trickStarter = game.commander;
        int trickStarterIndex = 0;
        for (int j = 0; j < players.size(); j++) {
            if (players.get(j).equals(trickStarter)) {
                trickStarterIndex = j;
                break;
            }
        }

        HashMap<String, String> taskCardMap = null;
        if (this.game.mission.tasks > 0 && this.game.orderTaskCards == null) {
            taskCardMap = new HashMap<>();
            for (String player : this.game.players.keySet()) {
                LinkedHashSet<String> taskCards = this.game.players.get(player).tasks;
                for (String taskCard : taskCards) {
                    taskCardMap.put(taskCard, player);
                }
            }
        }


        Scanner sc = new Scanner(System.in);

        if (game.mission.distress_signal.equals("on")) {
            System.out.println("Do you want to use the Distress Signal?");
            System.out.println("Players decide collectively and then the commander inputs the decision reached");
            boolean valid = false;
            while (!valid) {
                System.out.println("Commander type in the direction (left or right) if players wish to " +
                        "use the Distress Signal, otherwise hit return to not use it");
                String decision = sc.nextLine().trim();
                if (decision.equals("left") || decision.equals("right")) {
                    DistressSignal(decision, players, sc);
                    valid = true;
                } else if (decision.equals("")) {
                    valid = true;
                    System.out.println("Distress Signal not used");
                } else {
                    System.out.println("Error: Provide a valid input");
                }
            }
        }

        HashSet<String> tokens = null;
        if (game.mission.tokens != null) {
            tokens = new HashSet<>();
            if (game.numberedTaskCards != null) {
                tokens.addAll(game.numberedTaskCards);
            }
            if (game.flexTaskCards != null) {
                tokens.addAll(game.flexTaskCards);
            }
            if (game.noTokenTaskCards != null) {
                tokens.addAll(game.noTokenTaskCards);
            }
        }

        int maxWins = 0;
        int minWins = 0;
        HashMap<String, Integer> wins = new HashMap<>();
        for (String player : players) {
            wins.put(player, 0);
        }
        Trick results = null;

        HashMap<String, ArrayList<String>> CommunicatedCards = new HashMap<>();

        for (int trick = 1; trick <= maxTrick; trick++) {
            if (rc.drawCardRule.containsKey(String.valueOf(trick))) {
                String operation = rc.drawCardRule.get(String.valueOf(trick));
                if (operation.equals("DCR")) {
                    System.out.println("Drawing cards to the right....");
                } else {
                    System.out.println("Drawing cards to the left....");
                }
                DrawCard(operation, players);
            }

            //communicateCards
            askToCommunicateCards(players, CommunicatedCards, sc, trick);
            System.out.println("Starting trick " + trick + "\n");

            System.out.println(trickStarter + " your turn to start the trick" + "\n");
            displayInfo(taskCardMap, CommunicatedCards, results);
            System.out.println("Your cards: " + game.players.get(trickStarter).cards + "\n");

            //Player who starts the trick, picks a card
            boolean validInput = false;
            String cardChosen = "";
            while (!validInput) {
                System.out.println("Choose a card");
                cardChosen = sc.nextLine().trim();
                if (!game.players.get(trickStarter).cards.contains(cardChosen)) {
                    System.out.println("Error: Pick a valid card");
                } else {
                    validInput = true;
                    game.players.get(trickStarter).cards.remove(cardChosen);
                }
            }
            char suitOfTrick = cardChosen.charAt(0);
            LinkedHashMap<String, String> cardsPlayed = new LinkedHashMap<>();
            cardsPlayed.put(cardChosen, trickStarter);
            int traverse = trickStarterIndex + 1;

            //Players play a card
            System.out.println("********************\n");
            while (traverse != trickStarterIndex) {
                if (traverse >= players.size()) {
                    if (trickStarterIndex == 0) {
                        break;
                    } else {
                        traverse = 0;
                    }
                }
                String player = players.get(traverse);
                displayInfoDuringTrick(player, trick, cardsPlayed, suitOfTrick, taskCardMap, CommunicatedCards, results);

                validInput = false;

                while (!validInput) {
                    System.out.println("Choose a card");
                    cardChosen = sc.nextLine().trim();
                    validInput = validateCard(cardChosen, game.players.get(player).cards, suitOfTrick);
                    if (!validInput) {
                        System.out.println("Error: Pick a valid card");
                    } else {
                        game.players.get(player).cards.remove(cardChosen);
                    }
                }
                cardsPlayed.put(cardChosen, player);
                System.out.println("********************\n");
                traverse++;
            }
            //trick is evaluated
            results = PlayTrick(cardsPlayed, suitOfTrick, trick);
            trickStarter = results.winner;

            for (int j = 0; j < players.size(); j++) {
                if (players.get(j).equals(trickStarter)) {
                    trickStarterIndex = j;
                    break;
                }
            }


            //check if rules are met, and update mustWins
            boolean rulesMet = true;
            if (this.rc.cardRuleCol.size() != 0) {
                rulesMet = TrickValidator.validate(results, this.rc.trickRuleCol, this.rc.cardRuleCol, this.rc.mustWins, this.game.mission.players);
            }
            if (!rulesMet) {
                return false;
            }

            System.out.println(results.winner + " won trick " + trick + " and won cards " + results.cardsWon);

            if (tokens != null) {
                if (!validTokens(results, tokens, taskCardMap)) {
                    System.out.println("Mission Failed: Task cards won out of order");
                    sc.close();
                    return false;
                }
            }
            wins.put(results.winner, wins.get(results.winner) + 1);
            maxWins = Math.max(maxWins, wins.get(results.winner));
            minWins = Collections.min(wins.values());

            //Check if wins limit is met
            boolean checkWins = checkWins(maxWins, minWins, maxTrick, trick, results, wins);
            if (!checkWins) {
                return false;
            }


            //if rules met, no card rules left && no win rule, mission accomplished
            if (rc.cardRuleCol.size() == 0 && rc.winsRule.size() == 0) {
                sc.close();
                System.out.println("Mission Accomplished!!!!");
                return true;
            }

        }

        System.out.println("Mission Accomplished!!!!");
        return true;
    }

    public void displayInfoDuringTrick(String player, int trick, HashMap<String, String> cardsPlayed, char suitOfTrick,
                                       HashMap<String, String> taskCardMap, HashMap<String,
            ArrayList<String>> CommunicatedCards, Trick results) {
        System.out.println("Your turn to play a card " + player + "\n");
        displayInfo(taskCardMap, CommunicatedCards, results);
        System.out.println("Suit of the trick: " + suitOfTrick + "\n");
        System.out.println("Cards played so far during trick " + trick + "\n");
        for (String cardPlayed : cardsPlayed.keySet()) {
            System.out.println("Player: " + cardsPlayed.get(cardPlayed) + " " + "Card: " + cardPlayed);
        }
        System.out.println();
        System.out.println("Your cards: " + game.players.get(player).cards + "\n");

    }

    public boolean checkWins(int maxWins, int minWins, int maxTrick, int trick, Trick results, HashMap<String, Integer> wins) {
        for (String player : wins.keySet()) {
            int mustWinsLeft = 0;
            if (rc.mustWins.containsKey(player)) {
                mustWinsLeft = rc.mustWins.get(player);
            }
            int currWins = wins.get(player);
            if (rc.winsRule.containsKey(player)) {
                WR winRule = (WR) rc.winsRule.get(player);
                Expression eq = winRule.equation;
                if (eq instanceof Num && player.equals(results.winner)) {
                    int w = Integer.parseInt(((Num) eq).num);
                    if (winRule.equality.equals("=")) {
                        if (currWins + mustWinsLeft > w || currWins + maxTrick - trick < w) {
                            System.out.println("Mission Failed: " + player + " failed wins constraints");
                            return false;
                        }
                    } else if (winRule.equality.equals("<")) {
                        if (currWins + mustWinsLeft >= w) {
                            System.out.println("Mission Failed: " + player + " failed wins constraints");
                            return false;
                        }
                    } else if (winRule.equality.equals("<=")) {
                        if (currWins + mustWinsLeft > w) {
                            System.out.println("Mission Failed: " + player + " failed wins constraints");
                            return false;
                        }
                    } else if (winRule.equality.equals(">")) {
                        if (currWins + maxTrick - trick <= w) {
                            System.out.println("Mission Failed: " + player + " failed wins constraints");
                            return false;
                        }
                    } else if (winRule.equality.equals(">=")) {
                        if (currWins + maxTrick - trick < w) {
                            System.out.println("Mission Failed: " + player + " failed wins constraints");
                            return false;
                        }
                    }
                } else if (eq instanceof Equation) {
                    int w = ExpressionSolver.EquationSolver(eq, maxWins, minWins);
                    if (winRule.equality.equals("=")) {
                        if (currWins != w) {
                            System.out.println("Mission Failed: " + player + " failed wins constraints");
                            return false;
                        }
                    } else if (winRule.equality.equals("<")) {
                        if (currWins >= w) {
                            System.out.println("Mission Failed: " + player + " failed wins constraints");
                            return false;
                        }

                    } else if (winRule.equality.equals("<=")) {
                        if (currWins > w) {
                            System.out.println("Mission Failed: " + player + " failed wins constraints");
                            return false;
                        }
                    } else if (winRule.equality.equals(">")) {
                        if (currWins <= w) {
                            System.out.println("Mission Failed: " + player + " failed wins constraints");
                            return false;
                        }
                    } else if (winRule.equality.equals(">=")) {
                        if (currWins < w) {
                            System.out.println("Mission Failed: " + player + " failed wins constraints");
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public void askToCommunicateCards(ArrayList<String> players, HashMap<String,
            ArrayList<String>> CommunicatedCards, Scanner sc, int trick) {
        for (String player : players) {
            if (!game.players.get(player).ComUsed) {
                String op = "C";
                if (rc.comRule.containsKey(player)) {
                    if (rc.comRule.get(player).containsKey(String.valueOf(trick))) {
                        op = rc.comRule.get(player).get((String.valueOf(trick)));
                    }
                }
                if (!op.equals("NC")) {
                    boolean valid = false;
                    while (!valid) {
                        System.out.println(player + " choose a card to communicate. If you don't want to communicate a " +
                                "card at this time, hit return");
                        System.out.println("Your cards: " + this.game.players.get(player).cards);
                        String response = sc.nextLine().trim();
                        if (response.equals("")) {
                            System.out.println("No card communicated\n");
                            valid = true;
                        } else if (game.players.get(player).cards.contains(response)) {
                            if (response.charAt(0) == 'R') {
                                System.out.println("Error: Rocket cards cannot be communicated");
                            } else if (!CommunicateCard(response, game.players.get(player).cards, CommunicatedCards, player, op)) {
                                System.out.println("Error: " + "Communicated card not the highest/lowest/only card of its suit");
                            } else {
                                valid = true;
                                System.out.println(response + " communicated\n");
                                game.players.get(player).ComUsed = true;
                            }
                        } else {
                            System.out.println("Error: Please provide a valid response.");
                        }
                    }
                }
            }
        }

    }

    public void displayInfo(HashMap<String, String> taskCardMap, HashMap<String, ArrayList<String>> CommunicatedCards, Trick results) {
        PrintTaskCards(taskCardMap);
        System.out.println();
        PrintCommunicatedCards(CommunicatedCards);
        if (results != null) {
            System.out.println();
            System.out.println("Previous Trick: " + results.winner + " won trick " + results.TrickNumber + " and won cards " + results.cardsWon);
        }
        System.out.println();
    }

    public void PrintCommunicatedCards(HashMap<String, ArrayList<String>> CommunicatedCards) {
        System.out.println("Communicated Cards: ");
        for (String player : CommunicatedCards.keySet()) {
            String info = CommunicatedCards.get(player).get(0);
            String card = CommunicatedCards.get(player).get(1);
            if (this.game.players.get(player).cards.contains(card)) {
                System.out.println("Player: " + player + "   Card: " + card + "   Info: " + info);
            } else {
                CommunicatedCards.remove(player);
            }
        }
    }

    public boolean CommunicateCard(String card, LinkedHashSet<String> cards,
                                   HashMap<String, ArrayList<String>> CommunicatedCards, String player, String op) {
        boolean only = true;
        boolean lowest = true;
        boolean highest = true;
        int val_card = Integer.parseInt(String.valueOf(card.charAt(1)));
        char suit_card = card.charAt(0);
        for (String c : cards) {
            if (!c.equals(card) && c.charAt(0) == suit_card) {
                only = false;
                int c_val = Integer.parseInt(String.valueOf(c.charAt(1)));
                if (c_val > val_card) {
                    highest = false;
                } else if (c_val < val_card) {
                    lowest = false;
                }
            }
        }
        if (!CommunicatedCards.containsKey(player) && ((only || lowest) || highest)) {
            if (op.equals("C")) {
                if (only) {
                    CommunicatedCards.put(player, new ArrayList<>(List.of("only", card)));
                } else if (lowest) {
                    CommunicatedCards.put(player, new ArrayList<>(List.of("lowest", card)));
                } else {
                    CommunicatedCards.put(player, new ArrayList<>(List.of("highest", card)));
                }
            } else {
                CommunicatedCards.put(player, new ArrayList<>(List.of("", card)));
            }
            return true;
        }
        return false;
    }


    public boolean validTokens(Trick trick, HashSet<String> tokens, HashMap<String, String> taskCardMap) {
        HashSet<String> taskCardsWon = new HashSet<>();
        for (String card : trick.cardsWon) {
            if (tokens.contains(card)) {
                taskCardsWon.add(card);
            }
        }

        LinkedHashSet<String> numTaskCards = this.game.numberedTaskCards;
        LinkedHashSet<String> flexTaskCards = this.game.flexTaskCards;
        LinkedHashSet<String> noTokenTaskCards = this.game.noTokenTaskCards;
        HashMap<String, ArrayList<String>> orderTaskCards = this.game.orderTaskCards;


        if ((numTaskCards != null && numTaskCards.size() > 0) && taskCardsWon.size() > 0) {
            int matches = 0;
            ArrayList<String> cardsToDelete = new ArrayList<>();
            for (String card : numTaskCards) {
                if (!taskCardsWon.contains(card)) {
                    break;
                }
                matches++;
                cardsToDelete.add(card);
            }

            if (matches == taskCardsWon.size() || matches == numTaskCards.size()) {
                numTaskCards.removeAll(cardsToDelete);
                taskCardsWon.removeAll(cardsToDelete);
                if (taskCardMap != null) {
                    taskCardMap.keySet().removeAll(cardsToDelete);
                } else {
                    orderTaskCards.keySet().removeAll(cardsToDelete);
                }
            } else {
                return false;
            }

        }
        if ((flexTaskCards != null && flexTaskCards.size() > 0) && taskCardsWon.size() > 0) {
            ArrayList<String> cardsToDelete = new ArrayList<>();
            for (String card : flexTaskCards) {
                if (!taskCardsWon.contains(card)) {
                    break;
                }
                if (this.game.lastTask.equals(card) && (noTokenTaskCards != null && noTokenTaskCards.size() > 0)) {
                    return false;
                }
                cardsToDelete.add(card);
            }

            flexTaskCards.removeAll(cardsToDelete);
            taskCardsWon.removeAll(cardsToDelete);
            if (taskCardMap != null) {
                taskCardMap.keySet().removeAll(cardsToDelete);
            } else {
                orderTaskCards.keySet().removeAll(cardsToDelete);
            }
            for (String card : flexTaskCards) {
                if (taskCardsWon.contains(card)) {
                    return false;
                }
            }
        }
        if ((noTokenTaskCards != null && noTokenTaskCards.size() > 0) && taskCardsWon.size() > 0) {
            for (String card : taskCardsWon) {
                noTokenTaskCards.remove(card);
                if (taskCardMap != null) {
                    taskCardMap.remove(card);
                } else {
                    orderTaskCards.remove(card);
                }
            }
        }
        return true;
    }

    public boolean validateCard(String card, LinkedHashSet<String> cards, char suit) {
        if (cards.contains(card)) {
            if (card.charAt(0) != suit) {
                for (String c : cards) {
                    if (c.charAt(0) == suit) {
                        return false;
                    }
                }
            }
            return true;

        }
        return false;
    }


    public Trick PlayTrick(HashMap<String, String> cardsPlayed, char suitOfTrick, int trick) {
        char suit = suitOfTrick;
        int val = 0;
        for (String cards : cardsPlayed.keySet()) {
            int cardVal = Integer.parseInt(String.valueOf(cards.charAt(1)));
            if (cards.charAt(0) == suit && cardVal > val) {
                val = cardVal;
            } else if (cards.charAt(0) == 'R' && suit != 'R') {
                val = cardVal;
                suit = 'R';
            }
        }
        String cardUsedToWin = String.valueOf(suit) + val;
        String winner = cardsPlayed.get(cardUsedToWin);
        cardsPlayed.remove(cardUsedToWin);
        ArrayList<String> cardsPlayedList = new ArrayList<>(cardsPlayed.keySet());
        cardsPlayedList.add(0, cardUsedToWin);
        System.out.println(trick + " " + winner + " " + cardsPlayedList + " " + cardUsedToWin);
        return new Trick(String.valueOf(trick), winner, cardsPlayedList, cardUsedToWin);
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public void DrawCard(String operation, ArrayList<String> players) {
        ArrayList<String> cardsDrawn = new ArrayList<>();
        for (String player : players) {
            int rand = getRandomNumber(0, this.game.players.get(player).cards.size());
            int i = 0;
            for (String card : this.game.players.get(player).cards) {
                if (i == rand) {
                    cardsDrawn.add(card);
                    break;
                }
                i++;
            }
            this.game.players.get(player).cards.remove(cardsDrawn.get(cardsDrawn.size() - 1));
        }
        if (operation.equals("DCL")) {
            for (int i = 1; i < players.size(); i++) {
                this.game.players.get(players.get(i - 1)).cards.add(cardsDrawn.get(i));
            }
            this.game.players.get(players.get(players.size() - 1)).cards.add(cardsDrawn.get(0));

        } else {
            for (int i = 0; i < players.size() - 1; i++) {
                this.game.players.get(players.get(i + 1)).cards.add(cardsDrawn.get(i));
            }
            this.game.players.get(players.get(0)).cards.add(cardsDrawn.get(cardsDrawn.size() - 1));
        }

        //------debug--------//
        System.out.println("//------debug--------//");
        System.out.println("Randomly Drawn Cards: " + cardsDrawn);
        System.out.println("Player Layout: " + players);
        for (String player : this.game.players.keySet()) {
            System.out.println(player + "Cards: " + this.game.players.get(player).cards);
        }
        System.out.println("//------debug--------//");
        //------debug--------//

    }

    public void DistressSignal(String direction, ArrayList<String> players, Scanner sc) {
        ArrayList<String> cardsToDistribute = new ArrayList<>();
        boolean valid;
        for (String player : players) {
            valid = false;
            while (!valid) {
                System.out.println(player + " choose the card you want to pass on to your neighbor on the " + direction);
                System.out.println("Your cards: " + this.game.players.get(player).cards);
                String cardChosen = sc.nextLine().trim();
                if (this.game.players.get(player).cards.contains(cardChosen) && cardChosen.charAt(0) != 'R') {
                    valid = true;
                    this.game.players.get(player).cards.remove(cardChosen);
                    cardsToDistribute.add(cardChosen);
                } else {
                    if (cardChosen.length() == 2 && cardChosen.charAt(0) == 'R') {
                        System.out.println("Error: Rocket cards cannot be passed");
                    } else {
                        System.out.println("Error: Pick a valid card");
                    }
                }
            }
        }
        if (direction.equals("right")) {
            for (int i = 0; i < players.size() - 1; i++) {
                this.game.players.get(players.get(i + 1)).cards.add(cardsToDistribute.get(i));
            }
            this.game.players.get(players.get(0)).cards.add(cardsToDistribute.get(cardsToDistribute.size() - 1));
        } else {
            for (int i = 1; i < players.size(); i++) {
                this.game.players.get(players.get(i - 1)).cards.add(cardsToDistribute.get(i));
            }
            this.game.players.get(players.get(players.size() - 1)).cards.add(cardsToDistribute.get(0));
        }
        System.out.println("cardsToDistribute:" + cardsToDistribute);
        for (String Player : players) {
            System.out.println(Player + " " + this.game.players.get(Player).cards);
        }
        //------debug--------//
        System.out.println("//------debug--------//");
        System.out.println("CardsToDistribute: " + cardsToDistribute);
        System.out.println("Player Layout: " + players);
        for (String player : this.game.players.keySet()) {
            System.out.println(player + "Cards: " + this.game.players.get(player).cards);
        }
        System.out.println("//------debug--------//");
        //------debug--------//
    }

    public void PrintTaskCards(HashMap<String, String> taskCards) {
        if (this.game.mission.tasks > 0) {
            if (this.game.orderTaskCards != null) {
                System.out.println("Task Cards: ");
                for (String tc : this.game.orderTaskCards.keySet()) {
                    ArrayList<String> lis = this.game.orderTaskCards.get(tc);
                    String token = lis.get(0);
                    String player = lis.get(1);
                    System.out.println("Task Card: " + tc + "   " + "Token: " +
                            token + "   " + "Player: " + player);
                }
            } else {
                for (String tc : taskCards.keySet()) {
                    System.out.println(("Task Card: " + tc + "   " + "Player: " + taskCards.get(tc)));
                }
            }
        }
    }
}
