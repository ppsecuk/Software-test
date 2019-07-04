package two;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class AssertArrayEquals {

    @Test
    public void whenAssertingArraysEquality_thenEqual(){
        char[] expected = {'J','u','n','i','t'};
        char[] actual = "Junit".toCharArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void whenAssertArrayEquals_thenEqual() {
        String[] expectedArray = {"one","two","three"};
        assertArrayEquals(expectedArray,new String[]{"one","two","three"});
    }
}
