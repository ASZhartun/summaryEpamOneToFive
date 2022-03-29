package block1.taskBlock.cycles;

import block1.taskBlock.utilities.GetInput;

/**
 * Вычислить значения функции на отрезке [а,b] c шагом h:
 *      {x, x > 2
 * y =  |
 *      { -x, x <=2
 */
public class Task02 {
    public static void main(String[] args) {
        GetInput getInput = new GetInput();
        System.out.println("Scheme of input: a -> b -> h");
        double a = Double.parseDouble(getInput.scan());
        double b = Double.parseDouble(getInput.scan());
        double h = Double.parseDouble(getInput.scan());
        getInput.close();

        double result = 0;
        for (; a <= b; a += h) {
            if (a <= 2) {
                result -= a;
            } else {
                result += a;
            }
        }
        System.out.println(result);
    }
}
