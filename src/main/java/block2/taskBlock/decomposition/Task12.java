package block2.taskBlock.decomposition;

import java.util.Arrays;

/**
 * 12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
 * элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
 */

public class Task12 {
    public static void main(String[] args) {
        final Task12 task12 = new Task12();
        int k = 5;
        int N = 500;
        int[] sequence = new int[0];
        for (int i = 0; i < N; i++) {
            if (task12.getSumOfDigits(i) == k) sequence = task12.addElem(sequence, i);
        }
        System.out.println(Arrays.toString(sequence));

    }

    public int[] addElem(int[] sequence, int adding) {
        final int[] wideSequence = new int[sequence.length + 1];
        System.arraycopy(sequence, 0, wideSequence, 0, sequence.length);
        wideSequence[sequence.length] = adding;
        return wideSequence;
    }

    private int getSumOfDigits(int i) {
        int sum = 0;
        while (i > 0) {
            sum += i % 10;
            i /= 10;
        }
        return sum;
    }
}
