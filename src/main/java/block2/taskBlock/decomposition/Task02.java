package block2.taskBlock.decomposition;

import java.util.Arrays;

/**
 * 2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */

public class Task02 {
    public static void main(String[] args) {
        int[] sample = new int[]{16, 28, 44, 64};
        Arrays.sort(sample);
        int nod = 1;
        for (int i = 2; i < sample[0]; i++) {
            if (sample[0] % i == 0 && sample[1] % i == 0 && sample[2] % i == 0 && sample[3] % i == 0) {
                nod = i;
            }
        }
        System.out.println("NOD = " + nod);
    }
}
