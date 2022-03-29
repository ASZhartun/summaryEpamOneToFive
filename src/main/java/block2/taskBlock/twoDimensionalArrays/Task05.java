package block2.taskBlock.twoDimensionalArrays;

import block2.taskBlock.utilities.MatrixHelp;

/**
 * 5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * |   1       1       1       ...     1   1   1   |
 * |   2       2       2       ...     2   2   0   |
 * |   3       3       3       ...     3   0   0   |
 * |  n-1     n-1      0       ...     0   0   0   |
 * |   n       0       0       ...     0   0   0   |
 */

public class Task05 {
    public static void main(String[] args) {
        int N = 10;
        int[][] matrix = new int[N][N];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j >= matrix.length - i) {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = i + 1;
                }
            }
        }
        //fill and print generated matrix
        final MatrixHelp matrixHelp = new MatrixHelp();
        matrixHelp.printMatrix(matrix, "Result matrix: ");
    }
}
