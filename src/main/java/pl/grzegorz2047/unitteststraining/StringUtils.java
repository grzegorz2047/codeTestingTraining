package pl.grzegorz2047.unitteststraining;

import java.util.ArrayList;
import java.util.List;

/**
 * Plik stworzony przez grzegorz2047 19.02.2017.
 */
public class StringUtils {

    public static String reverse(String s) {
        StringBuilder reversed = new StringBuilder(s);
        return reversed.reverse().toString();
    }
}
