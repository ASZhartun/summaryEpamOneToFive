package block5.task02;

import block5.task02.payments.Payment;

/**
 * Задача 2.
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.
 */

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.addItem(
                new Payment.Item("milk", 2.99),
                new Payment.Item("coffee", 6.59),
                new Payment.Item("meat", 4.49),
                new Payment.Item("bread", 1.39),
                new Payment.Item("butter", 3.69),
                new Payment.Item("ice-cream", 1.39)
        );
        payment.print();
        System.out.println();
        System.out.println("Adding others purchases:");
        Payment.Item apples = new Payment.Item("apples", 4.37);
        Payment.Item oranges = new Payment.Item("oranges", 6.21);
        payment.addItem(apples);
        payment.addItem(oranges);
        payment.print();
        System.out.println();
        System.out.println("Deleting from list:");
        payment.removeItem(3);
        payment.removeItem(apples);
        payment.print();
    }
}
