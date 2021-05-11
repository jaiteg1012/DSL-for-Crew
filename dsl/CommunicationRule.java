public class CommunicationRule extends Expression {
    String operation;
    Expression tricks;
    Expression players;
    int playersAny;
    int id;

    public CommunicationRule(String operation, Expression tricks, Expression players, int playersAny) {
        this.operation = operation;
        this.tricks = tricks;
        this.players = players;
        this.playersAny = playersAny;
        this.id = -1;
    }

    public String toString() {
        String tricks;
        String players;

        if (this.tricks != null) {
            tricks = this.tricks.toString();
        } else {
            tricks = "All";
        }
        if (this.players != null) {
            players = this.players.toString();
        } else if (playersAny != -1) {
            players = "any " + this.playersAny;
        } else {
            players = "All";
        }
        return this.operation + "{" + tricks + " , " + players + "}";
    }
}


