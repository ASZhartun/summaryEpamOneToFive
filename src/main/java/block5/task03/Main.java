package block5.task03;

import block5.task03.Calendar.Calendar;

import java.time.Month;

/**
 * Задача 3.
 * Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о выходных и праздничных днях.
 */

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        calendar.add(
                new Calendar.Date(13, Month.AUGUST, Calendar.DateType.WEEKDAY),
                new Calendar.Date(18, Month.FEBRUARY, Calendar.DateType.WEEKEND),
                new Calendar.Date(3, Month.NOVEMBER, Calendar.DateType.WEEKEND),
                new Calendar.Date(5, Month.SEPTEMBER, Calendar.DateType.WEEKDAY),
                new Calendar.Date(1, Month.JANUARY, Calendar.DateType.HOLIDAY)
        );
        calendar.print();
        System.out.println(calendar.getDate(13, Month.AUGUST));
        System.out.println();
        System.out.println(calendar.getDateByType(Calendar.DateType.WEEKEND));
        System.out.println();
        System.out.println("Remove some dates.");
        calendar.remove(13, Month.AUGUST);
        calendar.remove(5, Month.SEPTEMBER);
        calendar.print();
    }
}
