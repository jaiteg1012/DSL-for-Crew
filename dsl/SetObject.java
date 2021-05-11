import java.util.ArrayList;
import java.util.LinkedHashSet;

public class SetObject extends Expression {
    LinkedHashSet<String> values;
    String type; // suit, value, card, trick, player, token

    public SetObject(ArrayList<String> values, String type) {
        this.values = new LinkedHashSet<>();
        this.type = type;
        if (values.size() == 3 && values.get(1).equals(":")) {
            int start = Integer.parseInt(values.get(0));
            int end = Integer.parseInt(values.get(2));
            for (int i = start; i <= end; i++) {
                this.values.add(String.valueOf(i));
            }
        } else {
            this.values.addAll(values);
        }

    }


    public String toString() {
        return this.type + ": " + this.values.toString();
    }
}
