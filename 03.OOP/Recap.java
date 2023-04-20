public class Recap {

    public static void main(String[] args) {
        // Type declaration
        int i;

        // Type initialization
        i = 3;
        System.out.println(i);

        // Calling a constructor
        Recap recap = new Recap();
        Recap recap2 = new Recap(2);

        // Calling a method
        int sum = recap.add(5, 5);
        System.out.println(sum);
        int sum2 = recap2.add(10, 10, 10);
        System.out.println(sum2);

        String helloAlice = Recap.sayHello("Alice");
        System.out.println(helloAlice);
    }



    // Constructor declaration
    public Recap() {
        System.out.println("Print this line when a new Recap object is created.");
    }

    // Constructor overloading
    public Recap(int i) {
        System.out.println("Print " + i + " when a new Recap object is created.");
    }



    // Method declaration
    public int add(int a, int b) {
        return a + b;
    }

    // Method overloading
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static String sayHello(String name) {
        return "Hello " + name;
    }
    
}
