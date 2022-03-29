package block3.common.taskBlock.stringAsObject;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 8. Вводится строка слов, разделенных пробелами.
 * Найти самое длинное слово и вывести его на экран.
 * Случай, когда самых длинных слов может быть несколько, не обрабатывать.
 */

public class Task08 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();              //Example: dog soap coast thunder initialize
        scanner.close();
        final String[] words = input.split(" ");
        int index = 0;
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > words[i-1].length()) index = i;
        }
        System.out.println("Longest word is "+ words[index]);
    }
}
