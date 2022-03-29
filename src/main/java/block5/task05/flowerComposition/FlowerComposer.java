package block5.task05.flowerComposition;

import block5.task05.flowerComposition.builders.FlowerBuilder;
import block5.task05.flowerComposition.builders.WrapBuilder;
import block5.task05.flowerComposition.components.Flower;
import block5.task05.flowerComposition.components.Wrap;

import java.util.Scanner;

/**
 * Create, return and give info about bouquet.
 */
public class FlowerComposer {
    public static Scanner scanner;
    private final FlowerBuilder flowerBuilder;
    private final WrapBuilder wrapBuilder;
    private final Bouquet bouquet;

    /**
     * Init scanner for input options of future bouquet.
     * Init factory for creating Flower and Wrap.
     * Init bouquet that is storing chosen flowers and wrappers.
     * Print out info about accessible flowers and wrappers for bouquet.
     */
    public FlowerComposer() {
        scanner = new Scanner(System.in);
        flowerBuilder = new FlowerBuilder();
        wrapBuilder = new WrapBuilder();
        bouquet = new Bouquet();
        printAssortments();
    }

    public void addFlower() {
        bouquet.addFlower((Flower) flowerBuilder.createItem());
    }

    public void addWrapper() {
        bouquet.addWrapper((Wrap) wrapBuilder.createItem());
    }

    public void getInfo() {
        System.out.println(bouquet.toString());
    }

    public void printAssortments() {
        System.out.println("We has next flowers:");
        for (Flower.FlowerType item :
                Flower.FlowerType.values()) {
            System.out.println(item);
        }
        System.out.println("We has next wrappers:");
        for (Wrap.WrapType item :
                Wrap.WrapType.values()) {
            System.out.println(item);
        }
    }

    public Bouquet getBouquet() {
        return bouquet;
    }
}
