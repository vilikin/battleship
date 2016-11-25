public class Gameboard {
    private int width;
    private int height;
    private char[][] board;

    public void setWidth(int w){
        if(w > 0 && w <= 80){
            width = w;
        }
    }
    
    public int getWidth(){
        return width;
    }

    public void setHeight(int h){
        if(h > 0 && h <= 80){
            height = h;
        }
    }

    public int getHeight(){
        return height;
    }

    public Gameboard(int width, int height){
        setWidth(width);
        setHeight(height);
        createNewEmptyBoard();
    }

    public void createNewEmptyBoard() {
        board = new char[height][width];
        for (int i= 0; i < height; i++) {
            for (int j = 0; j < width ; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public String drawBoard(){
        String result = "";
        for( int i = 0; i < height; i++){
            for(int j = 0; j < width; j++) {
                result += board[i][j];
            }
            result += "\n";
        }
        return result;
    }

    @Override
    public String toString(){
        return drawBoard();
    }
}
