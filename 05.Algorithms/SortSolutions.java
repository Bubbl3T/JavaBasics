public class SortSolutions {

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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}