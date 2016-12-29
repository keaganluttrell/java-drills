package com.galvanize.curriculum.xp.dip.car.method.injection;

public class App {

    public static void main(String... args) {

        Car car = new Car();

        Assistant navigation = new TurnByTurnNavigation();
        navigation.connect(car);
        car.addAssistant(navigation);
        car.drive();

        Assistant handsFree = new HandsFreeKit();
        handsFree.connect(car);
        car.addAssistant(handsFree);
        car.drive();

        Assistant speedLimit = new SpeedLimit();
        speedLimit.connect(car);
        car.addAssistant(speedLimit);
        car.drive();
    }
}
