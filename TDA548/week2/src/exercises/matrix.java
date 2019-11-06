package exercises;

import java.lang.reflect.Array;
import java.util.Arrays;

public class matrix {
    public static void main(String[] args) {
        matrixEqual ();
    }

    private static void matrixEqual() {
        int amountRows = 1;
        int[][] matrix = {{4, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int[] m = new int[matrix.length];
        int n = 0;
        boolean p = false;
        int a = 0;

        for (int k = 0; k < matrix.length; k++) {
            n = matrix[0][k];
            p = inAllRows (n, matrix, amountRows);
            if (p == true) {
                m[a] = n;
                a += 1;
            }
        }
        System.out.println (Arrays.toString (m));
        printArray (m, a);
    }

    private static void printArray(int[] m, int a) {
        int[] print = new int[a];
        for (int i = 0; i < a; i++) {
            print[i] = m[i];
        }
        System.out.println (Arrays.toString (print));
    }

    private static boolean inAllRows(int n, int[][] matrix, int amountRows) {
        for (int i = 1; i < matrix.length; i++) {
            for (int k = 0; k < matrix.length; k++) {
                if (n == matrix[i][k]) {
                    amountRows += 1;
                }
            }
        }
        if (amountRows == matrix.length) {
            return true;
        }
        return false;
    }
}