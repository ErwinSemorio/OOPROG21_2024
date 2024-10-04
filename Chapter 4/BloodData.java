
import java.util.Scanner;

public class BloodData {

    private String bloodType;
    private String rhFactor;

    // Getters and Setters
    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getRhFactor() {
        return rhFactor;
    }

    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }

    // Set default values for blood type and Rh factor
    public void defaultPatient() {
        this.bloodType = "A";
        this.rhFactor = "-";
    }

    // Method to input blood information
    public void inputBloodInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter blood type: ");
        this.bloodType = scanner.nextLine();

        System.out.print("Enter Rh factor (+ or -): ");
        this.rhFactor = scanner.nextLine();
    }

    // Method to display blood information
    public void displayBloodInfo() {
        System.out.println("Your blood type is: " + this.bloodType);
        System.out.println("Your Rh factor is: " + this.rhFactor);
    }
}
