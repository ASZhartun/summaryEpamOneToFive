package block2.taskBlock.decomposition;

import java.util.Arrays;

/**
 * 10. Дано натуральное число N. Написать метод(методы) для формирования массива,
 * элементами которого являются цифры числа N.
 */

public class Task10 {
    public static void main(String[] args) {
        int N = 145892;
        int[] arrayFromNumber = getArrayFromNumber(N);
        System.out.println(Arrays.toString(arrayFromNumber));
    }

    public static int[] getArrayFromNumber(int N) {
        int[] array = new int[getLengthArray(N)];
        for (int i = array.length - 1; i > -1; i--) {
            array[i] = N % 10;
            N /= 10;
        }
        return array;
    }

    public static int getLengthArray(int temp) {
        int length = 0;
        while (temp > 0) {
            temp /= 10;
            length++;
        }
        return length;
    }
}
