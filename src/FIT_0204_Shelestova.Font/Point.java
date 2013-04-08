package FIT_0204_Shelestova.Font;

public class Point {
    private int x;
    private int y;
    private boolean on;

    public Point(int x, int y, boolean on){
        this.x = x;
        this.y = y;
        this.on = on;
    }
    public Point(int x, int y){
        this(x, y, true);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isOn() {
        return on;
    }
    public  Point copy(){
        return new Point(x, y, on);
    }
    public String toString(){
        return "(" +x + ", " + y + ")";
    }
}
