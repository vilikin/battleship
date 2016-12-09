/**
 * EasyAI for Computer.
 *
 * @author Valtteri Poutanen valtteri.poutanen@hotmail.com
 * @version 2016.1128
 * @since 1.7
 */
public class EasyAI extends AI {

    /**
     * Tells if enemy ship has been found, and current searching pattern.
     */
    private int state;

    /**
     * Containing booleans to tell if nearby Coordinates has been shot at.
     */
    private boolean[] closeCoords;

    /**
     * Default constructor for EasyAI.
     */
    public EasyAI() {

        state = 0;
    }

    /**
     * Handles Computer's turn.
     */
    public void play() {

        if (state == 0) {
            System.out.println(getRandomCoordinate());
        } else {
            // Enemy ship found last turn, try find more
            System.out.println(findEnemyShip());
        }
    }

    /**
     * Returns coordinate near found ship part.
     */
    private Coordinate findEnemyShip() {

        int random = 0;

        do {
            random = (int) (Math.random() * 4);
        } while (closeCoords[random]);

        Coordinate coordinate;

        if (random == 0) {
            // Generate coordinate above
        } else if (random == 1) {
            // Generate coordinate on the right side
        } else if (random == 2) {
            // Generate coordinate below
        } else {
            // Generate coordinate on the left side
        }

        return null;
    }
}
