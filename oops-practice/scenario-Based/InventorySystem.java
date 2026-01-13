class OutOfStockException extends Exception {}

class Product {
    String name; int stock;
    void sell() throws OutOfStockException {
        if (stock == 0) throw new OutOfStockException();
        stock--;
    }
}

public class InventorySystem {
    public static void main(String[] args) throws Exception {
        Product p = new Product();
        p.stock = 1;
        p.sell();
        System.out.println("Sold");
    }
}
