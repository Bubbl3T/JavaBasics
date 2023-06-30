public class Sort {

    public static void main(String[] args) {
        int[] array = {5, 7, 6, 3, 0 ,2 ,1, 9, 4, 8};

        // Min
        System.out.println("Min:");
        System.out.println(min(array));
        System.out.println();

        // Max
        System.out.println("Max:");
        System.out.println(max(array));
        System.out.println();

        // Bubble Sort
        int[] arrayCopy = array.clone();
        bubbleSort(arrayCopy);
        System.out.println("Bubble sort:");
        for (int i : arrayCopy) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println();

        // Selection Sort
        arrayCopy = array.clone();
        selectionSort(arrayCopy);
        System.out.println("Selection sort:");
        for (int i : arrayCopy) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println();

        // Binary Search
        int[] sortedArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Binary search 3:");
        System.out.println(binarySearch(sortedArray, 3));
        System.out.println("Binary search 11:");
        System.out.println(binarySearch(sortedArray, 11));
        System.out.println();

        // Insertion Sort
        arrayCopy = array.clone();
        insertionSort(arrayCopy);
        System.out.println("Insertion sort:");
        for (int i : arrayCopy) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println();
    }

    public static int min(int[] array) {
        final int SIZE = array.length;
		// Write your code here
        return 0;
    }

    public static int max(int[] array) {
        final int SIZE = array.length;
		// Write your code here
		return 0;

    }

    public static void bubbleSort(int[] array) {
        final int SIZE = array.length;
        // Write your code here
    }
    
    public static void selectionSort(int[] array) {
        final int SIZE = array.length;
        // Write your code here
    }

    public static boolean binarySearch(int[] array, int num) {
        final int SIZE = array.length;
        // Write your code here
        return false;
    }

    public static void insertionSort(int[] array) {
        final int SIZE = array.length;
        // Write your code here
    }
}