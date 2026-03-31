class RoomNotAvailableException extends Exception {}

interface PricingStrategy {
    double price(int days);
}

class NormalPricing implements PricingStrategy {
    public double price(int d) { return d * 1000; }
}

public class HotelSystem {
    public static void main(String[] args) {
        PricingStrategy p = new NormalPricing();
        System.out.println(p.price(2));
    }
}
