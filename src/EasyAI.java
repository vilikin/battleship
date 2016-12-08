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
            System.out.println(findEnemyShip());
        }
    }

    /**
     * Returns coordinate near found ship part.
     */
    private Coordinate findEnemyShip() {

        return null;
    }
}
