public class Gameboard {
    private GameboardField field1;
    private GameboardField field2;

    /**
     * Constructs the class using default field size.
     *
     * @param p1 Player for first field.
     * @param p2 Player for second field.
     */
    public Gameboard(Player p1, Player p2){
        field1 = new GameboardField(10,10,p1);
        field2 = new GameboardField(10,10,p2);
    }

    /**
     * Constructs the class using custom field size.
     *
     * @param width width of the field.
     * @param height height of the field.
     * @param p1 Player for first field.
     * @param p2 Player for second field.
     */
    public Gameboard(int width, int height,Player p1, Player p2){
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
