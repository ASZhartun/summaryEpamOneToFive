package block1.taskBlock.branching;

import block1.taskBlock.utilities.GetInput;

import java.util.ArrayDeque;
import java.util.Arrays;

/**
 * 4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 * Определить, пройдет ли кирпич через отверстие.
 */
public class Task04 {
    public static void main(String[] args) {
        GetInput getInput = new GetInput();
        System.out.println("Dimensions of hole.");
        int A = Integer.parseInt(getInput.scan());
        int B = Integer.parseInt(getInput.scan());
        System.out.println("Dimensions of brick");
        int x = Integer.parseInt(getInput.scan());
        int y = Integer.parseInt(getInput.scan());
        int z = Integer.parseInt(getInput.scan());
        getInput.close();

        int[] brick = {x, y, z};
        int[] hole = {A, B};
        Arrays.sort(brick);
        Arrays.sort(hole);
        System.out.println(brick[0] < hole[0] && brick[1] < hole[1]);
    }
}
