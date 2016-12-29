package com.galvanize.curriculum.xp.ocp.shapes;

class Shape {

    private int a;
    private int b;
    private final String color;
    private final ShapeType type;


    Shape(ShapeType type, String color) {
        this.color = color;
        this.type = type;
    }

    int getA() {
        return a;
    }

    int getB() {
        return b;
    }

    String getColor() {
        return color;
    }

    ShapeType getType() {
        return type;
    }

    void setA(int a) {
        this.a = a;
    }

    void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Shape{" + "color='" + color + '\'' + ", type=" + type + '}';
    }
}
