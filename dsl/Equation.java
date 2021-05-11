public class Equation extends Expression {
    Expression left;
    Expression right;
    String operation;

    public Equation(Expression left, String operation, Expression right) {
        this.left = left;
        this.right = right;
        this.operation = operation;
    }

    public String toString() {
        return this.left + " " + this.operation + " " + this.right;
    }
}
