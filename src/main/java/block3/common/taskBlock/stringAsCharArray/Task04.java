package block3.common.taskBlock.stringAsCharArray;

/**
 * 4. В строке найти количество чисел.
 */

public class Task04 {
    public static void main(String[] args) {
        String sample = "54There 123are 35numbers at least, maybe444.5"; // 5 numbers
        int countNumbers = 0;
        final char[] chars = sample.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            boolean conditionIsDigit = chars[i] > 47 && chars[i] < 58;
            boolean conditionIsLetterOrEndString;
            if (i + 1 == chars.length) {
                conditionIsLetterOrEndString = true;
            } else {
                conditionIsLetterOrEndString = (chars[i + 1] <= 47 || chars[i + 1] >= 58);
            }

            if (conditionIsDigit && conditionIsLetterOrEndString) countNumbers++;
        }
        System.out.printf("String has %d numbers\n", countNumbers);
    }


}
