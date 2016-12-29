package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AreaCalculatorTest {
    double epsilon = Math.pow(2, -16);

    @Test
    public void testCircle() {
        // Setup
        double expected = Math.PI;
        AreaCalculator classUnderTest = new AreaCalculator();
        Circle shape = new Circle(1.0);
        Object[] shapes = new Object[] {shape};

        // Exercise
        double actual = classUnderTest.Area(shapes);

        // Assert
        assertEquals("Area for unit circle should be PI", expected, actual, epsilon);
    }

    @Test
    public void testRectangle() {
        // Setup
        double expected = 1.0;
        AreaCalculator classUnderTest = new AreaCalculator();
        Rectangle shape = new Rectangle(1.0, 1.0);
        Object[] shapes = new Object[] {shape};

        // Exercise
        double actual = classUnderTest.Area(shapes);

        // Assert
        assertEquals("Area for unit rectangle should be 1", expected, actual, epsilon);
    }

    @Test
    public void testEquilateralTriangle() {
        // Setup
        double expected = 0.433;
        AreaCalculator classUnderTest = new AreaCalculator();
        EquilateralTriangle shape = new EquilateralTriangle(1.0);
        Object[] shapes = new Object[] {shape};

        // Exercise
        double actual = classUnderTest.Area(shapes);

        // Assert
        assertEquals("Area for unit triangle should be ~0.433", expected, actual, epsilon);
    }

}
