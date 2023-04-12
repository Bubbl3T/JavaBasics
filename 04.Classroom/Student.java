public class Student extends People{

    private Attendance attendance;

    public Student(String name) {
        super(name);
        this.attendance = Attendance.ABSENT;
    }

    public void markAttendance() {
        this.attendance = Attendance.PRESENT;
        System.out.println(super.getName() + " is " + this.attendance.label);
    }
    
}
