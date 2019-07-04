package six;

import org.junit.Test;


import java.util.Arrays;

//import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.anyOf;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class AssertThatMatchers {

    @Test
    public void assertThatWithTwo(){
        int a = 1, b = 1;
        assertThat(a, is(b));
        assertThat(a, equalTo(b));
        assertThat(a, is(equalTo(b)));
    }

    @Test
    public void assertThatWithThree(){
        int a = 1, b = 1, c = 2;
        assertThat(a, anyOf(is(b), is(c)));
    }

    @Test
    public void testAssertThatHasItems(){
        assertThat(Arrays.asList("Java", "Kotlin", "Scala"),
                hasItems("Java", "Kotlin"));
    }

    @Test
    public void testAssertThatAnyOfContainsString(){
        assertThat("test", anyOf(is("testing"), containsString("est")));
    }
}
