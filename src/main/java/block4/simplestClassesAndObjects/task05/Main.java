package block4.simplestClassesAndObjects.task05;

/**
 * 5. Опишите класс, реализующий десятичный счетчик,
 * который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
 * Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
 * Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние.
 * Написать код, демонстрирующий все возможности класса.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Counter with values by default:");
        Counter counter = new Counter();
        for (int i = 0; i < 15; i++) {
            counter.increment();
            counter.getCount();
        }

        for (int i = 0; i < 25; i++) {
            counter.decrement();
            counter.getCount();
        }
        System.out.println();
        System.out.println("Counter with custom values:");
        Counter customCounter = new Counter(17, 15, 21);
        for (int i = 0; i < 4; i++) {
            customCounter.decrement();
            customCounter.getCount();
        }

        for (int i = 0; i < 8; i++) {
            customCounter.increment();
            customCounter.getCount();
        }
    }
}
