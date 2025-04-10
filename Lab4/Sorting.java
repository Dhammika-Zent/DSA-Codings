
public class Sorting {

    // Insertion Sort
    public void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int key = array[i];
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    // Selection Sort
    public void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;  // assume the current element is the smallest
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    // QuickSort
    public void quickSort(int low, int high, int[] array) {
        if (low < high) {
            int pivotIndex = partition(low, high, array);
            quickSort(low, pivotIndex - 1, array);
            quickSort(pivotIndex + 1, high, array);
        }
    }

    public int partition(int low, int high, int[] array) {
        int mid = low + (high - low) / 2;
        int pivot = array[mid];
        swap(array, mid, high);
        int i = low;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                swap(array, i, j);
                i++;
            }
        }
        swap(array, high, i);
        return i;
    }

    // Swap helper method
    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Display array method
    public void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Sorting sort = new Sorting();
        int[] array = {5, 2, 8, 1, 3};

        // Sorting using Selection Sort
        sort.selectionSort(array);
        sort.display(array);  // Display the sorted array after Selection Sort

        // Sorting using Insertion Sort
        sort.insertSort(array);
        sort.display(array);  // Display the sorted array after Insertion Sort

        // Sorting using QuickSort
        sort.quickSort(0, array.length - 1, array);
        sort.display(array);  // Display the sorted array after QuickSort
    }
}
