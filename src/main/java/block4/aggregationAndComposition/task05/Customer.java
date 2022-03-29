package block4.aggregationAndComposition.task05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Customer {
    private ArrayList<Voucher> list;
    private ArrayList<Voucher> choice;

    {
        list = new ArrayList<>();
        choice = new ArrayList<>();
    }

    public Customer(ArrayList<Voucher> list) {
        this.list = list;
    }

    public Customer(Voucher... vouchers) {
        this.list.addAll(Arrays.stream(vouchers).toList());
    }

    public Customer() {

    }

    public void addVoucher(Voucher voucher) {
        this.list.add(voucher);
    }

    public void addVoucher(ArrayList<Voucher> vouchers) {
        this.list.addAll(vouchers);
    }

    public void chooseVoucher(ArrayList<Voucher.Goal> searchingGoals, boolean strict, ArrayList<Voucher.Transport> transports, Voucher.Supply supply, int days) {
        ArrayList<Voucher> sample = new ArrayList<>();
        if (strict) {
            for (Voucher voucher : this.list) {
                sample.add(addStrictVoucherChoice(voucher, searchingGoals));
            }
        } else {
            for (Voucher voucher : this.list) {
                sample.add(addNonStrictVoucherChoice(voucher, searchingGoals));
            }
        }
        sample = getFilterBySupply(sample, supply);
        sample = getFilterByDays(sample, days);
        sample = getFilterByTransport(sample, transports);
        this.choice = sample;
    }

    public void chooseVoucher(ArrayList<Voucher.Goal> goals, boolean strict) {
        ArrayList<Voucher.Transport> transports = new ArrayList<>(
                List.of(
                        Voucher.Transport.NONE, Voucher.Transport.BUS,
                        Voucher.Transport.TRAIN, Voucher.Transport.PLANE,
                        Voucher.Transport.SHIP
                )
        );
        chooseVoucher(goals, strict, transports, Voucher.Supply.ALL, 0);
    }

    public void printList() {
        for (Voucher voucher :
                this.list) {
            System.out.println(voucher);
        }
    }

    public void printChoice() {
        for (Voucher voucher :
                this.choice) {
            System.out.println(voucher);
        }
    }

    private ArrayList<Voucher> getFilterByTransport(ArrayList<Voucher> vouchers, ArrayList<Voucher.Transport> transports) {
        ArrayList<Voucher> sample = new ArrayList<>();
        for (int i = 0; i < vouchers.size(); i++) {
            Voucher voucher = vouchers.get(i);
            for (int j = 0; j < transports.size(); j++) {
                if (checkTransport(voucher, transports.get(j))) {
                    sample.add(voucher);
                    break;
                }
            }
        }
        return sample;
    }

    private boolean checkTransport(Voucher voucher, Voucher.Transport transport) {
        ArrayList<Voucher.Transport> transports = voucher.getTransports();
        for (int i = 0; i < transports.size(); i++) {
            if (transports.get(i) == transport) return true;
        }
        return false;
    }

    private ArrayList<Voucher> getFilterByDays(ArrayList<Voucher> vouchers, int days) {
        ArrayList<Voucher> sample = new ArrayList<>();
        for (Voucher voucher :
                vouchers) {
            if (voucher.getDays() >= days) sample.add(voucher);
        }
        return sample;
    }

    private ArrayList<Voucher> getFilterBySupply(ArrayList<Voucher> vouchers, Voucher.Supply supply) {
        ArrayList<Voucher> sample = new ArrayList<>();
        for (Voucher voucher :
                vouchers) {
            if (voucher!=null) {
                if (voucher.getSupply().getQuantity() >= supply.getQuantity()) sample.add(voucher);
            }
        }
        return sample;
    }

    private Voucher addStrictVoucherChoice(Voucher voucher, ArrayList<Voucher.Goal> searchingGoals) {
        for (int j = 0; j < searchingGoals.size(); j++) {
            if (!checkAvailability(searchingGoals.get(j), voucher)) return null;
        }
        return voucher;
    }

    private Voucher addNonStrictVoucherChoice(Voucher voucher, ArrayList<Voucher.Goal> searchingGoals) {
        for (Voucher.Goal goal :
                searchingGoals) {
            if (checkAvailability(goal, voucher)) return voucher;
        }
        return null;
    }

    private boolean checkAvailability(Voucher.Goal goal, Voucher voucher) {
        ArrayList<Voucher.Goal> goals = voucher.getGoals();
        for (int i = 0; i < goals.size(); i++) {
            if (goal == goals.get(i)) return true;
        }
        return false;
    }

    public void sortByTitle() {
        this.list.sort(new Comparator<Voucher>() {
            @Override
            public int compare(Voucher o1, Voucher o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
    }

    public void sortByQuantityGoals() {
        this.list.sort(new Comparator<Voucher>() {
            @Override
            public int compare(Voucher o1, Voucher o2) {
                return o2.getGoals().size() - o1.getGoals().size();
            }
        });
    }

    public void sortByQuantityTransport() {
        this.list.sort(new Comparator<Voucher>() {
            @Override
            public int compare(Voucher o1, Voucher o2) {
                return o2.getTransports().size() - o1.getTransports().size();
            }
        });
    }

    public void sortByDuration() {
        this.list.sort(new Comparator<Voucher>() {
            @Override
            public int compare(Voucher o1, Voucher o2) {
                return o2.getDays() - o1.getDays();
            }
        });
    }

    public void sortBySupply() {
        this.list.sort(new Comparator<Voucher>() {
            @Override
            public int compare(Voucher o1, Voucher o2) {
                return o2.getSupply().getQuantity() - o1.getSupply().getQuantity();
            }
        });
    }
}
