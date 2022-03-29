package block4.aggregationAndComposition.task05;

import block4.aggregationAndComposition.task04.Client;

import java.util.ArrayList;
import java.util.List;

/**
 * 5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
 * (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 * Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Main {
    public static void main(String[] args) {
        // User's preferences:
        ArrayList<Voucher.Goal> goals = new ArrayList<>(List.of(
                Voucher.Goal.REST, Voucher.Goal.SHOPPING
        ));
        ArrayList<Voucher.Transport> transports = new ArrayList<>(List.of(
                Voucher.Transport.TRAIN, Voucher.Transport.BUS
        ));
        boolean strict = false; // Нестрогое соблюдение наличия целей поездок - хотя бы одна цель совпадает и славно!
        Voucher.Supply supply = Voucher.Supply.ALL;
        int wishingDays = 4;
        // End user's preferences

        Customer customer = new Customer();
        customer.addVoucher(new FewVouchers().getFew());
        System.out.println("Our firm has next vouchers:");
        customer.printList();
        System.out.println();

        System.out.println("Needing voucher:");
        System.out.println(new Voucher("needing", goals, transports, wishingDays, supply));
        System.out.println();
        System.out.println("Our proposals with non-strict goals:");
        customer.chooseVoucher(goals, strict,transports,supply,wishingDays);
        customer.printChoice();
        System.out.println("Our proposals with strict goals:"); // Все цели должны присутствовать
        customer.chooseVoucher(goals, !strict,transports,supply,wishingDays);
        customer.printChoice();
    }
}
