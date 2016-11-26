/**
 * Computer player for the game.
 *
 * @author Valtteri Poutanen valtteri.poutanen@hotmail.com
 * @version 2016.1126
 * @since 1.7
 **/
public class Computer implements PlayerInterface {

    /**
     * Default constructor for Computer.
     */
    public Computer() {

    }

    /**
     * Places a ship to the given coordinate.
     *
     * @param ship The ship to be placed on the gameboard
     * @param coordinate Ship's coordinate
     * @return True if a ship was successfully placed to the coordinate.
     */
    public boolean placeShip(Ship ship, Coordinate coordinate) {

        return false;
    }

    public boolean shoot(Coordinate coordinate) {

        return false;
    }
}
