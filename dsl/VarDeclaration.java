public class VarDeclaration extends Expression {
    String varName;
    String type;
    Expression varContents;

    public VarDeclaration(String varName, String type, Expression varContents) {
        this.varName = varName;
        this.type = type;
        this.varContents = varContents;
    }

    public String toString() {
        return this.type + ": " + this.varName + " = " + this.varContents.toString();

    }
}
