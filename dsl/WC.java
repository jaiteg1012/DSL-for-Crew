public class WC extends Expression {
    int any;
    Expression cards;
    Expression tricks;
    int playerAny;
    Expression players;
    int id;

    public WC(int any, Expression cards, Expression tricks, Expression players, int playerAny) {
        this.tricks = tricks;
        this.cards = cards;
        this.playerAny = playerAny;
        this.players = players;
        this.any = any;
        this.id = -1;
    }

    public String toString() {
        String tricks;
        String cards;
        String players;
        String any;

        if (this.any != -1) {
            any = "any " + this.any;
        } else {
            any = "ALL";
        }
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

        return "WC{" + any + " " + cards + " " + tricks + ", " + players + "}";
    }


}
