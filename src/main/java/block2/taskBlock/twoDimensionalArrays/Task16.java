package block2.taskBlock.twoDimensionalArrays;

import block2.taskBlock.utilities.MatrixHelp;

import java.util.Arrays;

/**
 * 16. Магическим квадратом порядка n называется квадратная матрица размера nxn,
 * составленная из чисел 1, 2, 3,..., n^2 так, что суммы по каждому столбцу,
 * каждой строке и каждой из двух больших диагоналей равны между собой.
 * Построить такой квадрат. Пример магического квадрата порядка 3:
 * 6   1   8
 * 7   5   3
 * 2   9   4
 */

public class Task16 {
    public static void main(String[] args) {
        MatrixHelp matrixHelp = new MatrixHelp();
        int n = 5;
        if (n == 1) {
            int[][] matrix = new int[][]{{1}};
            matrixHelp.printMatrix(matrix);
        } else if (n == 2) {
            System.out.println("Matrix doesn't exist!");
        } else if (n % 2 != 0) {
            // section for n is odd
            int[][] matrix = new int[n][n];
            // init wrapper matrix for using terrace method
            int w = n / 2 * 2 + n;
            int[][] wrapper = new int[w][w];
            // filling wrapper
            int number = 1;
            // cycle for displacement diagonals of terrace
            for (int z = 0; z <= w / 2; z++) {
                // filling single diagonal
                for (int i = w / 2, j = 0; i >= 0; i--, j++) {
                    wrapper[i + z][j + z] = number++;
                }
            }
            //replace outer values of wrapper's lines
            // upper side
            for (int i = 0; i < (w - n) / 2; i++) {
                for (int j = 0; j < wrapper[0].length; j++) {
                    if (wrapper[i][j] != 0) {
                        wrapper[i + n][j] = wrapper[i][j];
                    }
                }
            }
            // bottom side
            for (int i = (w - n) / 2 + n; i < w; i++) {
                for (int j = 0; j < wrapper[0].length; j++) {
                    if (wrapper[i][j] != 0) {
                        wrapper[i - n][j] = wrapper[i][j];
                    }
                }
            }
            //replace outer values of wrapper's columns
            //left side
            for (int i = 0; i < (w - n) / 2; i++) {
                for (int j = 0; j < wrapper.length; j++) {
                    if (wrapper[j][i] != 0) {
                        wrapper[j][i + n] = wrapper[j][i];
                    }
                }
            }
            //right side
            for (int i = (w - n) / 2 + n; i < w; i++) {
                for (int j = 0; j < wrapper.length; j++) {
                    if (wrapper[j][i] != 0) {
                        wrapper[j][i - n] = wrapper[j][i];
                    }
                }
            }
            //put values of inner matrix of wrapper to result matrix
            for (int i = (w - n) / 2, z = 0; i < (w - n) / 2 + n; i++, z++) {
                for (int j = (w - n) / 2, y = 0; j < (w - n) / 2 + n; j++, y++) {
                    matrix[z][y] = wrapper[i][j];
                }
            }
            matrixHelp.printMatrix(matrix);
        } else if (n == 4) {
            // section for n == 4
            int[][] matrix = new int[4][4];
            int[][] temp = new int[4][4];
            int number = 1;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = number++;
                    temp[i][j] = matrix[i][j];
                }
            }
            matrixHelp.printMatrix(matrix);
            matrixHelp.printMatrix(temp);
            // mirror temp by Oy
            for (int i = 0; i < temp.length; i++) {
                int buff;
                for (int j = 0; j < temp[0].length / 2; j++) {
                    buff = temp[i][j];
                    temp[i][j] = temp[i][n - j - 1];
                    temp[i][n - j - 1] = buff;
                }
            }
            // mirror temp by Ox
            for (int i = 0; i < temp.length / 2; i++) {
                int buff;
                for (int j = 0; j < temp[0].length; j++) {
                    buff = temp[i][j];
                    temp[i][j] = temp[n - i - 1][j];
                    temp[n - i - 1][j] = buff;
                }
            }
            // fill frozen diagonals
            for (int i = 0; i < temp.length; i++) {
                temp[i][i] = matrix[i][i];
                temp[i][n - i - 1] = matrix[i][n - i - 1];
            }

            matrixHelp.printMatrix(temp);
        } else {
            System.out.println("To be continued...");
        }
    }
}
