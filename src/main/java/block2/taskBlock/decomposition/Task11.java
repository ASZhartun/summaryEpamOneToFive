package block2.taskBlock.decomposition;

/**
 * 11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */

public class Task11 {
    public static void main(String[] args) {
        int first = 145654;
        int second = 2341;
        if (Task10.getLengthArray(first) > Task10.getLengthArray(second)) {
            System.out.println("First is longer");
        } else if (Task10.getLengthArray(first) < Task10.getLengthArray(second)) {
            System.out.println("Second is longer");
        } else System.out.println("Length of first equals length of second");
    }
}
