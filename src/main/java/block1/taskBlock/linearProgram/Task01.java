package block1.taskBlock.linearProgram;

import block1.taskBlock.utilities.GetInput;

/**
 * 1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
 */

public class Task01 {
    public static void main(String[] args) {
        GetInput getInput = new GetInput();
        int a = Integer.parseInt(getInput.scan());
        int b = Integer.parseInt(getInput.scan());
        int c = Integer.parseInt(getInput.scan());
        getInput.close();
        int z = ((a - 3) * b / 2) + c;
        System.out.println("Result: " + z);
    }
}
