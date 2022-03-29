package block3.common.taskBlock.stringAsObject;

/**
 * 10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
 * восклицательным или вопросительным знаком.
 * Определить количество предложений в строке X.
 */

public class Task10 {
    public static void main(String[] args) {
        String x = "Hello! I'm a human? No.";
        int count = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '.' || x.charAt(i) == '!' || x.charAt(i) == '?') count++;
        }
        System.out.printf("X has %d sentences", count);
    }
}
