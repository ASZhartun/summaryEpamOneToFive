package block2.taskBlock.twoDimensionalArrays;

import block2.taskBlock.utilities.MatrixHelp;

import java.util.Arrays;

/**
 * 11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
 * которых число 5 встречается три и более раз.
 */

public class Task11 {
    public static void main(String[] args) {
        int[][] matrix = new int[20][10];

        //fill and print generated matrix
        final MatrixHelp matrixHelp = new MatrixHelp();
        matrixHelp.fillMatrix(matrix);
        matrixHelp.printMatrix(matrix);

        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]==5) count++;
                if (count > 2) {
                    System.out.println("Строка № " + (i + 1) + "(в общечеловеческом смысле)" + ", в строке № " + i + " согласно нумерации массива");
                    count = 0;
                    break;
                }
            }
        }
    }
}
