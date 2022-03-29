package block2.taskBlock.sortings;

import java.util.Arrays;

/**
 * 3. Сортировка выбором. Дана последовательность чисел a1 <= a2 <= an. Требуется переставить элементы так,
 * чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
 * элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
 * повторяется. Написать алгоритм сортировки выбором.
 */

public class Task03 {
    public static void main(String[] args) {
        int[] sequence = new int[]{1, 1, 2, 3, 4, 7, 9, 10, 12, 13, 16, 19, 21};
        for (int i = 0; i < sequence.length - 1; i++) {
            int tempMax = sequence[i];
            int tempIndex = i;
            for (int j = i + 1; j < sequence.length; j++) {
                if (tempMax < sequence[j]) {
                    tempMax = sequence[j];
                    tempIndex = j;
                }
            }
            if (i != tempIndex) {
                sequence[tempIndex] = sequence[i];
                sequence[i] = tempMax;
            }
        }
        System.out.println(Arrays.toString(sequence));
    }
}
