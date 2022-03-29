package block2.taskBlock.decomposition;

import java.util.Arrays;

/**
 * 15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность.
 * Пример: 1234, 5789.
 * Для решения задачи использовать декомпозицию.
 */

public class Task15 {
    public static void main(String[] args) {
        final Task12 task12 = new Task12();
        final Task15 task15 = new Task15();
        int[] sequence = new int[0];
        int n = 10_000;
        for (int i = 0; i < n; i++) {
            if (task15.isStrictAscendingSequence(i)) {
                sequence = task12.addElem(sequence, i);
            }
        }
        System.out.println(Arrays.toString(sequence));
    }

    public boolean isStrictAscendingSequence(int number) {
        final int[] arrayDigits = getArrayDigits(number);
        for (int i = 0; i < arrayDigits.length - 1; i++) {
            if (arrayDigits[i + 1] - arrayDigits[i] != 1) return false;
        }
        return true;
    }

    public int[] getArrayDigits(int number) {
        int[] digits = new int[getLengthNumber(number)];
        for (int i = digits.length - 1; i > -1; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    private int getLengthNumber(int number) {
        int length = 0;
        while (number > 0) {
            number /= 10;
            length++;
        }
        return length;
    }
}
