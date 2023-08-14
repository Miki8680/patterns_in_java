package model.room;

import model.room.equipment.Light;

public class Room {

    private Light light;

    public Room() {
        this.light = new Light();
    }

    public void switchLights() {
        light.setSwitchedOn(!light.isSwitchedOn());
    }
}
