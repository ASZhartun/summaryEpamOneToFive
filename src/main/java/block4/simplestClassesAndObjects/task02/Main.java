package block4.simplestClassesAndObjects.task02;

/**
 * 2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
 * Добавьте конструктор, инициализирующий члены класса по умолчанию.
 * Добавьте set- и get- методы для полей экземпляра класса.
 */
public class Main {
    public static void main(String[] args) {
        Test2 test1 = new Test2();
        System.out.println("Constructor by default: ");
        test1.printVars();
        System.out.println("Constructor by custom: ");
        Test2 test2 = new Test2(25,-30);
        test2.printVars();
        System.out.println();
        System.out.println("test1:");
        test1.setFirst(-50);
        test1.setSecond(-100);
        test1.printVars();
        System.out.println("test2:");
        test2.setFirst(50);
        test2.setSecond(100);
        test2.printVars();
    }
}
