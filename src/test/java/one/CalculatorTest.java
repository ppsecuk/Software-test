package one;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAddFirst3Second5Returns8 () {
        Calculator calculator = new Calculator();
        int actual = calculator.add(3,5);
        int expected = 8;
        assertTrue(actual == expected);
        assertEquals(expected, actual);
    }

    @Test
    public void testAddFirst5Second3Returns8 () {
        Calculator calculator = new Calculator();
        int actual = calculator.add(5,3);
        int expected = 8;
        assertTrue(actual == expected);
        assertEquals(expected, actual);
    }

    @Test
    public void testNegativeNumber () {
        Calculator calculator = new Calculator();
        int actual = calculator.add(-5,3);
        int expected = -2;
        assertTrue(actual == expected);
        assertEquals(expected, actual);
    }

    @Test
    public void testDivisionOnZero () {
        Calculator calculator = new Calculator();
        int actual = calculator.add(4,0);
        int expected = 4;
        assertTrue(actual == expected);
        assertEquals(expected, actual);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testDivideFirst2Second0Returns0(){
        Calculator calculator = new Calculator();
        calculator.divide(2,0);
    }

    @Test
    @Ignore
    public void name() {
    }
}