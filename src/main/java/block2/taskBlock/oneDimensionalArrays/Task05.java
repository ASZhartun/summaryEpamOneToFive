package block2.taskBlock.oneDimensionalArrays;

import java.util.Arrays;
import java.util.Random;

/**
 * 5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */

public class Task05 {
    public static void main(String[] args) {
        int N = 25;
        int[] sequence = new int[N];
        Random random = new Random();
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = random.nextInt(26 + 25) - 25;
            if (sequence[i] > i) {
                System.out.println(sequence[i] + " with index " + i);
            }
        }
        System.out.println("Generated array: ");
        System.out.println(Arrays.toString(sequence));
    }
}
