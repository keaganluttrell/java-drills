package com.galvanize.curriculum.xp.dip.car.constructor.injection;

public class Ford {

    private PetrolEngine engine = new PetrolEngine();

    public void drive() {
        System.out.println("Driving...");
        engine.accelerate();
    }
}
