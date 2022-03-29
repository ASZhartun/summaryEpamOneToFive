package block2.taskBlock.decomposition;

/**
 * 9. Даны числа X, Y, Z, Т — длины сторон четырехугольника.
 * Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.
 */

public class Task09 {
    public static void main(String[] args) {
        double x = 6;
        double y = 15;
        double z = 7;
//        double t = 0;
        System.out.printf("Square of rectangle is %f", squareRectangle(x, y, z));
    }

    public static double squareRectangle(double h, double base, double roof) {
        return h * roof + h * (base - roof) * 0.5;
    }
}
