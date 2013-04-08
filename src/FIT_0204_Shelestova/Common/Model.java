package FIT_0204_Shelestova.Common;

public class Model {
    private int panelWidth;
    private int panelHeight;

    public int getPanelWidth() {
        return panelWidth;
    }

    public void setPanelWidth(int panelWidth) {
        this.panelWidth = panelWidth;
    }

    public int getPanelHeight() {
        return panelHeight;
    }

    public void setPanelHeight(int panelHeight) {
        this.panelHeight = panelHeight;
    }
    public double getXnull(){
        return panelWidth/2;
    }
    public double getYnull(){
        return panelHeight/2;
    }
}
