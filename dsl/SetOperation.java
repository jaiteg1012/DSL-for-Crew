


public class SetOperation extends Expression {
    Expression left;
    Expression right;
    String operation;
    String type;

    public SetOperation(Expression left, Expression right, String operation, String type) {
        this.left = left;
        this.right = right;
        this.operation = operation;
        this.type = type;
    }

    public String toString() {
        if (left != null) {
            return this.type + ": " + left.toString() + " " + operation + " " + right.toString();
        } else {
            return this.type + ": " + operation + " " + right.toString();
        }
    }
}
