import java.util.LinkedHashSet;

public class Player {
    LinkedHashSet<String> cards;
    boolean ComAllowed;
    boolean ComUsed;
    LinkedHashSet<String> tasks;
    String playerID;
    int maxWins;


    public Player(String playerID, LinkedHashSet<String> cards) {
        this.playerID = playerID;
        this.cards = cards;
        tasks = new LinkedHashSet<>();
        maxWins = -1;
        ComUsed = false;
    }

    public String toString() {
        return this.cards.toString();
    }
}
