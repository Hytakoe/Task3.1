public class TrafficLight {
    private TrafficLightTypes type;
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
}
