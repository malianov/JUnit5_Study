package BookPracticalUnitTestingWithJUnitAndMockito.exercise;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static BookPracticalUnitTestingWithJUnitAndMockito.exercise.StringReverse.reverse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringReverseTest {

    @Test
    void checkWithString() {
        assertEquals("qwerty", reverse("ytrewq"));
        assertEquals("йцукен", reverse("некуцй"));
        assertEquals("!123йцуФЫВ", reverse("ВЫФуцй321!"));
    }
}
