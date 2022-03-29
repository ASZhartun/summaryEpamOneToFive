package block4.simplestClassesAndObjects.task09;

import java.util.Arrays;

public class Book {
    enum Binding {
        SOFT("мягкий"), HARD("твердый"), LUXURY("лухарь");
        String typeBinder;
        Binding (String type) {
            this.typeBinder = type;
        }
        public String getTypeBinder() {
            return typeBinder;
        }

        @Override
        public String toString() {
            return getTypeBinder();
        }
    }

    int id;
    String title;
    String[] authors;
    String publisher;
    int year;
    int pages;
    String price;
    Binding bookBinder;

    public Book(int id, String title, String author, String publisher, int year, int pages, String price, Binding bookBinder) {
        this.id = id;
        this.title = title;
        this.authors = new String[]{author};
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.bookBinder = bookBinder;
    }

    public Book(int id, String title, String[] authors, String publisher, int year, int pages, String price, Binding bookBinder) {
        this.id = id;
        this.title = title;
        this.authors = new String[authors.length];
        System.arraycopy(authors, 0, this.authors, 0, authors.length);
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.bookBinder = bookBinder;
    }


    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = new String[authors.length];
        System.arraycopy(authors, 0, this.authors, 0, authors.length);
    }

    public void setAuthors(String author) {
        this.authors = new String[]{author};
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Binding getBookBinder() {
        return bookBinder;
    }

    public void setBookBinder(Binding bookBinder) {
        this.bookBinder = bookBinder;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id = " + id +
                ", title = '" + title + '\'' +
                ", authors = " + Arrays.toString(authors) +
                ", publisher = '" + publisher + '\'' +
                ", year = " + year +
                ", pages = " + pages +
                ", price = '" + price + '\'' +
                ", переплет = " + bookBinder +
                '}';
    }
}
