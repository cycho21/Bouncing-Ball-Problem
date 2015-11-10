package kr.ac.uos.ssl.gui;

import javax.swing.*;
import java.awt.*;

/**
 * @author Chan Yeon, Cho
 * @version 0.0.1 - SnapShot
 *          on 2015-11-09
 */

public class CustomPanel extends JPanel {

    private Image image;

    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(image, 0, 0, this);
    }

    public void setImage(Image image) {
        this.image = image;
        repaint();
    }
}