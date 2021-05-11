import java.util.ArrayList;

public class Mission extends Expression {
    int tasks;
    int players;
    int nSwap;
    int nSwitch;
    Expression tokens;
    String distress_signal;
    String distribution; //task distribution
    ArrayList<Expression> rules;
    String constraints_distribution;

    // check if  3 <= players <= 5
    public Mission(int tasks, int players, int nSwap, int nSwitch, Expression tokens, String distress_signal,
                   String distribution, String constraints_distribution, ArrayList<Expression> rules) {
        this.tasks = tasks;
        this.players = players;
        this.nSwap = nSwap;
        this.nSwitch = nSwitch;
        this.tokens = tokens;
        this.distress_signal = distress_signal;
        this.distribution = distribution;
        this.rules = rules;
        this.constraints_distribution = constraints_distribution;
    }

    public String toString() {
        return "Mission:" + "\n"
                + "tasks = " + this.tasks + "\n"
                + "players = " + this.players + "\n"
                + "nSwap = " + this.nSwap + "\n"
                + "nSwitch = " + this.nSwitch + "\n"
                + "tokens = " + this.tokens + "\n"
                + "distress_signal = " + this.distress_signal + "\n"
                + "distribution = " + this.distribution + "\n"
                + "constraint distribution = " + this.constraints_distribution + "\n"
                + "rules = " + this.rules;
    }

}
