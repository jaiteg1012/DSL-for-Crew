public class DWT extends Expression {
    Expression tricks;
    int playerAny;
    Expression players;
    Expression cards;
    int id;

    public DWT(Expression tricks, Expression cards, int playerAny, Expression players) {
        this.tricks = tricks;
        this.playerAny = playerAny;
        this.players = players;
        this.cards = cards;
        this.id = -1;
    }

    public String toString() {
        String tricks;
        String cards;
        String players;

        if (this.tricks != null) {
            tricks = this.tricks.toString();
        } else {
            tricks = "ALL";
        }
        if (this.cards != null) {
            cards = this.cards.toString();
        } else {
            cards = "ALL";
        }
        if (this.players != null) {
            players = this.players.toString();
        } else if (this.playerAny != -1) {
            players = "any " + this.playerAny;
        } else {
            players = "ALL";
        }

        return "DWT{" + tricks + cards + ", " + players + "}";
    }
}
