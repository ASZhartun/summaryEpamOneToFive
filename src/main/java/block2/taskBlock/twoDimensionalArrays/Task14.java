package block2.taskBlock.twoDimensionalArrays;

import block2.taskBlock.utilities.MatrixHelp;

import java.util.Random;

/**
 * 14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
 * единиц равно номеру столбца.
 */

public class Task14 {
    public static void main(String[] args) {
        int m = 12;
        int n = 9;
        int[][] matrix = new int[m][n];
        MatrixHelp matrixHelp = new MatrixHelp();
        Random random = new Random();
        // agreement: unit == '1'
        for (int i = 0; i < matrix[0].length; i++) {
            int units = 0;
            for (int j = 0; j < matrix.length; j++) {
                // condition: hasn't enough unit in column
                if (units < i) {
                    // condition: number of access elements of column isn't end-to-end
                    if ((i - units) < (matrix.length - j + 1)) {
                        int input = random.nextInt(2);
                        if (input == 1) units++;
                        matrix[j][i] = input;
                    } else {
                        //end-to-end -> add units to remaining elements
                        matrix[j][i] = 1;
                    }
                } else matrix[j][i] = 0;
            }
        }
        matrixHelp.printMatrix(matrix);
    }
}
