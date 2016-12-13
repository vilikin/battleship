/**
 * Parent class for Ai-objects.
 *
 * @author Valtteri Poutanen valtteri.poutanen@hotmail.com
 * @version 2016.1128
 * @since 1.7
 */
public abstract class AI {

    /**
     * Handles Computer's turn.
     */
    abstract void play();

    /**
     * Booleans that describe if coordinate has already been shot at.
     */
    protected boolean[][] shotCoordinates;

    /**
     * Returns random coordinate inside Gameboard that has not been shot yet.
     *
     * @return Coordinate inside Gameboard
     */
    protected Coordinate getRandomCoordinate() {

        int width = 5;
        int height = 5;
        int x;
        int y;

        do {
            x = (int) (Math.random() * width);
            y = (int) (Math.random() * height);
        } while(shotCoordinates[x][y]);

        return new Coordinate(x, y);
    }
}
