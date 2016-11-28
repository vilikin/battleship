/**
 * Implements one highscore instance with name and score.
 *
 * @author Vili Kinnunen
 * @version 2016.1128
 * @since 1.8
 */
public class Highscore {
    private String name;
    private int score;

    /**
     * Creates Highscore instance with name and score.
     * @param name      Name of the person who got the score
     * @param score     Score
     */
    public Highscore(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
