/**
 * Created by c5skotka on 29.11.2016.
 */
public class GameboardField {
    private int width;
    private int height;
    private char[][] field;

    public GameboardField(int width, int height) {
        this.width = width;
        this.height = height;
        field = new char[width][height];
    }
}
