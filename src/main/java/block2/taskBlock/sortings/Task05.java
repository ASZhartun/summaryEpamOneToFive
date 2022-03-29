package block2.taskBlock.sortings;

import java.util.Arrays;

/**
 * 5. Сортировка вставками. Дана последовательность чисел a1,a2,a3,...,an. Требуется переставить числа в порядке
 * возрастания. Делается это следующим образом. Пусть a1,a2,...,ai - упорядоченная последовательность, т. е.
 * a1<=a2<=ai. Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая
 * последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i+1 до n
 * не будут перебраны.
 * Примечание. Место помещения очередного элемента в отсортированную часть производить
 * с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */

public class Task05 {
    public static void main(String[] args) {
        int[] sequence = new int[]{21, 44, 13, 11, 9, 5, 6, 27, 3, 2, 0};
        System.out.println("Start sequence: " + Arrays.toString(sequence));
        for (int i = 1; i < sequence.length; i++) {
            int index = getIndex(sequence, i);
            int count = i;
            //cycle of swap elements for placing sequence[i] to index position.
            //cycle pass with swap from right to left
            while (count != index) {
                int local = sequence[count];
                sequence[count] = sequence[count - 1];
                sequence[count - 1] = local;
                count--;
            }
        }
        System.out.println("Ordered sequence: " + Arrays.toString(sequence));
    }

    public static int getIndex(int[] sequence, int k) {
        int leftEdge = 0;
        int rightEdge = k;
        int center;
        //looking for in which half desired value of element is located
        while (rightEdge > leftEdge & (rightEdge - leftEdge) / 2 != 0) {
            center = (rightEdge + leftEdge) / 2;
            if (sequence[k] > sequence[center]) {
                leftEdge = center;
            } else if (sequence[k] < sequence[center]) {
                rightEdge = center;
            } else {
                return ++center;
            }
        }
        // if value of elem more than far right element of ordered sequence
        if (sequence[k] >= sequence[rightEdge]) {
            return rightEdge;
        }
        // if value of elem more than far left element of ordered sequence
        else if (sequence[k] >= sequence[leftEdge]) {
            return ++leftEdge;
        }
        // if value of elem less than far left element of ordered sequence
        else {
            return leftEdge;
        }
    }
}
