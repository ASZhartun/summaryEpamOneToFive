package block1.taskBlock.cycles;

import java.math.BigDecimal;

/**
 * 4. Составить программу нахождения произведения квадратов первых двухсот чисел.
 */
public class Task04 {
    public static void main(String[] args) {
        BigDecimal result = new BigDecimal(1);
        BigDecimal temp;
        for (int i = 1; i <= 200; i++) {
            temp = BigDecimal.valueOf(i * i);
            result = result.multiply(temp);
        }
        System.out.println("Result: " + result);
    }
}
