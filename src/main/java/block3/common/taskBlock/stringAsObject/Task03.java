package block3.common.taskBlock.stringAsObject;

/**
 * 3. Проверить, является ли заданное слово палиндромом.
 */

public class Task03 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("kazak"));
        System.out.println(isPalindrome("kazan"));
        System.out.println(isPalindrome("kazzak"));
        System.out.println(isPalindrome("mazzan"));

    }

    public static boolean isPalindrome(String sample) {
        for (int i = 0; i < sample.length() / 2; i++) {
            if (sample.charAt(i) != sample.charAt(sample.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
