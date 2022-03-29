package block2.taskBlock.decomposition;

import java.util.Arrays;

/**
 * 16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
 * Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */

public class Task16 {
    public static void main(String[] args) {
        final Task12 task12 = new Task12();
        final Task16 task16 = new Task16();
        int[] numbers = new int[0];
        int n = 150;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (task16.isAllOddDigits(i)) {
                numbers = task12.addElem(numbers, i);
                sum += i;
            }
        }
        int count = task16.getQuantityEvenDigits(sum);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        System.out.println("Quantity of even digits: " + count);

    }

    public boolean isAllOddDigits(int number) {
        final Task15 task15 = new Task15();
        final int[] arrayDigits = task15.getArrayDigits(number);
        for (int i = 0; i < arrayDigits.length; i++) {
            if (arrayDigits[i] % 2 == 0) return false;
        }
        return true;
    }

    public int getQuantityEvenDigits(int number) {
        int count = 0;
        final Task15 task15 = new Task15();
        final int[] arrayDigits = task15.getArrayDigits(number);
        for (int i = 0; i < arrayDigits.length; i++) {
            if (arrayDigits[i] % 2 == 0) count++;
        }
        return count;
    }
}
