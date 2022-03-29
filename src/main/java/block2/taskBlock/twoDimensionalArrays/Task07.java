package block2.taskBlock.twoDimensionalArrays;

import block2.taskBlock.utilities.MatrixHelp;

import java.util.Arrays;

/**
 * 7. Сформировать квадратную матрицу порядка N по правилу:
 *      A[I,J] = sin((I^2-J^2)/N)
 * и подсчитать количество положительных элементов в ней.
 */

public class Task07 {
    public static void main(String[] args) {
        int N = 5;
        int positiveElements = 0;
        double[][] matrix = new double[N][N];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rule(i,j,N);
                if (matrix[i][j] > 0) positiveElements++;
            }
        }
        System.out.println("Generated matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("Positive elements: " + positiveElements);
    }

    public static double rule(int i, int j, int N) {
        return Math.sin((Math.pow(i,2)-Math.pow(j,2))/N);
    }
}
