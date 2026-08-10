class Employee {
    int empId;
    String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        System.out.println("=== Employee Management System ===");
        
        // Declaring an Employee reference but intentionally leaving it uninitialized (null)
        Employee emp = null;

        try {
            // Attempting to access a method on a null object causes NullPointerException
            emp.displayDetails();
        } catch (NullPointerException e) {
            System.out.println("Error: Employee object is not initialized (null). Please create the employee record first.");
        }
    }
}