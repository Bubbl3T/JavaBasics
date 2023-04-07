public class Calculator {

    public final double PI = 3.14;

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }

    // public Calculator() { // Default constructor
    //     System.out.println("I am a calculator");
    // }

    public int add(int a, int b) {
        return a + b;
    }

    /* Write the subtract method here */




    // public int add(int a, int b, int c) { // Method overriding
    //     return a + b + c;
    // }

    // public int add(int a, int b, int c, int... moreNumbers) { // Method overriding
    //     int sum = a + b + c;
    //     for (int number : moreNumbers) {
    //         sum += number;
    //     }
    //     return sum;
    // }



    /************
     * HOMEWORK *
     ************/
    // Implement the following methods in the Calculator class:
    // * Multiply
    // * Divide
    // * Modulus



    /************
     * ADVANCED *
     ************/
    // Modify the Calculator class such that methods can be chained and their types follow
    // the following conventions:
    // e.g.
    // int x = multiply(3, modulus(27, 4)); // x == 9
    // double y = add(3, divide(7.0, 2.0)); // y == 6.5

    // Hint: use method overloading
}
