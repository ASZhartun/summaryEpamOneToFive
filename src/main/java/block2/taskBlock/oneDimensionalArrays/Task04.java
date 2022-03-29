package block2.taskBlock.oneDimensionalArrays;

import java.util.Arrays;
import java.util.Random;

/**
 * 4. Даны действительные числа а1 ,а2 ,..., аn .
 * Поменять местами наибольший и наименьший элементы.
 */

public class Task04 {
    public static void main(String[] args) {
        int N = 25;
        double max = 0;
        double min = 999;
        double[] array = new double[N];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble(25);
            if(array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("MAX = " + max);
        System.out.println("MIN = " + min);
        System.out.println("Array's comparison...");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) array[i] = max;
            if (array[i] == max) array[i] = min;
        }
        System.out.println(Arrays.toString(array));

    }
}
