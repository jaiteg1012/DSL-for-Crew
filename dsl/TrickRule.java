public class TrickRule extends Expression {
    public String operation;
    public Expression cards;
    public Expression tricks;
    public Expression players;
    public boolean ordered;
    public int any;
    public int playerAny;
    public boolean all;
    public boolean playerAll;

    public TrickRule(String operation, int any, boolean all, Expression tricks, boolean ordered, Expression cards,
                     Expression players, int playerAny, boolean playerAll) {

        this.operation = operation;
        this.any = any;
        this.all = all;
        this.tricks = tricks;
        this.ordered = ordered;
        this.cards = cards;
        this.players = players;
        this.playerAny = playerAny;
        this.playerAll = playerAll;

    }

    public String toString() {
        String trick;
        String order;
        String cards;
        String players;
        if (this.tricks != null) {
            trick = this.tricks.toString();
        } else if (this.all) {
            trick = "all";
        } else {
            trick = "any " + String.valueOf(this.any);
        }
        if (this.ordered) {
            order = "ordered";
        } else {
            order = "not ordered";
        }
        if (this.cards != null) {
            cards = this.cards.toString();
        } else {
            cards = "NULL";
        }
        if (this.players != null) {
            players = this.players.toString();
        } else if (this.playerAll) {
            players = "all";
        } else if (this.playerAny != -1) {
            players = "any " + String.valueOf(this.playerAny);
        } else {
            players = "collab";
        }
        return "TrickRule: RULE{" + this.operation + " " + trick + " " + order + " " + cards + " " + players + "}";
    }
}
