package block4.simplestClassesAndObjects.task09;

import block4.simplestClassesAndObjects.task08.Customer;
import block4.simplestClassesAndObjects.task08.CustomerAggregator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class BookCollector {
    ArrayList<Book> collector;

    {
        this.collector = new ArrayList<>();
    }

    public BookCollector(Book[] array) {
        this.collector.addAll(Arrays.stream(array).toList());
    }

    public BookCollector(Book book) {
        this.collector.add(book);
    }

    public BookCollector() {

    }

    public ArrayList<Book> getCollector() {
        return collector;
    }

    public ArrayList<Book> getListByAuthor(String author) {
        ArrayList<Book> sample = new ArrayList<>();
        for (Book book :
                this.collector) {
            if (hasAuthor(author, book.getAuthors())) {
                System.out.println(book);
                sample.add(book);
            }
        }
        return sample;
    }

    public ArrayList<Book> getListByPublisher(String publisher) {
        ArrayList<Book> sample = new ArrayList<>();
        for (Book book :
                this.collector) {
            if (publisher.equals(book.getPublisher())) {
                System.out.println(book);
                sample.add(book);
            }
        }
        return sample;
    }

    public ArrayList<Book> getListByYear(int year) {
        ArrayList<Book> sample = new ArrayList<>();
        for (Book book :
                this.collector) {
            if (year <= book.getYear()) {
                System.out.println(book);
                sample.add(book);
            }
        }
        return sample;
    }

    public void addBook(Book book) {
        this.collector.add(book);
    }

    public void addBook(Book[] books) {
        this.collector.addAll(Arrays.stream(books).toList());
    }

    public void addBook(Collection<? extends Book> books) {
        this.collector.addAll(books);
    }

    public void printCollector() {
        for (Book item :
                this.collector) {
            System.out.println(item);
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

    private boolean hasAuthor(String author, String[] list) {
        for (String item :
                list) {
            if (item.equals(author)) return true;
        }
        return false;
    }
}
