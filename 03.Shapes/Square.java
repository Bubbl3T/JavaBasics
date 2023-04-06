public class Square {
    
    // Parameters
    public int length;

    // Constructors
    public Square() { // Default constructor
        this.length = 1;
    }

    public Square(int length) { // Overloaded constructor
        this.length = length;
    }

    // Methods
    public int getArea() {
        return this.length * this.length;
    }

    // Overriding (Covered in future classes)
    @Override
    public String toString() {
        return String.format("This is a square with length %d", this.length);
    }

}
