import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents a battleship on the game board.
 *
 * @author Toni Seppalainen toni.seppalainen@cs.tamk.fi
 * @version 2016.1212
 * @since 1.7
 */
public class Ship {

    /**
     * Tells if the ship is fully initialized.
     */
    private boolean isReady;

    /**
     * Holds covered coordinates and their status.
     */
    private Map<Coordinate, Boolean> coordinates;

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
        coordinates = new HashMap<>();
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
        // Parts of the ship not hit have false value in coordinates.
        return coordinates.containsValue(false);
    }

    /**
     * Returns the coordinates the ship is covering.
     *
     * @return List of covered coordinates.
     */
    public List<Coordinate> getCoveredCoordinates() {
        // Get covered coordinates from coordinates
        return new ArrayList<>(coordinates.keySet());
    }

    /**
     * Marks a part of the ship as hit.
     *
     * If the given coordinate is within the ship,
     * marks a hit for that part of the ship.
     * Returns true if the coordinate actually hits the ship
     * and false if the coordinate does not hit the ship.
     *
     * @param shot Coordinate of the shot to mark.
     * @return True if hit, false otherwise.
     */
    public boolean markHit(Coordinate shot) {

        if (coordinates.containsKey(shot)) {
            coordinates.put(shot, true);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Returns the ready status of the ship.
     *
     * @return True if the ship is ready, otherwise false.
     */
    public boolean isReady() {
        return isReady;
    }

    /**
     * Checks if the ship is ready and sets isReady accordingly.
     */
    private void checkReady() {
        //TODO check if ready and set isReady
    }

    public List<Coordinate> calculateEndCoordinates(Coordinate start) {
        //TODO return all possible end coordinates
        return null;
    }
}