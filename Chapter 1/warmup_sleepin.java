import java.util.Scanner;

public class warmup_sleepin {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        // We sleep in if it's not a weekday or vacation
        return !weekday || vacation;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //weekday
        System.out.print("Is it a weekday? (true/false): ");
        boolean weekday = scanner.nextBoolean();

        //vacation
        System.out.print("Are we on vacation? (true/false): ");
        boolean vacation = scanner.nextBoolean();

        //Determine
        boolean result = sleepIn(weekday, vacation);

        //result
        System.out.println("We sleep in: " + result);

        scanner.close();
    }
}

