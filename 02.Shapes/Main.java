public class Main {

    public static void main(String[] args) {
        // Default constructor
        Square sq = new Square();
        System.out.println(sq);
        System.out.println(sq.getArea());

        // Overloaded constructor
        Square sq2 = new Square(10);
        System.out.println(sq2);
        System.out.println(sq2.getArea());

        // Modification of class attributes
        sq2.length = 3;
        System.out.println(sq2);
        System.out.println(sq2.getArea());

        // Using getters and setters
        SquareVer2 sq3 = new SquareVer2(2);
        // sq3.length; // This line will not work since length is a private attribute
        int length = sq3.getLength(); // But this will work since the method is public
        sq3.setLength(8);
        System.out.println(length);
        System.out.println(sq3.getArea());

        /************
         * Homework *
         ************/
        // Complete the classes Rectangle and Circle so the code in the homework method works as expected.
        // You can uncomment the function call below to check your answers.
        
        // homework();
    }

    public static void homework() {
        System.out.println("\nHomework starts here\n====================");

        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1.getArea()); // Returns 1

        Rectangle rectangle2 = new Rectangle(2, 8);
        rectangle2.setWidth(7);
        // rectangle2.length = 3; // This should not work
        System.out.println(rectangle2.getLength()); // Returns 2
        System.out.println(rectangle2.getArea()); // Returns 14

        Circle circle = new Circle(2.5);
        circle.radius = 3.5;
        double area = circle.getArea();
        System.out.println(area); // Prints 38.465
    }
    
}
