package com.galvanize.curriculum.xp.dip.car.method.injection;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private List<Assistant> assistants = new ArrayList<>();

    public void drive() {
        System.out.println("Driving...");
        assistants.forEach(Assistant::assist);
    }

    public void addAssistant(Assistant assistant) {
        assistants.add(assistant);
    }

    public void setVolume(int percent) {
        System.out.println("Setting volume to " + percent + "%...");
    }
}
