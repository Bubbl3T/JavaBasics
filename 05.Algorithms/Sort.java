public class Sort {

    public static void main(String[] args) {
        int[] array = {5, 7, 6, 3, 0 ,2 ,1, 9, 4, 8};

        int[] arrayCopy = array.clone();
        bubbleSort(arrayCopy);
        System.out.println("Bubble sort:");
        for (int i : arrayCopy) {
            System.out.print(i);
        }
        System.out.println();

        arrayCopy = array.clone();
        insertionSort(arrayCopy);
        System.out.println("Insertion sort:");
        for (int i : arrayCopy) {
            System.out.print(i);
        }
        System.out.println();

        arrayCopy = array.clone();
        selectionSort(arrayCopy);
        System.out.println("Selection sort:");
        for (int i : arrayCopy) {
            System.out.print(i);
        }
        System.out.println();
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        // Write your code here
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        // Write your code here
    }
    
    public static void selectionSort(int[] array) {
        int n = array.length;
        // Write your code here
    }
}