import java.io.IOException;
import java.util.*;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;


public class TestTrickValidator {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.print("Usage: file");
        } else {
            String file = args[0];
            GrammarParser parser = getParser(file);
            ParseTree AbstractSynTree = parser.prog();
            if (ErrorHandler.hasError) {
                // error reporting is done by the listener here
            } else {
                AntlrToProgram programVisitor = new AntlrToProgram();
                Program prg = programVisitor.visit(AbstractSynTree);
                if (prg.errors.size() != 0) {
                    for (int i = 0; i < prg.errors.size(); i++) {
                        System.out.println(prg.errors.get(i));
                    }
                    return;
                }
                ExpressionSolver solver = new ExpressionSolver(prg.expressions);
                ArrayList<Mission> missions = solver.solver();
                //mission to test
                Mission temp_mission = missions.get(0);
                //add task cards
//            addTaskCards(temp_mission, "Player1", "P3");
//            addTaskCards(temp_mission, "Player2", "P2");
//            addTaskCards(temp_mission, "Player5", "P5");
//            addTaskCards(temp_mission, "Player1", "P7");


                RuleCollector collector = new RuleCollector(temp_mission.rules);

                //convention for cards in ArrayList: Cards that wins the trick is the fist card that appears in the list
                Trick first = new Trick("1", "Player1", new ArrayList<>(Arrays.asList("P4", "Y5", "B9", "B6", "G8")), "P4");
                Trick second = new Trick("2", "Player2", new ArrayList<>(Arrays.asList("P3", "Y3", "Y4", "G1", "Y7")), "P3");
                Trick third = new Trick("3", "Player3", new ArrayList<>(Arrays.asList("P5", "G2", "G3", "B4", "B5")), "P5");
                Trick fourth = new Trick("4", "Player4", new ArrayList<>(Arrays.asList("P9", "G4", "G9", "R2", "Y9")), "P9");
                Trick fifth = new Trick("5", "Player5", new ArrayList<>(Arrays.asList("P7", "G6", "G7", "B8", "G5")), "P7");
                Trick sixth = new Trick("6", "Player2", new ArrayList<>(Arrays.asList("P2", "R1", "P1", "B3", "Y1")), "P2");
                Trick seventh = new Trick("7", "Player1", new ArrayList<>(Arrays.asList("P8", "R4", "B1", "Y2", "Y8")), "P8");
                Trick eigthth = new Trick("8", "Player1", new ArrayList<>(Arrays.asList("Y6", "B2", "P6", "R3", "B7")), "Y6");


                ArrayList<Trick> tricks = new ArrayList<>(Arrays.asList(first, second, third, fourth, fifth, sixth, seventh, eigthth));

                HashMap<String, Integer> wins = new HashMap<>();
                for (int i = 1; i <= 5; i++) {
                    wins.put("Player" + i, 0);
                }
                int maxWins = 0;
                int minWins = 0;
                for (Trick trick : tricks) {
                    boolean result = TrickValidator.validate(trick, collector.trickRuleCol, collector.cardRuleCol, collector.mustWins, 5);
                    wins.put(trick.winner, wins.get(trick.winner) + 1);
                    maxWins = Math.max(maxWins, wins.get(trick.winner));
                    minWins = Collections.min(wins.values());
                    boolean checkWins = checkWins(maxWins, minWins, 8, Integer.parseInt(trick.TrickNumber), trick, wins, collector);
                    System.out.println("Satisfy Rules: " + result + " " + "Satisfy Wins: " + checkWins);
                    if (!(result && checkWins)) {
                        break;
                    }
                }
            }

        }
    }

    public static boolean checkWins(int maxWins, int minWins, int maxTrick, int trick, Trick
            results, HashMap<String, Integer> wins, RuleCollector rc) {
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
                    System.out.println("CurrWins: " + currWins + " " + "RuleWins: " + w);
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

    public static void addTaskCards(Mission mission, String player, String taskCard) {
        LinkedHashSet<String> tricks = ExpressionSolver.complement(new LinkedHashSet<>(), "trick", 5);
        SetObject trick = new SetObject(new ArrayList<>(tricks), "trick");
        SetObject c = new SetObject(new ArrayList<>(List.of(taskCard)), "card");
        SetObject players = new SetObject(new ArrayList<>(List.of(player)), "player");
        WC wc = new WC(-1, c, trick, players, -1);
        wc.id = -1;
        mission.rules.add(wc);

    }

    public static GrammarParser getParser(String file) {
        GrammarParser parser = null;
        try {
            CharStream input = CharStreams.fromFileName(file);
            GrammarLexer lexer = new GrammarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new GrammarParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(new ErrorHandler());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parser;
    }
}



