import java.util.HashSet;

public class CityCollection {
    // Declare the HashSet for storing cities
    HashSet<String> cityset;

    // Constructor to initialize the HashSet
    CityCollection() {
        cityset = new HashSet<>();
    }

    // Method to add a city to the set
    public void addCity(String city) {
        if (cityset.contains(city)) {
            System.out.println("The city is already added.");
        } else {
            cityset.add(city);
            System.out.println("Successfully added.");
        }
    }

    // Method to delete a city from the set
    public void deleteCity(String city) {
        if (cityset.contains(city)) {
            cityset.remove(city);
            System.out.println("The city has been successfully deleted.");
        } else {
            System.out.println("The city does not exist in the collection.");
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        CityCollection cc = new CityCollection();

        // Add cities
        cc.addCity("New York");
        cc.addCity("Los Angeles");
        cc.addCity("Chicago");

        // Try to add a duplicate city
        cc.addCity("Los Angeles");

        // Delete a city
        cc.deleteCity("Chicago");

        // Try to delete a city that doesn't exist
        cc.deleteCity("San Francisco");

        // Print remaining cities
        System.out.println("Remaining cities: " + cc.cityset);
    }
}
