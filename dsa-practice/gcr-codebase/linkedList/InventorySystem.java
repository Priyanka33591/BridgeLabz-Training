class Item {
    String name;
    int id, qty;
    double price;
    Item next;

    Item(String n, int i, int q, double p) {
        name = n; id = i; qty = q; price = p;
    }
}

public class InventorySystem {
    Item head;

    void addItem(Item item) {
        item.next = head;
        head = item;
    }

    void updateQty(int id, int newQty) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.qty = newQty;
                return;
            }
            temp = temp.next;
        }
    }

    double totalValue() {
        double sum = 0;
        Item temp = head;
        while (temp != null) {
            sum += temp.qty * temp.price;
            temp = temp.next;
        }
        return sum;
    }

    public static void main(String[] args) {
        InventorySystem i = new InventorySystem();
        i.addItem(new Item("Pen", 1, 10, 5));
        i.addItem(new Item("Book", 2, 5, 100));
        System.out.println(i.totalValue());
    }
}
