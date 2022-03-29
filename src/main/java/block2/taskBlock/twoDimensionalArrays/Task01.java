package block2.taskBlock.twoDimensionalArrays;

import block2.taskBlock.utilities.MatrixHelp;

import java.util.Arrays;

/**
 * 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */

public class Task01 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];

        //fill and print generated matrix
        final MatrixHelp matrixHelp = new MatrixHelp();
        matrixHelp.fillMatrix(matrix);
        matrixHelp.printMatrix(matrix);

        // if condition is true print column
        for (int j = 0; j < matrix[0].length; j += 2) {
            if (matrix[0][j] > matrix[matrix.length - 1][j]) printColumn(matrix, j);
        }

    }

    // method for printing specify column of specify matrix
    public static void printColumn(int[][] matrix, int column) {
        String s = "";
        for (int i = 0; i < matrix.length; i++) {
            s += matrix[i][column] + "\n";
        }
        System.out.println(s);
    }
}
