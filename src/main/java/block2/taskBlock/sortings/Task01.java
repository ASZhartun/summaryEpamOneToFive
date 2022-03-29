package block2.taskBlock.sortings;

import java.util.Arrays;

/**
 * 1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
 * один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
 * дополнительный массив.
 */

public class Task01 {
    public static void main(String[] args) {
        int[] firstArray = new int[10];
        int[] secondArray = new int[7];
        int[] resultArray = new int[firstArray.length + secondArray.length];
        int k = 5;
        Arrays.fill(firstArray, 1);
        Arrays.fill(secondArray, 2);
        for (int i = 0; i < k; i++) {
            resultArray[i] = firstArray[i];
        }

        for (int i = k, z = 0; i < secondArray.length + k; i++, z++) {
            resultArray[i] = secondArray[z];
        }

        for (int i = secondArray.length + k, z = k; i < resultArray.length; i++, z++) {
            resultArray[i] = firstArray[z];
        }
        System.out.println(Arrays.toString(resultArray));
    }
}
