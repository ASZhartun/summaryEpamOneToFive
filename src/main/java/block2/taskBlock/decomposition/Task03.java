package block2.taskBlock.decomposition;

/**
 * 3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
 */

public class Task03 {
    public static void main(String[] args) {
        int side = 3;
        System.out.println("Площадь правильного шестиугольника: " + (3 * Math.sqrt(3) * Math.pow(side,2) / 2));
    }

}
