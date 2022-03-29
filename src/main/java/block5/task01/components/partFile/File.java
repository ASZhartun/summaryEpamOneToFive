package block5.task01.components.partFile;

import block5.task01.components.partDirectory.Directory;

import java.time.LocalDateTime;

public abstract class File {
    protected String name;
    protected String root;
    protected LocalDateTime dateCreation;
    protected Directory folder;

    public File(String name, Directory root) {
        this.name = name;
        this.dateCreation = LocalDateTime.now();
        if (root != null) {
            this.root = root.getFullPath();
            this.folder = root;
            root.addContent(this);
        } else this.root = "";

    }

    public File() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateCreation() {
        return dateCreation.toString();
    }

    public String getFullPath() {
        return this.root.concat(this.name).concat("\\");
    }

    public void rename(String newName) {
        this.root = newName;
    }

    public abstract void printContent();

    public abstract void addContent(Object content);

    public abstract void remove(File file);

    public void setFolder(Directory folder) {
        this.folder = folder;
    }

    public Directory getFolder() {
        return folder;
    }
}
