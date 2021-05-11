public class DrawCardRule extends Expression {
    String operation;
    Expression tricks;
    int id;

    public DrawCardRule(String operation, Expression tricks) {
        this.operation = operation;
        this.tricks = tricks;
        this.id = -1;
    }

    public String toString() {
        if (tricks != null) {
            return this.operation + "{ " + this.tricks.toString() + "}";
        } else {
            return this.operation + "{ " + "ALL" + "}";
        }
    }

}
