import java.util.ArrayList;

public class Battleship {
    private String shipName;	// variable to hold ship name
    private ArrayList<String> locations;		// arrray to store each ship's location cordinates


    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public void setShipLocations(ArrayList<String> locations) {
        this.locations = locations;
    }

    public String guessResult(String guessLocation) {
        String result = "miss";

		// if the index of the guess is found in the array, then i will be 0 or greater meaning that the guess was correct
        int i = locations.indexOf(guessLocation);
        if(i >= 0) {	// if the guess is correct, remove the cordinate from the ship's location array
            locations.remove(i);
            if(locations.isEmpty()) {	// if the ship's location array is empty, return sunk
                result = "sunk";
            } else {
                result = "hit";
            }
        }
        return result;
    }
}
