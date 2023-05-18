public class Ex4Solutions {

    public static void main(String[] args) {
        System.out.println("Question 1");
        q1(5); // 1 2 3 4 5
        System.out.println();

        System.out.println("Question 2");
        q2(5); // 1 5 2 4 3
        System.out.println();
        q2(6); // 1 6 2 5 3 4
        System.out.println();

        System.out.println("Question 3");
        int[] array1 = {1, 9, 4, 2, 3, 0, -5, 7};
        q3(array1); // 9

        System.out.println("Question 4");
        int[] array2 = {-1, 2, 7, 18, 300, -4, -5, 7};
        q4(array2); // -5, -4, -1, 2, 7, 7, 18, 300
        for (int i : array2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Question 5");
        int[] array3 = {1, 2, 3, 0};
        q5(array3);
        // Hello World
        // 2
        // 3
        int[] array4 = {1, 1, 0, 1, 0};
        q5(array4);
        // Hello World
        // Hello World
    }

    /*******************
     * Basic questions *
     *******************/

    /**
     * Q1: Print numbers from 1 to n, separated by a whitespace.
     * (Loops)
     */
    private static void q1(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }

    /**
     * Q2: Print numbers in this sequence: 1, n, 2, n-1, 3, n-2, ...
     * (Loops, if-else)
     */
    private static void q2(int n) {
        // Note: If n is odd, the number (n+1)/2 should only be printed once.
        // e.g. If n = 5, the sequence printed should be: 1 5 2 4 3
        //      and not: 1 5 2 4 3 3
        for (int i = 1; i <= n / 2; i++) {
            System.out.print(i + " ");
            System.out.print(n + 1 - i + " ");
        }
        if (n % 2 == 1) {
            System.out.print((n + 1) / 2 + " ");
        }
    }

    /**************************
     * Intermediate questions *
     **************************/

    /**
     * Q3: Print the largest number in an array.
     * (Arrays)
     */
    private static void q3(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

    /**
     * Q4: Sort the array.
     * (Array sorting)
     */
    private static void q4(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swapping with XOR
                    array[j] ^= array[j + 1];
                    array[j + 1] ^= array[j];
                    array[j] ^= array[j + 1];
                    // Alternatively
                    // int temp = array[j];
                    // array[j] = array[j + 1];
                    // array[j + 1] = temp;
                }
            }
        }
    }

    /**********************
     * Advanced questions *
     **********************/

    /**
     * Q5: Create a menu that does the following:
     * 1. Take the next integer from an array as input.
     * 2. If the integer is 0, exit.
     * 3. If the integer is 1, print "Hello World" and return to menu again.
     * 4. If the integer is anything else, print the integer and return to menu again.
     * (Input output)
     */
    private static void q5(int[] array) {
        int index = 0;
        while (true) {
            int input = array[index++];
            if (input == 0) {
                break;
            } else if (input == 1) {
                System.out.println("Hello World");
            } else {
                System.out.println(input);
            }
        }
    }

}
