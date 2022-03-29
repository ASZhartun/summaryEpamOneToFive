package block1.taskBlock.linearProgram;

import block1.taskBlock.utilities.GetInput;

/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * 𝑠𝑖𝑛𝑥+𝑐𝑜𝑠𝑦𝑐𝑜𝑠𝑥−𝑠𝑖𝑛𝑦∗𝑡𝑔 𝑥𝑦
 */
public class Task03 {
    public static void main(String[] args) {
        GetInput getInput = new GetInput();
        double x = Double.parseDouble(getInput.scan());
        double y = Double.parseDouble(getInput.scan());
        getInput.close();
        double result = Math.sin(x) + Math.cos(y) * Math.cos(x) - Math.sin(y) * Math.tan(x * y);
        System.out.println("Result: " + result);
    }
}
