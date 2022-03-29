package block5.task04.bank;

public class Treasure {
    private int cost;
    private int id;

    public Treasure(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Treasure №" + this.id + " costs " + this.cost;
    }
}
