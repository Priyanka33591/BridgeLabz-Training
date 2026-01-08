class ItemNode {
    String name;
    int id, quantity;
    double price;
    ItemNode next;

    ItemNode(String name, int id, int q, double p) {
        this.name = name;
        this.id = id;
        this.quantity = q;
        this.price = p;
    }
}

class Inventory {
    ItemNode head;

    double totalValue() {
        double sum = 0;
        ItemNode t = head;
        while (t != null) {
            sum += t.price * t.quantity;
            t = t.next;
        }
        return sum;
    }
}
