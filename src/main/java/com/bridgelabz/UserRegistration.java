package com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}";
    public boolean validateFirstName(String fName) {
        return patternChecker(fName, NAME_PATTERN);
    }
    public boolean validateLastName(String lName){
        return patternChecker(lName, NAME_PATTERN);
    }


    private boolean patternChecker(String input,String fieldPattern) {
        Pattern pattern = Pattern.compile(fieldPattern);
        Matcher matcher = pattern.matcher(input);
        boolean result = matcher.matches();
        return result;
    }
}