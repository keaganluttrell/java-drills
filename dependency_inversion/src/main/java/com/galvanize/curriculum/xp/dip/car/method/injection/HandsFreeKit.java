package com.galvanize.curriculum.xp.dip.car.method.injection;

public class HandsFreeKit implements Assistant {

    private Car car;

    @Override
    public void connect(Car car) {
        this.car = car;
    }

    @Override
    public void assist() {
        car.setVolume(0);
        System.out.println("Incoming call...");
    }
}
