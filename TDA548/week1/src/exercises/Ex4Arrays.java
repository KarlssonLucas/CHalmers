package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 * Program to exercise arrays
 *
 * See:
 * - ArrayBasics
 */
public class Ex4Arrays {

    public static void main(String[] args) {
        new Ex4Arrays ().program ();
    }

    final Scanner sc = new Scanner (in);

    void program() {
        ArrayList<Integer> list = new ArrayList<> ();
        int x = 0;
        while (list.size () < 5) {
            int i = sc.nextInt ();
            list.add (i);
            x++;
        }
        out.println (list);
        out.println ("vilket tal?");
        int n = sc.nextInt ();
        out.println (list.get (n));

    }
}
