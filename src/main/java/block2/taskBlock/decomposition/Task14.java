package block2.taskBlock.decomposition;

import java.util.Arrays;

/**
 * 14. Натуральное число, в записи которого n цифр, называется числом Армстронга,
 * если сумма его цифр, возведенная в степень n, равна самому числу.
 * Найти все числа Армстронга от 1 до k.
 * Для решения задачи использовать декомпозицию.
 */

public class Task14 {
    public static void main(String[] args) {
        final Task14 task14 = new Task14();
        final Task12 task12 = new Task12();
        int[] ints = new int[0];
        int k = 100_000;
        int n = 3;
        for (int i = 0; i < k; i++) {
            if (task14.powSumDigits(i, n) == i) ints = task12.addElem(ints, i);
        }
        System.out.println(Arrays.toString(ints));
    }

    public int powSumDigits(int number, int nPow) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return (int) Math.pow(sum, nPow);
    }
}
