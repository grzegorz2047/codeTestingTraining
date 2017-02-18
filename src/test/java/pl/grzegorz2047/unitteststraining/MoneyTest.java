package pl.grzegorz2047.unitteststraining;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Plik stworzony przez grzegorz2047 18.02.2017.
 */
class MoneyTest {

    @Test
    public void constructorShouldSetAmountAndCurrency() {
        Money money = new Money(10, "USD");

        assertEquals(10, money.getAmount());
        assertEquals("USD", money.getCurrency());
    }

}