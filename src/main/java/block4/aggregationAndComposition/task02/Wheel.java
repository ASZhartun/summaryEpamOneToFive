package block4.aggregationAndComposition.task02;

public class Wheel {
    private int year;
    private int diameter;
    private boolean spinning = false;
    private boolean isBroken = false;

    public Wheel(int year, int diameter) {
        this.year = year;
        this.diameter = diameter;
    }

    public void setSpinning(boolean spinning) {
        this.spinning = spinning;
    }

    public boolean isSpinning() {
        return spinning;
    }

    public int getYear() {
        return year;
    }

    public int getDiameter() {
        return diameter;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }
}
