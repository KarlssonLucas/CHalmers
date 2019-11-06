package exercises;

public class soduku {
    public static void main(String[] args) {
        new soduku ().program ();
    }

    void program() {
        int[][] matrix = {{4, 8, 3, 9, 2, 1, 6, 5, 7},
                {9, 6, 7, 3, 4, 5, 8, 2, 1},
                {2, 5, 1, 8, 7, 6, 4, 9, 3},
                {5, 4, 8, 1, 3, 2, 9, 7, 6},
                {7, 2, 9, 5, 6, 4, 1, 3, 8},
                {1, 3, 6, 7, 9, 8, 2, 4, 5},
                {3, 7, 2, 6, 8, 9, 5, 1, 4},
                {8, 1, 4, 2, 5, 3, 7, 6, 9},
                {6, 9, 5, 4, 1, 7, 3, 8, 2}};

        System.out.println (isValidSoduku (matrix));
    }

    boolean isValidSoduku(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (!isValidCol (matrix, i)) {
                return false;
            } else if (!(isValidRow (matrix, i))) {
                return false;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix.length; k++) {
                if (i % 3 == 0 && k % 3 == 0) {
                    if (!in3by3 (matrix, i, k)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    boolean in3by3(int[][] matrix, int row, int col) {
        int sum = 0;

        for (int i = row; i < row + 3; i++) {
            for (int k = col; k < col + 3; k++) {
                sum += matrix[i][k];
            }
        }
        return sum == 45;
    }

    boolean isValidRow(int[][] matrix, int row) {
        int sum = 0;
        for (int r = 0; r < 9; r++) {
            sum += matrix[row][r];
        }
        return sum == 45;
    }

    boolean isValidCol(int[][] matrix, int col) {
        int sum = 0;
        for (int r = 0; r < 9; r++) {
            sum += matrix[r][col];
        }
        return sum == 45;
    }
}
