package block5.task01.components.partFile;

import block5.task01.components.partDirectory.Directory;

public class TextFile extends File {
    protected StringBuilder textContent;

    {
        textContent = new StringBuilder();
    }

    public TextFile(String name, Directory root) {
        super(name, root);
    }

    public TextFile(String name) {
        super(name, null);
    }

    @Override
    public void printContent() {
        System.out.println(textContent);
    }

    @Override
    public void addContent(Object content) {
        textContent.append((String) content);
    }

    @Override
    public void remove(File file) {
        this.textContent.delete(0, textContent.length());
    }


}
