class MovieNode {
    String title, director;
    int year;
    double rating;
    MovieNode next, prev;

    MovieNode(String t, String d, int y, double r) {
        title = t; director = d; year = y; rating = r;
    }
}

public class MovieSystem {
    MovieNode head, tail;

    void addMovie(String t, String d, int y, double r) {
        MovieNode node = new MovieNode(t, d, y, r);
        if (head == null) {
            head = tail = node;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    void deleteByTitle(String title) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                if (temp.prev != null) temp.prev.next = temp.next;
                else head = temp.next;

                if (temp.next != null) temp.next.prev = temp.prev;
                else tail = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    void displayForward() {
        MovieNode temp = head;
        while (temp != null) {
            System.out.println(temp.title);
            temp = temp.next;
        }
    }

    void displayReverse() {
        MovieNode temp = tail;
        while (temp != null) {
            System.out.println(temp.title);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        MovieSystem m = new MovieSystem();
        m.addMovie("Inception", "Nolan", 2010, 9.0);
        m.addMovie("Interstellar", "Nolan", 2014, 9.2);
        m.displayForward();
        m.displayReverse();
    }
}
