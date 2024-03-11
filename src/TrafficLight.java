import javax.swing.*;
import java.awt.*;

public class TrafficLight {
    private TrafficLightTypes type;
    private boolean isRed;
    public boolean isRed() {
        return isRed;
    }
    public void setRed(boolean red) {
        isRed = red;
    }

    private boolean isYellow;
    public boolean isYellow() {
        return isYellow;
    }
    public void setYellow(boolean yellow) {
        isYellow = yellow;
    }

    private boolean isGreen;
    public boolean isGreen() {
        return isGreen;
    }
    public void setGreen(boolean green) {
        isGreen = green;
    }

    private boolean isYellowToGreen;
    public boolean isYellowToGreen() {
        return isYellowToGreen;
    }
    public void setYellowToGreen(boolean yellowToGreen) {
        isYellowToGreen = yellowToGreen;
    }

    private boolean isRedToYellow;
    public boolean isRedToYellow() {
        return isRedToYellow;
    }
    public void setRedToYellow(boolean redToYellow) {
        isRedToYellow = redToYellow;
    }

    private boolean isRedToGreen;
    public boolean isRedToGreen() {
        return isRedToGreen;
    }
    public void setRedToGreen(boolean redToGreen) {
        isRedToGreen = redToGreen;
    }

    public TrafficLightTypes getType() {
        return type;
    }
    public void setType(TrafficLightTypes type) {
        this.type = type;
    }

    private int redToYellowTime;
    public int getRedToYellowTime() {
        if (!(this.type == TrafficLightTypes.PEDESTRIAN)) {
            return redToYellowTime;
        }
        else return 0;
    }
    public void setRedToYellowTime(int redToYellowTime) {
        if (!(this.type == TrafficLightTypes.PEDESTRIAN)) {
            this.redToYellowTime = redToYellowTime;
        }
    }

    private int redToGreenTime;
    public int redToGreenTime() {
        if (this.type == TrafficLightTypes.PEDESTRIAN) {
            return yellowToGreenTime;
        }
        else return 0;
    }
    public void redToGreenTime(int yellowToGreenTime) {
        if (this.type == TrafficLightTypes.PEDESTRIAN) {
            this.yellowToGreenTime = yellowToGreenTime;
        }
    }
    public JRadioButton redLight;
    public JRadioButton yellowLight;
    public JRadioButton greenLight;
    public JRadioButton rightLight;
    public JRadioButton leftLight;
    private int rightTime;
    public int getRightTime() {
        if (this.type == TrafficLightTypes.CAR_ALL || this.type == TrafficLightTypes.CAR_RIGHT) {
            return rightTime;
        }
        else return 0;
    }
    public void setRightTime(int rightTime) {
        if (this.type == TrafficLightTypes.CAR_ALL || this.type == TrafficLightTypes.CAR_RIGHT) {
            this.rightTime = rightTime;
        }
    }

    private int leftTime;
    public int getleftTime() {
        if (this.type == TrafficLightTypes.CAR_ALL || this.type == TrafficLightTypes.CAR_LEFT) {
            return leftTime;
        }
        else return 0;
    }
    public void setleftTime(int leftTime) {
        if (this.type == TrafficLightTypes.CAR_ALL || this.type == TrafficLightTypes.CAR_LEFT) {
            this.leftTime = leftTime;
        }
    }

    private int yellowToGreenTime;
    public int getYellowToGreenTime() {
        if (!(this.type == TrafficLightTypes.PEDESTRIAN)) {
            return yellowToGreenTime;
        }
        else return 0;
    }
    public void setYellowToGreenTime(int yellowToGreenTime) {
        if (!(this.type == TrafficLightTypes.PEDESTRIAN)) {
            this.yellowToGreenTime = yellowToGreenTime;
        }
    }

    private int redTime;
    public int getRedTime() {
        return redTime;
    }
    public void setRedTime(int redTime) {
        this.redTime = redTime;
    }

    private int greenTime;
    public int getGreenTime() {
        return greenTime;
    }
    public void setGreenTime(int greenTime) {
        this.greenTime = greenTime;
    }
    public void startPedestrian() throws InterruptedException {
        this.setRed(true);
        this.redLight.setBackground(Color.red);
        Thread.sleep(this.redTime * 1000);
        this.setRed(false);
        this.redLight.setBackground(Color.lightGray);
        this.setGreen(true);
        this.greenLight.setBackground(Color.green);
        Thread.sleep(this.greenTime * 1000);
        this.setGreen(false);
        this.greenLight.setBackground(Color.lightGray);
    }
    public void startAuto() throws InterruptedException {
        this.setRed(true);
        this.redLight.setBackground(Color.red);
        Thread.sleep(this.redTime * 1000);
        this.setYellow(true);
        this.yellowLight.setBackground(Color.yellow);
        Thread.sleep(this.yellowToGreenTime * 1000);
        this.setRed(false);
        this.redLight.setBackground(Color.lightGray);
        this.setYellow(false);
        this.yellowLight.setBackground(Color.lightGray);
        this.setGreen(true);
        this.greenLight.setBackground(Color.green);
        Thread.sleep(this.greenTime * 1000);
        this.setGreen(false);
        for (int i = 0; i < 4; i++){
            this.greenLight.setBackground(Color.GREEN);
            Thread.sleep(500);
            this.greenLight.setBackground(Color.lightGray);
        }
        this.yellowLight.setBackground(Color.yellow);
        Thread.sleep(1000);
        this.yellowLight.setBackground(Color.lightGray);
    }
    public void startRight() throws InterruptedException {
        this.rightLight.setBackground(Color.green);
        Thread.sleep(this.rightTime * 1000);
        for (int i = 0; i < 4; i++){
            this.rightLight.setBackground(Color.GREEN);
            Thread.sleep(500);
            this.rightLight.setBackground(Color.lightGray);
        }
    }
    public void startLeft() throws InterruptedException {
        this.leftLight.setBackground(Color.green);
        Thread.sleep(this.leftTime * 1000);
        for (int i = 0; i < 4; i++){
            this.leftLight.setBackground(Color.GREEN);
            Thread.sleep(500);
            this.leftLight.setBackground(Color.lightGray);
        }
    }
}
