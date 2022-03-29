package block2.taskBlock.utilities;

import java.util.Random;
import java.util.Scanner;

public class MatrixHelp {
    Scanner scanner;
    StringBuilder image;

    public MatrixHelp() {
        this.image = new StringBuilder();
        this.scanner = new Scanner(System.in);
    }

    public void printMatrix(int[][] matrix, String message) {
        this.image.delete(0,this.image.length());
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 10) {
                    this.image.append("  ");
                    this.image.append(matrix[i][j]);
                    this.image.append(" ");
                } else {
                    this.image.append(" ");
                    this.image.append(matrix[i][j]);
                    this.image.append(" ");
                }

            }
            this.image.append('\n');
        }
        System.out.println(message);
        System.out.println(this.image);
    }

    public void printMatrix(int[][] matrix) {
        printMatrix(matrix, "Generated matrix: ");
    }

    public void fillMatrix(int[][] matrix, int isNegativeHere) {
        final Random random = new Random();
        if (isNegativeHere < 0) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = random.nextInt(9 + 9) + 1 - 9;
                }
            }
        }
        else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = random.nextInt(16);
                }
            }
        }

    }

    public void fillMatrix(int[][] matrix) {
        fillMatrix(matrix, 1);
    }

    public int scanInt() {
        int digit = -1;
        System.out.println("Input Integer: ");
        if (scanner.hasNextInt()) {
            digit = scanner.nextInt();
        }
        return digit;
    }

    public void close() {
        this.scanner.close();
    }
}
