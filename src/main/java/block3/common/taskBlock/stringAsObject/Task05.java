package block3.common.taskBlock.stringAsObject;

/**
 * 5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */

public class Task05 {
    public static void main(String[] args) {
        String sample = "agfhfaaaa4aaa3kjlaa2kljla"; // 11 times
        int count = 0;
        for (int i = 0; i < sample.length(); i++) {
            if (sample.charAt(i) == 'a') count++;
        }
        System.out.printf("a meets %d times", count);
    }
}
