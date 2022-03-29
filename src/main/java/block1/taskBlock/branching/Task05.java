package block1.taskBlock.branching;

import block1.taskBlock.utilities.GetInput;

/**
 * Вычислить значение функции:
 *          { x^2 - 3x  + 9, x <=3
 * f(x) =   |
 *          { 1/(x^3 + 6), x > 3
 */
public class Task05 {
    public static void main(String[] args) {
        GetInput getInput = new GetInput();
        double x = Double.parseDouble(getInput.scan());
        getInput.close();
        double result;
        if (x > 3) {
            result = 1 / (Math.pow(x, 3) + 6);
        } else {
            result = Math.pow(x, 2) - 3 * x + 9;
        }
        System.out.println("Result: " + result);
    }
}
