public class SortSolutions {

    public static void main(String[] args) {
        int[] array = {5, 7, 6, 3, 0, 2, 1, 9, 4, 8};

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
		int min = array[0];
		for (int i = 1; i < SIZE; i++) {
				if (array[i] < min) {
						min = array[i];
				}
		}
		return min;

    }

    public static int max(int[] array) {
        final int SIZE = array.length;
		int max = array[0];
		for (int i = 1; i < SIZE; i++) {
				if (array[i] > max) {
						max = array[i];
				}
		}
		return max;

    }

    public static void bubbleSort(int[] array) {
        final int SIZE = array.length;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    
    public static void selectionSort(int[] array) {
        final int SIZE = array.length;
        for (int i = 0; i < SIZE; i++) {
            int minIndex = i;
            for (int j = i + 1; j < SIZE; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public static boolean binarySearch(int[] array, int num) {
        final int SIZE = array.length;
        int start = 0;
        int end = SIZE;
        int mid;
        while (end > start) {
            mid = (start + end) / 2;
            if (mid == num) {
                return true;
            }
            if (mid < num) {
                start = mid + 1;
            } else { // if (mid > num)
                end = mid;
            }
        }
        return false;
    }

    public static void insertionSort(int[] array) {
        final int SIZE = array.length;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}