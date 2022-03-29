package block5.task05.flowerComposition.components;

import block5.task05.flowerComposition.components.interfaces.Item;
/**
 * Class Flower is describing flower for bouquet and implements Item interface.
 */
public class Flower implements Item {
    private FlowerType flowerIs;

    public Flower(FlowerType type) {
        this.flowerIs = type;
    }

    public Flower() {

    }

    @Override
    public String getName() {
        return this.flowerIs.getName();
    }

    public String getColor() {
        return this.flowerIs.getColor();
    }

    @Override
    public double getPrice() {
        return this.flowerIs.getPrice();
    }

    @Override
    public Item getObject() {
        return this;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "flowerIs=" + flowerIs +
                '}';
    }
    /**
     * Get item of wrap from WrapType enum. Item is basing on user's input.
     * @param name texture of wrap.
     * @param color color of wrap.
     * @return Wrap object is based on user's input.
     */
    public static FlowerType getOriginItem(String name, String color) {
        for (int i = 0; i < Wrap.WrapType.values().length; i++) {
            String nameTemp = FlowerType.values()[i].getName();
            String colorTemp = FlowerType.values()[i].getColor();
            if (name.equals(nameTemp) && color.equals(colorTemp)) {
                return FlowerType.values()[i];
            }
        }
        return null;
    }
    /**
     * Set of all flowers that shop has.
     */
    public enum FlowerType {
        ROSE_RED("rose","red", 6.99),
        ROSE_PINK("rose","pink", 6.99),
        ROSE_WHITE("rose","white", 6.99),
        ROSE_BLUE("rose","blue", 6.99),
        ASTER("aster","red", 3.59),
        PEON_WHITE("peon","white", 4.29),
        PEON_PINK("peon","pink", 4.29),
        PHLOX("phlox","pink", 0.39),
        GLADIOLUS_PINK("gladiolus","pink", 2.79),
        GLADIOLUS_WHITE("gladiolus","white", 2.79);

        private final String name;
        private final String color;
        private final double price;

        FlowerType(String name, String color, double price) {
            this.name = name;
            this.color = color;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public String getColor() {
            return color;
        }

        @Override
        public String toString() {
            return "FlowerType{" +
                    "name='" + name + '\'' +
                    ", color='" + color + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}
