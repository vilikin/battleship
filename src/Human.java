/**
 * Contains attributes of human players.
 *
 * @author Erika Sankari
 * @version 2016.1124
 * @since 1.7
 */
public class Human extends Player {

    /**
     * Initiates values for the human object.
     */
    public Human() {

    }

    /**
     * Returns true if given coordinate contacts a ship.
     *
     * @param coord a coordination to be shot at.
     * @return true if a ship locates in the given coordinate.
     */
    @Override
    boolean shoot(Coordinate coord) {
        return false;
    }

    /**
     * Places a ship for the given coordinate.
     *
     * @param ship  the ship to be placed on the gameboard.
     * @param coord a coordination where ship is placed.
     * @return true if a ship was succesfully placed at the coordinate.
     */
    @Override
    boolean placeShip(Ship ship, Coordinate coord) {
        return false;
    }

    /**
     * Adds a ship for the player.
     *
     * @param newShip a ship to be added for player.
     */
    @Override
    void addShip(Ship newShip) {
        ships.add(newShip);
    }
}
