class MovieNode {
    String title, director;
    int year;
    double rating;
    MovieNode next, prev;

    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}

class MovieList {
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

    void removeByTitle(String title) {
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
        for (MovieNode t = head; t != null; t = t.next)
            System.out.println(t.title + " " + t.rating);
    }

    void displayReverse() {
        for (MovieNode t = tail; t != null; t = t.prev)
            System.out.println(t.title + " " + t.rating);
    }
}
