package pl.grzegorz2047.unitteststraining;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Plik stworzony przez grzegorz2047 19.02.2017.
 */
@RunWith(JUnitParamsRunner.class)
public class StringUtilsTest {


    public static Object[] getStringToReverse() {
        return new String[][]{
                {"Test"},
                {"ALA"},
                {""},
                {"TO jest moj test"}
        };
    }

    @Parameters(method = "getStringToReverse")
    @Test
    public static void reverse(String toBeReversed) throws Exception {
        String reversed = StringUtils.reverse(toBeReversed);
        assertEquals(toBeReversed.length(), reversed.length());
        assertEquals(new StringBuilder(reversed).reverse().toString(), toBeReversed);
    }

}