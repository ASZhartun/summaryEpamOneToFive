package block3.common.taskBlock.stringAsObject;

/**
 * 6. Из заданной строки получить новую, повторив каждый символ дважды.
 */

public class Task06 {
    public static void main(String[] args) {
        String sample = "abcdefgh";
        System.out.println("Sample of string: " + sample);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sample.length(); i++) {
            result.append(sample.charAt(i));
            result.append(sample.charAt(i));
        }
        System.out.println("Result string: " + result);
    }
}
