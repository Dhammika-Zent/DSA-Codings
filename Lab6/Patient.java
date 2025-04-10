public class Patient implements Comparable<Patient> {

    private String name;
    private int priority;

    // Constructor
    public Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for priority
    public int getPriority() {
        return priority;
    }

    // Compare patients based on their priority
    @Override
    public int compareTo(Patient other) {
        return Integer.compare(this.priority, other.priority); // Compares based on priority
    }

    // Override toString to print patient details
    @Override
    public String toString() {
        return name + " (" + priority + ")";
    }

    // Main method to test the Patient class
    public static void main(String[] args) {
        Patient patient1 = new Patient("Thivanka", 5);
        Patient patient2 = new Patient("Supun", 3);
        Patient patient3 = new Patient("Sithum", 8);

        System.out.println("Comparing patient1 and patient2: " + patient1.compareTo(patient2));  // Should return >0 as 5 > 3
        System.out.println("Comparing patient1 and patient3: " + patient1.compareTo(patient3));  // Should return <0 as 5 < 8
        System.out.println("Comparing patient2 and patient3: " + patient2.compareTo(patient3));  // Should return <0 as 3 < 8

        System.out.println("Patient1: " + patient1);
        System.out.println("Patient2: " + patient2);
        System.out.println("Patient3: " + patient3);
    }
}
