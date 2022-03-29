package block2.taskBlock.twoDimensionalArrays;

import block2.taskBlock.utilities.MatrixHelp;

/**
 * 4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * | 1        2       3   ...    n  |
 * | n       n-1     n-2  ...    1  |
 * | 1        2       3   ...    n  |
 * | n       n-1     n-2  ...    1  |
 * | .............................  |
 * | n       n-1     n-2  ...    1  |
 */

public class Task04 {
    public static void main(String[] args) {
        int N = 10;
        int[][] matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < N; j++) {
                    matrix[i][j] = j + 1;
                }
            } else {
                for (int j = 0; j < N; j++) {
                    matrix[i][j] = N - j;
                }
            }

        }

        //print generated matrix
        final MatrixHelp matrixHelp = new MatrixHelp();
        matrixHelp.printMatrix(matrix, "Result matrix: ");
    }
}
