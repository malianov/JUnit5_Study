package geyzenbag_marcphilipp.usage;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ExceptionTestingDemo {

    @Test
    public void newApproach() throws Exception {
        NumberFormatException expected = assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("foo");
        });
        assertEquals("For input string: \"foo\"", expected.getMessage());
    }
}