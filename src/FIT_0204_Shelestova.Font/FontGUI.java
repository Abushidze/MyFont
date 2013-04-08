package FIT_0204_Shelestova.Font;

import FIT_0204_Shelestova.Common.CommonGUI;
import FIT_0204_Shelestova.Common.ControlGroup;
import FIT_0204_Shelestova.Common.Controller;

import javax.swing.*;
import java.awt.*;

public class FontGUI extends CommonGUI {
    private ControlGroup xControlGroup;
    private ControlGroup yControlGroup;
    private ControlGroup scaleControlGroup;
    private FillEnableBox fillEnableBox;
    public FontGUI(Controller controller) {
        super(controller);
        setTitle("Font");
    }
    protected void createWidgets(){
        super.createWidgets();
        xControlGroup = new ControlGroup(this, "x", -1000, 1000, 0);
        yControlGroup = new ControlGroup(this, "y", -1000, 1000, 0);
        scaleControlGroup = new ControlGroup(this, "scale", -1000, 1000, 0);
        fillEnableBox = new FillEnableBox();
    }
    protected void addWidgetsToControlPanel() {
        super.addWidgetsToControlPanel();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);

        controlPanel.add(xControlGroup, gbc);

        gbc.gridx = 1;
        controlPanel.add(yControlGroup, gbc);

        gbc.gridx = 2;
        controlPanel.add(scaleControlGroup, gbc);

        gbc.gridx = 3;
        controlPanel.add(fillEnableBox, gbc);
    }

    protected void setHeights() {
        super.setHeights();
        int controlPanelHeight =  getFullHeight(xControlGroup) + getFullHeight(controlPanel);
        Dimension controlDim = new Dimension(controlPanel.getMinimumSize().width, controlPanelHeight);
        controlPanel.setPreferredSize(new Dimension(width, controlPanelHeight));
        controlPanel.setMinimumSize(controlDim);
        int frameHeight =  getFullHeight(controlPanel) + getFullHeight(drawPanel);
        Dimension frameDim = new Dimension(this.getMinimumSize().width, frameHeight);
        setPreferredSize(new Dimension(width, height));
        setMinimumSize(frameDim);
    }
    public void widgetChanged(JComponent widget){
        if(widget == xControlGroup){
            controller.setXposition(xControlGroup.getCurrentValue());
        }
        else if(widget == yControlGroup){
            controller.setYposition(yControlGroup.getCurrentValue());
        }
        else if(widget == scaleControlGroup){
            controller.setScale(scaleControlGroup.getCurrentValue());
        }
        canvas.repaint();
    }
}
