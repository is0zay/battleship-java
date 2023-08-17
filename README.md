# Battleship Game
This is a  Java game played on the console. The aim is to sink three ships randomly located in the least amount of attempts.

## How it works
Setup: To start the game, run the BattleshipGame class.

Guessing: The console will ask you to enter a guess. Guess a grid coordinate (e.g., "a3", "b2") where you think a battleship might be located.

Outcome: After each guess, the console will provide feedback on whether your guess was a hit, a miss, or if you've sunk a battleship. Keep guessing until all battleships are sunk.

Winning: The game ends when you successfully sink all three battleships. The number of guesses you took to complete the game will be displayed.

## Java Classes

### Battleship 
Represents an individual ship with a name and the ship's locations.
setName(String name): Sets the name of the battleship.
setLocations(ArrayList<String> locations): Sets the locations of the battleship. This is an array of cordinates.
checkGuess(String guess): Checks if a user's guess matches a battleship's location. Returns "miss", "hit", or "sunk".

### BattleshipGame
Sets the game up, coducts the game, and ends the Battleship game.
setUpGame(): Sets up the battleships for the game.
startPlaying(): Initiates the gameplay loop.
checkUserGuess(String guess): Checks the user's guess against all battleships' locations.
finishGame(): Displays the game's ending message.

### GameHelper Class
Handles user input and grid-related operations.
getUserInput(String prompt): Gets user input as a lowercase string.
Other grid-related methods used for battleship placement.


### Enjoy the game!