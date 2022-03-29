package block2.taskBlock.decomposition;

/**
 * 13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
 * Для решения задачи использовать декомпозицию.
 */

public class Task13 {
    public static void main(String[] args) {
        int n = 40;
        int roof = n * 2;
        int temp;
        if (isPride(n)) {
            temp = n;
        } else temp = 1;
        for (int i = n; i < roof + 1; i++) {
            if (isPride(i)) {
                if (i - temp == 2) System.out.println(temp + " " + i);
                temp = i;
            }
        }

    }

    public static boolean isPride(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
