package com.example.android.testingexample.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by mac on 5/1/16.
 */
public class EmailValidator {

    /**
     * Email validation is a very frequent requirement in many applications. Basically the main policy that email format follows is that it:
     * - Has to start with characters, digits or ‘_’, ‘-‘, ‘+’ symbols
     * - The above group can be followed with a ‘.’ and the same pattern as the first group.
     * - Then it must have exactly one ‘@’ character.
     * - The domain name must start with characters, digits and the ‘-‘ character.
     * - Then it must be followed by a ‘.’.
     * - After the ‘.’ you can have characters and digits.
     * - Optionally you  can have a second level Top Level Domain that can start
     */
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
    private static Matcher matcher;


    public static boolean isValidEmail(String email) {
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

}
