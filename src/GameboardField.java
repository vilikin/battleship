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

    @Override
    public String toString() {
        String result = "";
        for( int i = 0; i < height; i++){
            for(int j = 0; j < width; j++) {
                result += field[i][j];
            }
            result += "\n";
        }
        return result;
    }
}
