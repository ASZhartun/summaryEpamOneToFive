package block4.simplestClassesAndObjects.task07;

/**
 * 7. Описать класс, представляющий треугольник.
 * Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.
 */

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getMedianCrossPoint());
    }
}
