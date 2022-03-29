package block4.aggregationAndComposition.task02;

public class Engine {
    private int year;
    private String model;
    private boolean isWorking = false;
    private boolean isBroken = false;

    public Engine(int year, String model) {
        this.year = year;
        this.model = model;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }
}
