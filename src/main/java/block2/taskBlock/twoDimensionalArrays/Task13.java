package block2.taskBlock.twoDimensionalArrays;

import block2.taskBlock.utilities.MatrixHelp;

/**
 * 13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */

public class Task13 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][4];

        //fill and print generated matrix
        final MatrixHelp matrixHelp = new MatrixHelp();
        matrixHelp.fillMatrix(matrix);
        matrixHelp.printMatrix(matrix);

        // sort columns of matrix by ascending order of elements
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                int temp = matrix[j][i];
                for (int k = j + 1; k < matrix.length; k++) {
                    if (matrix[j][i] > matrix[k][i]) {
                        temp = matrix[j][i];
                        matrix[j][i] = matrix[k][i];
                        matrix[k][i] = temp;
                    }
                }
            }
        }
        matrixHelp.printMatrix(matrix, "Result matrix was sorted by ascending order: ");

        // sort columns of matrix by descending order of elements
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                int temp = matrix[j][i];
                for (int k = j + 1; k < matrix.length; k++) {
                    if (matrix[j][i] < matrix[k][i]) {
                        temp = matrix[j][i];
                        matrix[j][i] = matrix[k][i];
                        matrix[k][i] = temp;
                    }
                }
            }
        }
        matrixHelp.printMatrix(matrix, "Result matrix was sorted by descending order: ");
    }
}
