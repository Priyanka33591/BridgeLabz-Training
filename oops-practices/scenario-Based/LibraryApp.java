import java.util.*;

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String msg) {
        super(msg);
    }
}

class Book {
    String title;
    String author;
    boolean available;

    Book(String title, String author, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
    }
}

class Library {
    List<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
    }

    void searchBook(String keyword) {
        for (Book b : books) {
            if (b.title.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(b.title + " by " + b.author +
                        " (" + (b.available ? "Available" : "Checked Out") + ")");
            }
        }
    }

    void checkoutBook(String title) throws BookNotAvailableException {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                if (!b.available) {
                    throw new BookNotAvailableException("Book already checked out");
                }
                b.available = false;
                System.out.println("Book checked out successfully");
                return;
            }
        }
        System.out.println("Book not found");
    }
}
