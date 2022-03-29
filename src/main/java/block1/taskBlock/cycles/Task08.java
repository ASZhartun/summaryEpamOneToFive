package block1.taskBlock.cycles;

import block1.taskBlock.utilities.GetInput;

import java.util.Arrays;

/**
 * 8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

public class Task08 {
    public static void main(String[] args) {
        GetInput getInput = new GetInput();
        System.out.println("Scheme of input: first -> second");
        int first = Integer.parseInt(getInput.scan());
        int second = Integer.parseInt(getInput.scan());
        getInput.close();


        char[] firstArray = String.valueOf(first).toCharArray();
        char[] secondArray = String.valueOf(second).toCharArray();
        char[] resultArray = new char[Math.max(firstArray.length, secondArray.length)];
        Arrays.fill(resultArray, Character.MIN_VALUE);

        char[] temp = new char[Math.max(firstArray.length, secondArray.length)];
        if (temp.length == secondArray.length) {
            temp = firstArray;
            firstArray = secondArray;
            secondArray = temp;
        }

        for (int i = 0; i < firstArray.length; i++) {
            boolean flag = true;
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] == secondArray[j]) {

                    for (int k = 0; k < resultArray.length; k++) {
                        if (firstArray[i] == resultArray[k]) {
                            flag = false;
                            break;
                        }
                    }

                    if (flag) resultArray[i] = firstArray[i];
                    break;
                }
            }
        }

        String digits = "";
        for (int i = 0; i < resultArray.length; i++) {
            if (resultArray[i] != Character.MIN_VALUE) {
                digits += resultArray[i];
                digits += " ";
            }
        }
        System.out.println("Result: " + digits);

    }
}
