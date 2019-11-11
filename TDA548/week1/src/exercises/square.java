package exercises;

public class square {
    public static void main(String[] args) {
        new square ().program ();
    }

    void program() {
        int[][] matrix = {{0, 0, 1, 0},
                {0, 0, 1, 0},
                {1, 1, 1, 0},
                {1, 0, 1, 0}};

        int n = 2;
        System.out.println (prep (matrix, n));
    }

    private boolean prep(int[][] matrix, int n) {

        for (int i = 0; i < matrix.length - n + 1; i++) {
            for (int k = 0; k < matrix.length - n + 1; k++) {
                if (inSquare (i, k, matrix, n)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean inSquare(int row, int col, int[][] matrix, int n) {
        for (int i = row; i < n + row; i++) {
            for (int k = col; k < n + col; k++) {
                if (matrix[i][k] != 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
