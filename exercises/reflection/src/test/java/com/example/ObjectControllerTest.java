package com.example;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.TreeSet;

public class ObjectControllerTest {

    @Test
    public void reflecTest() {
        // Setup
        String path = "";
        for (Annotation annotation : ObjectController.class.getAnnotations()) {
            if (annotation instanceof RequestMapping) {
                RequestMapping mapping = (RequestMapping) annotation;
                path += mapping.path()[0];
            }
        }
        Set<String> descriptions = new TreeSet<>();

        // Exercise
        // TODO: Get the asserts under Then to pass

        // Assert
        Assert.assertThat(descriptions, CoreMatchers.hasItem("listObjects() handles GET /categories"));
        Assert.assertThat(descriptions, CoreMatchers.hasItem("createCategory() handles POST /categories"));
        Assert.assertThat(descriptions, CoreMatchers.hasItem("updateCategory() handles PUT /categories/{objectId}"));
        Assert.assertThat(descriptions, CoreMatchers.hasItem("deleteCategory() handles DELETE /categories/{objectId}"));
        Assert.assertThat(descriptions, CoreMatchers.hasItem("categories() handles GET /categories/{objectId}"));
    }
}
