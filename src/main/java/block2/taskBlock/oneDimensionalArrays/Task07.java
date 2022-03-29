package block2.taskBlock.oneDimensionalArrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Даны действительные числа a1, a2, ... a2n.
 * Найти: max( a1 + a2n, a2 + a2n−1, ... , an + an+1)
 */

public class Task07 {
    public static void main(String[] args) {
        int N = 24;
        double[] sequence = new double[N];
        double max = 0;
        Random random = new Random();
        for (int i = 0; i < sequence.length / 2; i++) {
            sequence[i] = random.nextDouble(24);
            sequence[sequence.length - i - 1] = random.nextDouble(24);
            double sum = sequence[i] + sequence[sequence.length - i - 1];
            System.out.println("Sum: " + sum + " with indices (" + i + ", " + (sequence.length - i - 1) + ")");
            if (max < sum) {
                max = sum;
            }
        }
        System.out.println("Generated sequence: ");
        System.out.println(Arrays.toString(sequence));
        System.out.println("MAX = " + max);
    }
}
