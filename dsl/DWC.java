public class DWC extends Expression {
    Expression cards;
    int playerAny;
    Expression players;
    Expression tricks;
    int id;

    public DWC(Expression cards, Expression tricks, Expression players, int playerAny) {

        this.cards = cards;
        this.players = players;
        this.playerAny = playerAny;
        this.tricks = tricks;
        this.id = -1;
    }

    public String toString() {
        String players;
        String tricks;
        if (this.players != null) {
            players = this.players.toString();
        } else if (this.playerAny != -1) {
            players = "any " + this.playerAny;
        } else {
            players = "ALL";
        }
        if (this.tricks != null) {
            tricks = this.tricks.toString();
        } else {
            tricks = "ALL";
        }
        return "DWC{ " + this.cards.toString() + tricks + " , " + players + "}";
    }
}
