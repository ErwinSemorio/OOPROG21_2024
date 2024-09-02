import java.util.Scanner;

public class SammysRentalPrice {
    public static void main(String[] args) {
        // Sammy's Seashore Supplies motto
        String motto = "S Sammy's makes it fun in the sun! S";
        
        //  motto
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println(motto);
        
        // user input
        Scanner input = new Scanner(System.in);
        
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        
        
        // for the number of minutes the equipment was rented
        System.out.print("Enter the number of minutes the equipment was rented: ");
        int totalMinutes = input.nextInt();
        
        // hour remaining mins.
        int hours = totalMinutes / 60;
        int remainingMinutes = totalMinutes % 60;
        
        // total price
        int totalPrice = (hours * 40) + remainingMinutes;
        
        //  results
        System.out.println("\nHours rented: " + hours);
        System.out.println("Additional minutes: " + remainingMinutes);
        System.out.println("Total price: $" + totalPrice);
        
        // Close the scanner
        input.close();
    }
}
