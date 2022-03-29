package block2.taskBlock.twoDimensionalArrays;

import block2.taskBlock.utilities.MatrixHelp;

import java.util.Arrays;

/**
 * 8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
 * на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
 * пользователь с клавиатуры.
 */

public class Task08 {
    public static void main(String[] args) {
        int N = 5;
        int[][] matrix = new int[N][N];
        //print generated matrix
        final MatrixHelp matrixHelp = new MatrixHelp();
        matrixHelp.fillMatrix(matrix);
        matrixHelp.printMatrix(matrix);
        // get user's columns to swap
        int firstColumn = matrixHelp.scanInt();
        int secondColumn = matrixHelp.scanInt();
        matrixHelp.close();
        //swap columns
        int temp = 0;
        for (int i = 0; i < matrix.length; i++) {
            temp = matrix[i][firstColumn];
            matrix[i][firstColumn] = matrix[i][secondColumn];
            matrix[i][secondColumn] = temp;
        }
        matrixHelp.printMatrix(matrix, "Matrix after swapping:");
    }
}
