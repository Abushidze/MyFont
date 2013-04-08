package FIT_0204_Shelestova.Font;

import FIT_0204_Shelestova.Common.CommandLineMode;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            CommandLineMode commandLineMode = new CommandLineMode(args[0],
                    new FontController());
        } else {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    FontGUI gui = new FontGUI(new FontController());
                    gui.setVisible(true);
                }
            });
        }
    }
}