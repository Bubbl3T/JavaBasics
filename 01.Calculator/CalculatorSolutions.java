public class CalculatorSolutions {

    public final double PI = 3.14;

    public static void main(String[] args) {
        CalculatorSolutions calculator = new CalculatorSolutions();
    }

    public CalculatorSolutions() { // Default constructor
        System.out.println("I am a calculator");
        int x = multiply(3, modulus(27, 4)); // x == 9
        System.out.println(x);
        double y = add(3, divide(7.0, 2.0)); // y == 6.5
        System.out.println(y);
    }

    public int add(int a, int b) {
        return a + b;
    }

    // public double add(int a, double b) {
    //     return a + b;
    // }

    // public double add(double a, int b) {
    //     return a + b;
    // }

    public double add(double a, double b) { // This works because int is a subset of double
        return a + b;
    }

    public int add(int a, int b, int c) { // Method overriding
        return a + b + c;
    }

    public int add(int a, int b, int c, int... moreNumbers) { // Method overriding
        int sum = a + b + c;
        for (int number : moreNumbers) {
            sum += number;
        }
        return sum;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public int modulus(int a, int b) {
        return a % b;
    }



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
