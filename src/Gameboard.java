public class Gameboard {
    private GameboardField field1;
    private GameboardField field2;

    public Gameboard(){
        field1 = new GameboardField(10,10);
        field2 = new GameboardField(10,10);
    }

    @Override
    public String toString(){
        return field1 + "\n" + field2;
    }
}
