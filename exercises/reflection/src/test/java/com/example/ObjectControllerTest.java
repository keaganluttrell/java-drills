package com.example;

import org.junit.Test;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.annotation.Annotation;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.MatcherAssert.assertThat;

public class ObjectControllerTest {

    @Test
    public void reflectionTest() {
        // Given
        String path = "";
        for (Annotation annotation : ObjectController.class.getAnnotations()) {
            if (annotation instanceof RequestMapping) {
                RequestMapping mapping = (RequestMapping) annotation;
                path += mapping.path()[0];
            }
        }
        Set<String> descriptions = new TreeSet<>();

        // When
        // TODO: Get the asserts under Then to pass


        // Then
        assertThat(descriptions, hasItem("listObjects() handles GET /categories"));
        assertThat(descriptions, hasItem("createCategory() handles POST /categories"));
        assertThat(descriptions, hasItem("updateCategory() handles PUT /categories/{objectId}"));
        assertThat(descriptions, hasItem("deleteCategory() handles DELETE /categories/{objectId}"));
        assertThat(descriptions, hasItem("categories() handles GET /categories/{objectId}"));
    }
}
