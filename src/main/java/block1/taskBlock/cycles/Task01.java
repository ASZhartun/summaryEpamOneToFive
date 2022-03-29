package block1.taskBlock.cycles;

import block1.taskBlock.utilities.GetInput;
import block1.taskBlock.utilities.GetInput;

/**
 * 1. Напишите программу, где пользователь вводит <b>любое целое положительное число</b>.
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 */
public class Task01 {

    public static void main(String[] args) {
        GetInput getInput = new GetInput();
        double number = Math.abs(Double.parseDouble(getInput.scan()));
        getInput.close();
        int result = 0;
        for (int i = 1; i < number; i++) {
            result+=i;
        }
        System.out.println(result);
    }
}
