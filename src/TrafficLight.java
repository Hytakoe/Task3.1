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
        Thread.sleep(this.redTime * 1000);
        this.setRed(false);
        this.setGreen(true);
        Thread.sleep(this.greenTime * 1000);
        this.setGreen(false);
    }
}
