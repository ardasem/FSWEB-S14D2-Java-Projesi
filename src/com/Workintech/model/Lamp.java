package com.Workintech.model;

import com.Workintech.enums.LampType;

public class Lamp {
    private LampType lamp;
    private boolean battery;
    private int globalRating;

    public Lamp(LampType lamp, boolean battery, int globalRating) {
        this.lamp = lamp;
        this.battery = battery;
        this.globalRating = globalRating;
    }

    public LampType getLamp() {
        return lamp;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobalRating() {
        return globalRating;
    }

    public void turnOn(LampType lamp){

    }

    @Override
    public String toString() {
        return "Lamp{" +
                "lamp=" + lamp.ordinal() +
                ", battery=" + battery +
                ", globalRating=" + globalRating +
                '}';
    }
}
