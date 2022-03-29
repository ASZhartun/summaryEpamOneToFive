package block4.aggregationAndComposition.task05;

import java.util.ArrayList;
import java.util.List;

public class FewVouchers {
    private ArrayList<Voucher> few;

    ArrayList<Voucher.Goal> goals1;
    ArrayList<Voucher.Transport> transports1;
    ArrayList<Voucher.Goal> goals2;
    ArrayList<Voucher.Transport> transports2;

    {
        few = new ArrayList<>();

        goals1 = new ArrayList<>();
        transports1 = new ArrayList<>();
        goals1.add(Voucher.Goal.REST);
        goals1.add(Voucher.Goal.SHOPPING);
        transports1.add(Voucher.Transport.BUS);
        transports1.add(Voucher.Transport.TRAIN);

        goals2 = new ArrayList<>();
        transports2 = new ArrayList<>();
        goals2.add(Voucher.Goal.REST);
        goals2.add(Voucher.Goal.TREATMENT);
        transports2.add(Voucher.Transport.PLANE);
        transports2.add(Voucher.Transport.SHIP);
    }

    public FewVouchers() {
        few.addAll(List.of(
                new Voucher("1", goals1, transports2, 4, Voucher.Supply.THREE_AT_DAY),
                new Voucher("2", goals1, transports1, 5, Voucher.Supply.TWO_AT_DAY),
                new Voucher("3", goals1, transports1, 6, Voucher.Supply.ONE_AT_DAY),
                new Voucher("4", goals2, transports1, 7, Voucher.Supply.THREE_AT_DAY),
                new Voucher("5", goals2, transports1, 8, Voucher.Supply.TWO_AT_DAY),
                new Voucher("6", goals2, transports2, 9, Voucher.Supply.ONE_AT_DAY),
                new Voucher("7", goals2, transports2, 10, Voucher.Supply.ALL)
        ));

    }

    public ArrayList<Voucher> getFew() {
        return few;
    }
}
