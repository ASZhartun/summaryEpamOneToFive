package block2.taskBlock.oneDimensionalArrays;

import java.util.Arrays;

/**
 * 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */
public class Task01 {
    public static void main(String[] args) {
        int[] arr = new int[25];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
        int K = 6;
        int summa = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % K == 0) {
                summa += arr[i];
            }
        }
        System.out.println("Result: " + summa); // for [0,25] with K = 6 => 6 + 12 + 18 + 24 = 60;
    }
}
