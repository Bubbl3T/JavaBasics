package classroom.people;

public class Teacher extends People {
    
    public Teacher(String name) {
        super(name);
    }

    public void giveLesson() {
        System.out.println("This lesson is on OOP in Java.");
    }

}
