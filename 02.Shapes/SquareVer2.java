public class SquareVer2 {

    private static int numSquares = 0;
    
    // Parameters
    private int length; // Note: access modifier is now private

    // Constructors
    public SquareVer2() { // Default constructor
        SquareVer2.numSquares += 1;
        this.length = 1;
    }
    
    public SquareVer2(int length) { // Overloaded constructor
        SquareVer2.numSquares += 1;
        this.length = length;
    }

    public int getLength() { // Getter
        return this.length;
    }

    public void setLength(int newLength) { // Setter 
        this.length = newLength;
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
