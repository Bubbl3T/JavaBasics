public class Ex3 {

    public static void main(String[] args) {
        System.out.println("Question 1");
        q1(5); // 5
        q1(6); // Even number

        System.out.println("Question 2");
        q2(5);

        System.out.println("Question 3");
        q3(6); // Even
        q3(9); // Yay
        q3(17); // 17

        System.out.println("Question 4");
        int[] n1 = {7, 8, 9, 4, 5, 6, 1, 2, 3};
        q4(n1, 1); // 8

        System.out.println("Question 5");
        int[] n2 = {90, 55, 13, 71};
        q5(n2); // 90, 55, 13, 71

        System.out.println("Question 6");
        q6(6); // Should give the same pyramid as shown in the example.

        System.out.println("Question 7");
        q7(100); // 5050

        System.out.println("Question 8");
        q8(10); // 2, 4, 6, 8, 10 

        System.out.println("Question 9");
        q9(11); // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
    }

    /*******************
     * Basic questions *
     *******************/

    /**
     * Q1: Print n if n is odd. If n is even, print "Even number".
     * (If-else)
     */
    private static void q1(int n) {
        // Tip: How to check if the number is odd or even?
        // Tip: How to let the program do something based on that?
        
    }

    /**
     * Q2: Print numbers from 1 to n.
     * (Loops)
     */
    private static void q2(int n) {
        // Note: The printing of numbers starts from 1, not 0.
        // Note: The printing of numbers end with n, not n-1.
        
    }

    /**
     * Q3: If n is even, print "Even". Else, if n is divisible by 3, print "Yay". Else, print n.
     * (Chained if-else)
     */
    private static void q3(int n) {
        // Note: If n is both even and divisible by 3, it should print "Even".
        
    }

    /**
     * Q4: Print out the element at the ith index in the array n.
     * (Array indexing)
     */
    private static void q4(int[] n, int i) {
        
    }

    /**
     * Q5: Print all the elements in an array.
     * (Array length and array iteration)
     */
    private static void q5(int[] n) {
        // Tip: How do we find out the length of the array?
        
    }

    /**************************
     * Intermediate questions *
     **************************/
    
    /**
     * Q6: Print the pyramid of n.
     * (Nested loops)
     * E.g. (n = 6)
     * 1
     * 12
     * 123
     * 1234
     * 12345
     * 123456
     */
    private static void q6(int n) {
        // Tip: How many loops do we need?
        // Note: Take note of the starting and ending numbers.
        // Note: We can use a mix of print and println function to achieve the result we want.
        
    }

     /**
      * Q7: Print the sum of numbers from 1 to n.
      * (Loops)
      */
    private static void q7(int n) {
        // Tip: We will need a way to add the numbers from 1 to n and save it.

    }

    /**
     * Q8: Print all the even numbers from 1 to n. However, you cannot modify the if else block.
     * (Loop updating)
     */
    private static void q8(int n) {
        for (int i = 1; i <= n; i++) { // Tip: Maybe we can modify this line?

            // DO NOT MODIFY
            if (i % 2 == 1) { // If i is odd
                System.out.println("I SHOULD NOT BE PRINTED");
                break;
            } else {          // If i is even
                System.out.println(i);
            }
            // END DO NOT MODIFY
            
        }
    }

    /**********************
     * Advanced questions *
     **********************/

    /**
     * Q9: Print the first n numbers of the Fibonacci sequence.
     * i.e. 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55...
     */
    private static void q9(int n) {
        // Tip: Think about how the Fibonacci sequence is produced.

    }

     
    
}
