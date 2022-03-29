package block2.taskBlock.twoDimensionalArrays;

import block2.taskBlock.utilities.MatrixHelp;

/**
 * 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */

public class Task12 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][8];

        //fill and print generated matrix
        final MatrixHelp matrixHelp = new MatrixHelp();
        matrixHelp.fillMatrix(matrix);
        matrixHelp.printMatrix(matrix);
        // sort lines of matrix by ascending order of elements
        for (int i = 0; i < matrix.length; i++) {
            sort(matrix[i]);
        }
        matrixHelp.printMatrix(matrix, "Result matrix: ");
    }

    public static void sort(int[] matrix) {
        int temp;
        for (int i = 0; i < matrix.length - 1; i++) {
            temp = matrix[i];
            for (int j = i + 1; j < matrix.length; j++) {
                if (matrix[i] > matrix[j]) {
                    temp = matrix[i];
                    matrix[i] = matrix[j];
                    matrix[j] = temp;
                }
            }
        }
    }
}
