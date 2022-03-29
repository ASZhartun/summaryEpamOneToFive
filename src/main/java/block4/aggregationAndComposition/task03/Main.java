package block4.aggregationAndComposition.task03;

/**
 * 3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
 * столицу, количество областей, площадь, областные центры.
 */

public class Main {
    public static void main(String[] args) {
        City[] cities = new City[]{
                new City("Pskov", 45.99),
                new City("Minsk", 64.22),
                new City("Talin", 39.96),
                new City("Kiev", 29.12),
                new City("Paris", 33.44),
                new City("Voronezh", 17.55),
                new City("Arhangelsk", 18.93),
                new City("Pekin", 33.13),
                new City("Berlin", 30.24),
        };
        Region region1 = new Region(cities[0],cities[3],cities[6]);
        System.out.println(region1);
        Region region2 = new Region(cities[1],cities[4],cities[7]);
        System.out.println(region2);
        Region region3 = new Region(cities[2],cities[5],cities[8]);
        System.out.println(region3);
        System.out.println();
        System.out.println("Task info:");
        Country country = new Country("Republic of World",region1, region2, region3);
        country.printCapital();
        country.quantityOfRegions();
        country.printSquare();
        country.printRegionalCenters();
    }

}
