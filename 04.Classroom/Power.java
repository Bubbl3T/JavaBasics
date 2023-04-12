public interface Power {

    default void turnOn() {
        System.out.println("Booting up....\nOn!");
    }

    default void turnOff() {
        System.out.println("Shutting down...\nOff!");
    }
    
}
