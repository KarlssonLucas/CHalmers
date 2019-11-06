package exercises.ex1useaclass;

import java.util.Arrays;

public class matrixEqual {
    public static void main(String[] args) {
        System.out.println (matrixCounter ());
    }

    static String matrixCounter() {
        int[][] matrix = {{7, 2, 3}, {1, 2, 4}, {1, 2, 5}};
        int currentNum;
        int inRows = 1;
        int amountOfEquals = 0;
        int[] equals = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            currentNum = matrix[0][i];
            if (inNextRow (currentNum, matrix, equals)) {
                equals[amountOfEquals] = currentNum;
                inRows++;
                amountOfEquals++;
            }
        }
        return Arrays.toString (equals);
    }

    private static boolean inNextRow(int currentNum, int[][] matrix, int[] equals) {
        int nRows = 1;

        for (int i = 1; i < matrix.length; i++) {
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[i][k] == currentNum) {
                    nRows++;
                }
            }
        }
        if (nRows == matrix.length) {
            return true;
        }
        return false;
    }
}
