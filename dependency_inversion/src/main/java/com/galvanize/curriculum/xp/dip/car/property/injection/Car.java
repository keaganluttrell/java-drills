package com.galvanize.curriculum.xp.dip.car.property.injection;

public class Car {

    private String audioSystem;

    public Car(String audioSystem) {
        this.audioSystem = audioSystem;
    }

    public void drive() {
        System.out.println("Driving...");
        switch (audioSystem) {
            case "Radio":
                Radio radio = new Radio();
                radio.play();
                break;
            case "CD Player":
                CdPlayer cdPlayer = new CdPlayer();
                cdPlayer.play();
                break;
            case "Subwoofer":
                Subwoofer subwoofer = new Subwoofer();
                subwoofer.play();
                break;
        }
    }
}
