package pl.grzegorz2047.unitteststraining;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Plik stworzony przez grzegorz2047 19.02.2017.
 */

@RunWith(JUnitParamsRunner.class)
public class HashMapTest {

    private HashMap<Object, Object> hash;

    @Before
    public void instantiateNewHashMap() {
        hash = new HashMap<>();
    }

    public Object[] getValuesForHashMap() {
        return new Object[][]{
                {1, 2},
                {"1", "2"},
                {new Object(), new Object()},
                {null, null}
        };
    }

    @Parameters(method = "getValuesForHashMap")
    @Test
    public void whenYouPutYouShouldGetTheSame(Object key, Object value) {
        hash.put(key, value);
        assertEquals(value, hash.get(key));
    }


    @Parameters(method = "getValuesForHashMap")
    @Test
    public void whenYouPutObjectWithTheSameKeyItsBeingReplaced(Object key, Object value) {
        Object anotherObject = new Object();
        hash.put(key, value);
        hash.put(key, anotherObject);
        assertEquals(anotherObject, hash.get(key));
    }

    @Parameters(method = "getValuesForHashMap")
    @Test
    public void whenYouPutAndClearYouShouldNotHaveAnyObjectsInHashMap(Object key, Object value) {
        hash.put(key, value);
        hash.clear();
        assertEquals(0, hash.size());
    }

    @Test
    public void whenYouPutNullAsKeyAndThenGetItYouShouldReceiveObject() {
        Object object = new Object();
        hash.put(null, object);
        assertEquals(object, hash.get(null));
    }


}
