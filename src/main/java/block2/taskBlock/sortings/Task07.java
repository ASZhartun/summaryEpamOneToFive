package block2.taskBlock.sortings;

import java.util.Arrays;

/**
 * 7. Пусть даны две неубывающие последовательности действительных чисел a1<=a2<=a3<=an и b1<=b2<=b3<=bm.
 * Требуется указать те места, на которые нужно вставлять элементы последовательности b1<=b2<=b3<=bm в первую
 * последовательность так, чтобы новая последовательность оставалась возрастающей.
 */

public class Task07 {
    public static void main(String[] args) {
        int[] aSequence = new int[]{1, 4, 7, 10, 13, 16, 19};
        int[] bSequence = new int[]{2, 5, 8, 9, 11, 12, 15, 18};
        System.out.println(Arrays.toString(aSequence));
        System.out.println(Arrays.toString(bSequence));
        int[] result = new int[aSequence.length + bSequence.length];
        int a = 0;
        int b = 0;
        for (int i = 0; i < result.length; i++) {
            if (a < aSequence.length & b < bSequence.length) {
                if (aSequence[a] <= bSequence[b]) {
                    result[i] = aSequence[a];
                    a++;
                } else {
                    result[i] = bSequence[b];
                    b++;
                }
            } else if (a >= aSequence.length) {
                result[i] = bSequence[b];
                b++;
            } else {
                result[i] = aSequence[a];
                a++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
