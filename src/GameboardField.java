/**
 * Handles one players game field.
 *
 * @author Sami Kotkavuori sami.kotkavuori@cs.tamk.fi
 * @version 1.0
 * @since 1.0
 */
public class GameboardField {

    /**
     * Contains fields width.
     */
    private int width;

    /**
     * Contains fields height.
     */
    private int height;

    /**
     * Contains data on the field.
     */
    private char[][] field;

    /**
     * Sets fields width.
     *
     * Width of the field must be 5-80
     *
     * @param w Fields width.
     */
    public void setWidth(int w){
        if(w > 5 && w <= 80){
            width = w;
        }
    }

    /**
     * Gets fields width.
     *
     * @return Width of the field.
     */
    public int getWidth(){
        return width;
    }

    /**
     * Sets fields height.
     *
     * Height of the field must be 5-80.
     *
     * @param h Fields height.
     */
    public void setHeight(int h){
        if(h > 5 && h <= 80){
            height = h;
        }
    }

    /**
     * Gets fields height.
     *
     * @return Height of the field.
     */
    public int getHeight(){
        return height;
    }

    public void setChar(int x, int y) {

    }
    
    /**
     * Constructs the field object.
     *
     * @param width Width of the field.
     * @param height Height of the field.
     */
    public GameboardField(int width, int height) {
        setWidth(width);
        setHeight(height);
        createNewEmptyField();
    }

    /**
     * Creates new empty field.
     *
     * Field is width x height and filled with ' '.
     */
    public void createNewEmptyField() {
        field = new char[height][width];
        for (int i= 0; i < height; i++) {
            for (int j = 0; j < width ; j++) {
                field[i][j] = ' ';
            }
        }
    }

    /**
     * Prints the field.
     *
     * @return How the field currently looks like.
     */
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
