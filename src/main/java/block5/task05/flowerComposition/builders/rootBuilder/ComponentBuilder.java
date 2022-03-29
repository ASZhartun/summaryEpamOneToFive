package block5.task05.flowerComposition.builders.rootBuilder;

import block5.task05.flowerComposition.FlowerComposer;
import block5.task05.flowerComposition.components.interfaces.Item;

import java.util.Locale;

/**
 * Abstract builder that is describing common method and default method and fields for user's input.
 */
public abstract class ComponentBuilder {
    protected String inputName;
    protected String inputColor;

    public ComponentBuilder() {

    }

    public void getInputs() {
        this.inputName = FlowerComposer.scanner.nextLine().toLowerCase(Locale.ROOT);
        this.inputColor = FlowerComposer.scanner.nextLine().toLowerCase(Locale.ROOT);
    }

    public abstract Item createItem();
}
