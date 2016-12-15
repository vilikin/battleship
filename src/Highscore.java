/**
 * Implements one highscore instance with player name and score.
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
     * @param name      Name of the player who got the score
     * @param score     Score
     */
    public Highscore(String name, int score) {
        this.name = name;
        this.score = score;
    }

    /**
     * Gets name of the player who got the score.
     *
     * @return Name of the player who got the score
     */
    public String getName() {
        return name;
    }

    /**
     * Gets score of the player.
     *
     * @return Score of the player
     */
    public int getScore() {
        return score;
    }

    /**
     * Sets name for the player.
     *
     * @param name  Name for the player
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets score for the player.
     *
     * @param score Score for the player
     */
    public void setScore(int score) {
        this.score = score;
    }
}
