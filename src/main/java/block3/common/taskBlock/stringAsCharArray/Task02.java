package block3.common.taskBlock.stringAsCharArray;

/**
 * 2. Замените в строке все вхождения 'word' на 'letter'.
 */

public class Task02 {
    public static void main(String[] args) {
        final Task02 task02 = new Task02();
        String sample = "Hello word or world, wordiness or wordless, in oddworld by oddwords.";
        char[] target = {'w', 'o', 'r', 'd'};
        char[] replacement = {'l', 'e', 't', 't', 'e', 'r'};
        char[] chars = sample.toCharArray();
        for (int i = 0; i < chars.length; ) {
            if (isWord(chars, i, target)) {
                chars = task02.replace(chars, i, replacement, target);
                i+=6;
            }
            i++;
        }
        System.out.println(String.valueOf(chars));
    }


    public char[] replace(char[] src, int pos, char[] replacement, char[] target) {
        final char[] chars = new char[src.length + replacement.length - target.length];
        for (int i = 0; i < pos; i++) {
            chars[i] = src[i];
        }

        for (int i = 0; i < replacement.length; i++) {
            chars[i + pos] = replacement[i];
        }

        for (int i = pos + replacement.length; i < chars.length; i++) {
            chars[i] = src[i - replacement.length + target.length];
        }

        return chars;
    }

    public static boolean isWord(char[] src, int pos, char[] target) {
        for (int i = 0; i < target.length; i++) {
            if (src[i + pos] != target[i]) return false;
        }
        return true;
    }
}
