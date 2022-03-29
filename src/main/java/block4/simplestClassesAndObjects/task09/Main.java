package block4.simplestClassesAndObjects.task09;

import java.util.ArrayList;

/**
 * 9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
 * Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года.
 */

public class Main {
    public static void main(String[] args) {
        Book book = new Book(1, "ChessNovel", "Cweig", "МИФ", 2007, 173, "17.43р.", Book.Binding.HARD);
        System.out.println(book);
        BookCollector bookCollector = new BookCollector(book);
        Book[] books = new Book[]{
                new Book(2, "Amok", "Cweig", "МИФ", 1992, 173, "17.43р.", Book.Binding.HARD),
                new Book(3, "Neznaika", "Nosov", "Koloss", 1993, 173, "17.43р.", Book.Binding.HARD),
                new Book(4, "Dom", "Petrosyan", "Koloss", 1978, 173, "17.43р.", Book.Binding.HARD),
                new Book(5, "Java Core", "Blinou", "Epam", 2003, 173, "17.43р.", Book.Binding.HARD),
                new Book(6, "Memuari", "Zhvaneckiy", "AST", 2015, 173, "17.43р.", Book.Binding.HARD),
        };
        bookCollector.addBook(books);
        bookCollector.printCollector();
        System.out.println("Books by author:");
        ArrayList<Book> cweig = bookCollector.getListByAuthor("Cweig");
        System.out.println();
        System.out.println("Books by publisher:");
        ArrayList<Book> koloss = bookCollector.getListByPublisher("Koloss");
        System.out.println();
        System.out.println("Books by year+:");
        ArrayList<Book> listByYear = bookCollector.getListByYear(2000);
    }
}
