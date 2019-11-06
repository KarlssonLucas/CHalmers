package exercises.ex1useaclass;

import java.util.ArrayList;

public class specialsubstring {
    public static void main(String[] args) {
        toSubstring ();
    }

    private static String toSubstring() {
        String string = "union";
        StringBuilder sb = new StringBuilder ();
        ArrayList<String> al = new ArrayList<> ();

        for (int i = 0; i < string.length (); i++) {
            for (int k = 0; k < string.length () + 1; k++) {
                if (k > i) {
                    String subs = string.substring (i, k);
                    al.add (subs);
                }
            }
        }
        System.out.println (al.toString ());
        System.out.println (specialsub (al));
        return "a";
    }

    static String specialsub(ArrayList<String> al) {
        String vocals = "aeiouy";
        ArrayList<String> specialsubs = new ArrayList<> ();

        for (int i = 0; i < al.size (); i++) {
            String currentString = al.get (i);
            boolean contains = vocals.contains (String.valueOf (currentString.charAt (0)));
            String s = String.valueOf (currentString.charAt (currentString.length () - 1));
            if (contains && !vocals.contains (s) || !contains && vocals.contains (s)) {
                specialsubs.add (al.get (i));
            }
        }
        return specialsubs.toString ();
    }
}
