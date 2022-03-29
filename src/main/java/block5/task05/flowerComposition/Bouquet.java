package block5.task05.flowerComposition;

import block5.task05.flowerComposition.components.Flower;
import block5.task05.flowerComposition.components.Wrap;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class Bouquet is describing bouquet of user. It has storage for all flowers and wraps that user chosen.
 */
public class Bouquet {
    private ArrayList<Flower> flowers;
    private ArrayList<Wrap> wrapper;

    public Bouquet() {
        this.flowers = new ArrayList<>();
        this.wrapper = new ArrayList<>();
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public void addFlower(Flower... flower) {
        flowers.addAll(Arrays.stream(flower).toList());
    }

    public void addWrapper(Wrap wrap) {
        wrapper.add(wrap);
    }

    public void addWrapper(Wrap... wrap) {
        wrapper.addAll(Arrays.stream(wrap).toList());
    }

    public double getPrice() {
        double sum = 0;
        for (Flower item :
                this.flowers) {
            if (item != null) {
                sum += item.getPrice();
            }
        }
        for (Wrap item :
                this.wrapper) {
            if (item != null) {
                sum += item.getPrice();
            }

        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder summary = new StringBuilder();
        summary.append("Bouquet has next flowers:\n");
        for (Flower item :
                this.flowers) {
            if (item == null) continue;
            summary.append(item);
            summary.append('\n');
        }
        summary.append("enveloped by ");
        for (Wrap item :
                this.wrapper) {
            if (item == null) continue;
            summary.append(item).append(" ");
        }
        summary.append("\nBouquet costs ").append(this.getPrice());
        return summary.toString();
    }
}
