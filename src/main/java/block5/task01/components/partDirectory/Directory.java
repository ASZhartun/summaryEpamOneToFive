package block5.task01.components.partDirectory;

import block5.task01.components.partFile.File;

import java.util.ArrayList;

public class Directory extends File {
    protected ArrayList<File> listContent;

    {
        listContent = new ArrayList<>();
    }

    public Directory(String name, Directory root) {
        super(name, root);
    }

    public Directory(String name) {
        super(name, null);
    }

    @Override
    public void printContent() {
        for (File item :
                listContent) {
            System.out.println(item.getName());
        }
    }

    @Override
    public void addContent(Object content) {
        File adding = (File) content;
        this.listContent.add(adding);
        adding.setFolder(this);
    }

    @Override
    public void remove(File file) {
        if (file != null) {
            for (int i = 0; i < this.listContent.size(); i++) {
                if (this.listContent.get(i).getName().equals(file.getName())) {
                    this.listContent.remove(i);
                    break;
                }
            }
        }
    }
}
