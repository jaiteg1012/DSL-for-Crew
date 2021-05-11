public class WR extends Expression {
    String equality;
    Expression equation;
    Expression players;
    int playersAny;
    int id;

    public WR(String equality, Expression equation, Expression players, int playersAny) {
        this.equality = equality;
        this.equation = equation;
        this.players = players;
        this.playersAny = playersAny;
        this.id = -1;
    }

    public String toString() {
        String players;
        if (this.players != null) {
            players = this.players.toString();
        } else if (this.playersAny != -1) {
            players = "any " + this.playersAny;
        } else {
            players = "All";
        }
        return "WR{Wins " + this.equality + " " + this.equation.toString() + ", " + players + "}";
    }
}
