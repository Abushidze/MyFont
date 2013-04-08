package FIT_0204_Shelestova.Common;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class ControlPanel extends MyPanel{
    private String title = "Control Panel";

    protected ControlPanel(CommonGUI gui) {
        super(gui);
        setBorder(BorderFactory.createTitledBorder(
                new LineBorder(Color.GRAY, 1, true), title));
        setBackground(GUIStandarts.panelColor);
    }

}
