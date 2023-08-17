import java.util.ArrayList;

public class BattleshipGame {
    private ArrayList<Battleship> ships = new ArrayList<>();	// Array that contains ships, to keep track of remaining ships
    private GameHelper helper = new GameHelper();		// uses object to access GameHelper properties and methods
    int guessNumber = 0;		// variable to track number of guesses

    public void gameSetUp() {
		// naming the ships
        Battleship ship1 = new Battleship();	
        ship1.setShipName("Test One");

        Battleship ship2 = new Battleship();
        ship2.setShipName("Test Two");

        Battleship ship3 = new Battleship();
        ship3.setShipName("Test Three");

		// adding the ships to the array
        ships.add(ship1);
        ships.add(ship2);
        ships.add(ship3);

		// use set ship location to randomly place the ship
        ship1.setShipLocations(helper.placeStartup(3));
        ship2.setShipLocations(helper.placeStartup(3));
        ship3.setShipLocations(helper.placeStartup(3));

        System.out.println("Game is ready to play");

    }

	//methid to start the gameplay
    public void startGame() {	
		// run while ships still remain in array
        while(!ships.isEmpty()) {
            String userGuess = helper.getUserInput("Guess the ship location");
            guessChecker(userGuess);
        }

		// if no ships are remaining, end the game
        if (ships.isEmpty()) {
            endGame();
        }
    }

	// method that runs when guess is input buy the user
    private void guessChecker(String userGuess) {
        guessNumber ++;		// increase the guess counter by one when a guess is added
        String result = "miss";

		// iterate through ships array
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
