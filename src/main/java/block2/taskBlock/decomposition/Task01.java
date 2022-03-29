package block2.taskBlock.decomposition;

/**
 * 1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
 * натуральных чисел:
 * НОК(А,В) = А * В / НОД(А,В)
 */

public class Task01 {
    public static void main(String[] args) {
        int a = 9;
        int b = 15;
        System.out.println("HOД = " + nod(a, b));
        System.out.println("HOK = " + nok(a, b));
    }

    public static int nod(int a, int b) {
        int nodValue = 1;
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        for (int i = 2; i <= b; i++) {
            if (a % i == 0 && b % i == 0) nodValue = i;
        }
        return nodValue;
    }

    public static int nok(int a, int b) {
        int nokValue = 1;
        if (a > b) {
            nokValue = a;
        } else nokValue = b;
        while (true) {
            if ((nokValue % a == 0 && nokValue / a >= 1) && (nokValue % b == 0 && nokValue / b >= 1)) break;
            nokValue++;
        }
        return nokValue;
    }
}
