package block4.aggregationAndComposition.task04;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Client {
    private ArrayList<Account> list;
    private String number;

    {
        this.list = new ArrayList<>();
    }

    public Client(String number, Account ... accounts) {
        this.number = number;
        this.list.addAll(Arrays.stream(accounts).toList());
    }

    public Client() {

    }

    public void addAccount(Account account) {
        this.list.add(account);
    }

    public void addAccount(Account ... accounts) {
        this.list.addAll(Arrays.stream(accounts).toList());
    }

    public Account searchAccountByNumber(String number) {
        for (Account item :
                this.list) {
            if (number.equals(item.getNumber())) return item;
        }
        System.out.println("Number wasn't find!");
        return null;
    }

    public ArrayList<Account> searchAccountByNumber(String bottom, String top) {
        ArrayList<Account> accounts = new ArrayList<>();
        for (Account item :
                this.list) {
            int bottomChecked = bottom.compareTo(item.getNumber());
            int topChecked = top.compareTo(item.getNumber());
            if (bottomChecked <= 0 && topChecked >= 0) accounts.add(item);
        }
        return accounts;
    }

    public ArrayList<Account>  searchAccountByBalance(BigDecimal bottom, BigDecimal top) {
        ArrayList<Account> accounts = new ArrayList<>();
        for (Account item :
                this.list) {
            boolean bottomChecked = item.getBalance().compareTo(bottom) >= 0;
            boolean topChecked = item.getBalance().compareTo(top) <= 0;
            if (bottomChecked && topChecked) accounts.add(item);
        }
        return accounts;
    }

    public void sortByNumber() {
        this.list.sort(new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return o1.getNumber().compareTo(o2.getNumber());
            }
        });
    }

    public void sortByBalance() {
        this.list.sort(new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return o2.getBalance().compareTo(o1.getBalance());
            }
        });
    }

    public BigDecimal getAccountTotalSummary() {
        BigDecimal summary = new BigDecimal(0);
        for (Account item :
                this.list) {
            if (!item.isFreeze()) {
                summary = summary.add(item.getBalance());
            }
        }
        return summary;
    }

    public BigDecimal getAccountPositiveSummary() {
        BigDecimal summary = new BigDecimal(0);
        BigDecimal zero = new BigDecimal(0);
        for (Account item :
                this.list) {
            if (item.getBalance().compareTo(zero) > 0 && !item.isFreeze()) {
                summary = summary.add(item.getBalance());
            }
        }
        return summary;
    }

    public BigDecimal getAccountNegativeSummary() {
        BigDecimal summary = new BigDecimal(0);
        BigDecimal zero = new BigDecimal(0);
        for (Account item :
                this.list) {
            if (item.getBalance().compareTo(zero) < 0 && !item.isFreeze()) {
                summary = summary.add(item.getBalance());
            }
        }
        return summary;
    }

    public void printAccountList() {
        for (Account item :
                this.list) {
            System.out.println(item);
        }
    }
}
