package block2.taskBlock.twoDimensionalArrays;

import block2.taskBlock.utilities.MatrixHelp;

/**
 * 10. Найти положительные элементы главной диагонали квадратной матрицы.
 */

public class Task10 {
    public static void main(String[] args) {
        int N = 10;
        int[][] matrix = new int[N][N];
        final StringBuilder result = new StringBuilder();
        //fill and print generated matrix
        final MatrixHelp matrixHelp = new MatrixHelp();
        matrixHelp.fillMatrix(matrix, -5);
        matrixHelp.printMatrix(matrix);

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > 0) {
                result.append(matrix[i][i] + " with coordinates: " + "("+i+", "+i+")\n");
            }
        }
        System.out.println(result);
    }
}
