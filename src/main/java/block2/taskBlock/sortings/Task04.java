package block2.taskBlock.sortings;

import java.util.Arrays;

/**
 * 4. Сортировка обменами. Дана последовательность чисел a1 <= a2 <= an. Требуется переставить числа в
 * порядке возрастания. Для этого сравниваются два соседних числа ai, ai+1 . Если ai > ai+1 , то делается
 * перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
 * Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */

public class Task04 {
    public static void main(String[] args) {
        int[] sequence = new int[]{21, 15, 13, 12, 10, 8, 6, 5, 3, 2, 1, 0};
        int count = 0;
        for (int j = 0; j < sequence.length - 1; j++) {
            for (int i = 0; i < sequence.length - 1; i++) {
                if (sequence[i] > sequence[i + 1]) {
                    int temp = sequence[i];
                    sequence[i] = sequence[i + 1];
                    sequence[i + 1] = temp;
                    count++;
                }
            }
        }
        System.out.println("Quantity of swapping: " + count);
        System.out.println(Arrays.toString(sequence));
    }
}
