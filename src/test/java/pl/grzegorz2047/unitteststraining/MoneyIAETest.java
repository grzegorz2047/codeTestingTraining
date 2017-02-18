package pl.grzegorz2047.unitteststraining;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Objects;

/**
 * Plik stworzony przez grzegorz2047 18.02.2017.
 */
@RunWith(JUnitParamsRunner.class)
public class MoneyIAETest {

    private final static int VALID_AMOUNT = 5;
    private final static String VALID_CURRENCY = "USD";

    private static final Object[] getInvalidAmount() {
        return new Integer[][]{ //Tablica integerow, w każda tablica jest innym przypadkiem, gdzie mamy jeden parametr
                {-12387},
                {-5},
                {-1}
        };
    }

    @Test(expected = IllegalArgumentException.class) //Test przejdzie, kiedy wykona się ustalony wyjątek
    @Parameters(method = "getInvalidAmount") //Bierz parametr z metody
    public void constructorShouldThrowAEForInvalidAmount(int invalidAmount) {
        new Money(invalidAmount, VALID_CURRENCY); //Wywolaj specjalnie wyjątek
    }

    private static final Object[] getInvalidCurrency() {
        return new String[][]{{null}, {""}};
    }

    @Test(expected = IllegalArgumentException.class)
    @Parameters(method = "getInvalidCurrency")
    public void constructorShouldThrowIAEForInvalidCurrency(String invalidCurrency) {
        new Money(VALID_AMOUNT, invalidCurrency);
    }


}
