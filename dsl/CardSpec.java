
public class CardSpec extends Expression {
    Expression suit;
    Expression value;

    public CardSpec(Expression suit, Expression value) {
        this.suit = suit;
        this.value = value;
    }

    public String toString() {
        return "Cards{ Suit:" + this.suit + " " + "Value:" + this.value + "}";
    }
}
