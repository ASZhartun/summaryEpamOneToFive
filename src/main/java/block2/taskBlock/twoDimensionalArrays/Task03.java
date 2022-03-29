package block2.taskBlock.twoDimensionalArrays;

import block2.taskBlock.utilities.MatrixHelp;

/**
 * 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

public class Task03 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];

        //fill and print generated matrix
        final MatrixHelp matrixHelp = new MatrixHelp();
        matrixHelp.fillMatrix(matrix);
        matrixHelp.printMatrix(matrix);

        int kLine = 3;
        int pColumn = 4;

        // print specify line
        System.out.println("Result line: ");
        for (int i = 0; i < matrix[kLine].length; i++) {
            System.out.print(matrix[kLine][i] + " ");
        }

        System.out.println();

        // print specify column
        System.out.println("Result column:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][pColumn]);
        }
    }
}
