public class CardRule extends Expression {
    public String type;
    public String operation;
    public Expression cards;
    public Expression tricks;
    public Expression players;
    public boolean ordered;
    public int any;
    public int playerAny;
    public boolean playerAll;

    public CardRule(String operation, int any, Expression cards, boolean ordered, Expression tricks, Expression players,
                    int playerAny, boolean playerAll) {

        this.operation = operation;
        this.any = any;
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
        } else if (any != -1) {
            trick = "any " + String.valueOf(this.any);
        } else {
            trick = "NULL";
        }
        if (this.ordered) {
            order = "ordered";
        } else {
            order = "not ordered";
        }
        cards = this.cards.toString();
        if (this.players != null) {
            players = this.players.toString();
        } else if (this.playerAll) {
            players = "all";
        } else if (this.playerAny != -1) {
            players = "any " + String.valueOf(this.playerAny);
        } else {
            players = "collab";
        }
        return "CardRule: RULE{" + this.operation + " " + cards + " " + order + " " + trick + " " + players + "}";
    }

}

