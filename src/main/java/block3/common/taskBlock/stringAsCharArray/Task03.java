package block3.common.taskBlock.stringAsCharArray;

/**
 * 3. В строке найти количество цифр.
 */

public class Task03 {
    public static void main(String[] args) {
        String sample = "There 123are 4digits at least.";
        final char[] chars = sample.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < 58 && chars[i] > 47) count++;
        }
        System.out.println("Quantity of digits: " + count);
    }
}
