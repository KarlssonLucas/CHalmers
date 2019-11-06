package exercises;

public class squareattempt2 {
    public static void main(String[] args) {
        new squareattempt2 ().program ();
    }

    void program() {
        int[][] matrix = {{0, 1, 1, 0},
                {1, 0, 1, 1},
                {0, 0, 0, 1},
                {0, 0, 0, 0}};

        System.out.println (calculateColumn (matrix));
    }

    boolean calculateColumn(int[][] matrix) {
        int n = 2;
        int m = matrix.length;
        for (int row = 0; row < matrix.length - n + 1; row++) {
            for (int col = 0; col < matrix.length - n + 1; col++) {
                if (!isInAllRows (n, matrix, col, row)) {

                } else {
                    return true;
                }
            }

        }
        return false;
    }

    boolean isInAllRows(int n, int[][] matrix, int befcol, int befrow) {

        for (int row = befrow; row < befrow + n; row++) {
            for (int col = befcol; col < befcol + n; col++) {
                if (matrix[row][col] == 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
