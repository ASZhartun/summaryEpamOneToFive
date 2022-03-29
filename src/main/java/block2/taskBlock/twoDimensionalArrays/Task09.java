package block2.taskBlock.twoDimensionalArrays;

import block2.taskBlock.utilities.MatrixHelp;

/**
 * 9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
 * столбец содержит максимальную сумму.
 */

public class Task09 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][3];

        //fill and print generated matrix
        final MatrixHelp matrixHelp = new MatrixHelp();
        matrixHelp.fillMatrix(matrix);
        matrixHelp.printMatrix(matrix);

        int max = 0;
        int column = 0;
        // running through the columns, get max of each
        for (int i = 0; i < matrix[0].length; i++) {
            int temp = 0;
            for (int j = 0; j < matrix.length; j++) {
                temp += matrix[j][i];
            }
            // search max value, get №Column of max value.
            if (max < temp) {
                max = temp;
                column = i;
            }
        }
        System.out.println("MAX: " + max + " of column: " + column);
    }
}
