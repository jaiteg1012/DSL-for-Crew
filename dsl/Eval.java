import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class Eval {

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
                int i = 0;
                while (i < missions.size()) {
                    Mission temp_mission = missions.get(i);
                    Game game = new Game(missions.get(i));
                    RuleCollector collector = new RuleCollector(temp_mission.rules);
                    PlayableMission play = new PlayableMission(game, collector);
                    boolean result = play.play();
                    if (result) {
                        i++;
                    }
                }
            }
        }
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
