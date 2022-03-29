package block1.taskBlock.linearProgram;

/**
 * 4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */
public class Task04 {
    public static void main(String[] args) {
        double source = 456.123;
        System.out.println("Source number: " + source);
        String[] split = Double.toString(source).split("\\.");
        double result = Double.parseDouble(split[1] + "." + split[0]);
        System.out.println("Result number: " + result);

    }
}
