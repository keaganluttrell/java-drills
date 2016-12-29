package com.galvanize.curriculum.xp.ocp.pub;

import java.util.ArrayList;
import java.util.List;

class Customer {

    private List<Double> drinks = new ArrayList<>();
    private boolean isHappyHour;

    void orderDrinks(double price, int quantity) {

        if (isHappyHour) {
            drinks.add(price * quantity * 0.5);
        } else {
            drinks.add(price * quantity);
        }
    }

    double getTotalDue() {
        return drinks.stream().mapToDouble(Double::doubleValue).sum();
    }

    void setHappyHour(boolean isHappyHour) {
        this.isHappyHour = isHappyHour;
    }
}
