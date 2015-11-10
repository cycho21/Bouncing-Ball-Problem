package kr.ac.uos.ssl.bean;

import kr.ac.uos.ssl.configuration.Configuration;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author Chan Yeon, Cho
 * @version 0.0.1 - SnapShot
 *          on 2015-11-03
 */

public class BallContainer {

    private ArrayList<Ball> balls;
    private Color color;
    private Random rand;

    public BallContainer() {
    }

    public void init() {
        this.color = Color.BLACK;
        if (balls == null) {
            balls = new ArrayList<Ball>();
        }
        if (rand == null) {
            rand = new Random();
        }
    }

    public void makeBall(int num) {
        for (int i = 0; i < num; i++) {
            Ball ball = new Ball(rand.nextInt(Configuration.WIDTH), rand.nextInt(Configuration.HEIGHT));
            balls.add(ball);
        }
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ArrayList<Ball> getBalls() {
        return balls;
    }

    public void setBalls(ArrayList<Ball> balls) {
        this.balls = balls;
    }
}