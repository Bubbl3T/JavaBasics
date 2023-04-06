public class CircleSolution {

    // Parameters
    public double radius; // The radius of the circle
    private static final double PI = 3.14;

    // Constructors
    public CircleSolution(double radius) {
        this.radius = radius;
    }

    // Methods
    public double getArea() { // Get the area of the circle (Remember to return a double)
        return this.radius * this.radius * PI;
    }

    // Overriding (Covered in future classes)
    @Override
    public String toString() {
        return String.format("This is a circle with radius %d", this.radius);
    }
    
}
