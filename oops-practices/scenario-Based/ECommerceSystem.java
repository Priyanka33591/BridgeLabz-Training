class PaymentFailedException extends Exception {}

interface Payment {
    void pay(double amt) throws PaymentFailedException;
}

class UPIPayment implements Payment {
    public void pay(double amt) {}
}

class Product {
    String name; double price;
}

public class ECommerceSystem {
    public static void main(String[] args) throws Exception {
        Payment p = new UPIPayment();
        p.pay(500);
        System.out.println("Order placed");
    }
}
