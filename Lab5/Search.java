public class Search {

    // Linear search method
    public int linearSearch(int[] array, int target) {
        // Loop through the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index if the target is found
            }
        }
        return -1; // Return -1 if the target is not found
    }

    // Binary search method
    public boolean binarySearch(int[] array, int target) {
        int start = 0, end = array.length - 1;

        while (start <= end) {
            // Recalculate mid in each iteration
            int mid = start + (end - start) / 2;

            // Check if the target is at the mid index
            if (array[mid] == target) {
                return true; // Return true if the target is found
            }

            // If target is smaller, ignore the right half
            else if (array[mid] > target) {
                end = mid - 1;
            }

            // If target is larger, ignore the left half
            else {
                start = mid + 1;
            }
        }

        return false; // Return false if the target is not found
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance of the Search class
        Search searchObj = new Search();

        // Define the array and the target value
        int[] array = {10, 20, 30, 40, 50};
        int target = 40;

        // Call the linearSearch method and store the result
        int result = searchObj.linearSearch(array, target);

        // Output the result of linear search
        if (result != -1) {
            System.out.println("Linear Search: Value " + target + " found at index " + result);
        } else {
            System.out.println("Linear Search: Value " + target + " not found.");
        }

        // Call the binarySearch method and store the result
        boolean binaryResult = searchObj.binarySearch(array, target);

        // Output the result of binary search
        if (binaryResult) {
            System.out.println("Binary Search: Value " + target + " found.");
        } else {
            System.out.println("Binary Search: Value " + target + " not found.");
        }
    }
}
