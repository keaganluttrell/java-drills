package com.database.driver

import com.galvanize.ReflectionHelper
import org.junit.Test

import java.lang.reflect.Modifier

class ConnectionTest {

    @Test
    public void testInterface() throws Exception {
        ReflectionHelper.assertImplements(Connection.class, AutoCloseable.class);
    }

    @Test
    public void testConstructor() throws Exception {
        ReflectionHelper.assertConstructorSignature(Connection.class, [ConnectionPool.class], Modifier.PROTECTED, 0);
    }

    @Test
    public void testMethods() throws Exception {
        ReflectionHelper.assertMethodSignature(Connection.class, "runQuery", [String.class], int.class, Modifier.PUBLIC, 0);
        ReflectionHelper.assertMethodSignature(Connection.class, "close", [], void.class, Modifier.FINAL, 0);
    }
}
