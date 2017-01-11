package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.TreeSet;

public class WebFramework {
    public static Set<String> getDescriptions(Class<?> clazz) {
        // Get the base path
        String basePath = "";
        for (Annotation annotation : ObjectController.class.getAnnotations()) {
            if (annotation instanceof RequestMapping) {
                RequestMapping mapping = (RequestMapping) annotation;
                basePath += mapping.path()[0];
            }
        }
        Set<String> descriptions = new TreeSet<>();

        // TODO: Collect the remaining information for the description

        return descriptions;
    }
}
