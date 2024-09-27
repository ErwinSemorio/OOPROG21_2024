public class Billing {

    // Method to compute bill with a single price parameter
    public double computeBill(double price) {
        double total = price + (price * 0.08); // Adding 8% tax
        System.out.println("The total price for the bill is: $" + total);
        return total;
    }

    // Method to compute bill with price and quantity
    public double computeBill(double price, int quantity) {
        double total = (price * quantity) + (price * quantity * 0.08); // Adding 8% tax
        System.out.println("The total price for the bill is: $" + total);
        return total;
    }

    // Method to compute bill with price, quantity, and coupon discount
    public double computeBill(double price, int quantity, int couponDiscount) {
        double discountedPrice = price * quantity - couponDiscount;
        double total = discountedPrice + (discountedPrice * 0.08); // Adding 8% tax
        System.out.println("The total price for the bill is: $" + total);
        return total;
    }

    // Main method to test the overloaded methods
    public static void main(String[] args) {
        Billing bill = new Billing();

        // Testing each method
        bill.computeBill(23.2);  // Single price
        bill.computeBill(23.2, 2);  // Price and quantity
        bill.computeBill(23.2, 3, 5);  // Price, quantity, and coupon discount
    }
}
