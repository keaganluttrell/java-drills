package com.galvanize.curriculum.xp.dip.car.constructor.injection;

public class Tesla {

    private ElectricEngine engine = new ElectricEngine();

    public void drive() {
        System.out.println("Driving...");
        engine.accelerate();
    }
}
