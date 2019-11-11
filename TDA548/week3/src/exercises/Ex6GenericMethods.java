package exercises;

import java.util.*;

import static java.lang.System.out;

/*
 * Implement generic versions of shuffle and sort
 *
 *  See:
 *  - WrapperTypes
 *  - GenericMethod
 */
public class Ex6GenericMethods {

    public static void main(String[] args) {
        new Ex6GenericMethods ().program ();
    }

    final Random rand = new Random ();

    void program() {

        // Working with wrapper types, generic methods only work with reference types
        Integer[] is = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String origIs = Arrays.toString (is);
        String[] ss = {"a", "b", "c", "d", "e"};
        String origSS = Arrays.toString (ss);

        // diffIndex works for all arrays reference types
        out.println (diffIndex (is, is) == -1);
        out.println (diffIndex (ss, ss) == -1);

        // shuffle should be a generic method, so we can use it for Integers ...
        shuffle (is);
        out.println (!Arrays.toString (is).equals (origIs));  // May be false, but unlikely
        // ... and here for String.
        shuffle (ss);
        out.println (!Arrays.toString (ss).equals (origSS));

        // sort should also be generic (this is hard)
        sort (is);
        out.println (Arrays.toString (is).equals (origIs));
        sort (ss);
        out.println (Arrays.toString (ss).equals (origSS));

    }

    public static <T extends Comparable<T>> T[] sort(T[] anArray) {
        if (anArray[2].compareTo (anArray[0]) > 0) {

        }
        return anArray;
    }

    <T> T[] shuffle(T[] is) {
        int n = 0;
        for (int i = 0; i < is.length; i++) {
            n = rand.nextInt (is.length);
            T temp = is[i];
            is[i] = is[n];
            is[n] = temp;
        }
        return is;
    }

    <T> int diffIndex(T[] is, T[] is1) {
        int n = 0;
        for (int i = 0; i < is1.length; i++) {
            if (is[i] == is1[i]) {
                n += 1;
            }
        }
        if (n == 0 || n == is1.length) {
            return -1;
        }
        return n;
    }
}
