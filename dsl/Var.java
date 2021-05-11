public class Var extends Expression {
    public String id;
    public String type;

    public Var(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public String toString() {
        return "Var: " + id + " " + "Type: " + this.type;
    }
}
