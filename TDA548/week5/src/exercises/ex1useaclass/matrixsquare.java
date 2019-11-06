package exercises.ex1useaclass;

public class matrixsquare {
    private static void main(String[] args) {
        int[][] matrix = {{1, 0, 1, 0}, {1, 1, 0, 0}, {1, 1, 0, 0}};
        sqmatrix (matrix);
    }

    private void sqmatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col] == 1) {
                    inSquare (matrix, row, col);
                }
            }
        }
    }

    private static void inSquare(int[][] matrix, int row, int col) {
        int len = matrix.length;
        if (row + 1 < len && col + 1 < len) {
            squareOf1 (matrix, row, col);
        }
    }

    private static void squareOf1(int[][] matrix, int row, int col) {
        if (matrix[row][col] == 1 && matrix[row + 1][col] == 1 && matrix[row][col + 1] == 1 && matrix[row + 1][col + 1] == 1) {
            System.out.println (true);
        }
        System.out.println (false);
    }


}
