package block2.taskBlock.twoDimensionalArrays;

import block2.taskBlock.utilities.MatrixHelp;

/**
 * 6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 1   1   1   ...    1   1   1
 * 0   1   1   ...    1   1   0
 * 0   0   1   ...    1   0   0
 * ............................
 * 0   1   1   ...    1   1   0
 * 1   1   1   ...    1   1   1
 */

public class Task06 {
    public static void main(String[] args) {
        int N = 30;
        int[][] matrix = new int[N][N];

        //fill upper part of matrix
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j >= matrix[i].length - i && j > matrix[i].length / 2) {
                    matrix[i][j] = 0;
                } else if (j < i && j < matrix[i].length / 2 - 1) {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = 1;
                }
            }
        }
        //copy upper part of matrix to down part
        for (int i = matrix.length / 2; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrix[matrix.length - i - 1][j];
            }
        }
        //print generated matrix
        final MatrixHelp matrixHelp = new MatrixHelp();
        matrixHelp.printMatrix(matrix, "Result matrix: ");
    }
}
