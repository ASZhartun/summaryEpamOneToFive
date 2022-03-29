package block1.taskBlock.branching;

import block1.taskBlock.utilities.GetInput;

/**
 * 3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */
public class Task03 {
    public static void main(String[] args) {
        GetInput getInput = new GetInput();
        int x1 = Integer.parseInt(getInput.scan());
        int y1 = Integer.parseInt(getInput.scan());
        int x2 = Integer.parseInt(getInput.scan());
        int y2 = Integer.parseInt(getInput.scan());
        int x3 = Integer.parseInt(getInput.scan());
        int y3 = Integer.parseInt(getInput.scan());
        getInput.close();

        int leftSide = (y3 - y1) * (x2-x1);
        int rightSide = (x3-x1) * (y2 - y1);
        System.out.println(leftSide == rightSide);
    }
}
