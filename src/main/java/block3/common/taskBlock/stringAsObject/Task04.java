package block3.common.taskBlock.stringAsObject;

/**
 * 4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 */

public class Task04 {
    public static void main(String[] args) {
        String sample = "информатика";
        final String concat = sample.substring(7, 8).concat(sample.substring(3, 4).concat(sample.substring(4, 5).concat(sample.substring(7, 8))));
        System.out.println(concat);
    }
}
