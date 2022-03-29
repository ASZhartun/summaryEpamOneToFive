package block2.taskBlock.oneDimensionalArrays;

import java.util.Arrays;
import java.util.Random;

/**
 * 3. Дан массив действительных чисел, размерность которого N.
 * Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
 */

public class Task03 {
    public static void main(String[] args) {
        int N = 25;
        int zeros = 0;
        int negatives = 0;
        int positives = 0;
        double[] array = new double[N];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble((11-(-10) )) + (-10); //[a;b) => a = -10; b = 11; => random(b+a) - a;
            if (array[i] > 0) positives++;
            else if (array[i] == 0) zeros++;
            else negatives++;
        }
        System.out.println("Result:");
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Zeros received: " + zeros);
        System.out.println("Negatives received: " + negatives);
        System.out.println("Positives received: " + positives);
    }
}
