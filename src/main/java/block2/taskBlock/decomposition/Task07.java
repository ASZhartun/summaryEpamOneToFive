package block2.taskBlock.decomposition;

/**
 * 7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */

public class Task07 {
    public static void main(String[] args) {
        int n = 1;
        int m = 9;
        final Task07 task07 = new Task07();
        final int sum = task07.sum(n, m);
        System.out.printf("Sum of factorials of odds from %d to %d: %d", n, m, sum);
    }

    public int factorial(int f) {
        if (f == 1) return 1;
        else return factorial(f - 1) * f;
    }

    public int sum(int bottom, int top) {
        int sum = 0;
        for (int i = bottom; i <= top; i += 2) {
            sum += factorial(i);
        }
        return sum;
    }
}
