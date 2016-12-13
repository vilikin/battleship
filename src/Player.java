import java.util.ArrayList;
import java.util.List;

/**
 * Player includes simple methods for player and computer.
 *
 * @author Akash Singh
 * @author Erika Sankari
 * @version 2016.1124
 * @since 1.7
 */ 
public abstract class Player {

    /**
     * Contains the ships owned by this player.
     */
    protected List<Ship> ships;

    /**
     * Holds player's name.
     */
    private String name;

    /**
     * Initiates player object.
     */
    public Player() {
        ships = new ArrayList<>();
    }

    /**
     * Initiates player object with a name.
     *
     * @param name String name
     */
    public Player(String name) {
        this.name = name;
    }

    /**
     * Returns true if given coordinate contacts a ship.
     *
     * @param coord a coordination to be shot at.
     * @return true if a ship locates in the given coordinate.
     */
    abstract boolean shoot(Coordinate coord);

    /**
     * Places a ship for the given coordinate.
     *
     * @param ship the ship to be placed on the gameboard.
     * @param coord a coordination where ship is placed.
     * @return true if a ship was succesfully placed at the coordinate.
     */
    abstract boolean placeShip(Ship ship, Coordinate coord);

    /**
     * Adds a ship for the player.
     *
     * @param newShip a ship to be added for player.
     */
    void addShip(Ship newShip) {
        ships.add(newShip);
    }

    /**
     * Removes a ship from this players list of ships
     *
     * @param ship Ship to remove
     */
    void removeShip(Ship ship) {
        //TODO implement removing ship
    }

    /**
     * Returns player's name as a String.
     *
     * @return String name
     */
    public String getName() {
        return name;
    }

    /**
     * Changes player's name to a given new name.
     *
     * @param name String new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the ships owned by this player.
     *
     * @return List of ships owned by this player.
     */
    public List<Ship> getShips() {
      return ships;
    }
}
