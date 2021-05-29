package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
    private static final String MOBILE_PATTERN = "^[0-9]{0,2}[ ][0-9]{10}";
    private static final String PASSWORD_PATTERN = "(?=.*[A-Z]+)(?=.*[0-9]+).{8,}";

    public boolean validateFirstName(String fName) {
        return patternChecker(fName, NAME_PATTERN);
    }
    public boolean validateLastName(String lName){
        return patternChecker(lName, NAME_PATTERN);
    }
    public boolean validateEmailId(String emailId){
        return patternChecker(emailId, EMAIL_PATTERN);
    }
    public boolean validateMobileNum(String mobileNum){
        return patternChecker(mobileNum, MOBILE_PATTERN);
    }
    public boolean validatePassword(String password){
        return patternChecker(password, PASSWORD_PATTERN);
    }
    private boolean patternChecker(String input,String fieldPattern) {
        Pattern pattern = Pattern.compile(fieldPattern);
        Matcher matcher = pattern.matcher(input);
        boolean result = matcher.matches();
        return result;
    }
}