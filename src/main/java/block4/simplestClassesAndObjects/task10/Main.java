package block4.simplestClassesAndObjects.task10;

import java.util.ArrayList;

/**
 * 10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
 * и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

public class Main {
    public static void main(String[] args) {
        Airline moscow = new Airline("Moscow", 1900, Airline.TypePlane.PASSENGER, "12:15", Airline.Days.MONDAY, Airline.Days.FRIDAY);
        Airline[] airlines = {
                new Airline("Moscow", 1900, Airline.TypePlane.PASSENGER, "21:15", Airline.Days.MONDAY, Airline.Days.SUNDAY),
                new Airline("Moscow", 1917, Airline.TypePlane.PASSENGER, "08:15", Airline.Days.FRIDAY, Airline.Days.THURSDAY),
                new Airline("Berlin", 1925, Airline.TypePlane.PASSENGER, "17:43", Airline.Days.WEDNESDAY, Airline.Days.TUESDAY),
                new Airline("Paris", 1125, Airline.TypePlane.PASSENGER, "12:43", Airline.Days.SUNDAY, Airline.Days.SATURDAY),
                new Airline("London", 1785, Airline.TypePlane.PASSENGER, "17:15", Airline.Days.TUESDAY, Airline.Days.SATURDAY, Airline.Days.SUNDAY),
                new Airline("London", 1780, Airline.TypePlane.PASSENGER, "17:40", Airline.Days.MONDAY, Airline.Days.SATURDAY, Airline.Days.FRIDAY),
        };
        AirlineAggregator airlineAggregator = new AirlineAggregator(moscow);
        airlineAggregator.addAirline(airlines);
        airlineAggregator.printList();
        System.out.println();
        System.out.println("By destination point:");
        ArrayList<Airline> london = airlineAggregator.getListByDestination("London");
        london.forEach(System.out::println);
        System.out.println();
        System.out.println("By day of week:");
        ArrayList<Airline> listByDayOfWeek = airlineAggregator.getListByDayOfWeek(Airline.Days.TUESDAY);
        listByDayOfWeek.forEach(System.out::println);
        System.out.println();
        System.out.println("By destination point and departure time greater than :");
        ArrayList<Airline> listByDayAndTimeGreater = airlineAggregator.getListByDayAndTimeGreater(Airline.Days.SUNDAY, "15:00");
        listByDayAndTimeGreater.forEach(System.out::println);

    }
}
