package block2.taskBlock.oneDimensionalArrays;

import java.util.Arrays;
import java.util.Random;

/**
 * 8. Дана последовательность целых чисел a1, a2, ... an.
 * Образовать новую последовательность, выбросив из исходной те члены, которые равны
 * min(a1,a2,...an)
 */

public class Task08 {
    public static void main(String[] args) {
        int N = 25;
        int[] sequence = new int[N];
        Random random = new Random();
        int min = 999;
        int count = 0;
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = random.nextInt(4) + 1;
            if (min > sequence[i]) min = sequence[i];
        }

        System.out.println("Generated sequence: ");
        System.out.println(Arrays.toString(sequence) + " with length: " + sequence.length);
        System.out.println("MIN = " + min);

        // Replace min value of array's element to "-1"
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] == min) {
                sequence[i] = -1;

            } else count++;
        }
        System.out.println("Elements for delete from sequence: " + (sequence.length - count));

        // Get all values from old array to new array except "-1".
        int[] resultSequence = new int[count];
        int index = 0;
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] != -1) {
                resultSequence[index] = sequence[i];
                index++;
            }
        }
        System.out.println();
        System.out.println("Result sequence: ");
        System.out.println(Arrays.toString(resultSequence) + " with length: " + resultSequence.length);
    }
}
