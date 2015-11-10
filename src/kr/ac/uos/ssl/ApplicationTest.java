package kr.ac.uos.ssl;

import kr.ac.uos.ssl.bean.Ball;
import kr.ac.uos.ssl.bean.ContainerManager;
import kr.ac.uos.ssl.configuration.Configuration;
import kr.ac.uos.ssl.gui.GraphicManager;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * @author Chan Yeon, Cho
 * @version 0.0.1 - SnapShot
 *          on 2015-11-03
 */

public class ApplicationTest {


    private ContainerManager containerManager;
    private GraphicManager graphicManager;
    private final Random rand;
    private BufferedImage image;
    private Graphics2D g;

    public ApplicationTest() {
        rand = new Random();
        startTest();
    }

    private void startTest() {

       /* Problem
        * Make objects and relation of them. and initialize.
        */

        while (true) {
            try {
                drawBall();
                moveBall();
                graphicManager.getFrame().repaint();
                Thread.sleep(Configuration.FRAME_DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    private void process(Ball tempBall) {

        tempBall.setX(tempBall.getX()+tempBall.getxDelta());
        tempBall.setY(tempBall.getY()+tempBall.getyDelta());
        if (( tempBall.getxDelta() > 0) && (tempBall.getX() >= Configuration.WIDTH - 30)) {
            tempBall.setxDelta(-tempBall.getxDelta());
        }
        if (( tempBall.getxDelta() < 0) && (tempBall.getX() <= 0 )) {
            tempBall.setxDelta(-tempBall.getxDelta());
        }
        if (( tempBall.getyDelta() > 0) && (tempBall.getY() >= Configuration.HEIGHT - 30)) {
            tempBall.setyDelta(-tempBall.getyDelta());
        }
        if (( tempBall.getyDelta() < 0) && (tempBall.getY() <= 0 )) {
            tempBall.setyDelta(-tempBall.getyDelta());
        }
    }

    private void drawBall() {
        image = new BufferedImage(1280, 800, BufferedImage.TYPE_INT_RGB);
        g = image.createGraphics();

        /* Problem
         * Set a Background of BufferedImage
         */

        for (int i =0; i < containerManager.getBallGroups().size(); i++) {
            for(Ball tempBall : containerManager.getBallGroups().get(i).getBalls()){
                /* Problem
                 * Draw a tempBall to BufferedImage with it's color
                 */
            }
        }
        graphicManager.getPanel().setImage(image);
    }

    private void moveBall() {
        for (int i =0; i < containerManager.getBallGroups().size(); i++) {
            containerManager.getBallGroups().get(i).getBalls().forEach(this::process);
        }
    }

    private void setMapper(CommandMapper cMapper, ContainerManager containerManager) {
        cMapper.setContainerManager(containerManager);
    }

    public static void main(String[] args) {
        new ApplicationTest();
    }
}
