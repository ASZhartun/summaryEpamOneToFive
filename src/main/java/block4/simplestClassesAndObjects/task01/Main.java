package block4.simplestClassesAndObjects.task01;

/**
 * 1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
 * Добавьте метод, который находит сумму значений этих переменных,
 * и метод, который находит наибольшее значение из этих двух переменных.
 */
public class Main {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.setFirst(15);
        test1.setSecond(12);
        test1.printVars();
        System.out.println("Sum: " + test1.sum());
        System.out.println("Max value: " + test1.getMaxOfVars());
    }
}
