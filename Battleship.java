import java.util.ArrayList;

public class Battleship {
    private String shipName;
    private ArrayList<String> locations;

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public void setShipLocations(ArrayList<String> locations) {
        this.locations = locations;
    }

    public String guessResult(String guessLocation) {
        String result = "miss";

        int i = locations.indexOf(guessLocation);
        if(i >= 0) {
            locations.remove(i);
            if(locations.isEmpty()) {
                result = "sunk";
            } else {
                result = "hit";
            }
        }
        return result;
    }
}
