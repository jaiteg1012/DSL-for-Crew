import java.util.ArrayList;

public class Program {
    public ArrayList<Expression> expressions;
    public ArrayList<String> errors;

    public Program() {
        expressions = new ArrayList<Expression>();
    }

    public void addExpression(Expression e) {
        expressions.add(e);
    }
}
