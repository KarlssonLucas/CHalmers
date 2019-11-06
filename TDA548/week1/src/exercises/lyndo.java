package exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class lyndo {
    public static void main(String[] args) {
        new lyndo ().program ();
    }

    void program() {
        String l1 = "aba";
        String l2 = "bbaba";

        System.out.println (rotateNtimes (l1));
        System.out.println (rotateNtimes (l2));
    }

    String rotateNtimes(String s) {
        ArrayList words = null;
        for (int i = 0; i < s.length (); i++) {
            words = (ArrayList) rotation (s).clone ();
        }

        lyndonword (words);
        return "";
    }

    ArrayList rotation(String s) {
        StringBuilder sb = new StringBuilder ();
        ArrayList<String> words = new ArrayList<> ();

        String substring = s.substring (1);
        sb.append (substring);
        sb.append (s.charAt (0));
        words.add (sb.toString ());
        s = sb.toString ();
        sb.setLength (0);

        return words;
    }

    String lyndonword(ArrayList<String> words) {
        String alphabet = "abcdefghijklmnopqrstuvxyz";

        for (int i = 0; i < words.size () - 1; i++) {
            if (words.get (i).compareTo (words.get (i + 1)) < 0) {
                words.remove (i);
            } else {
                continue;
            }
        }
        return "";
    }
}
