package com.galvanize.curriculum.xp.dip.car.constructor.injection;

public class Jeep {

    private DieselEngine engine = new DieselEngine();

    public void drive() {
        System.out.println("Driving...");
        engine.accelerate();
    }
}
