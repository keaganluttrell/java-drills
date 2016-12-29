package com.galvanize.curriculum.xp.dip.pizza;

class PizzaStore {

    Pizza createPizza(Type type) {
        Pizza pizza;
        switch (type) {
            case CHEESE:
                pizza = new CheesePizza();
                break;
            case VEGGIE:
                pizza = new VeggiePizza();
                break;
            case CLAM:
                pizza = new ClamPizza();
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza();
                break;
            default:
                throw new RuntimeException("Unsupported Type: " + type);
        }
        pizza.prepare();
        pizza.back();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
