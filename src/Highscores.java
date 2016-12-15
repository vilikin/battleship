import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * Implements methods to save and retrieve highscores.
 *
 * @author Vili Kinnunen
 * @version 2016.1128
 * @since 1.8
 */
public class Highscores {

    /**
     * Highscore file.
     */
    private static File file = new File("highscores.txt");

    /**
     * Saves highscore to a file.
     *
     * @param highscore Highscore instance to be saved
     * @return  If operation was successful or not
     */
    public static boolean save(Highscore highscore) {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(file)))) {
            writer.append("<hs><player>" + highscore.getName() +
                    "</player><score>" + highscore.getScore() +
                    "</score></hs>\n");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Gets top x highscores.
     *
     * @param scores How many top scores to display
     * @return Array of highscore instances
     */
    public static Highscore[] get(int scores) {

    }

    /**
     * Gets all highscores from best to worst.
     *
     * @return  Array of highscore instances
     */
    public static Highscore[] getAll() {

    }
}
