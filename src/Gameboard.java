public class Gameboard {
    private GameboardField field1;
    private GameboardField field2;

    public Gameboard(){
        field1 = new GameboardField(10,10);
        field2 = new GameboardField(10,10);
    }

    public Gameboard(int width, int height){
        field1 = new GameboardField(width, height);
        field2 = new GameboardField(width, height);
    }

    @Override
    public String toString(){
        return field1 + "\n" + field2;
    }
}
