public class Gameboard {
    private GameboardField field1;
    private GameboardField field2;

    /**
     * Constructs the class using default field size.
     */
    public Gameboard(){
        field1 = new GameboardField(10,10);
        field2 = new GameboardField(10,10);
    }

    /**
     * Constructs the class using custom field size.
     *
     * @param width width of the field.
     * @param height height of the field.
     */
    public Gameboard(int width, int height){
        field1 = new GameboardField(width, height);
        field2 = new GameboardField(width, height);
    }

    private String addBordersToField(GameboardField field) {
        return "";
    }

    /**
     * Returns both fields drawn.
     *
     * @return String representation of fields.
     */
    @Override
    public String toString(){
        return field1 + "\n" + field2;
    }
}
