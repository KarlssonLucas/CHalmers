package exercises;

import java.util.ArrayList;

import static java.lang.System.out;

/**
 * A String problem
 * <p>
 * See:
 * - UseString
 */
public class Ex5StringOrdering {

    public static void main(String[] args) {
        new Ex5StringOrdering ().program ();
    }

    void program() {

        // Yes, "aa bb cc" is ordered like "abc" because all
        // a's are before all b's that are before all c's
        out.println (isOrdered ("abc", "aa bb cc"));
        // Yes, all a's before all b's
        out.println (isOrdered ("ab", "aa eee bb ddd cc"));
        // Yes, all e's before all c's
        out.println (isOrdered ("ec", "aa eee becb c dddc"));

        // Not all c's are before all b's
        //out.println(!isOrdered("acb", "aa bb cc"));
        // Not all b's before all c's
        //out.println(!isOrdered("abc", "aa bb ccc b"));
        // No!
        //out.println(!isOrdered("bac", "aa eee bbb ddd ccc"));

        // Degenerate cases
        //out.println(isOrdered("a", "aa bb cc"));
        //out.println(isOrdered("", "aa bb cc"));
        //out.println(isOrdered("abc", ""));
        //out.println(!isOrdered("ax", "aa bb cc"));
    }

    private boolean isOrdered(String order, String string) {
        ArrayList<String> list = new ArrayList<> ();
        StringBuilder sb = new StringBuilder ();
        for (int i = 0; i < order.length (); i++) {
            for (int k = 0; k < string.length (); k++) {
                char ch = order.charAt (i);
                char sch = string.charAt (k);
                if (Character.isWhitespace (sch)) {
                    continue;
                }
                if (sch == ch) {
                    sb.append (ch);
                }
                if (sch != ch) {
                    list.add (sb.toString ());
                    break;
                }
            }
        }
        int i = 0;
        for (i = 0; i < order.length (); i++) {
            if (String.valueOf (order.charAt (i)) == list.get (i)) {

            } else {
                break;
            }
        }
        if (i == order.length () - 1) {
            return true;
        }
        return false;
    }
}
