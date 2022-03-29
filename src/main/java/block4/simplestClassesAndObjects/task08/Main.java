package block4.simplestClassesAndObjects.task08;

import java.util.ArrayList;

/**
 * 8. Создать класс Customer, спецификация которого приведена ниже.
 * Определить конструкторы, set- и get- методы и метод toString().
 * Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * <p>
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Zhmih", "Arkadiy", "Petrovich", "minsk", "5110 0001 3456 7579", "BY20 OLMP 3135 0000 0010 0000 0933");
        CustomerAggregator aggregator = new CustomerAggregator(customer);
        Customer[] ghosts = new Customer[] {
                new Customer(2, "Zhmih", "Victor", "Petrovich", "minsk", "4110 5678 3456 7579", "BY20 OLMP 3135 0000 0010 0000 0912"),
                new Customer(3, "Zhmih", "Evgeniy", "Petrovich", "minsk", "5880 0001 1276 7579", "BY20 OLMP 3135 0000 0010 0000 0917"),
                new Customer(4, "Kozel", "Dmitriy", "Sergeevych", "minsk", "6344 1515 6744 7579", "BY20 OLMP 3135 0000 0010 0000 0933"),
                new Customer(5, "Kozel", "Boris", "Sergeevych", "minsk", "2111 4343 3155 1616", "BY20 OLMP 3135 0000 0010 0000 0944"),
                new Customer(6, "Ikar", "Poligraph", "Karmovich", "minsk", "8000 0001 3456 7579", "BY20 OLMP 3135 0000 0010 0000 0833"),
                new Customer(7, "Voltazh", "Ibragim", "Eduardovich", "minsk", "1100 1501 3434 8000", "BY20 OLMP 3135 0000 0010 0000 0536"),
        };
        // Alphabetical Sort begin
        System.out.println("Aggregator has:");
        aggregator.addCustomer(ghosts);
        aggregator.printData();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Alphabetical sort:");
        aggregator.alphabeticalSort();
        aggregator.printData();
        System.out.println();
        System.out.println();
        System.out.println();
        // Alphabetical Sort end
        String bottom = "4000 0000 0000 0000";
        String top = "7000 0000 0000 0000";
        System.out.printf("CardNumbers between: %s - %s\n", bottom,top);
        ArrayList<Customer> specifyCreditCards = aggregator.getSpecifyCreditCards(bottom, top);


    }
}
