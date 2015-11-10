package kr.ac.uos.ssl.gui;

import kr.ac.uos.ssl.configuration.Configuration;

import javax.swing.*;
import java.awt.*;

/**
 * @author Chan Yeon, Cho
 * @version 0.0.1 - SnapShot
 *          on 2015-11-04
 */

public class GraphicManager {

    private JFrame frame;
    private CustomPanel panel;

    public GraphicManager() {
    }

    public void init() {
        makeFrame();
        makePanel();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public void makePanel() {
        /* Problem
         * Make panel and initialize
         */
    }

    public void makeFrame() {
        /* Problem
         * Make frame and initialize
         */
    }

    public JFrame getFrame() {
        return frame;
    }

    public CustomPanel getPanel() {
        return panel;
    }
}
