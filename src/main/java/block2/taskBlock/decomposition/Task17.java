package block2.taskBlock.decomposition;

/**
 * 17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
 * Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */

public class Task17 {
    public static void main(String[] args) {
        final Task17 task17 = new Task17();
        int number = 148397;
        System.out.println("Start value: " + number);
        int count = 0;
        while (number > 0) {
            number = number - task17.getSumOfDigits(number);
            count++;
            System.out.println(number);
        }
        System.out.println("Quantity of operations: " + count);
    }

    public int getSumOfDigits(int number) {
        final Task15 task15 = new Task15();
        final int[] arrayDigits = task15.getArrayDigits(number);
        int sum = 0;
        for (int i = 0; i < arrayDigits.length; i++) {
            sum += arrayDigits[i];
        }
        return sum;
    }
}
