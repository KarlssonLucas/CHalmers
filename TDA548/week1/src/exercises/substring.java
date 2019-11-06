package exercises;

import java.util.ArrayList;

public class substring {
    public static void main(String[] args) {
        new substring ().program ();
    }

    void program() {
        String s = "salt";

        substrings (s);
    }

    private void substrings(String s) {
        ArrayList<String> al = new ArrayList<> ();

        for (int i = 0; i < s.length () + 1; i++) {
            for (int k = i + 1; k < s.length () + 1; k++) {
                al.add (s.substring (i, k));
            }
        }
        System.out.println (al.toString ());
        specialsub (al);
    }

    private void specialsub(ArrayList<String> al) {
        String vowels = "aeiouy";
        System.out.println (vowels.substring (0, 1));
        for (int i = 0; i < al.size (); i++) {
            String currentS = al.get (i);
            if (vowels.contains (String.valueOf (currentS.charAt (0))) && !vowels.contains (String.valueOf (currentS.charAt (currentS.length () - 1))) || !vowels.contains (String.valueOf (currentS.charAt (0))) && vowels.contains ((String.valueOf (currentS.charAt (currentS.length () - 1))))) {
                System.out.println (currentS);
            }
        }
    }
}
