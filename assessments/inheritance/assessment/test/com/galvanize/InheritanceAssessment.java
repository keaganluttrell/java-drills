package com.galvanize;

import org.junit.Assert;
import org.junit.Test;

public class InheritanceAssessment {
    @Test
    public void testInheritance() throws Exception {
        Class<?> dieselEngine = Class.forName("com.galvanize.DieselEngine");
        Class<?> petrolEngine = Class.forName("com.galvanize.PetrolEngine");
        Class<?> engine = Class.forName("com.galvanize.Engine");
        Class<?> radiator = Class.forName("com.galvanize.Radiator");
        Class<?> component = Class.forName("com.galvanize.Component");

        Assert.assertTrue(dieselEngine.getSuperclass() == engine);
        Assert.assertTrue(petrolEngine.getSuperclass() == engine);
        Assert.assertTrue(engine.getSuperclass() == component);
        Assert.assertTrue(radiator.getSuperclass() == component);
    }
}
