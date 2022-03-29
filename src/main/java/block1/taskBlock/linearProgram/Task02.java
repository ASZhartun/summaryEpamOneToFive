package block1.taskBlock.linearProgram;

import block1.taskBlock.utilities.GetInput;

/**
 * 2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * 𝑏+(√(𝑏^2+4𝑎𝑐)/2𝑎)−𝑎^3𝑐+𝑏^(−2)
 */
public class Task02 {
    public static void main(String[] args) {
        GetInput getInput = new GetInput();
        double a = Double.parseDouble(getInput.scan());
        double b = Double.parseDouble(getInput.scan());
        double c = Double.parseDouble(getInput.scan());
        getInput.close();
        double result = b + Math.sqrt(b * b + 4 * a * c) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("Result: " + result);
    }
}
