package block2.taskBlock.oneDimensionalArrays;

import java.util.Arrays;

/**
 * 10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
 * элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */

public class Task10 {
    public static void main(String[] args) {
        int N = 11;
        int[] sequence = new int[N];

        // filling sequence
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = i;
        }
        System.out.println(Arrays.toString(sequence));

        // get deep of move through depend on even/odd of sequence.length
        int range =0;
        if (N % 2 == 0) {
            range = sequence.length / 2;
        }
        else range = sequence.length / 2 + 1;

        //compressed sequence
        for (int i = 1, y = 2; i < range ; i++, y += 2) {
            sequence[i] = sequence[y];
        }
        for (int i = range; i < sequence.length; i++) {
            sequence[i] = 0;
        }
        // print result sequence
        System.out.println(Arrays.toString(sequence));
    }
}
