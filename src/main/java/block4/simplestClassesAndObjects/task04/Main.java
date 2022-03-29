package block4.simplestClassesAndObjects.task04;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Locale;

/**
 * 4. Создайте класс Train, содержащий поля:
 * - название пункта назначения,
 * - номер поезда,
 * - время отправления.
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
 * Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 * Добавьте возможность сортировки массив по пункту назначения,
 * причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
 */
public class Main {
    public static void main(String[] args) {
        Train smolensk = new Train("Smolensk", 1490, "27/12/2022 17:43");
        Train[] trains = {
                new Train("Smolensk", 7230, "27/12/2022 17:53"),
                new Train("Kishinev", 4315, "13/06/2022 08:19"),
                new Train("Novosibirsk", 1685, "30/03/2022 15:13"),
                new Train("Smolensk", 1490, "27/12/2022 17:43"),
                new Train("Irkutsk", 2530, "20/02/2022 17:43"),
        };
        System.out.println("Trains before sorts:");
        for (Train train :
                trains) {
            System.out.println(train);
        }
        System.out.println("Trains after number sort:");
        Train.sortByTrainNumber(trains);
        for (Train train :
                trains) {
            System.out.println(train);
        }
        Train.getInfo(trains);
        System.out.println();
        System.out.println("Trains after destination sort:");
        Train.sortByTrainDestination(trains);
        for (Train train :
                trains) {
            System.out.println(train);
        }
    }
}
