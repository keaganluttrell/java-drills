import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.omg.CORBA.Object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ListOpsTest {

    // ----------------------------------------------------- all ------------------------------------------------------
    @Test
    public void allReturnsTrueForEmptyArray() {
        // Setup
        List<Object> list = new ArrayList<>();

        // Exercise
        boolean actual = ListOps.all(list, item -> true);

        // Assert
        assertTrue("returns true for an empty array", actual);
    }

    @Test
    public void allReturnsFalseIfAnyElementReturnsFalse() {
        // Setup
        List<Integer> list = Arrays.asList(1,2,3);

        // Exercise
        boolean actual = ListOps.all(list, i -> i % 2 == 0);

        // Assert
        assertFalse("returns false if any element returns a false value when provided as an argument to the provided function", actual);
    }

    @Test
    public void allReturnsTrueIfAllElementsTrue() {
        // Setup
        List<Integer> list = Arrays.asList(1,2,3);

        // Exercise
        boolean actual = ListOps.all(list, i -> i > 0);

        // Assert
        assertTrue("returns true if all elements returns a truthy value when provided as an argument to the provided function", actual);
    }

    @Test
    public void allReturnsTrueIfNoFunction() {
        // Setup
        List<Integer> list = Arrays.asList(1,2,3);

        // Exercise
        boolean actual = ListOps.all(list, null);

        // Assert
        assertTrue("returns true if no function is provided", actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void allThrowsIfNoList() {
        // Exercise
        boolean actual = ListOps.all(null, null);
    }

    // ------------------------------------------------ any -----------------------------------------------------------
    @Test
    public void anyReturnsFalseForEmptyList() {
        // Setup
        List<Integer> list = new ArrayList<>();

        // Exercise
        boolean actual = ListOps.any(list, i -> false);

        // Assert
        assertFalse("returns false for an empty array", actual);
    }

    @Test
    public void anyReturnsTrueIfAnyElementTrue() {
        // Setup
        List<Integer> list = Arrays.asList(1,2,3);

        // Exercise
        boolean actual = ListOps.any(list, i -> i % 2 == 0);

        // Assert
        assertTrue("returns true if any element returns a true value when provided as an argument to the provided function", actual);
    }

    @Test
    public void anyReturnsFalseWhenNoElementTrue() {
        // Setup
        List<Integer> list = Arrays.asList(1,2,3);

        // Exercise
        boolean actual = ListOps.any(list, i -> i < 0);

        // Assert
        assertFalse("returns false if no element returns a truthy value when provided as an argument to the provided function", actual);
    }

    @Test
    public void anyReturnsFalseIfNoFunction() {
        // Setup
        List<Integer> list = Arrays.asList(1,2,3);

        // Exercise
        boolean actual = ListOps.any(list, null);

        // Assert
        assertFalse("returns false if no function is provided", actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void anyThrowsIfNoList() {
        // Exercise
        boolean actual = ListOps.any(null, null);
    }

    // ----------------------------------------------- forEach --------------------------------------------------------
    @Test
    public void forEachAppliesTheArgument() {
        // Setup
        List<Integer> expected = Arrays.asList(1,2,3);
        List<Integer> actual = new ArrayList<>();

        // Exercise
        ListOps.forEach(expected, actual::add);

        // Assert
        assertEquals("applies the argument function applied to each element and returns undefined", expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void forEachThrows() {
        ListOps.forEach(null, null);
    }

    // ----------------------------------------------- map ------------------------------------------------------------
    @Test
    public void mapReturnsEmptyWhenEmpty() {
        // Setup
        List<Integer> expected = new ArrayList<>();

        // Exercise
        List<Integer> actual = ListOps.map(expected, (i) -> i);

        // Assert
        assertEquals("returns an empty array when given an empty array", expected, actual);
    }

    @Test
    public void mapReturnsMappedArray() {
        // Setup
        List<Integer> input = Arrays.asList(1,2,3);

        // Exercise
        List<Integer> actual = ListOps.map(input, (i) -> i*i);

        // Assert
        assertEquals(Arrays.asList(1,2,3), input);
        assertEquals(Arrays.asList(1,4,9), actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void mapThrowsNoFunction() {
        ListOps.map(Arrays.asList(1,2,3), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void mapThrowsNoList() {
        ListOps.map(null, null);
    }

    // --------------------------------------------- stretch ----------------------------------------------------------
    @Test
    public void stretchReturnsZero() {
        // Setup
        List<String> input = Arrays.asList("hi","there","world");
        double expected = 0.0;

        // Exercise
        double actual = ListOps.stretchAverageLengthMoreThanTenLong(input);

        // Assert
        assertEquals("returns 0 when there are no string with more than 10 characters", expected, actual, 0);
    }

    @Test
    public void stretchAverage() {
        // Setup
        List<String> input = Arrays.asList("hi","there","world","quizzically","puzzleheaded");
        double expected = 11.5;

        // Exercise
        double actual = ListOps.stretchAverageLengthMoreThanTenLong(input);

        // Assert
        assertEquals("returns the average of only words more than 10 characters long", expected, actual, 0);
    }

}

