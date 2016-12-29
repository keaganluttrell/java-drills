package com.galvanize.curriculum.xp.dip.car.constructor.injection;

public class App {

    public static void main(String... args) {

        Jeep jeep = new Jeep();
        jeep.drive();

        Ford ford = new Ford();
        ford.drive();

        Tesla tesla = new Tesla();
        tesla.drive();
    }
}
