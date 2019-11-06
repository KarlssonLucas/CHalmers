package exercises;

import java.util.ArrayList;

public class compstring {
    public static void main(String[] args) {
        new compstring ().program ();
    }

    void program() {
        String orgString = "aabbbcddd";

        compressString (orgString);
    }

    void compressString(String orgString) {
        int counter = 1;
        char ch = ' ';
        ArrayList<String> al = new ArrayList<> ();

        for (int i = 0; i < orgString.length (); i++) {
            for (int k = i; k < orgString.length (); k++) {
                ch = orgString.charAt (k);
                if (k + 1 < orgString.length () && orgString.charAt (k) == orgString.charAt (k + 1)) {
                    counter++;
                } else {
                    break;
                }
            }
            i = i + counter - 1;
            al.add (String.valueOf (counter));
            al.add (String.valueOf (ch));
            counter = 1;
        }
        System.out.println (al.toString ());
    }
}
