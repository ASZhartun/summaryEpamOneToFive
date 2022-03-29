package block2.taskBlock.sortings;

import java.util.Arrays;

/**
 * 2. Даны две последовательности
 * a1 <= a2 <= a3 <= an
 * b1 <= b2 <= b3 <= bm.
 * Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
 * Примечание. Дополнительный массив не использовать.
 */

public class Task02 {
    public static void main(String[] args) {
        // Solution with agreement: n < m
        int[] aSequence = new int[]{1, 3, 5, 7, 9, 11, 13};
        int[] bSequence = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18};
        int[] resultSequence = new int[aSequence.length + bSequence.length];
        int n = 0;
        int m = 0;
        for (int i = 0; i < resultSequence.length; i++) {
            if (n >= aSequence.length) {
                resultSequence[i] = bSequence[m];
                m++;
            } else {
                if (aSequence[n] > bSequence[m]) {
                    resultSequence[i] = bSequence[m];
                    m++;
                } else {
                    resultSequence[i] = aSequence[n];
                    n++;
                }
            }
        }
        System.out.println(Arrays.toString(resultSequence));
    }
}
