package block2.taskBlock.oneDimensionalArrays;

import java.util.Arrays;
import java.util.Random;

/**
 * 2. Дана последовательность действительных чисел а1 ,а2 ,..., ап.
 * Заменить все ее члены, большие данного Z, этим числом.
 * Подсчитать количество замен.
 */
public class Task02 {
    public static void main(String[] args) {
        double Z = 4;
        int count = 0;
        double[] sequence = new double[25];
        Random random = new Random();

        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = random.nextDouble(25);
            if (sequence[i] > Z) {
                sequence[i] = Z;
                count++;
            }
        }
        System.out.println("Result: ");
        System.out.println("Array: " + Arrays.toString(sequence));
        System.out.println("Replacements: " + count);
    }
}