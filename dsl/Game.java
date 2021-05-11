import java.util.*;

public class Game {

    Mission mission;
    LinkedHashMap<String, Player> players;
    LinkedHashSet<String> numberedTaskCards;
    LinkedHashSet<String> flexTaskCards;
    LinkedHashSet<String> noTokenTaskCards;
    HashMap<String, ArrayList<String>> orderTaskCards;
    String lastTask;
    String commander;

    public Game(Mission mission) {
        players = new LinkedHashMap<>();
        this.mission = mission;
        int numPlayers = this.mission.players;

        ArrayList<String> suits = new ArrayList<>(Arrays.asList("B", "G", "P", "R", "Y"));
        ArrayList<String> cards = new ArrayList<>();
        ArrayList<String> taskCards = new ArrayList<>();

        for (String suit : suits) {
            for (int i = 1; i <= 9; i++) {
                if (suit.equals("R") && i >= 5) {
                    continue;
                }
                if (!suit.equals("R")) {
                    taskCards.add(suit + i);
                }
                cards.add(suit + i);
            }
        }
        Collections.shuffle(cards);
        Collections.shuffle(taskCards);

        //-------debug--------
//        System.out.println(cards);
//        System.out.println(taskCards);
        //-------debug--------


        int start = 0;
        int end = 0;
        for (int i = 1; i <= numPlayers; i++) {
            end += 40 / numPlayers;
            if (i == numPlayers && i == 3) {
                players.put("Player" + i, new Player("Player" + i, new LinkedHashSet<>(cards.subList(start, end + 1))));
            } else {
                players.put("Player" + i, new Player("Player" + i, new LinkedHashSet<>(cards.subList(start, end))));
            }
            if (players.get("Player" + i).cards.contains("R4")) {
                commander = "Player" + i;
            }
            start = end;
        }

        //------debug---------
        for (String p : players.keySet()) {
            System.out.println(p + " Cards: " + players.get(p).cards);
        }
        //------debug---------

        System.out.println(commander + " is the Commander\n");

        int numTaskCards = mission.tasks;
        int nSwaps = mission.nSwap;
        int nSwitch = mission.nSwitch;

        // All players have cards Now


        //Lets distribute the task cards

        //first see if there are tokens
        LinkedHashSet<String> taskCardsSet = null;
        orderTaskCards = null;
        ArrayList<String> tokens;
        Scanner sc = new Scanner(System.in);
        if (mission.tasks > 0) {
            if (mission.tokens != null) {
                orderTaskCards = new LinkedHashMap<>();
                tokens = new ArrayList<>(((SetObject) mission.tokens).values);
                tokens.sort(new TokenComparator());
                for (int i = 0; i < numTaskCards; i++) {
                    if (i < tokens.size()) {
                        orderTaskCards.put(taskCards.get(i), new ArrayList<>(List.of(tokens.get(i), "")));
                    } else {
                        orderTaskCards.put(taskCards.get(i), new ArrayList<>(List.of("", "")));
                    }
                }
                while (nSwaps > 0) {
                    //in the game, maybe just let the commander take care of this
                    System.out.println("Task Cards:");
                    for (String c : orderTaskCards.keySet()) {
                        ArrayList<String> lis = orderTaskCards.get(c);
                        String token = lis.get(0);
                        System.out.println("Task Card: " + c + " " + "Token: " +
                                token);
                    }
                    boolean validInput = false;
                    while (!validInput) {
                        System.out.println("Enter the task cards whose tokens you want to swap or hit return to skip");
                        String cardsToSwap = sc.nextLine().trim();
                        if (cardsToSwap.equals("")) {
                            nSwaps = 0;
                            break;

                        }
                        String[] toSwap = cardsToSwap.split("\\s+");
                        if (toSwap.length != 2) {
                            System.out.println("Error: Please Enter valid task cards");
                        } else {
                            String card1 = toSwap[0];
                            String card2 = toSwap[1];
                            if ((orderTaskCards.containsKey(card1) && orderTaskCards.containsKey(card2) &&
                                    (!orderTaskCards.get(card1).get(0).equals("") && !orderTaskCards.get(card2).get(0).equals("")))
                                    && !card1.equals(card2)) {
                                validInput = true;
                                String tempToken1 = orderTaskCards.get(card1).get(0);
                                String tempToken2 = orderTaskCards.get(card2).get(0);
                                orderTaskCards.get(card1).set(0, tempToken2);
                                orderTaskCards.get(card2).set(0, tempToken1);
                                nSwaps--;
                            } else {
                                if (card1.equals(card2) && orderTaskCards.containsKey(card1)) {
                                    System.out.println("Error: Duplicate cards detected. Please enter two unique task cards " +
                                            "whose tokens you want to swap");
                                } else {
                                    System.out.println("Error: Please Enter valid task cards");
                                }
                            }
                        }
                    }

                }
                if (tokens.size() < numTaskCards) {
                    while (nSwitch > 0) {
                        //in the game, maybe just let the commander take care of this
                        System.out.println("Task Cards:");
                        for (String c : orderTaskCards.keySet()) {
                            ArrayList<String> lis = orderTaskCards.get(c);
                            String token = lis.get(0);
                            System.out.println("Task Card: " + c + " " + "Token: " +
                                    token);
                        }
                        boolean validInput = false;
                        while (!validInput) {
                            System.out.println("Enter the task cards , one with a token and one without, whose tokens you want to switch or hit return to skip");
                            String cardsToSwap = sc.nextLine().trim();
                            if (cardsToSwap.equals("")) {
                                nSwitch = 0;
                                break;
                            }
                            String[] toSwap = cardsToSwap.split("\\s+");
                            if (toSwap.length != 2) {
                                System.out.println("Error: Please Enter valid task cards");
                            } else {
                                String card1 = toSwap[0];
                                String card2 = toSwap[1];
                                if (((orderTaskCards.containsKey(card1) && orderTaskCards.containsKey(card2)) &&
                                        (orderTaskCards.get(card1).get(0).equals("") && !orderTaskCards.get(card2).get(0).equals("") ||
                                                !orderTaskCards.get(card1).get(0).equals("") && orderTaskCards.get(card2).get(0).equals("")))
                                        && !card1.equals(card2)) {
                                    validInput = true;
                                    String tempToken1 = orderTaskCards.get(card1).get(0);
                                    String tempToken2 = orderTaskCards.get(card2).get(0);
                                    orderTaskCards.get(card1).set(0, tempToken2);
                                    orderTaskCards.get(card2).set(0, tempToken1);
                                    nSwitch--;

                                } else {
                                    if (card1.equals(card2) && orderTaskCards.containsKey(card1)) {
                                        System.out.println("Error: Duplicate cards detected. Please enter two unique task cards " +
                                                "whose tokens you want to swap");
                                    } else if ((orderTaskCards.containsKey(card1) && orderTaskCards.containsKey(card2)) &&
                                            ((!orderTaskCards.get(card1).get(0).equals("") && !orderTaskCards.get(card2).get(0).equals("")) ||
                                                    (orderTaskCards.get(card1).get(0).equals("") && orderTaskCards.get(card2).get(0).equals("")))) {
                                        System.out.println("Error: Both task cards already have a token or both don't have a token");
                                    } else {
                                        System.out.println("Error: Enter valid cards");
                                    }
                                }
                            }

                        }

                    }
                }


            } else {
                taskCardsSet = new LinkedHashSet<>(taskCards.subList(0, numTaskCards));
            }

            //distribute task cards to players

            //normal distribution: Commander picks first, then the player next to him and so on until no task cards left
            LinkedHashSet<String> newTaskCards = null;
            if (mission.distribution.equals("n")) {
                System.out.println("Task cards are distributed normally");
                int i = Integer.parseInt(String.valueOf(commander.charAt(6)));
                if (orderTaskCards == null) {
                    newTaskCards = new LinkedHashSet<>();
                }
                while (numTaskCards != 0) {
                    boolean validInput = false;
                    while (!validInput) {
                        if (orderTaskCards != null) {
                            //print task cards
                            System.out.println("Task Cards:");
                            for (String c : orderTaskCards.keySet()) {
                                ArrayList<String> lis = orderTaskCards.get(c);
                                String token = lis.get(0);
                                String player = lis.get(1);
                                System.out.println("Task Card: " + c + " " + "Token: " +
                                        token + " " + "Player: " + player);
                            }
                            System.out.println("Player" + i + " pick a task card");
                            System.out.println("Your cards: \n" + players.get("Player" + i).cards);
                            String taskCardChosen = sc.nextLine().trim();
                            if (!orderTaskCards.containsKey(taskCardChosen)) {
                                System.out.println("Error: Choose a valid task card");
                            } else {
                                if (orderTaskCards.get(taskCardChosen).get(1).equals("")) {
                                    players.get("Player" + i).tasks.add(taskCardChosen);
                                    orderTaskCards.get(taskCardChosen).set(1, "Player" + i);
                                    validInput = true;
                                    i++;
                                    if (i > numPlayers) {
                                        i = 1;
                                    }
                                } else {
                                    System.out.println("Error: This task card has already been chosen by " +
                                            orderTaskCards.get(taskCardChosen).get(1));
                                }
                            }

                        } else {
                            System.out.println("Task Cards: \n" + taskCardsSet);
                            System.out.println("Player" + i + "  pick a task card");
                            System.out.println("Your cards: \n" + players.get("Player" + i).cards);
                            String taskCardChosen = sc.nextLine().trim();
                            if (!taskCardsSet.contains(taskCardChosen)) {
                                System.out.println("Error: Choose a valid task card \n");
                            } else {
                                players.get("Player" + i).tasks.add(taskCardChosen);
                                newTaskCards.add(taskCardChosen);
                                taskCardsSet.remove(taskCardChosen);
                                validInput = true;
                                i++;
                                if (i > numPlayers) {
                                    i = 1;

                                }
                            }
                        }
                    }
                    numTaskCards--;
                    System.out.println();

                }
                taskCardsSet = newTaskCards;


            } else if (mission.distribution.equals("cde")) {
                System.out.println("Commander decides which players get task cards. A task card is revealed and players respond with yes or no");
                Set<String> iterate;
                if (orderTaskCards != null) {
                    iterate = orderTaskCards.keySet();
                } else {
                    iterate = taskCardsSet;
                }
                boolean valid = false;
                while (!valid) {
                    for (String taskCard : iterate) {
                        if (orderTaskCards != null) {
                            System.out.println("Task Card: " + taskCard + " " + "Token: " + orderTaskCards.get(taskCard).get(0));
                        } else {
                            System.out.println("Task Card: " + taskCard);
                        }
                        HashMap<String, String> PlayerChoices = new HashMap<>();
                        for (int i = 1; i <= numPlayers; i++) {
                            boolean validInput = false;
                            if (!commander.equals("Player" + i)) {
                                while (!validInput) {
                                    if (!commander.equals("Player" + i)) {
                                        System.out.println("Player" + i + " are you up for this task?");
                                        System.out.println("Your cards: " + players.get("Player" + i).cards);
                                        System.out.println("Respond only with a yes or no");
                                        String playerChoice = sc.nextLine().trim();
                                        if (playerChoice.equals("yes") || playerChoice.equals("no")) {
                                            validInput = true;
                                            PlayerChoices.put("Player" + i, playerChoice);
                                        } else {
                                            System.out.println("Error: Provide a valid input");
                                        }
                                    }
                                }
                            }
                        }
                        System.out.println("Commander" + " (" + commander + ") " + "decide who gets the task");
                        System.out.println("Your cards: " + players.get(commander).cards);
                        if (orderTaskCards != null) {
                            System.out.println("Player choices for " + "Task Card: " + taskCard + " " + "Token: " + orderTaskCards.get(taskCard).get(0));
                        } else {
                            System.out.println("Player choices for " + "Task Card: " + taskCard);
                        }
                        for (String p : PlayerChoices.keySet()) {
                            System.out.println("Player: " + p + " " + "Choice: " + PlayerChoices.get(p));
                        }

                        System.out.println("Enter the player who you want to take up the task");
                        boolean validInput = false;
                        while (!validInput) {
                            String chosenPlayer = sc.nextLine().trim();
                            if (chosenPlayer.length() == 7 && Character.isDigit(chosenPlayer.charAt(6))) {
                                int playerNum = Integer.parseInt(String.valueOf(chosenPlayer.charAt(6)));
                                if (chosenPlayer.startsWith("Player") &&
                                        (playerNum > 0 && playerNum <= numPlayers)) {
                                    validInput = true;
                                    players.get(chosenPlayer).tasks.add(taskCard);
                                    if (orderTaskCards != null) {
                                        orderTaskCards.get(taskCard).set(1, chosenPlayer);
                                    }
                                } else {
                                    System.out.println("Error: Enter a valid player");
                                }
                            } else {
                                System.out.println("Error: Enter a valid player");
                            }
                        }
                    }


                    //check if cards are evenly distributed
                    int max = -1;
                    int min = -1;
                    for (String p : players.keySet()) {
                        int length = players.get(p).tasks.size();
                        if (length >= max) {
                            int temp_max = max;
                            max = length;
                            if (min == -1 || min > temp_max) {
                                min = temp_max;
                            }
                        } else if (min > length) {
                            min = length;
                        }
                    }
                    if (max - min > 1) {
                        boolean input = false;
                        while (!input) {
                            System.out.println("Task cards not evenly distributed. Type redo to redo the distribution or hit return to continue");
                            String choice = sc.nextLine().trim();
                            if (choice.equals("redo")) {
                                input = true;
                                for (Player p : players.values()) {
                                    p.tasks.clear();
                                }
                            } else if (!choice.equals("")) {
                                System.out.println("Error: enter a valid input");
                            } else {
                                input = true;
                                valid = true;
                            }

                        }
                    } else {
                        valid = true;
                    }
                }

                //commander decides the individual that gets all the task cards
            } else {
                System.out.println("Commander decides which player gets all the task cards");
                HashMap<String, String> PlayerChoices = new HashMap<>();
                for (int i = 1; i <= numPlayers; i++) {
                    boolean validInput = false;
                    if (!commander.equals("Player" + i)) {
                        while (!validInput) {
                            System.out.println("Player" + i + " are you up for the tasks?");
                            System.out.println("Your cards: " + players.get("Player" + i).cards);
                            System.out.println("Respond only with a yes or no");
                            String playerChoice = sc.nextLine().trim();
                            if (playerChoice.equals("yes") || playerChoice.equals("no")) {
                                validInput = true;
                                PlayerChoices.put("Player" + i, playerChoice);
                            } else {
                                System.out.println("Error: Provide a valid input");
                            }

                        }
                    }
                }
                System.out.println("Commander" + " (" + commander + ") " + "decide who gets the tasks");
                System.out.println("Player Choices:");
                for (String p : PlayerChoices.keySet()) {
                    System.out.println("Player: " + p + " " + "Choice: " + PlayerChoices.get(p));
                }
                String chosenPlayer = "";
                boolean validInput = false;
                while (!validInput) {
                    chosenPlayer = sc.nextLine().trim();
                    if (chosenPlayer.length() == 7 && Character.isDigit(chosenPlayer.charAt(6))) {
                        int playerNum = Integer.parseInt(String.valueOf(chosenPlayer.charAt(6)));
                        if ((chosenPlayer.startsWith("Player") &&
                                (playerNum > 0 && playerNum <= numPlayers)) && !chosenPlayer.equals(commander)) {
                            validInput = true;
                        } else {
                            System.out.println("Error: Enter a valid player");
                        }
                    } else {
                        System.out.println("Error: Enter a valid player");
                    }
                }
                Set<String> taskCardsToAdd;
                if (orderTaskCards != null) {
                    taskCardsToAdd = orderTaskCards.keySet();
                } else {
                    taskCardsToAdd = taskCardsSet;
                }
                players.get(chosenPlayer).tasks.addAll(taskCardsToAdd);

            }
        }

        //----------debug------------
//        for (String p : players.keySet()) {
//            System.out.println(p + " Tasks " + players.get(p).tasks);
//        }
        //----------debug------------

        //sub in players for rules
        HashMap<String, String> PlayerChoices = null;
        if (((mission.constraints_distribution.equals("cde") || mission.constraints_distribution.equals("pd")) || mission.constraints_distribution.equals("cdwi")) && mission.rules.size() > 0) {
            if (mission.constraints_distribution.equals("pd")) {
                System.out.println("Players decide who gets the rules together. Feel free to communicate with each other." +
                        " When players are done deciding, the commander assigns rules to players according to the decisions made");
            } else if (mission.constraints_distribution.equals("cde")) {
                System.out.println("Commander decides who gets the rule with input from players.");
                PlayerChoices = new HashMap<>();
            } else {
                System.out.println("Commander decides who gets the rule without input from players.");
            }

            HashMap<String, String> placeHolderToPlayerMap = null;
            for (Expression rule : mission.rules) {
                System.out.println(rule);
                int any = 0;
                int id = 0;
                LinkedHashSet<String> rulePlayers = null;
                if (rule instanceof WT) {
                    any = ((WT) rule).playerAny;
                    if (((WT) rule).players != null) {
                        rulePlayers = ((SetObject) ((WT) rule).players).values;
                    }
                    id = ((WT) rule).id;
                } else if (rule instanceof DWT) {
                    any = ((DWT) rule).playerAny;
                    if (((DWT) rule).players != null) {
                        rulePlayers = ((SetObject) ((DWT) rule).players).values;
                    }
                    id = ((DWT) rule).id;
                } else if (rule instanceof WC) {
                    any = ((WC) rule).playerAny;
                    if (((WC) rule).players != null) {
                        rulePlayers = ((SetObject) ((WC) rule).players).values;
                    }
                    id = ((WC) rule).id;
                } else if (rule instanceof DWC) {
                    any = ((DWC) rule).playerAny;
                    if (((DWC) rule).players != null) {
                        rulePlayers = ((SetObject) ((DWC) rule).players).values;
                    }
                    id = ((DWC) rule).id;
                } else if (rule instanceof WR) {
                    any = ((WR) rule).playersAny;
                    if (((WR) rule).players != null) {
                        rulePlayers = ((SetObject) ((WR) rule).players).values;
                    }
                    id = ((WR) rule).id;

                } else if (rule instanceof CommunicationRule) {
                    any = ((CommunicationRule) rule).playersAny;
                    if (((CommunicationRule) rule).players != null) {
                        rulePlayers = ((SetObject) ((CommunicationRule) rule).players).values;
                    }
                    id = ((CommunicationRule) rule).id;

                }

                if (any != 0) {
                    LinkedHashSet<String> newPlayers = new LinkedHashSet<>();
                    if (any == -1 && rulePlayers != null) {
                        if (rulePlayers.size() != numPlayers) {
                            for (String pl : rulePlayers) {
                                if (pl.startsWith("Player")) {
                                    if (placeHolderToPlayerMap == null) {
                                        placeHolderToPlayerMap = new HashMap<>();
                                    }
                                    if (!placeHolderToPlayerMap.containsKey(pl)) {
                                        if (placeHolderToPlayerMap.keySet().size() == mission.players) {
                                            System.out.println("Error: No players left to map placeholder " + pl + " to (Rule " + id + ")");
                                            continue;
                                        }
                                        MapPlaceHolderToPlayer(pl, placeHolderToPlayerMap, PlayerChoices, sc);
                                    }
                                    newPlayers.add(placeHolderToPlayerMap.get(pl));
                                } else {
                                    if (pl.length() == 2) {
                                        for (String p : this.players.keySet()) {
                                            if (this.players.get(p).cards.contains(pl)) {
                                                newPlayers.add(p);
                                                break;
                                            }
                                        }
                                    } else {
                                        newPlayers.add(cardDirSub(new ArrayList<>(players.keySet()), pl));
                                    }
                                }

                            }
                        } else {
                            newPlayers = rulePlayers;
                        }

                    } else {
                        boolean valid = false;
                        if (any > numPlayers) {
                            System.out.println("Warning: any players > total players, any players changed from " + any + " to " + newPlayers + "(Rule " + id + ")");
                            any = numPlayers;
                        }
                        if (mission.constraints_distribution.equals("cde")) {
                            for (int i = 1; i <= numPlayers; i++) {
                                boolean validInput = false;
                                if (!commander.equals("Player" + i)) {
                                    while (!validInput) {
                                        System.out.println("Player" + i + " are you up for the rule " + rule + " ?");
                                        System.out.println("Your cards: " + players.get("Player" + i).cards);
                                        System.out.println("Respond only with a yes or no");
                                        String playerChoice = sc.nextLine().trim();
                                        if (playerChoice.equals("yes") || playerChoice.equals("no")) {
                                            validInput = true;
                                            PlayerChoices.put("Player" + i, playerChoice);
                                        } else {
                                            System.out.println("Error: Provide a valid input");
                                        }

                                    }
                                }
                            }
                        }
                        while (!valid) {
                            System.out.println("Commander" + " (" + commander + ") " + "who gets the rule " + rule + " ? ");
                            if (mission.constraints_distribution.equals("cde")) {
                                System.out.println("Player Choices: ");
                                for (String p : PlayerChoices.keySet()) {
                                    System.out.println("Player: " + p + " " + "Choice: " + PlayerChoices.get(p));
                                }

                            }

                            System.out.println("Commander" + " (" + commander + ") " + "enter " + any + " players that you want to assign " + rule);
                            String chosenPlayers = sc.nextLine().trim();
                            String[] plrs = chosenPlayers.split("\\s+");
                            if (plrs.length == any) {
                                for (String p : plrs) {
                                    if (p.length() == 7 && Character.isDigit(p.charAt(6))) {
                                        int playerNum = Integer.parseInt(String.valueOf(p.charAt(6)));
                                        if ((p.startsWith("Player") &&
                                                (playerNum > 0 && playerNum <= numPlayers))) {
                                            if (!newPlayers.contains(p)) {
                                                newPlayers.add(p);
                                            } else {
                                                newPlayers.clear();
                                                System.out.println("Error: Duplicate players detected. Provide unique players");
                                                break;
                                            }
                                        } else {
                                            System.out.println("Error: Provide valid players");
                                            newPlayers.clear();
                                            break;
                                        }
                                    } else {
                                        System.out.println("Error: Provide valid players");
                                        newPlayers.clear();
                                        break;
                                    }
                                }
                                if (newPlayers.size() == any) {
                                    valid = true;
                                }
                            } else {
                                System.out.println("Error: Provide " + any + " players");
                            }
                        }
                    }
                    SetObject newPlayerSet = new SetObject(new ArrayList<>(newPlayers), "player");
                    if (rule instanceof WT) {
                        ((WT) rule).players = newPlayerSet;
                        ((WT) rule).playerAny = -1;

                    } else if (rule instanceof DWT) {
                        ((DWT) rule).players = newPlayerSet;
                        ((DWT) rule).playerAny = -1;

                    } else if (rule instanceof WC) {
                        ((WC) rule).players = newPlayerSet;
                        ((WC) rule).playerAny = -1;

                    } else if (rule instanceof DWC) {
                        ((DWC) rule).players = newPlayerSet;
                        ((DWC) rule).playerAny = -1;

                    } else if (rule instanceof WR) {
                        ((WR) rule).players = newPlayerSet;
                        ((WR) rule).playersAny = -1;

                    } else if (rule instanceof CommunicationRule) {
                        ((CommunicationRule) rule).players = newPlayerSet;
                        ((CommunicationRule) rule).playersAny = -1;
                    }

                }
                System.out.println("updated rule: " + rule);
            }


        }
        //rules are distributed
        //assign task cards
//        System.out.println(mission.tasks);
        if (mission.tasks > 0) {
            if (orderTaskCards != null) {
                TokenComparator compare = new TokenComparator();

                Comparator<Map.Entry<String, ArrayList<String>>> tokenMapComp =
                        (e1, e2) -> {
                            String s1 = e1.getValue().get(0);
                            String s2 = e2.getValue().get(0);
                            return compare.compare(s1, s2);
                        };

                ArrayList<Map.Entry<String, ArrayList<String>>> sortedOrderTokens = new ArrayList<>(orderTaskCards.entrySet());
                sortedOrderTokens.sort(tokenMapComp);
                for (Map.Entry<String, ArrayList<String>> pair : sortedOrderTokens) {
                    if (pair.getValue().get(0).equals("")) {
                        if (noTokenTaskCards == null) {
                            noTokenTaskCards = new LinkedHashSet<>();
                        }
                        noTokenTaskCards.add(pair.getKey());
                    } else if (pair.getValue().get(0).charAt(0) == 'x') {
                        if (flexTaskCards == null) {
                            flexTaskCards = new LinkedHashSet<>();
                        }
                        if (pair.getValue().get(0).equals("xx")) {
                            lastTask = pair.getKey();
                        }
                        flexTaskCards.add(pair.getKey());
                    } else {
                        if (numberedTaskCards == null) {
                            numberedTaskCards = new LinkedHashSet<>();
                        }
                        numberedTaskCards.add(pair.getKey());
                    }
                }


            }


            LinkedHashSet<String> tricks = ExpressionSolver.complement(new LinkedHashSet<>(), "trick", numPlayers);
            SetObject trick = new SetObject(new ArrayList<>(tricks), "trick");
            Set<String> iterate;
            if (orderTaskCards != null) {
                iterate = orderTaskCards.keySet();
            } else {
                iterate = taskCardsSet;
            }
            for (String tc : iterate) {
                String player = null;
                for (Player p : players.values()) {
                    if (p.tasks.contains(tc)) {
                        player = p.playerID;
                        break;
                    }
                }
                SetObject c = new SetObject(new ArrayList<>(List.of(tc)), "card");
                SetObject players = new SetObject(new ArrayList<>(List.of(player)), "player");
                WC wc = new WC(-1, c, trick, players, -1);
                wc.id = -1;
                System.out.println(wc);
                mission.rules.add(wc);
            }
        }
    }

    public void MapPlaceHolderToPlayer(String PlaceHolder, HashMap<String, String> PlaceHolderToPlayer,
                                       HashMap<String, String> PlayerChoices, Scanner sc) {

        if (mission.constraints_distribution.equals("cde")) {
            for (int i = 1; i <= this.mission.players; i++) {
                boolean validInput = false;
                if (!commander.equals("Player" + i)) {
                    while (!validInput) {
                        System.out.println("Player" + i + " are you up for the rules for the place holder " + PlaceHolder + " ?");
                        System.out.println("Your cards: " + players.get("Player" + i).cards);
                        System.out.println("Respond only with a yes or no");
                        String playerChoice = sc.nextLine().trim();
                        if (playerChoice.equals("yes") || playerChoice.equals("no")) {
                            validInput = true;
                            PlayerChoices.put("Player" + i, playerChoice);
                        } else {
                            System.out.println("Error: Provide a valid input");
                        }

                    }
                }
            }
        }
        System.out.println("Commander" + " (" + commander + ") " + "who gets the rules for " + PlaceHolder + "?");
        if (mission.constraints_distribution.equals("cde")) {
            System.out.println("Player Choices: ");
            for (String p : PlayerChoices.keySet()) {
                System.out.println("Player: " + p + " " + "Choice: " + PlayerChoices.get(p));
            }
        }
        boolean validInput = false;
        while (!validInput) {
            String chosenPlayer = sc.nextLine().trim();
            if (chosenPlayer.length() == 7 && Character.isDigit(chosenPlayer.charAt(6))) {
                int playerNum = Integer.parseInt(String.valueOf(chosenPlayer.charAt(6)));
                if ((chosenPlayer.startsWith("Player") &&
                        (playerNum > 0 && playerNum <= this.mission.players))) {
                    if (PlaceHolderToPlayer.containsValue(chosenPlayer)) {
                        String err = "";
                        for (String plr : PlaceHolderToPlayer.keySet()) {
                            if (PlaceHolderToPlayer.get(plr).equals(chosenPlayer)) {
                                err = plr;
                                break;
                            }
                        }
                        System.out.println("Error:" + chosenPlayer + " has already gotten the rules for "
                                + err + ". Choose a different player.");
                    } else {
                        validInput = true;
                        PlaceHolderToPlayer.put(PlaceHolder, chosenPlayer);
                    }
                } else {
                    System.out.println("Error: Enter a valid player");
                }
            } else {
                System.out.println("Error: Enter a valid player");
            }

        }
    }

    public String cardDirSub(ArrayList<String> players, String cardDir) {
        String card = cardDir.substring(0, 2);
        String direction = cardDir.substring(3);
        String plr = "";
        for (String player : this.players.keySet()) {
            if (this.players.get(player).cards.contains(card)) {
                plr = player;
                break;
            }
        }
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).equals(plr)) {
                if (direction.equals("left")) {
                    if (i - 1 >= 0) {
                        return players.get(i - 1);
                    } else {
                        return players.get(players.size() - 1);
                    }
                } else {
                    if (i + 1 < players.size()) {
                        return players.get(i + 1);
                    } else {
                        return players.get(0);
                    }
                }
            }
        }
        return plr;
    }

}

