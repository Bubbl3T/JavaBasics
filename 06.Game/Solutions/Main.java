public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        while (true) {
            game.printMenu();
            int choice = game.getInput();
            if (choice != 1) {
                break;
            }
            game.newRound();
        }
    }
    
}
