import java.util.ArrayList;

public class BattleshipGame {
    private ArrayList<Battleship> ships = new ArrayList<>();
    private GameHelper helper = new GameHelper();
    int guessNumber = 0;

    public void gameSetUp() {
        Battleship ship1 = new Battleship();
        ship1.getShipName("Test One");

        Battleship ship2 = new Battleship();
        ship2.getShipName("Test Two");

        Battleship ship3 = new Battleship();
        ship3.getShipName("Test Three");

        ships.add(ship1);
        ships.add(ship2);
        ships.add(ship3);

        System.out.println("Game is ready to play");

    }

    public void startGame() {
        while(!ships.isEmpty()) {
            String userGuess = helper.getUserInput("Guess the ship location");
            guessChecker(userGuess);
        }
    }

    private void guessChecker(String userGuess) {
        guessNumber ++;
        String result = "miss";

        for(Battleship ship : ships) {
            result = ship.guessResult(userGuess);
            if (result.equals("hit") || result.equals("sunk")) {
                break;
            }
        }

        System.out.println(result);
    }

    private void endGame() {
        System.out.println("All ships are sunk! Game over.");
        System.out.println("Number of guesses: " + guessNumber);
    }

    public static void main(String[] args) {
        BattleshipGame play = new BattleshipGame();
        play.gameSetUp();
        play.startGame();
    }
}
