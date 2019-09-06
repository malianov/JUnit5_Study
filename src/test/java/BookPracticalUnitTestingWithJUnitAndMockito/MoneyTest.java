package BookPracticalUnitTestingWithJUnitAndMockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {
    @Test
    void constructorShouldSetAmountAndCurrency() {
        Money money = new Money(10, "USD");         // SUT is created
        assertEquals(110, money.getAmount(), "this is a message");
        assertEquals("USD", money.getCurrency(), "this is a message");
    }
}
