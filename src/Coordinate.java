/**
 * TODO Short Description
 * <p>
 * TODO description and @since
 *
 * @author Erika Sankari
 * @version 2016.1130
 * @since 1.7
 */
public class Coordinate {

    /**
     * Specifies objects position on the x-axel.
     */
    private int x;

    /**
     * Specifies objects position on the y-axel.
     */
    private int y;

    /**
     * Returns coordinate x.
     *
     * @return int x
     */
    public int getX() {
        return x;
    }

    /**
     * Sets new value for coordinate x.
     *
     * @param x int new coordinate x.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Returns coordinate y.
     *
     * @return int y
     */
    public int getY() {
        return y;
    }

    /**
     * Sets new value for coordinate y.
     *
     * @param y int new coordinate y
     */
    public void setY(int y) {
        this.y = y;
    }
}
