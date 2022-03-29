package block3.common.taskBlock.stringAsObject;

/**
 * 2. В строке вставить после каждого символа 'a' символ 'b'.
 */

public class Task02 {
    public static void main(String[] args) {
        char symbol = 'b';
        String sample = "axay aacc aaag";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sample.length(); i++) {
            result.append(sample.charAt(i));
            if (sample.charAt(i) == 'a') {
                result.append(symbol);
            }
        }
        System.out.println(sample);
        System.out.println(result);
    }
}
