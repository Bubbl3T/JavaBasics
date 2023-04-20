package classroom;

public enum Attendance {
    PRESENT("present"),
    ABSENT("absent"),
    ON_MC("on mc");

    public final String label;

    private Attendance(String label) {
        this.label = label;
    }
}