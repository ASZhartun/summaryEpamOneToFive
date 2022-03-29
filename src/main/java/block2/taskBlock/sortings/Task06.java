package block2.taskBlock.sortings;

import java.util.Arrays;

/**
 * 6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
 * Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если  ai =< ai+1, то продвигаются
 * на один элемент вперед. Если  ai>ai+1, то производится перестановка и сдвигаются на один элемент назад.
 * Составить алгоритм этой сортировки.
 */

public class Task06 {
    public static void main(String[] args) {
        int[] sequence = new int[]{-15, 44, 13, 999, 9, 5, 6, 27, 3, 2, 0};
        System.out.println("Start sequence: ");
        System.out.println(Arrays.toString(sequence));
        for (int i = 0; i < sequence.length - 1; ) {
            if (sequence[i] > sequence[i + 1]) {
                int temp = sequence[i];
                sequence[i] = sequence[i + 1];
                sequence[i + 1] = temp;
                if (i != 0) i--;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(sequence));
    }
}
