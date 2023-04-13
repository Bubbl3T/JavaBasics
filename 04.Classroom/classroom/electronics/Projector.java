package classroom.electronics;

public class Projector extends Electronics implements Power {

    public Projector() {
        super(1500);
    }

    public void turnOn() {
        System.out.println("Booting up....\nDisplaying content!");
    }

    public void turnOff() {
        System.out.println("Thank you for using our product!");
    }
    
}
