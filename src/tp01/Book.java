package tp01;

/**
 * Book
 */
public class Book {
    String author;
    String title;
    int year;

    Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    String getAuthor() {
        return this.author;
    }

    String getTitle() {
        return this.title;
    }

    String print() {
        return author + " a écrit " + title + " en " + year;
    }

    public static void main(String[] args) {
        Book book = new Book("Edwin A. Abbott", "Flatland", 1884);
        System.out.println(book.print());
    }
}