package com.galvanize.curriculum.xp.dip.car.method.injection;

public class SpeedLimit implements Assistant {

    private Car car;

    @Override
    public void connect(Car car) {
        this.car = car;
    }

    @Override
    public void assist() {
        car.setVolume(20);
        System.out.println("*BING* The current speed limit is 30 mph...");
    }
}
