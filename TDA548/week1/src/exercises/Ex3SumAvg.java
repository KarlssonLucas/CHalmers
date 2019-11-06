package exercises;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.*;;

/*
 * Program to calculate sum and average for non-negative integers
 *
 * See:
 * - Loops (while only)
 * - LoopAndAHalf
 *
 */
public class Ex3SumAvg {

    public static void main(String[] args) {
        new Ex3SumAvg ().program ();
    }

    final Scanner sc = new Scanner (in);

    void program() {
        int x = 0;
        ArrayList<Integer> list = new ArrayList<Integer> ();
        while (x == 0) {
            int n = sc.nextInt ();
            list.add (n);
            if (list.size () > 4) {
                break;
            }
        }
        double sum = 0;
        for (int i = 0; i < list.size (); i++) {
            sum = sum + list.get (i);
        }
        double k = sum / (list.size ());
        out.println (k);
    }

}
