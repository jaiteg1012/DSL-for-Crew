import java.util.ArrayList;

public class Trick {
    ArrayList<String> cardsWon;
    String winner;
    String cardUsedToWin;
    String TrickNumber;

    public Trick(String trickNumber, String winner, ArrayList<String> cardsWon, String cardUsedToWin) {
        this.TrickNumber = trickNumber;
        this.winner = winner;
        this.cardUsedToWin = cardUsedToWin;
        this.cardsWon = cardsWon;
    }

    public String toString() {

        return "Trick Number: " + TrickNumber + "\n"
                + "Winner: " + winner + "\n"
                + "Card used to win the trick: " + cardUsedToWin + "\n"
                + "Cards won: " + cardsWon;

    }

}
