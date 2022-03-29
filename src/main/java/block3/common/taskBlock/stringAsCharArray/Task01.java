package block3.common.taskBlock.stringAsCharArray;

import java.util.Arrays;

/**
 * 1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */

public class Task01 {
    public static void main(String[] args) {
        final String[] titles = new String[]{"helloWorld", "strictAscending", "downShifting"};
        System.out.println(Arrays.toString(titles));
        final Task01 task01 = new Task01();
        for (int i = 0; i < titles.length; i++) {
            titles[i] = task01.transform(titles[i]);
        }
        System.out.println(Arrays.toString(titles));
    }

    public String transform(String title) {
        char[] chars = new char[title.length() + 1];
        for (int i = 0, j = 0; i < title.length(); i++, j++) {
            if (title.charAt(i) > 64 && title.charAt(i) < 91) {
                chars[j] = '_';
                chars[j + 1] = (char) (title.charAt(i) + 32);
                j++;
            } else {
                chars[j] = title.charAt(i);
            }
        }

        return String.valueOf(chars);
    }


}
