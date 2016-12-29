package com.galvanize.curriculum.xp.dip.time;

class Clock {

    String tellTime() {
        long timeInMinutes = System.currentTimeMillis() / 1000 / 60 % (24 * 60);
        return String.format("%02d:%02d", timeInMinutes / 60, timeInMinutes % 60);
    }
}
