package exercises;

import java.util.Arrays;

import static java.lang.System.out;

/*
 *  Pig Latin, silly secret language
 *  https://en.wikipedia.org/wiki/Pig_Latin
 *
 *  See:
 *  - UseCharacter
 *  - UseStringBuilder
 *  - UseString
 *  - ShortForLoop
 *
 */
public class Ex2PigLatin {

    public static void main(String[] args) {
        new Ex2PigLatin ().program ();
    }

    void program() {
        String s = "my name is eric";
        out.println (toPigLatin (s).equals ("ymay amenay isway ericway"));
    }

    private Object toPigLatin(String s) {
        String voc = "aieyuo";
        String con = "bcdfghjklmnpqrstv";
        StringBuilder newS = new StringBuilder ();

        String[] ns = s.split (" ");
        out.println (Arrays.toString (ns));
        for (int i = 0; i < ns.length; i++) {
            String currentString = ns[i];
            for (int k = 0; k < ns[i].length (); k++) {
                if (currentString.charAt (k) == ' ') {
                    continue;
                }
            }
        }

        out.println (newS.toString ());
        return newS.toString ();
    }
}


