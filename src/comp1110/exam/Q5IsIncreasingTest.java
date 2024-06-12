package comp1110.exam;

// import JUnit
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

public class Q5IsIncreasingTest {

    @Test
    public void testString() {
        // FIXME: Write at most 5 JUnit tests for the isIncreasing method.
        // The specification of the method is found in IsIncreasing.java.
        // Your tests should cover edge cases.
        // A correct implementation should pass all your tests.
        // Note that to test the isIncreasing method, you must instantiate
        // the class IsIncreasing with a type of your choice; you can use
        // different types for different tests.

        IsIncreasing<String> stringSequence = new IsIncreasing<>();

        // Test case 1: Increasing sequence
        String[] sequence1 = {"apple", "banana", "cherry"};
        assertTrue(stringSequence.isIncreasing(sequence1));

        // Test case 2: Not increasing sequence
        String[] sequence2 = {"apple", "cherry", "banana"};
        assertFalse(stringSequence.isIncreasing(sequence2));

        // Test case 3: Empty sequence
        String[] sequence3 = {};
        assertTrue(stringSequence.isIncreasing(sequence3));

        // Test case 4: Single element sequence
        String[] sequence4 = {"apple"};
        assertTrue(stringSequence.isIncreasing(sequence4));

        // Test case 5: Non-strictly increasing sequence
        String[] sequence5 = {"apple", "apple", "banana"};
        assertTrue(stringSequence.isIncreasing(sequence5));
    }
}


