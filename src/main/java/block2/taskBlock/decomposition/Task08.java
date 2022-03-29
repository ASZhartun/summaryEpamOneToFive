package block2.taskBlock.decomposition;

/**
 * 8. Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно
 * расположенных элементов массива с номерами от k до m.
 */

public class Task08 {
    public static void main(String[] args) {
        int[] sequence = new int[]{12, 13, 67, 23, 56, 1, 98, 45, 34, 12, 3, 45, 23};
        int k = 4;
        System.out.println(sumThreeElem(sequence, 2));

    }

    /**
     * return sum of three element of sequence
     * @param sequence - sequence of ints
     * @param k - index is from calculate sum of elements
     * @return - sum of three elements
     */
    public static int sumThreeElem(int[] sequence, int k) {
        int sum = 0;
        int m = k + 2;
        for (int i = k; i <= m; i++) {
            sum += sequence[i];
        }
        return sum;
    }
}
