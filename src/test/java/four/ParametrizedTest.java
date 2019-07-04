package four;

import one.Calculator;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class ParametrizedTest {
    @Parameterized.Parameters
    public static List<Integer[]> parameters(){
        return Arrays.asList(new Integer[][]{
                        {1, 1, 2},
                        {2, 4, 6},
                        {1, 6, 7},
                        {4, 1, 5}
                });
    }
    @Parameterized.Parameter()
    public int argument1;
    @Parameterized.Parameter(1)
    public int argument2;
    @Parameterized.Parameter(2)
    public int expectedResult;

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        int actual = calculator.add(argument1, argument2);
        assertEquals(expectedResult, actual);
    }
}
