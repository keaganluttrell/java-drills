package com.galvanize.curriculum.xp.dip.car.property.injection;

public class App {

    public static void main(String... args) {

        Car car1 = new Car("Radio");
        car1.drive();

        Car car2 = new Car("CD Player");
        car2.drive();

        Car car3 = new Car("Subwoofer");
        car3.drive();
    }
}
