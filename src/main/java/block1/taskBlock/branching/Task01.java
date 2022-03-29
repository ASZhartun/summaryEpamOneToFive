package block1.taskBlock.branching;

import block1.taskBlock.utilities.GetInput;

/**
 * 1. Даны два угла треугольника (в градусах).
 * Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
 */
public class Task01 {
    public static void main(String[] args) {
        GetInput getInput = new GetInput();
        System.out.println("First angle");
        int alpha = Integer.parseInt(getInput.scan());
        System.out.println("Second angle");
        int beta = Integer.parseInt(getInput.scan());
        getInput.close();

        if (180 > alpha + beta) {
            System.out.println("Triangle is existing!");
            if (alpha + beta == 90 || alpha == 90 || beta == 90) {
                System.out.println("Triangle is right-angle!");
            }
            else {
                System.out.println("Triangle isn't right-angle!");
            }
        }
        else System.out.println("Triable isn't existing!");
    }
}
