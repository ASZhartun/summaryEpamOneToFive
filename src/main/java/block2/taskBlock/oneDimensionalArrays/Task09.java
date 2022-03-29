package block2.taskBlock.oneDimensionalArrays;

import java.util.Arrays;
import java.util.Random;

/**
 * 9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
 * чисел несколько, то определить наименьшее из них.
 */

public class Task09 {
    public static void main(String[] args) {
        int N = 10;
        int[] sequence = new int[N];
        int[] occurrences = new int[N];
        Random random = new Random();
        // filling sequence
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = random.nextInt(9) + 1;
        }
        System.out.println("Generated sequence: ");
        System.out.println(Arrays.toString(sequence));
        // calculate occurrences of numbers
        int topOccurrence = 0;
        for (int i = 0; i < sequence.length; i++) {
            int temp = sequence[i];
            for (int j = 0; j < sequence.length; j++) {
                if (temp == sequence[j]) occurrences[i]++;
            }
            // get max occurrences
            if (topOccurrence < occurrences[i]) topOccurrence = occurrences[i];
        }
        System.out.println(Arrays.toString(occurrences));
        System.out.println("^ occurrences ^");

        // get min value from numbers with top occurrence of sequence
        int resultNumber = Integer.MAX_VALUE;
        for (int i = 0; i < sequence.length; i++) {
            if (occurrences[i] == topOccurrence) {
                if (sequence[i] < resultNumber) resultNumber = sequence[i];
            }
        }

        System.out.println("Result: " + resultNumber);
    }
}
