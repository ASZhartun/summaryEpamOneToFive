package block3.common.taskBlock.stringAsObject;

/**
 * 1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */

public class Task01 {
    public static void main(String[] args) {
        String sample = "5:    6:      8:        2:  1: 7:       ";
        int max = 0;
        int len = 0;
        for (int i = 0; i < sample.length(); i++) {
            if (sample.charAt(i) == ' ') {
                len++;
                if (len > max) {
                    max = len;
                }
            } else {
                len = 0;
            }
        }
        System.out.println("Max quantity of spaces: " + max);
    }
}
