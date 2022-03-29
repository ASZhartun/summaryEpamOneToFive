package block5.task05.flowerComposition.builders;

import block5.task05.flowerComposition.builders.rootBuilder.ComponentBuilder;
import block5.task05.flowerComposition.components.Flower;
import block5.task05.flowerComposition.components.interfaces.Item;

/**
 * Create flower is basing on input options like name and color of flower.
 */
public class FlowerBuilder extends ComponentBuilder {


    public FlowerBuilder() {

    }

    /**
     * Get inputs of user. Check input for existing at enum flowers of shop.
     * @return new Flower
     */
    @Override
    public Item createItem() {
        System.out.println("1) Pass name of flower;");
        System.out.println("2) Pass color of flower.");
        super.getInputs();
        if (Item.checkValues(this.inputName, this.inputColor, new Flower())) {
            return new Flower(Flower.getOriginItem(this.inputName, this.inputColor));
        }
        return null;
    }
}
