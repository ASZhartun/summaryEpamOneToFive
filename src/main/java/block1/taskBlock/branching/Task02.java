package block1.taskBlock.branching;

import block1.taskBlock.utilities.GetInput;

/**
 * Найти max{min(a, b), min(c, d)}.
 */
public class Task02 {
    public static void main(String[] args) {
        GetInput getInput = new GetInput();
        System.out.print("a: ");
        int a = Integer.parseInt(getInput.scan());
        System.out.print("b: ");
        int b = Integer.parseInt(getInput.scan());
        System.out.print("c: ");
        int c = Integer.parseInt(getInput.scan());
        System.out.print("d: ");
        int d = Integer.parseInt(getInput.scan());
        getInput.close();

        int minF = a >= b? b: a;
        int minS = c >= d? d: c;
        int result = minF >= minS? minF: minS;
        System.out.println("Result: " + result);
    }
}
