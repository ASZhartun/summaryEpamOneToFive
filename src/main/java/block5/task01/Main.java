package block5.task01;

import block5.task01.components.partDirectory.Directory;
import block5.task01.components.partFile.TextFile;

/**
 * Задача 1.
 * Создать объект класса Текстовый файл, используя классы Файл, Директория.
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

public class Main {
    public static void main(String[] args) {
        // Creating directory and files
        Directory root = new Directory("C:");
        Directory texts = new Directory("texts", root);
        Directory task = new Directory("task", texts);
        TextFile javaTask5 = new TextFile("JavaTask5", task);
        TextFile wasted = new TextFile("wasted");
        wasted.addContent("My fault! Has no directory");

        System.out.println("Our catalog tree:");
        System.out.println(task.getFullPath());
        System.out.println("There are locating files:");
        task.printContent();
        System.out.println();
        javaTask5.addContent("Hello Java 5");

        System.out.println("Adding lost file.");
        task.addContent(wasted);
        System.out.println("There are locating files:");
        task.printContent();
        System.out.println();

        System.out.println("File JavaTask5");
        System.out.println("Name: " + javaTask5.getName());
        System.out.print("Content: ");
        javaTask5.printContent();
        javaTask5.addContent("\tGot more text!");
        System.out.print("Content: ");
        javaTask5.printContent();
        System.out.println("Let's clear file!");
        javaTask5.remove(null);
        System.out.print("Content: ");
        javaTask5.printContent();
        System.out.println();

        System.out.println("Let's delete this file from directory!");
        System.out.println("Before deleting:");
        task.printContent();
        System.out.println("After deleting:");
        task.remove(javaTask5);
        task.printContent();
        System.out.println();
        System.out.println("Root folder has:");
        root.printContent();
        System.out.println("Create new folder at root folder:");
        Directory additional = new Directory("etc", root);
        root.printContent();

    }
}
