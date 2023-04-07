public class RectangleSolution {

    // Parameters
    private int length; // The length and width of the rectangle
    private int width;

    // Constructors
    public RectangleSolution() {
        this.length = 1;
        this.width = 1;
    }

    public RectangleSolution(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Methods
    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

    public int getArea() { // Get the area of the rectangle
        return this.length * this.width;
    }

    // Overriding (Covered in future classes)
    @Override
    public String toString() {
        return String.format("This is a rectangle with length %d and width %d", 
                this.length, this.width);
    }
    
}
