import java.util.Scanner;

public class StudentCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Student Calculator ===");
        System.out.print("Enter total marks: ");
        double totalMarks = scanner.nextDouble();

        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();

        try {
            // Division by zero will throw ArithmeticException if numSubjects is 0
            double average = totalMarks / numSubjects;
            System.out.println("The average marks is: " + average);
        } catch (ArithmeticException e) {
            System.out.println("Error: Number of subjects cannot be zero. Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }
}