class Book {
    int id;
    String title, author;
    boolean available;
    Book next, prev;

    Book(int i, String t, String a) {
        id = i; title = t; author = a; available = true;
    }
}

public class Library {
    Book head, tail;

    void addBook(Book b) {
        if (head == null) {
            head = tail = b;
            return;
        }
        tail.next = b;
        b.prev = tail;
        tail = b;
    }

    void display() {
        Book t = head;
        while (t != null) {
            System.out.println(t.title + " " + t.available);
            t = t.next;
        }
    }

    public static void main(String[] args) {
        Library l = new Library();
        l.addBook(new Book(1, "Java", "James"));
        l.addBook(new Book(2, "DSA", "CLRS"));
        l.display();
    }
}
