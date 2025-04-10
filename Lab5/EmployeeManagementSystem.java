import java.util.HashMap;

public class EmployeeManagementSystem {
    // Declare a HashMap to store Employee objects with their IDs
    HashMap <Integer, Employee> employeeMap;

    // Constructor to initialize the employee map
    public EmployeeManagementSystem() {
        employeeMap = new HashMap<>();
    }

    // Method to add or update an employee
    public void addEmployee(Employee e) {
        if (employeeMap.containsKey(e.id)) {
            System.out.println("Successfully updated!");
        } else {
            System.out.println("Successfully inserted");
        }
        employeeMap.put(e.id, e);
    }

    // Method to delete an employee based on ID
    public void deleteEmployee(int id) {
        if (employeeMap.containsKey(id)) {
            employeeMap.remove(id);
            System.out.println("Employee with ID " + id + " has been successfully deleted.");
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();
        
        // Creating Employee objects
        Employee e1 = new Employee(101, "John Doe");
        Employee e2 = new Employee(102, "Jane Smith");
        
        // Adding employees
        system.addEmployee(e1);
        system.addEmployee(e2);

        // Deleting an employee
        system.deleteEmployee(101); // Deleting employee with ID 101
        
        // Trying to delete a non-existing employee
        system.deleteEmployee(105); // ID 105 does not exist
    }
}

// Employee class
class Employee {
    int id;
    String name;

    // Constructor for Employee class
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
