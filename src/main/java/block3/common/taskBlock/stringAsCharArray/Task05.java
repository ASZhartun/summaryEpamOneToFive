package block3.common.taskBlock.stringAsCharArray;


/**
 * 5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
 * Крайние пробелы в строке удалить.
 */

public class Task05 {
    public static void main(String[] args) {
        String sample = "   3this  2is   3space    4in a  2row2  ";
        char[] chars = sample.toCharArray();
        char[] preResult = new char[chars.length];
        boolean flag = true;
        for (int i = 0, j = 0; i < chars.length; i++) {
            if (chars[i] != ' ') flag = true;
            if (flag) {
                // set flag false that ban to add next elem is '\space'
                if (chars[i] == ' ') {
                    flag = false;
                    preResult[j] = chars[i];
                    j++;
                } else {
                    preResult[j] = chars[i];
                    j++;
                }
            }
        }
        int index = 0;
        for (int i = 1; i < preResult.length; i++) {
            //find end of string with 1 space at the end
            if (preResult[i] == ' ' && preResult[i + 1] == 0) {
                index = i;
                break;
            }
        }
        char[] result = new char[index - 1];
        for (int i = 1, j = 0; i < index; i++, j++) {
            result[j] = preResult[i];
        }
        System.out.println(String.valueOf(result));
    }
}
