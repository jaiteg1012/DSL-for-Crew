import java.util.ArrayList;

public class AntlrToProgram extends GrammarBaseVisitor<Program> {

    @Override
    public Program visitProg(GrammarParser.ProgContext ctx) {
        Program prog = new Program();
        int i = 0;
        int children = ctx.getChildCount();
        ArrayList<String> errors = new ArrayList<>();
        AntlrToExpression visitor = new AntlrToExpression(errors);
        while (i < children - 1) {
            prog.addExpression(visitor.visit(ctx.getChild(i)));
            i++;
        }
        prog.errors = errors;

        return prog;

    }

}
