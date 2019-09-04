package sandbox.developer_ibm_com;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class DummyTest {
    @Test
    @DisplayName("Dummy test")
    void dummyTest() {
        int expected = 4;
        int actual = 2 + 2;
        assertEquals(expected, actual,"INCONCEIVABLE");
        /////////////////////////

        Object nullValue = null;
        assertFalse(nullValue != null);
        assertNull(nullValue);
        assertNotNull("null2",  "INCONCEIVABLE");
        assertTrue(nullValue == null);
        /////////////////////////

        // All of the assertions contained within it are performed, even if one or more of them fail
        assertAll("Assert All of these",
                ()-> assertEquals(expected, actual, "INCONCEIVABLE!"),
                ()-> assertFalse(nullValue != null),
                ()-> assertNull(nullValue),
                ()-> assertNotNull("A String", "INCONCEIVABLE!"),
                ()-> assertTrue(nullValue == null));
    }

//    @Test()
//    @DisplayName("Empty argument")
//    public void testAdd_ZeroOperands_EmptyArgument() {
//        long[] numbersToSum = {};
//        assertThrows(IllegalArgumentException.class, ()-> classUnderTest.add(numbersToSum));
//    }

    @Test
    @DisplayName("This test is only run on Fridays")
    public void testAdd_OnlyOnWednesday() {
        LocalDateTime localDateTime = LocalDateTime.now();
        assumeTrue(localDateTime.getDayOfWeek().getValue() == 3);
        // Remainder of test (only executed if assumption holds)...
        // If the condition doesn’t hold, then the test is skipped.
        //This doesn’t affect the “green” of the project, and won’t cause the build to fail;
        // all of the code in test method after assumeTrue() is simply skipped.
        System.out.println("Today is Wednesday");
    }

    @Test
    @DisplayName("This test is only run on Fridays (with lambda)")
    public void testAdd_OnlyOnFriday_WithLambda() {
        LocalDateTime localDateTime = LocalDateTime.now();
        assumingThat(localDateTime.getDayOfWeek().getValue() == 3,
                () -> {
                // Execute this if assumption holds...
                    System.out.println("Today is Wednesday");
                    //Note that everything after the lambda will execute,
                    //regardless of whether the assumption in assumingThat() holds.
        });
        // Execute this regardless
    }
    // Use assertions to check the results of a test method. Use assumptions to
    // determine whether to run the test method at all. An aborted test is not
    // reported as a failure, meaning that failure won’t break the build.
}
