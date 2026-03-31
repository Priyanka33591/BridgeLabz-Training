public class DiscountFee {
    public static void main(String[] args) {
        double originalFee = 5000;
        double discountPercent = 20;
        double discountAmount = (discountPercent / 100) * originalFee;
        double discountedFee = originalFee - discountAmount;
        System.out.println("The discounted fee is: INR " + discountAmount + " and the final fee after discount is: INR "
                + discountedFee);
    }
}
