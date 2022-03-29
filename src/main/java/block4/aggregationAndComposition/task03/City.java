package block4.aggregationAndComposition.task03;

public class City {
    private String title;
    private double square;
    private boolean isCapital;
    private boolean isRegionalCenter;
    private String inRegion;

    {
        isCapital = true;
        isRegionalCenter = true;
        inRegion = "";
    }

    public City(String title, double square) {
        this.title = title;
        this.square = square;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    public boolean isRegionalCenter() {
        return isRegionalCenter;
    }

    public void setRegionalCenter(boolean regionalCenter) {
        isRegionalCenter = regionalCenter;
    }

    public String getInRegion() {
        return inRegion;
    }

    public void setInRegion(String inRegion) {
        this.inRegion = inRegion;
    }

    @Override
    public String toString() {
        return "City{" +
                "title='" + title + '\'' +
                ", square=" + square +
                '}';
    }
}
