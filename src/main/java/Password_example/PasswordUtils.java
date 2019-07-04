package Password_example;

public class PasswordUtils {

    private static final String VALID_PASSWORD_REGEX = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%=:\\?]).{6,8})";

    public static boolean validatePassword(String password){
        return (password != null && password.matches(VALID_PASSWORD_REGEX));
    }
}
