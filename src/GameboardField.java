/**
 * Handles one players game field.
 *
 * @author Sami Kotkavuori sami.kotkavuori@cs.tamk.fi
 * @version 1.0
 * @since 1.0
 */
public class GameboardField {

    /**
     * Vertical coordinates.
     */
    private final String[] verticalCoordinates = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

    /**
     * Horizontal coordinates.
     */
    private final String[] horizontalCoordinates = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50"};

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
     * Player that has this field.
     */
    private Human player;

    /**
     * Computer player that has this field.
     */
    private Computer computer;

    /**
     * Sets player.
     *
     * @param p Human.
     */
    public void setPlayer(Human p) {
        player = p;
    }

    /**
     * Sets computer.
     *
     * @param computer Computer.
     */
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    /**
     * Sets fields width.
     *
     * Width of the field must be 5-50
     *
     * @param w Fields width.
     */
    public void setWidth(int w){
        if(w > 5 && w <= 50){
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
     * Height of the field must be 5-50.
     *
     * @param h Fields height.
     */
    public void setHeight(int h){
        if(h > 5 && h <= 50){
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

    /**
     * Sets given character to given location in field.
     *
     * @param x x-coordinate.
     * @param y y-coordinate.
     * @param c character to place.
     */
    public void setChar(int x, int y, char c) {
        if(x >= 0 && x <= 50 && y >= 0 && y <= 50) {
            field[x][y] = c;
        }
    }

    /**
     * Constructs the field object.
     *
     * @param width Width of the field.
     * @param height Height of the field.
     * @param player Human that uses this field.
     */
    public GameboardField(int width, int height, Human player) {
        setPlayer(player);
        setWidth(width);
        setHeight(height);
        createNewEmptyField();
    }

    /**
     * Constructs the field objects with a computer player.
     *
     * @param width    int width of the field.
     * @param height   int height of the field.
     * @param computer Computer that uses this field.
     */
    public GameboardField(int width, int height, Computer computer) {
        setComputer(computer);
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
        for( int i = -2; i < height; i++){
            for(int j = -4; j < width; j++) {
                if(i < 0 && j < 0){
                    result += " ";
                } else if(i == -2 && j >= 0){
                    result += " " + verticalCoordinates[j] + " ";
                } else if( j == -3 && i >= 0){
                    result += horizontalCoordinates[i];
                    if(horizontalCoordinates[i].length() == 1){
                        result += " ";
                    }
                } else if( i == -1 && j >= 0){
                    result += "___";
                } else if( j == -1 && i >= 0) {
                    result += "|";
                } else if (i >= 0 && j >= 0) {
                    result += " " + field[i][j] + " ";
                } else {
                    result += " ";
                }
            }
            result += "\n";
        }
        return result;
    }
}
