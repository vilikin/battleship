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
     * Returns random coordinate inside Gameboard.
     *
     * @return Coordinate inside Gameboard
     */
    protected int[] getRandomCoordinate() {

        int width = 5;
        int height = 5;

        int[] coordinate = new int[2];
        coordinate[0] = (int) (Math.random() * width);
        coordinate[1] = (int) (Math.random() * height);

        return coordinate;
    }
}
