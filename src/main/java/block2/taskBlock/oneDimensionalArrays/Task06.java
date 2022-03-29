package block2.taskBlock.oneDimensionalArrays;

import java.util.Arrays;
import java.util.Random;

/**
 * 6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
 * являются простыми числами.
 */

public class Task06 {
    public static void main(String[] args) {
        int N = 100;
        double[] sequence = new double[N];
        double sum = 0;
        Random random = new Random();
        System.out.println("Check prime indexes: ");
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = random.nextDouble(10);
            if (isPrimeNumber(i)) {
                sum += sequence[i];
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Generated array: " + Arrays.toString(sequence));
        System.out.println("Result: " + sum);

    }

    public static boolean isPrimeNumber(int index) {
        int source = index;
        index--;
        boolean flag = true;
        while (index > 1) {
            if (source % index == 0) {
                flag = false;
                break;
            }
            index--;
        }
        return flag;
    }
}
