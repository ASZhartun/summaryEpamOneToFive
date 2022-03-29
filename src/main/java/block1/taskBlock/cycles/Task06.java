package block1.taskBlock.cycles;

/**
 * 6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */
public class Task06 {
    public static void main(String[] args) {
        for (int i = 0; i < 65536; i++) {
            char symbol = (char) i;
            System.out.println(symbol + " - " + i);
        }
    }
}
