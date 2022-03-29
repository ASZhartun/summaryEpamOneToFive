package block1.taskBlock.linearProgram;

import block1.taskBlock.utilities.GetInput;

/**
 * 6. Для данной области составить линейную программу, которая печатает true,
 * если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
 * <a src="/Practice (tasks).pdf">pic.1 of task 6</a>
 */
public class Task06 {
    public static void main(String[] args) {
        GetInput getInput = new GetInput();
        int x = Integer.parseInt(getInput.scan());
        int y = Integer.parseInt(getInput.scan());
        boolean x_scope = (x >= -4) && (x <= 4);
        boolean y_scope = (y >= -3) && (y <= 4);
        boolean result = false;
        System.out.println(x_scope && y_scope);
    }
}
