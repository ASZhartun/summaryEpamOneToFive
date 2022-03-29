package block5.task05.flowerComposition.components.interfaces;

import block5.task05.flowerComposition.components.Flower;
import block5.task05.flowerComposition.components.Wrap;

public interface Item {
    public String getName();

    public double getPrice();

    public Item getObject();

    public static boolean checkValues(String name, String color, Item item) {
        if (item instanceof Wrap) {
            for (int i = 0; i < Wrap.WrapType.values().length; i++) {
                boolean textureCondition = Wrap.WrapType.values()[i].getTexture().getPaperTypeName().equals(name);
                boolean colorCondition = Wrap.WrapType.values()[i].getColor().getNameColor().equals(color);
                if (textureCondition && colorCondition) return true;
            }
        } else {
            // flower part
            for (int i = 0; i < Flower.FlowerType.values().length; i++) {
                boolean textureCondition = Flower.FlowerType.values()[i].getName().equals(name);
                boolean colorCondition = Flower.FlowerType.values()[i].getColor().equals(color);
                if (textureCondition && colorCondition) return true;
            }

        }
        System.out.println("Wrong options. Please choose another!");
        return false;
    }
}