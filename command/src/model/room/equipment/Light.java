package model.room.equipment;

public class Light {

    private boolean switchedOn;

    public boolean isSwitchedOn() {
        return switchedOn;
    }

    public void setSwitchedOn(boolean switchedOn) {
        this.switchedOn = switchedOn;
    }

    public void switchLights(){
        switchedOn = !switchedOn;
    }
}
