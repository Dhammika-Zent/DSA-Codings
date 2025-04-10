import java.util.PriorityQueue;

public class PatientManager {
    private PriorityQueue<Patient> patientQueue;

    // Constructor to initialize the priority queue
    public PatientManager() {
        patientQueue = new PriorityQueue<>();  // Added the missing semicolon here
    }

    // Method to add a patient to the queue
    public void addPatient(Patient p) {
        patientQueue.add(p);
    }

    // Method to delete (remove) a patient from the queue and return their priority
    public int deletePatient() {
        if (patientQueue.isEmpty()) {
            System.out.println("No patients in the queue.");
            return -1;  // Return -1 if no patients are in the queue
        }
        return patientQueue.poll().getPriority();  // Remove and return the patient's priority
    }

    // Method to display all patients in the queue
    public void displayAll() {
        if (patientQueue.isEmpty()) {
            System.out.println("No patients in the queue.");
            return;
        }
        for (Patient p : patientQueue) {
            System.out.println(p);  // Print each patient's info (using the toString method)
        }
    }

    // Main method to test the PatientManager class
    public static void main(String[] args) {
        PatientManager manager = new PatientManager();

        // Creating patients
        Patient p1 = new Patient("John Doe", 5);
        Patient p2 = new Patient("Jane Doe", 3);
        Patient p3 = new Patient("Alice Smith", 8);

        // Adding patients to the queue
        manager.addPatient(p1);
        manager.addPatient(p2);
        manager.addPatient(p3);

        // Displaying all patients
        System.out.println("Patients in the queue:");
        manager.displayAll();

        // Deleting a patient and showing the priority of the deleted patient
        System.out.println("\nDeleted patient with priority: " + manager.deletePatient());

        // Displaying remaining patients
        System.out.println("\nPatients remaining in the queue:");
        manager.displayAll();
    }
}
