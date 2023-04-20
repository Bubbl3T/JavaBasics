package classroom.people;

public class People {

    private String name;

    public People(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "My name is " + name + ".";
    }
    
}
