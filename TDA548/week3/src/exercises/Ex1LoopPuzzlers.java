package exercises;

import java.util.Arrays;

import static java.lang.System.out;

/*
 *  Some puzzlers
 *  General improvement of programming skills
 *
 *  See:
 *  - LoopPuzzler
 */
public class Ex1LoopPuzzlers {

    public static void main(String[] args) {
        new Ex1LoopPuzzlers ().program ();
    }


    void program() {
        int p = 0;

        int[][] n = new int[11][11];
        for (int i = 0; i < 11; i++) {
            for (int k = 0; k < 11; k++) {
                n[i][k] = (k * p);
            }
            p++;
        }

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.print (n[i][j] + " ");
            }
            System.out.println ();
        }

        int f = 0;
        for (int i = 0; i < 100; i++) {
            char m = 'x';
            for (int k = 0; k < f; k++) {
                out.print ('x');
            }
            out.println ();
            f++;
        }

        int u = 0;
        int t = 0;
        for (int i = 0; i < 50; i++) {
            for (int k = 0; k < 50; k++) {
                if (u > k) {
                    out.print ("");
                } else {
                    while (t < 10) {
                        out.print ('x');
                        t++;
                    }
                }
                u++;
            }
            out.println ();

        }

    }
}
