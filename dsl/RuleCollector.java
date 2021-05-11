import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

//handle ordered WT, by checking the first item in Trick and Card : if they are the same
//handle ordered WAT, by checking the first item in CArd, and if that is the way the trick is won

public class RuleCollector {
    HashMap<String, HashMap<String, ArrayList<Expression>>> trickRuleCol;
    HashMap<String, HashMap<String, Expression>> cardRuleCol;
    HashMap<String, HashMap<String, String>> comRule;
    HashMap<String, String> drawCardRule;
    HashMap<String, Expression> winsRule;
    HashMap<String, Integer> mustWins;
    String WT = "WT";
    String DWT = "DWT";
    String WC = "WC";
    String DWC = "DWC";
    HashSet<String> WCtracker;
    HashSet<String> wtTrickTacker;

    public RuleCollector(ArrayList<Expression> rules) {
        trickRuleCol = new HashMap<>();
        cardRuleCol = new HashMap<>();
        comRule = new HashMap<>();
        drawCardRule = new HashMap<>();
        winsRule = new HashMap<>();
        mustWins = new HashMap<>();
        WCtracker = new HashSet<>();
        wtTrickTacker = new HashSet<>();

        for (Expression rule : rules) {
            ruleHandler(rule);
        }

    }


    private void ruleHandler(Expression rule) {
        if (rule instanceof WT) {
            if (((WT) rule).any == -1) {
                for (String trick : ((SetObject) ((WT) rule).tricks).values) {
                    if (wtTrickTacker.contains(trick)) {
                        System.out.println("Warning: Rule " + ((WT) rule).id + " " + "ignored. " + trick + " already has a win trick rule ");
                        return;
                    }
                }
                wtTrickTacker.addAll(((SetObject) ((WT) rule).tricks).values);
                for (String trick : ((SetObject) ((WT) rule).tricks).values) {
                    if (!trickRuleCol.containsKey(trick)) {
                        trickRuleCol.put(trick, new HashMap<>());
                    }
                    HashMap<String, ArrayList<Expression>> trick_map = trickRuleCol.get(trick);
                    if (!trick_map.containsKey(WT)) {
                        ArrayList<Expression> new_list = new ArrayList<>();
                        new_list.add(rule);
                        trick_map.put(WT, new_list);
                    }

                }
                if (((SetObject) ((WT) rule).players).values.size() == 1) {
                    for (String Player : ((SetObject) ((WT) rule).players).values) {
                        int wins;
                        if (((WT) rule).any != -1) {
                            wins = ((WT) rule).any;
                        } else {
                            wins = ((SetObject) ((WT) rule).tricks).values.size();
                        }
                        if (mustWins.containsKey(Player)) {
                            mustWins.put(Player, mustWins.get(Player) + wins);
                        } else {
                            mustWins.put(Player, wins);
                        }
                    }
                }
            } else {
                for (String card : ((SetObject) ((WT) rule).cards).values) {
                    if (!cardRuleCol.containsKey(card)) {
                        cardRuleCol.put(card, new HashMap<>());
                    }
                    HashMap<String, Expression> card_map = cardRuleCol.get(card);

                    card_map.put(String.valueOf(((WT) rule).id), rule);
                }
            }
        } else if (rule instanceof DWT) {
            for (String trick : ((SetObject) ((DWT) rule).tricks).values) {
                if (!trickRuleCol.containsKey(trick)) {
                    trickRuleCol.put(trick, new HashMap<>());
                }
                HashMap<String, ArrayList<Expression>> trick_map = trickRuleCol.get(trick);
                if (!trick_map.containsKey(DWT)) {
                    ArrayList<Expression> new_list = new ArrayList<>();
                    new_list.add(rule);
                    trick_map.put(DWT, new_list);

                } else {
                    trick_map.get(DWT).add(rule);
                }
            }


        } else if (rule instanceof WC) {
            if (((WC) rule).any == -1) {
                for (String card : ((SetObject) ((WC) rule).cards).values) {
                    if (WCtracker.contains(card)) {
                        System.out.println("Warning: Rule " + ((WC) rule).id + " " + "ignored. " + card + " already has a win card rule");
                        return;
                    }
                }
                WCtracker.addAll(((SetObject) ((WC) rule).cards).values);
            }
            for (String trick : ((SetObject) ((WC) rule).tricks).values) {
                if (!trickRuleCol.containsKey(trick)) {
                    trickRuleCol.put(trick, new HashMap<>());
                }
                HashMap<String, ArrayList<Expression>> trick_map = trickRuleCol.get(trick);
                if (!trick_map.containsKey(WC)) {
                    ArrayList<Expression> new_list = new ArrayList<>();
                    new_list.add(rule);
                    trick_map.put(WC, new_list);

                } else {
                    trick_map.get(WC).add(rule);
                }
            }
            if (((SetObject) ((WC) rule).players).values.size() == 1) {
                for (String Player : ((SetObject) ((WC) rule).players).values) {
                    int wins;
                    if (((WC) rule).any != -1) {
                        wins = ((WC) rule).any;
                    } else {
                        wins = ((SetObject) ((WC) rule).cards).values.size();
                    }
                    if (mustWins.containsKey(Player)) {
                        mustWins.put(Player, mustWins.get(Player) + wins);
                    } else {
                        mustWins.put(Player, wins);
                    }
                }
            }
        } else if (rule instanceof DWC) {
            for (String trick : ((SetObject) ((DWC) rule).tricks).values) {
                if (!trickRuleCol.containsKey(trick)) {
                    trickRuleCol.put(trick, new HashMap<>());
                }
                HashMap<String, ArrayList<Expression>> trick_map = trickRuleCol.get(trick);
                if (!trick_map.containsKey(DWC)) {
                    ArrayList<Expression> new_list = new ArrayList<>();
                    new_list.add(rule);
                    trick_map.put(DWC, new_list);

                } else {
                    trick_map.get(DWC).add(rule);
                }
            }


        } else if ((rule instanceof CommunicationRule || rule instanceof WR) || rule instanceof DrawCardRule) {
            if (rule instanceof CommunicationRule) {
                for (String player : ((SetObject) ((CommunicationRule) rule).players).values) {
                    if (!comRule.containsKey(player)) {
                        comRule.put(player, new HashMap<>());
                    }
                    HashMap<String, String> playerComMap = comRule.get(player);
                    for (String trick : ((SetObject) ((CommunicationRule) rule).tricks).values) {
                        if (!playerComMap.containsKey(trick)) {
                            playerComMap.put(trick, ((CommunicationRule) rule).operation);
                        } else {
                            System.out.println("Warning: Rule " + ((CommunicationRule) rule).id + " " + "ignored. " + player + " already has a communication rule on trick " + trick);
                        }
                    }
                }
            } else if (rule instanceof WR) {
                for (String player : ((SetObject) ((WR) rule).players).values) {
                    if (!winsRule.containsKey(player)) {
                        winsRule.put(player, rule);
                    } else {
                        System.out.println("Warning: Rule " + ((WR) rule).id + " " + "ignored. " + player + " already has a win rule ");
                    }
                }
            } else {
                for (String trick : ((SetObject) ((DrawCardRule) rule).tricks).values) {
                    if (!drawCardRule.containsKey(trick)) {
                        drawCardRule.put(trick, ((DrawCardRule) rule).operation);
                    } else {
                        System.out.println("Warning: Rule " + ((DrawCardRule) rule).id + " " + "ignored. Trick " + trick + "already has a draw card rule");
                    }
                }
            }
        }
        if (!(rule instanceof WT) || ((WT) rule).any == -1) {
            LinkedHashSet<String> cards = null;
            if (rule instanceof WT) {
                cards = ((SetObject) ((WT) rule).cards).values;
            } else if (rule instanceof WC) {
                cards = ((SetObject) ((WC) rule).cards).values;
            } else if (rule instanceof DWT) {
                cards = ((SetObject) ((DWT) rule).cards).values;
            } else if (rule instanceof DWC) {
                cards = ((SetObject) ((DWC) rule).cards).values;
            }
            if (cards != null) {
                for (String card : cards) {
                    if (!cardRuleCol.containsKey(card)) {
                        cardRuleCol.put(card, new HashMap<>());
                    }
                    if (rule instanceof WT) {
                        cardRuleCol.get(card).put(String.valueOf(((WT) rule).id), rule);
                    } else if (rule instanceof WC) {
                        cardRuleCol.get(card).put(String.valueOf(((WC) rule).id), rule);
                    } else if (rule instanceof DWT) {
                        cardRuleCol.get(card).put(String.valueOf(((DWT) rule).id), rule);
                    } else {
                        cardRuleCol.get(card).put(String.valueOf(((DWC) rule).id), rule);
                    }
                }
            }
        }


    }

}
