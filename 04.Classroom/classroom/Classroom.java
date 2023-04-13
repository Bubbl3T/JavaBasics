package classroom;

import classroom.electronics.Fan;
import classroom.electronics.Projector;
import classroom.people.Student;
import classroom.people.Teacher;

public class Classroom {

    private static Classroom classroom = new Classroom();

    public Fan fan1;
    public Fan fan2;
    public Projector projector;
    public Teacher teacher;
    public Student[] students;

    private Classroom() {
        fan1 = new Fan();
        fan2 = new Fan();
        projector = new Projector();
        teacher = new Teacher("Ms Tay");
        students = new Student[] {new Student("Alice"), new Student("Bob"), new Student("Charlie")};
    }

    public static Classroom createClassroom() {
        return Classroom.classroom;
    }

    public void startClass() {
        fan1.turnOn();
        fan2.turnOn();
        projector.turnOn();
        for (Student student : students) {
            student.markAttendance();
        }
        teacher.giveLesson();
    }

    public void speedUpFans() {
        fan1.speedUp();
        fan2.speedUp();
    }

    public void speedDownFans() {
        fan1.speedDown();
        fan2.speedDown();
    }

    public void endClass() {
        projector.turnOff();
        fan1.turnOff();
        fan2.turnOff();
    }
    
}
