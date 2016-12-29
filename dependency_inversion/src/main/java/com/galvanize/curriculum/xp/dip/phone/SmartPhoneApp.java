package com.galvanize.curriculum.xp.dip.phone;

class SmartPhoneApp {

    private FlashStorage flashStorage = new FlashStorage();
    private CloudStorage cloudStorage = new CloudStorage();

    void handleSaveButtonTouched(String textFieldContent) {
        flashStorage.save(textFieldContent);
        if (SmartPhone.hasConnection()) {
            cloudStorage.save(textFieldContent);
        }
    }
}
