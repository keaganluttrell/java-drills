package com.galvanize;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ReflectionHelper {

    public static void assertConstructorSignature(Class<?> clazz, ArrayList<Class<?>> expectedParams, int expectedMods, int unexpectedMods) {
        String fqmn = clazz.getName() + " constructor";

        // Method name
        List<Constructor<?>> constructors = Arrays.asList(clazz.getDeclaredConstructors());
        assertTrue(clazz.getName() + " should have a constructor", constructors.size() > 0);

        // Parameter count
        constructors = constructors.stream()
                .filter ( m -> m.getParameterTypes().length == expectedParams.size() )
                .collect(Collectors.toList());
        assertTrue(fqmn + " should take " + expectedParams.size() + " parameters", constructors.size() > 0);

        // Parameter types
        Constructor<?> actualConstructor = null;
        for(Constructor<?> method : constructors) {
            Class<?>[] actualParams = method.getParameterTypes();
            if(paramsEqual(expectedParams, actualParams)) {
                actualConstructor = method;
            }
        }
        if(actualConstructor == null) {
            Class<?>[] actualParams = constructors.get(0).getParameterTypes();
            assertParams(fqmn, expectedParams, actualParams);
        }

        // Modifiers
        int actualMods = actualConstructor.getModifiers();
        assertMods(fqmn, expectedMods, unexpectedMods, actualMods);
    }

    public static void assertMethodSignature(Class<?> clazz, String methodName, ArrayList<Class<?>> expectedParams, Class<?> expectedReturnType, int expectedMods, int unexpectedMods) {
        String fqmn = clazz.getName() + "." + methodName + "()";

        // Method name
        List<Method> methods = Arrays.stream(clazz.getDeclaredMethods())
                .filter (m -> methodName.equals(m.getName()))
                .collect(Collectors.toList());
        assertTrue(clazz.getName() + " should have a " + methodName + " method", methods.size() > 0);

        // Parameter count
        methods = methods.stream()
                .filter ( m -> m.getParameterTypes().length == expectedParams.size() )
                .collect(Collectors.toList());
        assertTrue(fqmn + " should take " + expectedParams.size() + " parameters", methods.size() > 0);

        // Parameter types
        Method actualMethod = null;
        for(Method method : methods) {
            Class<?>[] actualParams = method.getParameterTypes();
            if(paramsEqual(expectedParams, actualParams)) {
                actualMethod = method;
            }
        }
        if(actualMethod == null) {
            Class<?>[] actualParams = methods.get(0).getParameterTypes();
            assertParams(fqmn, expectedParams, actualParams);
            throw new IllegalStateException("Parameters match, but no method was found!"); // This line should never be hit
        }

        // Modifiers
        int actualMods = actualMethod.getModifiers();
        assertMods(fqmn, expectedMods, unexpectedMods, actualMods);

        // Return value
        Class<?> actualReturnType = actualMethod.getReturnType();
        assertEquals(fqmn + " should return a " + expectedReturnType.getName(), expectedReturnType, actualReturnType);
    }

    public static void assertImplements(Class<?> clazz, Class<?>[] expectedInterfaces) {
        Set<Class<?>> actualInterfaces = new HashSet<>(Arrays.asList(clazz.getInterfaces()));
        for(Class<?> expectedInterface : expectedInterfaces) {
            assertTrue(clazz.getName() + " should implement " + expectedInterface.getName(), actualInterfaces.contains(expectedInterface));
        }
    }

    // ------------------------------------------------ Helpers -------------------------------------------------------
    private static boolean paramsEqual(ArrayList<Class<?>> expectedParams, Class<?>[] actualParams) {
        if(expectedParams.size() != actualParams.length) {
            return false;
        }
        for(int i = 0; i < expectedParams.size(); i++) {
            Class<?> expectedParam = expectedParams.get(i);
            Class<?> actualParam = actualParams[i];
            if(actualParam != expectedParam) {
                return false;
            }
        }
        return true;
    }

    private static void assertParams(String fqmn, ArrayList<Class<?>> expectedParams, Class<?>[] actualParams) {
        for(int i = 0; i < expectedParams.size(); i++) {
            Class<?> expectedParam = expectedParams.get(i);
            Class<?> actualParam = actualParams[i];
            assertEquals(fqmn + " parameter " + (i+1) + " should be a " + expectedParam.getName(), expectedParam, actualParam);
        }
    }

    private static void assertMods(String fqmn, int expectedMods, int unexpectedMods, int actualMods) {
        int flagMods = Modifier.PUBLIC | Modifier.STATIC | Modifier.FINAL;
        List<Field> knownMods = Arrays.stream(Modifier.class.getDeclaredFields())
                .filter(f -> (f.getModifiers() & flagMods) == flagMods)
                .filter ( f -> f.getType() == int.class )
                .collect(Collectors.toList());
        for(Field knownMod : knownMods) {
            knownMod.setAccessible(true);
            String name = knownMod.getName();
            try {
                int currentMod = (int)knownMod.get(null);
                if((expectedMods & currentMod) != 0) {
                    assertTrue(fqmn + " should be " + name, (actualMods & currentMod) != 0);
                }
                if((unexpectedMods & currentMod) != 0) {
                    assertTrue(fqmn + " should not be " + name, (actualMods & currentMod) == 0);
                }
            } catch (IllegalAccessException ex) {
                throw new RuntimeException(ex); // Shouldn't happen
            }
        }
    }

}
