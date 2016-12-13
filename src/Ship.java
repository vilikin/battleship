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

        isReady = startCoordinate != null &&
                endCoordinate != null &&
                coordinates.size() == size;

    }

    /**
     * Returns all possible end coordinates with the given start coordinate.
     *
     * @param start The coordinate to start from.
     * @return List of possible end coordinates.
     */
    public List<Coordinate> calculateEndCoordinates(Coordinate start) {
        List<Coordinate> list = new ArrayList<>();

        // calculate four possible end points
        int x = start.getX();
        int y = start.getY();
        int s = size - 1;

        list.add(new Coordinate(x + s, y));
        list.add(new Coordinate(x - s, y));
        list.add(new Coordinate(x, y + s));
        list.add(new Coordinate(x, y - s));

        return list;
    }

    /**
     * Fills the coordinates of this ship by selecting an end coordinate.
     *
     * Validates the given end coordinate and sets is if it is valid.
     * If the given end coordinate is not valid it is not set and the method
     * returns false.
     * This method expects the startCoordinate to be set, if not
     * the method returns false.
     *
     * @param end The chosen end coordinate.
     * @return True if end coordinate was valid, otherwise false.
     */
    public boolean selectEndCoordinate(Coordinate end) {
        boolean valid = false;
        if (startCoordinate != null) {
            List<Coordinate> ends;
            ends = calculateEndCoordinates(startCoordinate);
            for (Coordinate e : ends) {
                if (e.getX() == end.getX()
                        && e.getY() == end.getY()) {
                    valid = true;
                    int x = end.getX();
                    int y = end.getY();
                    endCoordinate = new Coordinate(x, y);
                    fillCoordinates();
                }
            }
        }
        return valid;
    }

    /**
     * Sets the ships start coordinate.
     *
     * @param startCoordinate The start coordinate to set.
     */
    public void setStartCoordinate(Coordinate startCoordinate) {
        this.startCoordinate = startCoordinate;
        this.endCoordinate = null;
    }

    /**
     * Returns the ships start coordinate.
     *
     * @return The ships start coordinate.
     */
    public Coordinate getStartCoordinate() {
        return startCoordinate;
    }

    /**
     * Calculates this ships covered coordinates to field coordinates.
     */
    private void fillCoordinates() {

        if (startCoordinate != null && endCoordinate != null) {
            coordinates.clear();

            // determine direction
            int xDir = 0;
            int yDir = 0;

            if (startCoordinate.getX() > endCoordinate.getX()) {
                xDir = 1;
            } else if (startCoordinate.getX() < endCoordinate.getX()){
                xDir = -1;
            }

            if (startCoordinate.getY() > endCoordinate.getY()) {
                yDir = 1;
            } else if (startCoordinate.getY() < endCoordinate.getY()){
                yDir = -1;
            }

            // Current is startCoordinate at first
            Coordinate current;
            current = new Coordinate(
                    startCoordinate.getX(),
                    startCoordinate.getY());

            // fill coordinates
            for (int i = 0; i < size ; i++) {
                // First Add current coordinate
                coordinates.put(current, false);

                // Then Set the current to next, won't be added if done
                int newX = current.getX() + xDir;
                int newY = current.getY() + yDir;
                current = new Coordinate(newX, newY);
            }
        }
    }
}