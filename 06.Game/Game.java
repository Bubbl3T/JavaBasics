import java.util.Random;

public class Game {

    public static final int ROCK = 0;
    public static final int SCISSORS = 1;
    public static final int PAPER = 2;

    private static Random random = new java.util.Random();
    
    public static int aiChoice() {
        return Game.random.nextInt(3);
    }

}
