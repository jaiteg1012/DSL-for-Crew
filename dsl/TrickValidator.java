import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class TrickValidator {

    public static boolean validate(Trick trick,
                                   HashMap<String, HashMap<String, ArrayList<Expression>>> trickRules,
                                   HashMap<String, HashMap<String, Expression>> cardRules,
                                   HashMap<String, Integer> mustWins,
                                   int players) {
        String WT = "WT";
        String DWT = "DWT";
        String WC = "WC";
        String DWC = "DWC";


        if (trickRules.containsKey(trick.TrickNumber)) {
            HashMap<String, ArrayList<Expression>> trickMap = trickRules.get(trick.TrickNumber);
            if (trickMap.containsKey(WT)) {
                WT winTrick = (WT) trickMap.get(WT).get(0);
                if (((SetObject) winTrick.players).values.contains(trick.winner)) {
                    if (!winTrick.ordered) {
                        if (((SetObject) winTrick.cards).values.contains(trick.cardUsedToWin)) {
                            ((SetObject) winTrick.cards).values.remove(trick.cardUsedToWin);
                            //
                            if (((SetObject) winTrick.players).values.size() == 1) {
                                for (String player : ((SetObject) winTrick.players).values) {
                                    if (mustWins.containsKey(player)) {
                                        mustWins.put(player, mustWins.get(player) - 1);
                                    }
                                }
                            }
                            //
                            cardRules.get(trick.cardUsedToWin).remove(String.valueOf(winTrick.id));
                            ((SetObject) winTrick.tricks).values.remove(trick.TrickNumber);
                            if (((SetObject) winTrick.tricks).values.size() > ((SetObject) winTrick.cards).values.size()) {
                                System.out.println("Mission Failed: Rule " + winTrick.id + " failed during trick " + trick.TrickNumber);
                                return false;
                            }
                            if (((SetObject) winTrick.tricks).values.size() == 0) {
                                for (String win_card : ((SetObject) winTrick.cards).values) {
                                    if (cardRules.containsKey(win_card)) {
                                        cardRules.get(win_card).remove(String.valueOf(winTrick.id));
                                        if (cardRules.get(win_card).size() == 0) {
                                            cardRules.remove(win_card);
                                        }
                                    }
                                }
                            }

                        } else {
                            System.out.println("Mission Failed: Rule " + winTrick.id + " failed during trick " + trick.TrickNumber);
                            return false;
                        }
                    } else {
                        int pos = 0;
                        String card = null;

                        for (String t : ((SetObject) winTrick.tricks).values) {
                            if (t.equals(trick.TrickNumber)) {
                                break;
                            } else {
                                pos++;
                            }
                        }

                        for (String c : ((SetObject) winTrick.cards).values) {
                            if (pos == 0) {
                                card = c;
                                break;
                            }
                            pos--;
                        }

                        if (!card.equals(trick.cardUsedToWin)) {
                            System.out.println("Mission Failed: Rule " + winTrick.id + " failed during trick " + trick.TrickNumber);
                            return false;
                        }

                        ((SetObject) winTrick.tricks).values.remove(trick.TrickNumber);
                        ((SetObject) winTrick.cards).values.remove(trick.cardUsedToWin);
                        //
                        if (((SetObject) winTrick.players).values.size() == 1) {
                            for (String player : ((SetObject) winTrick.players).values) {
                                if (mustWins.containsKey(player)) {
                                    mustWins.put(player, mustWins.get(player) - 1);
                                }
                            }
                        }
                        //
                        cardRules.get(trick.cardUsedToWin).remove(String.valueOf(winTrick.id));
                        // no need to empty other potential cards????

                    }
                } else {
                    System.out.println("Mission Failed: Rule " + winTrick.id + " failed during trick " + trick.TrickNumber);
                    return false;
                }

            }

            if (trickMap.containsKey(DWT)) {
                ArrayList<Expression> dwts = trickMap.get(DWT);
                for (Expression dontWinTrick : dwts) {
                    DWT dwt = (DWT) dontWinTrick;
                    if (((SetObject) dwt.players).values.contains(trick.winner)) {
                        if (((SetObject) dwt.cards).values.contains(trick.cardUsedToWin)) {
                            System.out.println("Mission Failed: Rule " + dwt.id + " failed during trick " + trick.TrickNumber);
                            return false;
                        }
                    }
                    ((SetObject) dwt.tricks).values.remove(trick.TrickNumber);
                    if (((SetObject) dwt.tricks).values.size() == 0) {
                        for (String win_card : ((SetObject) dwt.cards).values) {
                            if (cardRules.containsKey(win_card)) {
                                cardRules.get(win_card).remove(String.valueOf(dwt.id));
                                if (cardRules.get(win_card).size() == 0) {
                                    cardRules.remove(win_card);
                                }
                            }
                        }

                    }
                }
            }

            if (trickMap.containsKey(WC)) {
                ArrayList<Expression> wcs = trickMap.get(WC);
                for (Expression winCards : wcs) {
                    WC wc = (WC) winCards;
                    if (wc.any == -1) {
                        for (String card : trick.cardsWon) {
                            if (((SetObject) wc.cards).values.contains(card)) {
                                if (((SetObject) wc.players).values.contains(trick.winner)) {
                                    ((SetObject) wc.cards).values.remove(card);
                                    //
                                    if (((SetObject) wc.players).values.size() == 1) {
                                        for (String player : ((SetObject) wc.players).values) {
                                            if (mustWins.containsKey(player)) {
                                                mustWins.put(player, mustWins.get(player) - 1);
                                            }
                                        }
                                    }
                                    //
                                    cardRules.get(card).remove(String.valueOf(wc.id));
                                } else {
                                    if (wc.id == -1) {
                                        String taskCard = "";
                                        for (String c : ((SetObject) wc.cards).values) {
                                            taskCard = c;
                                        }
                                        System.out.println("Mission Failed: " + trick.winner + " " +
                                                "was not supposed to win the task card " + taskCard);
                                    } else {
                                        System.out.println("Mission Failed: Rule " + wc.id + " failed during trick " + trick.TrickNumber);
                                    }
                                    return false;
                                }
                            }
                        }
                        ((SetObject) wc.tricks).values.remove(trick.TrickNumber);
                        if (Math.ceil(((SetObject) wc.cards).values.size() / (float) players) > ((SetObject) wc.tricks).values.size()) {
                            System.out.println("Mission Failed: Rule " + wc.id + " failed during trick " + trick.TrickNumber);
                            return false;
                        }

                    } else {
                        for (String card : trick.cardsWon) {
                            if (((SetObject) wc.cards).values.contains(card)) {
                                if (((SetObject) wc.players).values.contains(trick.winner)) {
                                    ((SetObject) wc.cards).values.remove(card);

                                    if (wc.any > 0) {
                                        wc.any--;
                                        //
                                        if (((SetObject) wc.players).values.size() == 1) {
                                            for (String player : ((SetObject) wc.players).values) {
                                                if (mustWins.containsKey(player)) {
                                                    mustWins.put(player, mustWins.get(player) - 1);
                                                }
                                            }
                                        }
                                        //
                                    } else {
                                        break;
                                    }
                                } //else {
//                                    System.out.println(trick.TrickNumber);
//                                    return false;
                                //}
                            }
                        }
                        ((SetObject) wc.tricks).values.remove(trick.TrickNumber);
                        if (wc.any > ((SetObject) wc.cards).values.size() || (((SetObject) wc.tricks).values.size() == 0 && wc.any > 0)) {
                            System.out.println("Mission Failed: Rule " + wc.id + " failed during trick " + trick.TrickNumber);
                            return false;
                        }

                        if (wc.any == 0) {
                            for (String win_card : ((SetObject) wc.cards).values) {
                                if (cardRules.containsKey(win_card)) {
                                    cardRules.get(win_card).remove(String.valueOf(wc.id));
                                    if (cardRules.get(win_card).size() == 0) {
                                        cardRules.remove(win_card);
                                    }
                                }
                            }
                        }

                    }
                }
            }

            if (trickMap.containsKey(DWC)) {
                ArrayList<Expression> dwcs = trickMap.get(DWC);
                for (Expression dontWinCards : dwcs) {
                    DWC dwc = (DWC) dontWinCards;
                    for (String card : trick.cardsWon) {
                        if (((SetObject) dwc.cards).values.contains(card)) {
                            if (((SetObject) dwc.players).values.contains(trick.winner)) {
                                System.out.println("Mission Failed: Rule " + dwc.id + " failed during trick " + trick.TrickNumber);
                                return false;
                            }
                        }
                    }
                    ((SetObject) dwc.tricks).values.remove(trick.TrickNumber);
                    if (((SetObject) dwc.tricks).values.size() == 0) {
                        for (String win_card : ((SetObject) dwc.cards).values) {
                            if (cardRules.containsKey(win_card)) {
                                cardRules.get(win_card).remove(String.valueOf(dwc.id));
                                if (cardRules.get(win_card).size() == 0) {
                                    cardRules.remove(win_card);
                                }
                            }
                        }

                    }
                }
            }
        }


        // handle any tricks and all the card stuff
        for (String card : trick.cardsWon) {
            if (cardRules.containsKey(card)) {
                HashMap<String, Expression> cardMap = cardRules.get(card);
                for (String ruleId : cardMap.keySet()) {
                    Expression r = cardMap.get(ruleId);
                    if (r instanceof WT) {
                        if (((WT) r).any == -1) {
                            if (!((WT) r).ordered) {
                                ((SetObject) ((WT) r).cards).values.remove(card);
                                if (((SetObject) ((WT) r).tricks).values.size() > ((SetObject) ((WT) r).cards).values.size()) {
                                    System.out.println("Mission Failed: Rule " + ((WT) r).id + " failed during trick " + trick.TrickNumber);
                                    return false;
                                }
                            } else {
                                System.out.println("Mission Failed: Rule " + ((WT) r).id + " failed during trick " + trick.TrickNumber);
                                return false; //since this rule exists, means that the player who was supposed to win
                                // the orderd trick didnt win
                            }
                        } else {
                            // handle any
                            // how are you going to handle order in here
                            // unlike WT, you will be visiting WAT for the first time, so check for players
                            if (!((WT) r).ordered) {
                                if (card.equals(trick.cardUsedToWin)) {
                                    if ((((SetObject) ((WT) r).players).values.contains(trick.winner) &&
                                            (((SetObject) ((WT) r).cards).values.contains(card)))) {
                                        if (((WT) r).any > 0) {
                                            ((WT) r).any--;
                                            //
                                            if (((SetObject) ((WT) r).players).values.size() == 1) {
                                                for (String player : ((SetObject) ((WT) r).players).values) {
                                                    if (mustWins.containsKey(player)) {
                                                        mustWins.put(player, mustWins.get(player) - 1);
                                                    }
                                                }
                                            }
                                            //
                                        }
                                    }
                                }

                                if ((((SetObject) ((WT) r).cards).values.contains(card))) {
                                    ((SetObject) ((WT) r).cards).values.remove(card);
                                    if (((WT) r).any > ((SetObject) ((WT) r).cards).values.size() ||
                                            ((WT) r).any > (40 / players) - Integer.parseInt(trick.TrickNumber)) {
                                        System.out.println("Mission Failed: Rule " + ((WT) r).id + " failed during trick " + trick.TrickNumber);
                                        return false;
                                    }
                                    if (((WT) r).any == 0) {
                                        // remove the rule from all the cards
                                        for (String any_card : ((SetObject) ((WT) r).cards).values) {
                                            if (cardRules.containsKey(any_card)) {
                                                cardRules.get(any_card).remove(String.valueOf(((WT) r).id));
                                                if (cardRules.get(any_card).size() == 0) {
                                                    cardRules.remove(any_card);
                                                }
                                            }
                                        }
                                    }
                                }

                            } else {
                                if (card.equals(trick.cardUsedToWin)) {
                                    if ((((SetObject) ((WT) r).players).values.contains(trick.winner) &&
                                            (((SetObject) ((WT) r).cards).values.contains(card)))) {
                                        String firstCard = "";
                                        for (String any_card : ((SetObject) ((WT) r).cards).values) {
                                            firstCard = any_card;
                                            break;
                                        }
                                        if (firstCard.equals(trick.cardUsedToWin)) {
                                            if (((WT) r).any > 0) {
                                                ((WT) r).any--;
                                                //
                                                if (((SetObject) ((WT) r).players).values.size() == 1) {
                                                    for (String player : ((SetObject) ((WT) r).players).values) {
                                                        if (mustWins.containsKey(player)) {
                                                            mustWins.put(player, mustWins.get(player) - 1);
                                                        }
                                                    }
                                                }
                                                //
                                            }
                                            ((SetObject) ((WT) r).cards).values.remove(trick.cardUsedToWin);
                                            if (((WT) r).any > ((SetObject) ((WT) r).cards).values.size() ||
                                                    ((WT) r).any > 40 / players - Integer.parseInt(trick.TrickNumber)) {
                                                System.out.println("Mission Failed: Rule " + ((WT) r).id + " failed during trick " + trick.TrickNumber);
                                                return false;
                                            }

                                        } else {
                                            System.out.println("Mission Failed: Rule " + ((WT) r).id + " failed during trick " + trick.TrickNumber);
                                            return false;
                                        }
                                    }
                                } else if (((SetObject) ((WT) r).cards).values.contains(card)) {
                                    System.out.println("Mission Failed: Rule " + ((WT) r).id + " failed during trick " + trick.TrickNumber);
                                    return false;
                                }
                                //Since for ordered rule card length = x, if any becomes 0 all the cards
                                // have already been taken care of
//                                    if (((WT) r).any == 0) {
//                                        // remove the rule from all the cards
//                                        for (String any_card : ((SetObject) ((WT) r).cards).values) {
//                                            if (cardRules.containsKey(any_card)) {
//                                                cardRules.get(any_card).remove(String.valueOf(((WT) r).id));
//                                                if (cardRules.get(any_card).size() == 0) {
//                                                    cardRules.remove(any_card);
//                                                }
//                                            }
//                                        }
//                                    }

                            }


                        }
                    } else if (r instanceof WC) {
                        //some other player or the same player needed to win the card in a future trick
                        if (((WC) r).any == -1) {
                            if (((WC) r).id == -1) {
                                String taskCard = "";
                                for (String c : ((SetObject) ((WC) r).cards).values) {
                                    taskCard = c;
                                }
                                System.out.println("Mission Failed: " + trick.winner + " " +
                                        "was not supposed to win the task card " + taskCard);
                            } else {
                                System.out.println("Mission Failed: Rule " + ((WC) r).id + " failed during trick " + trick.TrickNumber);
                            }
                            return false;
                        } else {
                            LinkedHashSet<String> c = ((SetObject) ((WC) r).cards).values;
                            c.remove(card);
                            if (((WC) r).any > c.size()) {
                                System.out.println("Mission Failed: Rule " + ((WC) r).id + " failed during trick " + trick.TrickNumber);
                                return false;
                            }
                        }
                    } else if (r instanceof DWT) {
                        ((SetObject) ((DWT) r).cards).values.remove(card);
                    } else if (r instanceof DWC) {
                        ((SetObject) ((DWC) r).cards).values.remove(card);
                    }
                }
                // you need all of the not win rules satisfied as well, so cant return just yet
                cardRules.remove(card);
                // you need all of the not win rules satisfied as well, so cant return just yet without
                //checking if the other cards are not taken yet. How to check if notWin rules still exist?
                //I think add them to cards as well
                // you need to know if the cards are no longer there then you can exit
                if (cardRules.size() == 0) {
                    return true;
                }
            }
        }
        if (cardRules.size() == 0) {
            return true;
        }


//what if the limit win rule is not yet satisfied, need to go the distance
        return true;
    }


}




