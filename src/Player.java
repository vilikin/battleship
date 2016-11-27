/**
 * Player includes simple methods for player and computer.
 *
 * @author Akash Singh
 * @author Erika Sankari
 * @version 2016.1124
 * @since 1.7
 */ 
public abstract class Player {

    int x;
    int y;

    /**
     * Initiates player object.
     */
    public Player() {

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
    abstract void addShip(Ship newShip);
}
