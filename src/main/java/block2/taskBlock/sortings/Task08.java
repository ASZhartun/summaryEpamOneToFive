package block2.taskBlock.sortings;

/**
 * 8.Даны дроби
 * p1  ,  p2  , pn
 * q1     q2    qn
 * (pi, qi - натуральные). Составить программу, которая приводит эти дроби к общему
 * знаменателю и упорядочивает их в порядке возрастания.
 */

public class Task08 {
    public static void main(String[] args) {
        int[] numerator = new int[]{9, 7, 5, 3, 1};
        int[] denominator = new int[]{10, 8, 6, 4, 2};
        System.out.println("Start sequence of fractions");
        for (int i = 0; i < numerator.length; i++) {
            System.out.print(numerator[i] + "/" + denominator[i] + "   ");
        }
        System.out.println();

        int commonDenominator = 1;
        boolean flag = true;
        // get commonDenominator
        while (flag) {
            commonDenominator++;
            for (int i = 0; i < denominator.length; i++) {
                if (commonDenominator / denominator[i] >= 1 && commonDenominator % denominator[i] == 0) flag = false;
                else {
                    flag = true;
                    break;
                }
            }
        }
        // multiply numerators
        for (int i = 0; i < numerator.length; i++) {
            numerator[i] *= commonDenominator / denominator[i];
        }
        System.out.println("Fractions with common denominator");
        for (int i = 0; i < numerator.length; i++) {
            System.out.print(numerator[i] + "/" + commonDenominator + "   ");
        }
        System.out.println();

        //sorting fractions
        for (int i = 1; i < numerator.length; i++) {
            int current = numerator[i];
            int j = i;
            while (j > 0 && current < numerator[j - 1]) {
                numerator[j] = numerator[j - 1];
                numerator[j - 1] = current;
                j--;
            }
        }
        System.out.println("Ascending sorted sequence of fractions");
        for (int i = 0; i < numerator.length; i++) {
            System.out.print(numerator[i] + "/" + commonDenominator + "   ");
        }

    }
}
