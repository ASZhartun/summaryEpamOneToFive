package block2.taskBlock.twoDimensionalArrays;

import block2.taskBlock.utilities.MatrixHelp;

/**
 * 2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */

public class Task02 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];

        //fill and print generated matrix
        final MatrixHelp matrixHelp = new MatrixHelp();
        matrixHelp.fillMatrix(matrix);
        matrixHelp.printMatrix(matrix);

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][i] + " ");
        }
    }
}
