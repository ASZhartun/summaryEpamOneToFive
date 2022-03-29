package block4.aggregationAndComposition.task04;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
 * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
 * всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 45633; i++) {
            new Account();
        }

        Account account1 = new Account(new BigDecimal(24534.27));
        Account[] accounts = new Account[]{
                new Account(-55145.88),
                new Account(new BigDecimal(67880)),
                new Account(0.25),
                new Account(-0.10),
                new Account(-15100.50),
                new Account(19890.25),
                new Account(20001.10),
        };

        Client client = new Client("0000 0000 0000 0001", account1);
        client.addAccount(accounts);
        System.out.println("Client has accounts:");
        client.printAccountList();
        System.out.println();
        System.out.println("Samples of searching account:");
        ArrayList<Account> searchNegatives = client.searchAccountByBalance(new BigDecimal(-100_000), new BigDecimal(0));
        ArrayList<Account> searchOver20_000 = client.searchAccountByBalance(new BigDecimal(20_000), new BigDecimal(1_000_000));
        System.out.println(searchNegatives);
        System.out.println(searchOver20_000);
        System.out.println();
        System.out.println("Sort account by number:");
        client.sortByNumber();
        client.printAccountList();
        System.out.println();
        System.out.println("Sort account by balance:");
        client.sortByBalance();
        client.printAccountList();
        System.out.println();
        System.out.println("Account's summary with positive balance:");
        System.out.println(client.getAccountPositiveSummary());
        System.out.println();
        System.out.println("Account's summary with negative balance:");
        System.out.println(client.getAccountNegativeSummary());
        System.out.println();
        System.out.println("Account's summary:");
        System.out.println(client.getAccountTotalSummary());
        System.out.println();
        System.out.println("Account's summary, when account1 is frozen:");
        account1.setFreeze(true);
        System.out.println(client.getAccountTotalSummary());
        System.out.println();


    }
}
