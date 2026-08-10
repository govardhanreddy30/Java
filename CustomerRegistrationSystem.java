import java.util.Scanner;

public class CustomerRegistrationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Customer Registration System ===");
        System.out.print("Enter customer's age as a string: ");
        String ageString = scanner.next();

        try {
            // Converting String to integer; throws NumberFormatException if input is non-numeric
            int age = Integer.parseInt(ageString);
            System.out.println("Customer registration successful! Age recorded: " + age);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input format entered for age ('" + ageString + "').");
            System.out.println("Please enter numeric digits only (e.g., 25).");
        } finally {
            scanner.close();
        }
    }
}