package pl.grzegorz2047.unitteststraining;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Plik stworzony przez grzegorz2047 18.02.2017.
 */
@RunWith(JUnitParamsRunner.class) //Używaj kiedy chcesz wykorzystać JUnitParams
public class MoneyParameterizedTest { //Konwencja nazywania klas to JakasNazwaTest

    private static final Object[] getMoney() { //Wykorzystaj kiedy chcesz mieć wiele danych do testowania
        return new Object[] {
                new Object[] {10, "USD"},
                new Object[] {20, "EUR"}
        };
    }
    @Test //Oznacz metodę jako test
    @Parameters(method = "getMoney") //Wyznacza metodę, z której ma brać dane dla parametrów
    public void constructorShouldSetAmountAndCurrency(int amount, String currency) {
        Money money = new Money(amount, currency);

        assertEquals(amount, money.getAmount());
        assertEquals(currency, money.getCurrency());
    }
}
