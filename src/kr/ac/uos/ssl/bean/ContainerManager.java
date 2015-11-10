package kr.ac.uos.ssl.bean;

import java.util.ArrayList;

/**
 * @author Chan Yeon, Cho
 * @version 0.0.1 - SnapShot
 *          on 2015-11-03
 */

public class ContainerManager {

    private ArrayList<BallContainer> ballGroups;

    public ContainerManager() {
    }

    public void init() {
        if (ballGroups == null) {
            ballGroups = new ArrayList<BallContainer>();
        }
    }

    public ArrayList<BallContainer> getBallGroups() {
        return ballGroups;
    }

    public void setBallGroups(ArrayList<BallContainer> ballGroups) {
        this.ballGroups = ballGroups;
    }

}
