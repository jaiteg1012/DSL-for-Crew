import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class ExpressionSolver {
    public ArrayList<Expression> expressions;
    public HashMap<String, VarDeclaration> variables;
    public int players;
    public ArrayList<String> errors;

    public ExpressionSolver(ArrayList<Expression> expressions) {
        this.expressions = expressions;
        this.variables = new HashMap<>();
        this.errors = new ArrayList<>();
    }

    public ArrayList<Mission> solver() {
        ArrayList<Mission> missions = new ArrayList<>();
        for (Expression expression : this.expressions) {
            if (expression instanceof VarDeclaration) {
                VarDeclaration dec = (VarDeclaration) expression;
                if (dec.type.equals("var")) {
                    Var lookupVar = (Var) dec.varContents;
                    String type = variables.get(lookupVar.id).type;
                    Expression contents = variables.get(lookupVar.id).varContents;
                    dec.type = type;
                    dec.varContents = contents;
                }
                variables.put(dec.varName, dec);
            } else if (expression instanceof Mission) {
                Mission mission = (Mission) expression;
                mission.tokens = SetExpressionSolver(mission.tokens);
                players = mission.players;
                for (int i = 0; i < mission.rules.size(); i++) {
                    Expression rule = mission.rules.get(i);
                    if (rule instanceof WT) {
                        ((WT) rule).id = i;

                    } else if (rule instanceof WC) {
                        ((WC) rule).id = i;
                    } else if (rule instanceof DWC) {
                        ((DWC) rule).id = i;
                    } else if (rule instanceof DWT) {
                        ((DWT) rule).id = i;
                    } else if (rule instanceof WR) {
                        ((WR) rule).id = i;
                    } else if (rule instanceof CommunicationRule) {
                        ((CommunicationRule) rule).id = i;
                    } else if (rule instanceof DrawCardRule) {
                        ((DrawCardRule) rule).id = i;
                    }
                    mission.rules.set(i, RuleSub(rule));
                }
                missions.add((Mission) expression);
            } //else {
//                System.out.println(expression);
//                System.out.println(SetExpressionSolver(expression));
//            }
        }
//        System.out.println(variables);
        return missions;
    }

    public Expression RuleSub(Expression e) {
        ArrayList<String> allPlayers = new ArrayList<>(Arrays.asList("Player1", "Player2", "Player3", "Player4",
                "Player5"));

        if (e instanceof WT) {
            if (((WT) e).all) {
                ((WT) e).tricks = new SetObject(new ArrayList<>(), "trick");
                ((SetObject) ((WT) e).tricks).values = complement(((SetObject) ((WT) e).tricks).values, "trick", players);
            } else if (((WT) e).tricks != null) {
                ((WT) e).tricks = SetExpressionSolver(((WT) e).tricks);
                validateTrick(((SetObject) ((WT) e).tricks).values);
            }
            if (((WT) e).cards == null) {
                ((WT) e).cards = new SetObject(new ArrayList<>(), "card");
                ((SetObject) ((WT) e).cards).values = complement(((SetObject) ((WT) e).cards).values, "card", players);
            } else {
                ((WT) e).cards = SetExpressionSolver(((WT) e).cards);
            }
            if (((WT) e).players == null && ((WT) e).playerAny == -1) {
                ((WT) e).players = new SetObject(new ArrayList<>(allPlayers.subList(0, players)), "player");
            } else if (((WT) e).players != null) {
                ((WT) e).players = SetExpressionSolver(((WT) e).players);
            }
        } else if (e instanceof DWT) {
            if (((DWT) e).tricks == null) {
                ((DWT) e).tricks = new SetObject(new ArrayList<>(), "trick");
                ((SetObject) ((DWT) e).tricks).values = complement(((SetObject) ((DWT) e).tricks).values, "trick", players);
            } else {
                ((DWT) e).tricks = SetExpressionSolver(((DWT) e).tricks);
                validateTrick(((SetObject) ((DWT) e).tricks).values);
            }
            if (((DWT) e).cards == null) {
                ((DWT) e).cards = new SetObject(new ArrayList<>(), "card");
                ((SetObject) ((DWT) e).cards).values = complement(((SetObject) ((DWT) e).cards).values, "card", players);
            } else {
                ((DWT) e).cards = SetExpressionSolver(((DWT) e).cards);
            }

            if (((DWT) e).players == null && ((DWT) e).playerAny == -1) {
                ((DWT) e).players = new SetObject(new ArrayList<>(allPlayers.subList(0, players)), "player");
            } else if (((DWT) e).players != null) {
                ((DWT) e).players = SetExpressionSolver(((DWT) e).players);
            }
        } else if (e instanceof WC) {
            ((WC) e).cards = SetExpressionSolver(((WC) e).cards);
            if (((WC) e).tricks == null) {
                ((WC) e).tricks = new SetObject(new ArrayList<>(), "trick");
                ((SetObject) ((WC) e).tricks).values = complement(((SetObject) ((WC) e).tricks).values, "trick", players);
            } else {
                ((WC) e).tricks = SetExpressionSolver(((WC) e).tricks);
                validateTrick(((SetObject) ((WC) e).tricks).values);
            }
            if (((WC) e).players == null && ((WC) e).playerAny == -1) {
                ((WC) e).players = new SetObject(new ArrayList<>(allPlayers.subList(0, players)), "player");
            } else if (((WC) e).players != null) {
                ((WC) e).players = SetExpressionSolver(((WC) e).players);
            }
        } else if (e instanceof DWC) {
            ((DWC) e).cards = SetExpressionSolver(((DWC) e).cards);
            if (((DWC) e).players == null && ((DWC) e).playerAny == -1) {
                ((DWC) e).players = new SetObject(new ArrayList<>(allPlayers.subList(0, players)), "player");
            } else if (((DWC) e).players != null) {
                ((DWC) e).players = SetExpressionSolver(((DWC) e).players);
            }
            if (((DWC) e).tricks == null) {
                ((DWC) e).tricks = new SetObject(new ArrayList<>(), "trick");
                ((SetObject) ((DWC) e).tricks).values = complement(((SetObject) ((DWC) e).tricks).values, "trick", players);
            } else {
                ((DWC) e).tricks = SetExpressionSolver(((DWC) e).tricks);
                validateTrick(((SetObject) ((DWC) e).tricks).values);
            }
        } else if (e instanceof WR) {
            ((WR) e).equation = EquationSubstituter(((WR) e).equation);
            if (((WR) e).players == null && ((WR) e).playersAny == -1) {
                ((WR) e).players = new SetObject(new ArrayList<>(allPlayers.subList(0, players)), "player");
            } else if (((WR) e).players != null) {
                ((WR) e).players = SetExpressionSolver(((WR) e).players);
            }
        } else if (e instanceof CommunicationRule) {
            if (((CommunicationRule) e).tricks == null) {
                ((CommunicationRule) e).tricks = new SetObject(new ArrayList<>(), "trick");
                ((SetObject) ((CommunicationRule) e).tricks).values = complement(((SetObject) ((CommunicationRule) e).tricks).values, "trick", players);
            } else {
                ((CommunicationRule) e).tricks = SetExpressionSolver(((CommunicationRule) e).tricks);
                validateTrick(((SetObject) ((CommunicationRule) e).tricks).values);
            }
            if (((CommunicationRule) e).players == null && ((CommunicationRule) e).playersAny == -1) {
                ((CommunicationRule) e).players = new SetObject(new ArrayList<>(allPlayers.subList(0, players)), "player");
            } else if (((CommunicationRule) e).players != null) {
                ((CommunicationRule) e).players = SetExpressionSolver(((CommunicationRule) e).players);
            }
        } else if (e instanceof DrawCardRule) {
            if (((DrawCardRule) e).tricks == null) {
                ((DrawCardRule) e).tricks = new SetObject(new ArrayList<>(), "trick");
                ((SetObject) ((DrawCardRule) e).tricks).values = complement(((SetObject) ((DrawCardRule) e).tricks).values, "trick", players);
            } else {
                ((DrawCardRule) e).tricks = SetExpressionSolver(((DrawCardRule) e).tricks);
                validateTrick(((SetObject) ((DrawCardRule) e).tricks).values);
            }
        }
        return e;
    }


    public SetObject CardSpecSolver(CardSpec c) {
        LinkedHashSet<String> values = null;
        LinkedHashSet<String> suit = null;
        ArrayList<String> cards = new ArrayList<>();

        if (c.suit instanceof SetObject) {
            suit = ((SetObject) c.suit).values;
        } else {
            suit = SetExpressionSolver(c.suit).values;
        }
        if (c.value instanceof SetObject) {
            values = ((SetObject) c.value).values;
        } else {
            values = SetExpressionSolver(c.value).values;
        }

        for (String s : suit) {
            for (String v : values) {
                if (!(s.equals("R") && Integer.parseInt(v) > 4)) {
                    cards.add(s + v);
                }
            }
        }
        return new SetObject(cards, "card");
    }

    public SetObject SetExpressionSolver(Expression e) {
        if (e instanceof SetObject) {
            if (((SetObject) e).type.equals("trick")) {
                ((SetObject) e).values = trickTransform(((SetObject) e).values);
            }
            return ((SetObject) e);
        } else if (e instanceof Var) {
            if (validateVariable(((Var) e).type, variables.get(((Var) e).id).type)) {
                return SetExpressionSolver(variables.get(((Var) e).id).varContents);
            }
        } else if (e instanceof CardSpec) {
            return CardSpecSolver((CardSpec) e);
        } else if (e instanceof SetOperation) {
            SetObject left = null;
            SetObject right = null;
            String operation = ((SetOperation) e).operation;
            if (((SetOperation) e).left != null) {
                left = SetExpressionSolver(((SetOperation) e).left);
            }
            if (((SetOperation) e).right != null) {
                right = SetExpressionSolver(((SetOperation) e).right);
            }
            if (operation.equals("|")) {
                union(left.values, right.values);
                return left;
            } else if (operation.equals("&")) {
                intersection(left.values, right.values);
                return left;
            } else {
                right.values = complement(right.values, right.type, players);
                return right;
            }

        }
        return null;
    }

    public Expression EquationSubstituter(Expression e) {
        if (e instanceof Num) {
            return e;
        } else if (e instanceof Var) {
            if (((Var) e).id.equals("maxWins") || ((Var) e).id.equals("minWins")) {
                return e;
            } else {
                if (variables.get(((Var) e).id).type.equals("equation")) {
                    return EquationSubstituter(variables.get(((Var) e).id).varContents);
                }
            }

        } else if (e instanceof Equation) {
            Expression left = EquationSubstituter(((Equation) e).left);
            Expression right = EquationSubstituter(((Equation) e).right);
            String operation = ((Equation) e).operation;
            if ((left instanceof Var || left instanceof Equation) || (right instanceof Var || right instanceof Equation)) {
                return new Equation(left, ((Equation) e).operation, right);
            } else {
                if (operation.equals("+")) {
                    return new Num(plus(((Num) left).num, ((Num) right).num));
                } else {
                    return new Num(minus(((Num) left).num, ((Num) right).num));
                }
            }
        }
        return null;
    }

    public static int EquationSolver(Expression e, int maxWins, int minWins) {
        if (e instanceof Num) {
            return Integer.parseInt(((Num) e).num);
        } else if (e instanceof Var) {
            if (((Var) e).id.equals("maxWins")) {
                return maxWins;
            } else if (((Var) e).id.equals("minWins")) {
                return minWins;
            }
        } else if (e instanceof Equation) {
            int left = EquationSolver(((Equation) e).left, maxWins, minWins);
            int right = EquationSolver(((Equation) e).right, maxWins, minWins);
            String operation = ((Equation) e).operation;
            if (operation.equals("+")) {
                return left + right;
            } else {
                return left - right;
            }
        }
        return -1;
    }


    public boolean validateVariable(String varType, String exprType) {
        return varType.contains(exprType);
    }

    public LinkedHashSet<String> trickTransform(LinkedHashSet<String> set) {
        LinkedHashSet<String> transformedSet = new LinkedHashSet<>();
        int maxTrick = 40 / players;
        if (set.contains("first") || set.contains("last")) {
            for (String val : set) { // add semantic error if tricks contain first and 1 or maxVal and last
                if (val.equals("first")) {
                    transformedSet.add("1");
                } else if (val.equals("last")) {
                    transformedSet.add(String.valueOf(maxTrick));
                } else {
                    transformedSet.add(val);
                }
            }
            return transformedSet;
        }
        return set;
    }


    public static LinkedHashSet<String> complement(LinkedHashSet<String> set, String type, int players) {
        LinkedHashSet<String> compliment = new LinkedHashSet<>();
        ArrayList<String> all_vals;
        if (type.equals("suit")) {
            all_vals = new ArrayList<>(Arrays.asList("B", "G", "P", "R", "Y"));
            for (String suit : all_vals) {
                if (!set.contains(suit)) {
                    compliment.add(suit);
                }
            }
        } else if (type.equals("value")) {
            for (int i = 1; i <= 9; i++) {
                if (!set.contains(String.valueOf(i))) {
                    compliment.add(String.valueOf(i));
                }
            }
        } else if (type.equals("card")) {
            ArrayList<String> suits = new ArrayList<>(Arrays.asList("B", "G", "P", "R", "Y"));
            for (String suit : suits) {
                for (int i = 1; i <= 9; i++) {
                    if (suit.equals("R") && i >= 5) {
                        continue;
                    }
                    if (!set.contains(suit + i)) {
                        compliment.add(suit + i);
                    }
                }
            }
        } else if (type.equals("trick")) {
            int max_trick = 40 / players;
            for (int i = 1; i <= max_trick; i++) {
                if (!set.contains(String.valueOf(i))) {
                    compliment.add(String.valueOf(i));
                }
            }

        }
        // throw error if compliment is empty set
        return compliment;
    }


    public void validateTrick(LinkedHashSet<String> tricks) {
        tricks.removeIf(trick -> Integer.parseInt(trick) > 40 / this.players);

    }


    public void union(LinkedHashSet<String> set1, LinkedHashSet<String> set2) {
        set1.addAll(set2);
    }

    public void intersection(LinkedHashSet<String> set1, LinkedHashSet<String> set2) {
        set1.retainAll(set2);
    }

    public String plus(String a, String b) {
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        return String.valueOf(x + y);

    }

    public String minus(String a, String b) {
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        return String.valueOf(x - y);
    }

}
