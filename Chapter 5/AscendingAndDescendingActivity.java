import java.util.Scanner;

public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input three integers
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Check if the numbers are already in ascending order
        if (num1 <= num2 && num2 <= num3) {
            // If they are in ascending order, display in ascending order
            System.out.println("The numbers in ascending order: " + num1 + " " + num2 + " " + num3);
        } else {
            // If they are not, display them in descending order
            int temp;

            // Sort the numbers using simple comparisons
            if (num1 < num2) {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }

            if (num1 < num3) {
                temp = num1;
                num1 = num3;
                num3 = temp;
            }

            if (num2 < num3) {
                temp = num2;
                num2 = num3;
                num3 = temp;
            }

            System.out.println("The numbers in descending order: " + num1 + " " + num2 + " " + num3);
        }

        scanner.close();
    }
}
