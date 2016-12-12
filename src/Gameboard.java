public class Gameboard {
    private GameboardField field1;
    private GameboardField field2;

    /**
     * Constructs the class using default field size.
     *
     * @param p1 Human for first field.
     * @param p2 Human for second field.
     */
    public Gameboard(Human p1, Human p2) {
        field1 = new GameboardField(10,10,p1);
        field2 = new GameboardField(10,10,p2);
    }

    /**
     * Constructs the class using default field size.
     *
     * @param p1 Human for first field.
     * @param p2 Computer for second field.
     */
    public Gameboard(Human p1, Computer p2) {
        field1 = new GameboardField(10, 10, p1);
        field2 = new GameboardField(10, 10, p2);
    }

    /**
     * Constructs the class using custom field size.
     *
     * @param width width of the field.
     * @param height height of the field.
     * @param p1 Human for first field.
     * @param p2 Human for second field.
     */
    public Gameboard(int width, int height, Human p1, Human p2) {
        field1 = new GameboardField(width, height,p1);
        field2 = new GameboardField(width, height,p2);
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
