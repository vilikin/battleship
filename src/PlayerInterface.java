/**
 * PlayerInterface includes simple methods for player and computer.
 *
 * @author Akash Singh
 * @version 2016.1124
 * @since 1.7
 */ 
public interface PlayerInterface {

    /**
     * Returns true if given coordinate contacts a ship.
     *
     * @param coord a coordination to be shot at.
     * @return true if coordinate lands a ship.
     */
    boolean shoot(Coordinate coord);
}