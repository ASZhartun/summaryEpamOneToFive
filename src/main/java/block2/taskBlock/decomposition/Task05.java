package block2.taskBlock.decomposition;

/**
 * 5. Составить программу, которая в массиве A[N] находит второе по величине число
 * (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).
 */

public class Task05 {
    public static void main(String[] args) {
        int[] sequence = new int[]{14, 12, 21, 16, 23, 15, 8, 19, 2, 0, 1};
        final int max = getMax(sequence);
        int top2 = 0;
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] == max) continue;
            if (top2 < sequence[i]) top2 = sequence[i];
        }
        System.out.println("Max value of sequence is " + max);
        System.out.println("Top 2 value of sequence is " + top2);
    }

    public static int getMax(int[] sequence) {
        int max = 0;
        for (int i = 0; i < sequence.length; i++) {
            if (max < sequence[i]) max = sequence[i];
        }
        return max;
    }
}
