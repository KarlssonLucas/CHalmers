package exercises;

import java.util.Arrays;

public class inrow {
    public static void main(String[] args) {
        new inrow ().program ();
    }

    void program() {
        int[][] matrix = {{1, 2, 3}, {1, 2, 4}, {1, 2, 5}};
        int[] common = new int[matrix.length];
        int nCommon = 0;

        for (int i = 0; i < matrix.length; i++) {
            int current = matrix[0][i];
            if (inAll (current, matrix)) {
                common[nCommon] = current;
                nCommon++;
            }
        }

        int[] newCommon = new int[nCommon];
        for (int i = 0; i < nCommon; i++) {
            newCommon[i] = common[i];
        }
        System.out.println (Arrays.toString (newCommon));
    }

    private boolean inAll(int current, int[][] matrix) {
        int inRows = 1;
        for (int i = 1; i < matrix.length; i++) {
            for (int k = 0; k < matrix.length; k++) {
                if (current == matrix[i][k]) {
                    inRows++;
                    break;
                }
            }
        }
        if (inRows == matrix.length) {
            return true;
        } else {
            return false;
        }
    }
}
