
public class WT extends Expression {
    public Expression cards;
    public Expression tricks;
    public Expression players;
    public boolean ordered;
    public int any;
    public int playerAny;
    public boolean all;
    int id;

    public WT(int any, boolean all, Expression tricks, boolean ordered, Expression cards,
              Expression players, int playerAny) {
        this.any = any;
        this.all = all;
        this.tricks = tricks;
        this.ordered = ordered;
        this.cards = cards;
        this.players = players;
        this.playerAny = playerAny;
        this.id = -1;
    }

    public String toString() {
        String tricks;
        String order;
        String cards;
        String players;
        if (this.any != -1) {
            tricks = "any " + this.any;
        } else if (this.tricks != null) {
            tricks = this.tricks.toString();
        } else {
            tricks = "ALL";
        }

        if (this.ordered) {
            order = "ordered";
        } else {
            order = "not ordered";
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
            players = "All";
        }

        return "WT{ " + tricks + " " + order + " " + cards + " , " + players + "}";

    }
}
