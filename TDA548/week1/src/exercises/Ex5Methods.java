package exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.System.out;

/*
 *  Implement methods to make program produce correct output (normally print true)
 *
 * See:
 * - MethodsBasics
 * - MethodsArrObj  (just arrays)
 */
public class Ex5Methods {

    public static void main(String[] args) {
        new Ex5Methods ().program ();
    }

    void program() {
        int[][] matrix = {{8, 6, 3},
                {1, 2, 4},
                {1, 2, 5}};

        inRow (matrix);
    }

    private void inRow(int[][] matrix) {
        int n = 0;
        int index = 0;
        int[] firstRow = matrix[0];
        int[] commonElements = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            n = matrix[0][i];
            if (inAllRows (matrix, n)) {
                commonElements[index] = n;
                index++;
            }
        }
        int[] cut = new int[index];
        for (int i = 0; i < cut.length; i++) {
            cut[i] = commonElements[i];
        }

        out.println (Arrays.toString (cut));
    }

    boolean inAllRows(int[][] matrix, int n) {
        int nRows = 1;

        for (int k = 1; k < matrix.length; k++) {
            if (inThisRow (matrix, n, k)) {
                nRows++;
            } else {
                break;
            }
        }
        if (nRows == matrix.length) {
            return true;
        }
        return false;
    }

    private boolean inThisRow(int[][] matrix, int n, int k) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[k][i] == n) {
                return true;
            }
        }
        return false;
    }
}
