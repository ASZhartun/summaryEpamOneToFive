package block2.taskBlock.twoDimensionalArrays;

import block2.taskBlock.utilities.MatrixHelp;

/**
 * 15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */

public class Task15 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];

        //fill and print generated matrix
        final MatrixHelp matrixHelp = new MatrixHelp();
        matrixHelp.fillMatrix(matrix);
        matrixHelp.printMatrix(matrix);
        int max = getMaxElement(matrix);
        System.out.println("MAX element of matrix: " + max);
        System.out.println();
        // replace all odd elements by max value
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 !=0) matrix[i][j] = max;
            }
        }
        matrixHelp.printMatrix(matrix, "Result matrix: ");


    }

    public static int getMaxElement(int[][] matrix) {
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j]) max = matrix[i][j];
            }
        }
        return max;
    }
}
