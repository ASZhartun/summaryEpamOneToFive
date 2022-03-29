package block4.aggregationAndComposition.task05;

import java.util.ArrayList;

public class Voucher {
    private String title;
    private ArrayList<Goal> goals;
    private ArrayList<Transport> transports;
    private int days;
    private Supply supply;

    {
        goals = new ArrayList<>();
        transports = new ArrayList<>();
    }

    public Voucher(String title, ArrayList<Goal> goals, ArrayList<Transport> transports, int days, Supply supply) {
        this.title = title;
        this.goals = goals;
        this.transports = transports;
        this.days = days;
        this.supply = supply;
    }

    public Voucher() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Goal> getGoals() {
        return goals;
    }

    public void setGoals(ArrayList<Goal> goals) {
        this.goals = goals;
    }

    public void setGoals(Goal goal) {
        this.goals.add(goal);
    }

    public ArrayList<Transport> getTransports() {
        return transports;
    }

    public void setTransports(ArrayList<Transport> transports) {
        this.transports = transports;
    }

    public void setTransports(Transport transport) {
        this.transports.add(transport);
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Supply getSupply() {
        return supply;
    }

    public void setSupply(Supply supply) {
        this.supply = supply;
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "title='" + title + '\'' +
                ", goals=" + goals +
                ", transports=" + transports +
                ", days=" + days +
                ", supply=" + supply +
                '}';
    }

    public enum Supply {
        ONE_AT_DAY(1),
        TWO_AT_DAY(2),
        THREE_AT_DAY(3),
        NONE(0),
        ALL(-1);
        private int quantity;

        Supply(int quantity) {
            this.quantity = quantity;
        }

        public int getQuantity() {
            return quantity;
        }
    }

    public enum Transport {
        SHIP,
        PLANE,
        BUS,
        TRAIN,
        NONE
    }

    public enum Goal {
        REST,
        EXCURSION,
        TREATMENT,
        SHOPPING,
        CRUISE
    }
}
