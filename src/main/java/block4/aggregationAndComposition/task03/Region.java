package block4.aggregationAndComposition.task03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Region {
    private String name;
    private ArrayList<City> cities;
    private double square;
    {
        cities = new ArrayList<>();
    }

    public Region(City city) {
        this.cities.add(city);
        appointRegionalCenter();
        setRegionalNaming();
        calculateRegionSquare();
    }

    public Region(City ... cities) {
        this.cities.addAll(Arrays.stream(cities).toList());
        appointRegionalCenter();
        setRegionalNaming();
        calculateRegionSquare();
    }
    public Region() {

    }

    public void addCities(City city) {
        this.cities.add(city);
        appointRegionalCenter();
        setRegionalNaming();
        calculateRegionSquare();
    }

    public void addCities(City ... cities) {
        this.cities.addAll(Arrays.stream(cities).toList());
        appointRegionalCenter();
        setRegionalNaming();
        calculateRegionSquare();
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public String getName() {
        return name;
    }

    public double getSquare() {
        return square;
    }

    private void appointRegionalCenter() {
        if (this.cities.size() > 1) {
            this.cities.sort(new Comparator<City>() {
                @Override
                public int compare(City o1, City o2) {
                    double value = o2.getSquare() - o1.getSquare();
                    if (value > 0) return 1;
                    else if (value < 0) return -1;
                    else return 0;
                }
            });
        }
        this.cities.get(0).setRegionalCenter(true);
        this.name = this.cities.get(0).getTitle();
    }

    @Override
    public String toString() {
        return "Region{" +
                "name='" + name + '\'' +
                ", cities=" + cities +
                '}';
    }

    private void setRegionalNaming() {
        this.cities.forEach((city) ->{
            city.setInRegion(this.name);
        });
    }

    private void calculateRegionSquare() {
        for (City item :
                this.cities) {
            this.square += item.getSquare();
        }
    }
}
