import java.util.Random;
import java.util.Scanner;

public class Game {

    public static final int ROCK = 0;
    public static final int SCISSORS = 1;
    public static final int PAPER = 2;

    private static Random random = new java.util.Random();

    private int userScore = 0;
    private int aiScore = 0;
    
    public static int aiChoice() {
        return Game.random.nextInt(3);
    }

    public void printMenu() {
        System.out.println("Welcome to the game of Scissors Paper Stone!");
        System.out.println("Enter 1 to play and 2 to exit.");
    }

    public int getInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public int compareShapes(int aiChoice, int userChoice) {
        switch (aiChoice) {
        case ROCK:
            switch (userChoice) {
            case ROCK:
                return 0;
            case SCISSORS:
                return -1;
            case PAPER:
                return 1;
            }
        case SCISSORS:
            // switch (userChoice) {
            // case ROCK:
            //     return 1;
            // case SCISSORS:
            //     return 0;
            // case PAPER:
            //     return -1;
            // }
            return aiChoice - userChoice;
        case PAPER:
            switch (userChoice) {
            case ROCK:
                return -1;
            case SCISSORS:
                return 1;
            case PAPER:
                return 0;
            }
        }
        return 0;
    }

    public boolean checkValidShape(int choice) {
        return ROCK <= choice && choice <= PAPER;
    }

    public void newRound() {
        System.out.println("Your current score: " + this.userScore);
        System.out.println("AI's current score: " + this.aiScore);
        int aiChoice = Game.aiChoice();
        System.out.println("Enter 0 to use Rock.");
        System.out.println("Enter 1 to use Scissors.");
        System.out.println("Enter 2 to use Paper.");
        int userChoice = getInput();
        while (userChoice < ROCK || userChoice > PAPER) {
            System.out.println("Invalid choice, choose again.");
            userChoice = getInput();
        }
        int result = compareShapes(aiChoice, userChoice);
        System.out.print("AI's choice: ");
        switch (aiChoice) {
        case ROCK:
            System.out.println("Rock");
            break;
        case SCISSORS:
            System.out.println("Scissors");
            break;
        case PAPER:
            System.out.println("Paper");
            break;
        }
        if (result == 0) { // Tie
            System.out.println("It's a tie!");
        } else if (result == 1) { // User win
            System.out.println("You win!");
            this.userScore += 1;
        } else if (result == -1) {
            System.out.println("Oh no you lost!");
            this.aiScore += 1;
        }
    }

}
