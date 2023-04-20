package classroom.people;

import static classroom.Attendance.*;
import classroom.Attendance;

public class Student extends People{

    private Attendance attendance;

    public Student(String name) {
        super(name);
        this.attendance = ABSENT;
    }

    public void markAttendance() {
        this.attendance = PRESENT;
        System.out.println(super.getName() + " is " + this.attendance.label);
    }
    
}
