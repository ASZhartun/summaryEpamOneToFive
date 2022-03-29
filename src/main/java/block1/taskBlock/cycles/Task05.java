package block1.taskBlock.cycles;

import block1.taskBlock.utilities.GetInput;

/**
 * 5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
 * заданному е. Общий член ряда имеет вид:
 * a<sub>n</sub> = 1 / 2<sup>n</sup> + 1 / 3<sup>n</sup>
 */
public class Task05 {
    public static void main(String[] args) {
        GetInput getInput = new GetInput();
        System.out.println("Scheme input: e -> n. Recommended 0 < e < 1");
        double e = Double.parseDouble(getInput.scan());
        int n = Integer.parseInt(getInput.scan());
        getInput.close();

        double result = 0;
        double temp;
        for (int i = 0; i <= n; i++) {
            temp = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (Math.abs(temp) >= e) {
                result += temp;
            }
        }

        System.out.println("Result: " + result);
    }
}
