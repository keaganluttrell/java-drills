package com.galvanize.curriculum.xp.ocp.shapes;

import static com.galvanize.curriculum.xp.ocp.shapes.ShapeType.CIRCLE;
import static com.galvanize.curriculum.xp.ocp.shapes.ShapeType.RECTANGLE;

class App {

    public static void main(String... args) {

        Printer printer = new Printer();

        Shape rectangle = new Shape(RECTANGLE, "blue");
        rectangle.setA(2);
        rectangle.setB(3);
        System.out.println(printer.draw(rectangle));

        Shape circle = new Shape(CIRCLE, "red");
        circle.setA(4);
        System.out.println(printer.draw(circle));
    }
}
