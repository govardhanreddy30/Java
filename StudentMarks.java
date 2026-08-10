import java.util.Scanner;
public class StudentMarks {
    public static void main(String[] args) {
        // Storing marks of 5 students in an array (valid indices: 0 to 4)
        int[] marks = {85, 90, 78, 92, 88};
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Student Marks Processing ===");
        System.out.println("Stored marks for 5 students.");
        System.out.print("Enter the index of the student (Valid range: 0 to 4): ");
        int index = scanner.nextInt();

        try {
            // Accessing array element outside bounds throws ArrayIndexOutOfBoundsException
            System.out.println("Mark at index " + index + " is: " + marks[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Entered index is outside the valid range.");
            System.out.println("Please enter an index between 0 and " + (marks.length - 1) + ".");
        } finally {
            scanner.close();
        }
    }
}