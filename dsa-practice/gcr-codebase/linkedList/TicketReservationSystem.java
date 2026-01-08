class TicketNode {
    int id;
    String customer, movie;
    TicketNode next;
}

class TicketSystem {
    TicketNode head;

    void displayTickets() {
        if (head == null) return;
        TicketNode temp = head;
        do {
            System.out.println(temp.customer + " " + temp.movie);
            temp = temp.next;
        } while (temp != head);
    }
}
