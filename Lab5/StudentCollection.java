import java.util.HashMap;

public class StudentCollection {
    HashMap <Integer, String> StudentMap;

    // Constructor to initialize the StudentMap
    StudentCollection() {
        StudentMap = new HashMap <> ();
    }

    // Method to add a student
    public void addStudent(int id, String name) {
        if (StudentMap.containsKey(id)) {
            System.out.println("Updated Successfully");
        } else {
            System.out.println("Inserted Successfully!");
        }
        StudentMap.put(id, name);
    }

    // Method to delete a student
    public void deleteStudent(int id) {
        if (StudentMap.containsKey(id)) {
            StudentMap.remove(id);
            System.out.print("The student deleted successfully");
        } else {
            System.out.print("The student does not exist");
        }
    }

    // Method to search for a student by ID
    public void searchStudent(int id) {
        if (StudentMap.containsKey(id)) {
            System.out.println("Student found: " + StudentMap.get(id));
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        StudentCollection sc = new StudentCollection();

        // Add students
        sc.addStudent(101, "John Doe");
        sc.addStudent(102, "Jane Smith");

        // Search for students
        sc.searchStudent(101);  // Should print: Student found: John Doe
        sc.searchStudent(103);  // Should print: Student with ID 103 not found.

        // Delete a student
        sc.deleteStudent(101);

        // Attempt to delete a student that doesn't exist
        sc.deleteStudent(105);

        //adding again Jana
        sc. addStudent(102, "Jane Smith");
    }
}
