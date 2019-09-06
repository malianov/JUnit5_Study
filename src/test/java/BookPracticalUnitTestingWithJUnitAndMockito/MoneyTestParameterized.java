package BookPracticalUnitTestingWithJUnitAndMockito;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTestParameterized {
    @ParameterizedTest
    @CsvSource({"11, USD", "20, EUR"})

    void constructorShouldSetAmountAndCurrency(ArgumentsAccessor argumentsAccessor) {
        int getAmount = argumentsAccessor.getInteger(0);
        String getCurrency = argumentsAccessor.getString(1);

        Money money = new Money(getAmount, getCurrency);         // SUT is created
        //assertEquals(11, money.getAmount(), "this is a message");
        assertEquals("USD", money.getCurrency(), "this is a message");
    }
}
