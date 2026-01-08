class Ticket {
    int id;
    String name;
    Ticket next;

    Ticket(int i, String n) {
        id = i; name = n;
    }
}

public class TicketSystem {
    Ticket head;

    void add(Ticket t) {
        if (head == null) {
            head = t;
            t.next = head;
            return;
        }
        Ticket temp = head;
        while (temp.next != head)
            temp = temp.next;
        temp.next = t;
        t.next = head;
    }

    void display() {
        if (head == null) return;
        Ticket t = head;
        do {
            System.out.println(t.name);
            t = t.next;
        } while (t != head);
    }

    public static void main(String[] args) {
        TicketSystem ts = new TicketSystem();
        ts.add(new Ticket(1, "Priyanka"));
        ts.add(new Ticket(2, "Kartik"));
        ts.display();
    }
}
