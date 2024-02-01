package tp01;

/**
 * UseBook
 */
public class UseBook {
    public static void main(String[] args) {
        Book[] library = new Book[]{
            new Book("Edwin A. Abbott", "Flatland", 1884),
            new Book("Adolf Hitler", "Mein Kampf", 1925),
            new Book("L'étranger", "Albert Camus", 1942),
        };

        for (Book book : library) {
            System.out.println(book.print());
        }
    }
}