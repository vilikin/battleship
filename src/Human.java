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

    @Override
    boolean shoot(Coordinate coord) {
        return false;
    }

    @Override
    boolean placeShip(Ship ship, Coordinate coord) {
        return false;
    }

    @Override
    void addShip(Ship newShip) {

    }
}
