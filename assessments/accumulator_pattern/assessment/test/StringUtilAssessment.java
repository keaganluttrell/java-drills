import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class StringUtilAssessment {

    private List<Method> findMethod(Class<?> returnType, Class<?>[] arguments) throws Exception {
        List<Method> methods = new ArrayList<>();
        URLClassLoader cl = (URLClassLoader)getClass().getClassLoader();
        URL[] urls = cl.getURLs();
        List<URL> paths = Arrays.stream(urls)
                .filter(url -> !StringUtils.equalsIgnoreCase("jar", FilenameUtils.getExtension(url.getPath())))
                .filter(url -> StringUtils.equals("file", url.getProtocol()))
                .collect(Collectors.toList());
        for(URL url : paths) {
            File basePath = new File(url.toURI());
            if(!basePath.exists()) {
                continue;
            }
            Collection<File> files = FileUtils.listFiles(basePath, new String[] {"class"}, true);
            for(File file : files) {
                String relativePath = FilenameUtils.removeExtension(basePath.toURI().relativize(file.toURI())
                    .getPath())
                    .replace("/", ".");
                Class<?> clazz = cl.loadClass(relativePath);
                for(Method method : clazz.getDeclaredMethods()) {
                    if(method.getParameterCount() != arguments.length) {
                        continue;
                    }
                    Class<?>[] types = method.getParameterTypes();
                    boolean found = true;
                    for(int i = 0; i < arguments.length; i++) {
                        if(types[i] != arguments[i]) {
                            found = false;
                        }
                    }
                    if(!found) {
                        continue;
                    }
                    Class<?> type = method.getReturnType();
                    if(!returnType.isAssignableFrom(type)) {
                        continue;
                    }
                    // http://stackoverflow.com/questions/6148798/get-generic-type-for-java-util-map-parameter
                    methods.add(method);
                }
            }
        }
        return methods;
    }

    @Test
    public void findsCharsInBoth() throws Exception {

        // Setup
        Map<Character,Integer> expected = new HashMap<>();
        expected.put('a', 1);
        expected.put('b', 2);

        // Exercise
        Map<?,?> actual = null;
        for(Method method : findMethod(Map.class, new Class<?>[] {String.class, String.class})) {
            Object inst = Modifier.isStatic(method.getModifiers()) ? null : method.getDeclaringClass().newInstance();
            actual = (Map<?,?>)method.invoke(inst, new Object[] {"ab", "b"});
            if(expected.equals(actual)) {
                break;
            }
        }
        Assert.assertNotNull(actual);
        assertEquals("takes two strings and returns and object with character counts", expected, actual);
    }

}
