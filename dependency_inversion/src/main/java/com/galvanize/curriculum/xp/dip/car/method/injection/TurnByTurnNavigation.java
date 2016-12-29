package com.galvanize.curriculum.xp.dip.car.method.injection;

public class TurnByTurnNavigation implements Assistant {

    private Car car;

    @Override
    public void connect(Car car) {
        this.car = car;
    }

    @Override
    public void assist() {
        car.setVolume(50);
        System.out.println("Turn left after 200 meters, then turn right...");
    }
}
