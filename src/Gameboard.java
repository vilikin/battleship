public class Gameboard {
    private int width;
    private int height;

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
    }
}
