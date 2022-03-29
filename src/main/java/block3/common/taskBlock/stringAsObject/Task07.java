package block3.common.taskBlock.stringAsObject;

import java.util.Scanner;

/**
 * 7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
 * Например, если было введено "abc cde def", то должно быть выведено "abcdef".
 */

public class Task07 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        String sample = scanner.nextLine();
        scanner.close();
        System.out.println("Input string: " + sample);
        for (int i = 0; i < sample.length(); i++) {
            if (!result.toString().contains(sample.substring(i,i+1)) && sample.charAt(i)!=' ') {
                result.append(sample.charAt(i));
            }
        }
        System.out.println("Result string: " + result);
    }

}
