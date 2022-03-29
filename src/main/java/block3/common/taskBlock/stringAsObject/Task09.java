package block3.common.taskBlock.stringAsObject;

import java.util.Scanner;

/**
 * 9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
 * Учитывать только английские буквы.
 */

public class Task09 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String sample = scanner.nextLine();           // Hello. Insert Me. B:4, s:11
        scanner.close();
        int bigLetters = 0;
        int smallLetters = 0;
        for (int i = 0; i < sample.length(); i++) {
            if (sample.charAt(i) > 64 && sample.charAt(i) < 91) bigLetters++;
            if (sample.charAt(i) > 96 && sample.charAt(i) < 123) smallLetters++;
        }
        System.out.printf("Big letters: %d, small letters: %d", bigLetters, smallLetters);
    }
}
