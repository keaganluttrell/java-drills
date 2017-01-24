package com.database.driver

import com.galvanize.ReflectionHelper
import org.junit.Test

import java.lang.reflect.Constructor
import java.lang.reflect.Modifier

import static org.junit.Assert.assertNotNull
import static org.junit.Assert.assertTrue;

public class ConnectionPoolTest {
    @Test
    public void poolShouldNotLeak() throws Exception {
        int count = 0;
        Exception expectedException = null;
        ConnectionPool pool = new ConnectionPool(5);
        Connection connection = null;
        try {
            connection = pool.getConnection();
            count = connection.runQuery("select count(*) from users");
            throw new RuntimeException("Kaboom!");
        } catch (ex) {
            expectedException = ex;
        } finally {
            if (connection != null) {
                connection.close();
                connection = null;
            }
        }
        assertNotNull("An Exception should have been caught!", expectedException);
        assertTrue("ConnectionPool doesn't leak connections", pool.getLeasedCount() == 0);
        assertTrue("Connection always returns 5", count == 5);
    }

    @Test
    public void testConstructor() throws Exception {
        ReflectionHelper.assertConstructorSignature(ConnectionPool.class, [int.class], Modifier.PUBLIC, 0);
    }

    @Test
    public void testMethods() throws Exception {
        ReflectionHelper.assertMethodSignature(ConnectionPool.class, "getConnection", [], Connection.class, Modifier.PUBLIC | Modifier.FINAL, 0);
        ReflectionHelper.assertMethodSignature(ConnectionPool.class, "release", [Connection.class], void.class, Modifier.FINAL, Modifier.PUBLIC | Modifier.PRIVATE | Modifier.PROTECTED);
        ReflectionHelper.assertMethodSignature(ConnectionPool.class, "createConnection", [], Connection.class, Modifier.PROTECTED, 0);
        ReflectionHelper.assertMethodSignature(ConnectionPool.class, "getLeasedCount", [], int.class, Modifier.PUBLIC | Modifier.FINAL, 0);
    }

}
