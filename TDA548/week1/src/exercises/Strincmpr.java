package exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Strincmpr {
    public static void main(String[] args) {
        new Strincmpr ().program ();
    }

    void program() {
        String s = "aaabbbccc";

        System.out.println (compress (s));
    }

    String compress(String s) {
        int counter = 1;
        StringBuilder sb = new StringBuilder ();

        for (int i = 0; i < s.length () - 1; i++) {
            while (s.charAt (i) == s.charAt (i + 1)) {
                counter++;
                i++;
            }
            sb.append (counter);
            sb.append (s.charAt (i));
            if (s.charAt (i) != s.charAt (i + 1) && i >= s.length () - 1) {
                sb.append (1);
                sb.append (s.charAt (s.length () - 1));
            }
        }

        System.out.println (sb.toString ());

        return s;
    }
}
