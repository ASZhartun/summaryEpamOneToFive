package block4.aggregationAndComposition.task03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Country {
    private ArrayList<Region> regions;
    private String name;
    private double square;

    {
        regions = new ArrayList<>();
    }

    public Country(String name, Region... regions) {
        this.name = name;
        this.regions.addAll(Arrays.stream(regions).toList());
        appointCapital();
        calculateCountrySquare();
    }

    public Country(String name) {
        this.name = name;
    }

    public Country() {
        this("Nowhere");
    }

    public void addRegions(Region ... regions) {
        this.regions.addAll(Arrays.stream(regions).toList());
        appointCapital();
        calculateCountrySquare();
    }

    public void printCapital() {
        String title = this.regions.get(0).getCities().get(0).getTitle();
        System.out.printf("Capital ot %s is %s\n", this.name, title);
    }

    public void quantityOfRegions() {
        System.out.println("Quantity of regions: " + this.regions.size());
    }

    public void printRegionalCenters() {
        System.out.println("Names of regional centers:");
        for (Region item :
                this.regions) {
            System.out.println(item.getName());
        }
    }

    public void printSquare() {
        System.out.println("Square of country: " + this.square);
    }

    private void appointCapital() {
        this.regions.sort(new Comparator<Region>() {
            @Override
            public int compare(Region o1, Region o2) {
                double value = o2.getCities().get(0).getSquare() - o1.getCities().get(0).getSquare();
                if (value > 0) return 1;
                else if (value < 0) return -1;
                else return 0;
            }
        });
        this.regions.get(0).getCities().get(0).setCapital(true);
    }

    private void calculateCountrySquare() {
        for (Region item :
                this.regions) {
            this.square += item.getSquare();
        }
    }
}
