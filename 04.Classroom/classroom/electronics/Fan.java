package classroom.electronics;

public class Fan extends Electronics implements Power, Speed {

    private int speed = 0;

    public Fan() {
        super(150);
    }

    public int getSpeed() {
        return this.speed;
    }

    public void speedUp() {
        if (this.speed >= 5) {
            System.out.println("Fan speed is too fast!!!");
            return;
        }
        this.speed += 1;
        System.out.println("Current speed is set to " + this.speed);
    }

    public void speedDown() {
        if (this.speed == 0) {
            System.out.println("Fan speed already set to 0!");
            return;
        }
        this.speed -= 1;
        System.out.println("Current speed is set to " + this.speed);
    }
    
}
