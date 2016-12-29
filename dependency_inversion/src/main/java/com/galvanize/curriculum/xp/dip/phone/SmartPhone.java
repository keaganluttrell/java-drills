package com.galvanize.curriculum.xp.dip.phone;

class SmartPhone {

    private static final String CONNECTION = "3G";

    public static void main(String... args) {
        SmartPhoneApp smartPhoneApp = new SmartPhoneApp();

        // ...
        // User types "Hello World!" into text field
        String textFieldContent = "Hello World!";
        // User touches save button
        // ...

        smartPhoneApp.handleSaveButtonTouched(textFieldContent);
    }

    static boolean hasConnection() {
        return CONNECTION != null;
    }
}
