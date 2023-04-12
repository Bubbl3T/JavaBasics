public class Oop {

    public static void main(String[] args) {
        exampleInheritance();
        examplePolymorphism();
        exampleEncapsulation();
        exampleAbstraction();
    }

    /***************
     * Inheritance *
     ***************/

     private static class Parent {
        public int i;

        public Parent() {
            this.i = 3;
        }

        public Parent(int i) { // Non-default constructor
            this.i = i;
        }
    }

    private static class Child extends Parent {

        public Child() { // This is invoked implicitly if no constructor is provided.
            super();
        }

        public Child(int i) { // Non-default constructor
            super(i);
        }

        public void printNum() {
            System.out.println("Parent i: " + this.i);
            System.out.println("Child i: " + super.i);
        }
    }

    private static void exampleInheritance() {
        new Child().printNum();
        new Child(4).printNum(); // Non-default constructor
    }

    /****************
     * Polymorphism *
     ****************/

    private static class Animal {
        public void eat() {
            System.out.println("The animal is eating.");
        }
    }

    private static class Dog extends Animal {
        public void eat() {
            System.out.println("The dog is eating. Woof woof!");
        }
    }

    private static class Cat extends Animal {
        public void eat() {
            System.out.println("The cat is eating. Meow~~~");
        }
    }

    private static void examplePolymorphism() {
        Animal animal1 = new Animal();
        Animal animal2 = new Dog();
        Animal animal3 = new Cat();
        animal1.eat();
        animal2.eat();
        animal3.eat();
    }

    /*****************
     * Encapsulation *
     *****************/

    private static class FidgetSpinner {
        private final int RPS = 15;
        private int speed = 1;

        public void speedUp() {
            this.speed += 1;
            System.out.println("Spin faster!");
        }

        public void printSpeed() {
            System.out.printf("I am spinning at %d rounds per second!\n", this.speed * this.RPS);
        }
    }

    private static void exampleEncapsulation() {
        FidgetSpinner fs = new FidgetSpinner();
        fs.printSpeed();
        fs.speedUp();
        fs.printSpeed();
    }

    /***************
     * Abstraction *
     ***************/

    private static class Car {
        public void driveForward(int speed) {
            rotateLeftFrontWheel(speed);
            rotateRightFrontWheel(-speed);
            System.out.println("Your car is driving forward!");
        }

        private void rotateLeftFrontWheel(int speed) {
            String direction = "clockwise";
            if (speed < 0) {
                speed = -speed;
                direction = "anticlockwise";
            }
            System.out.printf("Rotating left front wheel at speed %d, %s\n", speed, direction);
        }

        private void rotateRightFrontWheel(int speed) {
            String direction = "clockwise";
            if (speed < 0) {
                speed = -speed;
                direction = "anticlockwise";
            }
            System.out.printf("Rotating right front wheel at speed %d, %s\n", speed, direction);
        }
    }

    private static void exampleAbstraction() {
        Car car = new Car();
        car.driveForward(180);
    }
    
}
