import java.util.List;

/**
 * Represents a battleship on the game board.
 *
 * @author Toni Seppalainen <toni.seppalainen@cs.tamk.fi>
 * @version 2016.1124
 * @since 1.7
 */
public class Ship {

    /**
     * Holds how many grid cells the ship's size is.
     */
    private int size;

    /**
     * Holds the location of the start of the ship.
     */
    private Coordinate startCoordinate;

    /**
     * Holds the location of the end of the ship.
     */
    private Coordinate endCoordinate;

    /**
     * Creates a ship with default size of 1.
     */
    public Ship() {
        setSize(1);
    }

    /**
     * Creates a ship with given size.
     *
     * @param size Size of the ship.
     */
    public Ship(int size) {
        this();
        setSize(size);
    }

    /**
     * Retrieves the ship's size.
     *
     * @return This ship's size.
     */
    public int getSize() {
        return size;
    }

    /**
     * Modifies ships size if given size is larger than zero.
     *
     * @param size Size to set to ship (size > 0).
     */
    public void setSize(int size) {
        // Only set larger than 0 values
        if (size > 0) {
            this.size = size;
        }
    }

    /**
     * Returns true if and only if the ship is alive.
     *
     * @return True if the ship is alive, otherwise false.
     */
    public boolean isAlive() {
        // TODO method implementation
        return true;
    }

    /**
     * Returns the coordinates the ship is covering.
     *
     * @return List of covered coordinates.
     */
    public List<Coordinate> getCoveredCoordinates() {
        // TODO method implementation
        return null;
    }
}