import java.util.Scanner;

public class CarlysEventPrice {
    public static void main(String[] args) {
        // Constants
        final double PRICE_PER_PERSON = 35.00;
        final int LARGE_EVENT_THRESHOLD = 50;

        // user input
        Scanner scanner = new Scanner(System.in);

        // motto
        System.out.println("*******************************");
        System.out.println("* Carly's makes the food that  *");
        System.out.println("* makes it a party.            *");
        System.out.println("*******************************");

        // number of guests
        System.out.print("Enter the number of guests attending the event: ");
        int numberOfGuests = scanner.nextInt();

        // total price
        double totalPrice = numberOfGuests * PRICE_PER_PERSON;

        // results
        System.out.println("\nNumber of guests: " + numberOfGuests);
        System.out.println("Price per guest: $" + PRICE_PER_PERSON);
        System.out.println("Total price: $" + totalPrice);
        
        // Check if the event is large
        boolean isLargeEvent = numberOfGuests >= LARGE_EVENT_THRESHOLD;
        System.out.println("Is this a large event? " + isLargeEvent);

        
        scanner.close();
    }
}
