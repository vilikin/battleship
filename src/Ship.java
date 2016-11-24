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
     * Retrieves the ship's size.
     *
     * @return This ship's size.
     */
    public int getSize() {
        return size;
    }

    /**
     * Modifies ships size to given size.
     *
     * @param size Size to set to ship.
     */
    public void setSize(int size) {
        this.size = size;
    }

    public boolean isAlive() {
        // TODO method implementation
        return true;
    }
}