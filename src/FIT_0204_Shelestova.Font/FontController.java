package FIT_0204_Shelestova.Font;

import FIT_0204_Shelestova.Common.Controller;

import java.io.File;
import java.io.IOException;


public class FontController implements Controller {
    FontModel model = new FontModel();
    @Override
    public void setPanelWidth(Integer newPanelWidth) {
        model.setPanelWidth(newPanelWidth);
    }

    @Override
    public void setPanelHeight(Integer newPanelHeight) {
        model.setPanelHeight(newPanelHeight);
    }

    @Override
    public int getPanelWidth() {
        return model.getPanelWidth();
    }

    @Override
    public int getPanelHeight() {
        return model.getPanelHeight();
    }

    @Override
    public void setXposition(Integer newXposition) {
        model.setX(newXposition);
    }

    @Override
    public void setYposition(Integer newYposition) {
        model.setY(newYposition);
    }
    @Override
    public void setScale(Integer scale){
        model.setScale(scale);
    }
    @Override
    public void setFill(boolean fill){
        model.setFill(fill);
    }

    @Override
    public void loadPropertiesFromFile(File fileName) throws IOException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void storePropertiesToFile(File fileName) throws IOException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void fillMemory(int[] memory) {
        FontBuilder builder = new FontBuilder(memory, model);
        memory = builder.getMemory();
    }


}
