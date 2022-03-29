package block4.simplestClassesAndObjects.task06;

/**
 * 6. Составьте описание класса для представления времени.
 * Предусмотрите возможности установки времени и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
 * В случае недопустимых значений полей поле устанавливается в значение 0.
 * Создать методы изменения времени на заданное количество часов, минут и секунд.
 */

public class Main {
    public static void main(String[] args) {
        TimeRepresentation clock = new TimeRepresentation(22, 56, 13);
        System.out.println(clock);
        clock.setHour(44);
        clock.setMinutes(60);
        clock.setSeconds(-5);
        System.out.println(clock);
        clock.applyHours(60);       //60 - 24 * 2 = 12;
        clock.applyMinutes(73);     //73- 60 * 1 = 13;
        clock.applySeconds(123);    //123 - 60 * 2 = 3;
        System.out.println(clock);
    }
}
