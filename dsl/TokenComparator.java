import java.util.Comparator;

public class TokenComparator implements Comparator<String> {
    public int compare(String a, String b) {
        if (a.equals("") && b.equals("")) {
            return 0;
        } else if (a.equals("")) {
            return -1;
        } else if (b.equals("")) {
            return 1;
        } else if (a.charAt(0) == 'x' && b.charAt(0) == 'x') {
            if (a.charAt(1) == 'x') {
                return 1;
            } else if (b.charAt(1) == 'x') {
                return -1;
            } else {
                return Integer.parseInt(String.valueOf(a.charAt(1))) - Integer.parseInt(String.valueOf(b.charAt(1)));
            }

        } else if (a.charAt(0) == 'x') {
            return 1;


        } else if (b.charAt(0) == 'x') {
            return -1;

        } else {
            return Integer.parseInt(a) - Integer.parseInt(b);
        }
    }
}
