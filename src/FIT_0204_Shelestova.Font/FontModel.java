package FIT_0204_Shelestova.Font;

import FIT_0204_Shelestova.Common.Model;

public class FontModel extends Model {
    private int x;
    private int y;
    private int scale;
    private boolean fill;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getScale() {
        return scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }
}
