package block5.task05.flowerComposition.components;

import block5.task05.flowerComposition.components.interfaces.Item;

/**
 * Class Wrap is describing wrapper for bouquet and implements Item interface.
 */
public class Wrap implements Item {
    private WrapType wrapper;

    public Wrap(WrapType wrapType) {
        this.wrapper = wrapType;
    }


    public Wrap() {

    }


    @Override
    public String getName() {
        return this.wrapper.toString();
    }

    @Override
    public double getPrice() {
        return this.wrapper.getWrapPrice();
    }

    @Override
    public Item getObject() {
        return this;
    }

    /**
     * Get item of wrap from WrapType enum. Item is basing on user's input.
     * @param name texture of wrap.
     * @param color color of wrap.
     * @return Wrap object is based on user's input.
     */
    public static WrapType getOriginItem(String name, String color) {
        for (int i = 0; i < WrapType.values().length; i++) {
            String textureTemp = WrapType.values()[i].getTexture().getPaperTypeName();
            String colorTemp = WrapType.values()[i].getColor().getNameColor();
            if (name.equals(textureTemp) && color.equals(colorTemp)) {
                return WrapType.values()[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Wrap{" +
                "wrapper=" + wrapper +
                '}';
    }

    /**
     * Set of all wraps that shop has.
     */
    public enum WrapType {
        MATTE_PINK(PaperType.MATTE, PaperColor.PINK, 0.79),
        MATTE_BLUE(PaperType.MATTE, PaperColor.BLUE, 0.79),
        MATTE_YELLOW(PaperType.MATTE, PaperColor.YELLOW, 0.79),
        MATTE_RED(PaperType.MATTE, PaperColor.RED, 0.79),
        MATTE_BLACK(PaperType.MATTE, PaperColor.BLACK, 0.79),
        MATTE_WHITE(PaperType.MATTE, PaperColor.WHITE, 0.79),
        MATTE_COFFEE(PaperType.MATTE, PaperColor.COFFEE, 0.79),
        GLOSSY_PINK(PaperType.GLOSSY, PaperColor.PINK, 0.99),
        GLOSSY_BLUE(PaperType.GLOSSY, PaperColor.BLUE, 0.99),
        GLOSSY_YELLOW(PaperType.GLOSSY, PaperColor.YELLOW, 0.99),
        GLOSSY_RED(PaperType.GLOSSY, PaperColor.RED, 0.99),
        GLOSSY_BLACK(PaperType.GLOSSY, PaperColor.BLACK, 0.99),
        GLOSSY_WHITE(PaperType.GLOSSY, PaperColor.WHITE, 0.99),
        GLOSSY_COFFEE(PaperType.GLOSSY, PaperColor.COFFEE, 0.99),
        GLOSSY_TRANSPARENT(PaperType.GLOSSY, PaperColor.TRANSPARENT, 0.59);


        private final PaperType texture;
        private final PaperColor color;
        private final double wrapPrice;

        WrapType(PaperType paperType, PaperColor paperColor, double price) {
            this.texture = paperType;
            this.color = paperColor;
            this.wrapPrice = price;
        }

        public PaperType getTexture() {
            return texture;
        }

        public PaperColor getColor() {
            return color;
        }

        public double getWrapPrice() {
            return wrapPrice;
        }

        @Override
        public String toString() {
            return "WrapType{" +
                    "texture=" + texture +
                    ", color=" + color +
                    ", wrapPrice=" + wrapPrice +
                    '}';
        }
    }

    public enum PaperType {
        MATTE("matte"),
        GLOSSY("glossy");

        private String paperTypeName;

        PaperType(String name) {
            this.paperTypeName = name;
        }

        public String getPaperTypeName() {
            return paperTypeName;
        }

        @Override
        public String toString() {
            return "PaperType{" +
                    "name='" + paperTypeName + '\'' +
                    '}';
        }
    }

    public enum PaperColor {
        PINK("pink"),
        BLUE("blue"),
        YELLOW("yellow"),
        RED("red"),
        BLACK("black"),
        WHITE("white"),
        COFFEE("coffee"),
        TRANSPARENT("transparent");

        private String nameColor;

        PaperColor(String nameColor) {
            this.nameColor = nameColor;
        }

        public String getNameColor() {
            return nameColor;
        }

        @Override
        public String toString() {
            return "PaperColor{" +
                    "nameColor='" + nameColor + '\'' +
                    '}';
        }
    }
}
