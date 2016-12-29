package com.galvanize.curriculum.xp.ocp.pub;

class App {

    public static void main(String... args) {

        Customer alan = new Customer();
        alan.orderDrinks(1.0, 1);                                // alan: 1.0

        alan.setHappyHour(true);
        alan.orderDrinks(1.0, 2);                                // alan: 1.0 + 1.0

        Customer bob = new Customer();
        bob.setHappyHour(true);
        bob.orderDrinks(0.8, 1);                                 // bob: 0.4

        System.out.println("Total due: " + alan.getTotalDue());  // alan is leaving  (2.0)

        bob.setHappyHour(false);
        bob.orderDrinks(1.3, 2);                                 // bob: 0.4 + 2.6
        bob.orderDrinks(2.5, 1);                                 // bob: 0.4 + 2.6 + 2.5

        bob.setHappyHour(true);
        bob.orderDrinks(1.0, 4);                                 // bob: 0.4 + 2.6 + 2.5 + 2.0
        bob.orderDrinks(5.0, 5);                                 // bob: 0.4 + 2.6 + 2.5 + 2.0 + 12.5

        System.out.println("Total due: " + bob.getTotalDue());   // bob is leaving (20.0)
    }
}
