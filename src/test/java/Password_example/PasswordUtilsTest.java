package Password_example;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordUtilsTest {

    @Test
    public void testValidatePasswordIsNull(){
        String password = null;
        boolean actual = PasswordUtils.validatePassword(password);
        assertFalse(actual);
    }

    @Test
    public void testValidatePasswordIsEmptyString(){
        String password = "";
        boolean actual = PasswordUtils.validatePassword(password);
        assertFalse(actual);
    }

    @Test
    public void testValidatePasswordHasMissingOneNumber(){
        String password = "abcdefg#1";
        boolean actual = PasswordUtils.validatePassword(password);
        assertFalse(actual);
    }

    @Test
    public void testValidatePasswordHasUpperCase(){
        String password = "ehfbwehfbwebhfew#1";
        boolean actual = PasswordUtils.validatePassword(password);
        assertFalse(actual);
    }

    @Test
    public void testValidatePasswordHasLowerCase(){
        String password = "ADWBDHW#1";
        boolean actual = PasswordUtils.validatePassword(password);
        assertFalse(actual);
    }

    @Test
    public void testValidatePasswordMissingSymbol(){
        String password = "ehfbwehfbwebhfew1A";
        boolean actual = PasswordUtils.validatePassword(password);
        assertFalse(actual);
    }

    @Test
    public void testValidateAllRulesMet(){
        String password = "ehfbwehfbwebhfewA5#";
        boolean actual = PasswordUtils.validatePassword(password);
        assertTrue(actual);
    }

    @Test
    public void testValidateIfLengthIsTooLong(){
        String password = "ehfbwehfbwebhfewAS#212d,edffffweffdsswe";
        boolean actual = PasswordUtils.validatePassword(password);
        assertFalse(actual);
    }

    @Test
    public void testValidateIfLengthIsTooLess(){
        String password = "Aw1#";
        boolean actual = PasswordUtils.validatePassword(password);
        assertFalse(actual);
    }

}