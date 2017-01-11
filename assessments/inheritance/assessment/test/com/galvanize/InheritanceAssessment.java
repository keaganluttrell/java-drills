package com.galvanize;

import org.junit.Assert;
import org.junit.Test;

public class InheritanceAssessment {
    @Test
    public void testInheritance() throws Exception {
        Class<?> dieselEngine = Class.forName("com.galvanize.DieselEngine");
        Class<?> petrolEngine = Class.forName("com.galvanize.PetrolEngine");
        Class<?> radiator = Class.forName("com.galvanize.Radiator");

        Class<?> dieselSuper = dieselEngine.getSuperclass();
        Class<?> petrolSuper = petrolEngine.getSuperclass();
        Class<?> radiatorSuper = radiator.getSuperclass();
        Class<?> engineSuper = dieselSuper.getSuperclass();

        Assert.assertTrue(dieselSuper == petrolSuper);
        Assert.assertTrue(radiatorSuper == engineSuper);
    }
}
