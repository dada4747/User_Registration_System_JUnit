package com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
    private static final String MOBILE_PATTERN = "^[0-9]{0,2}[ ][0-9]{10}";
    private static final String PASSWORD_PATTERN = "(?=.*[A-Z]+)(?=.*[0-9]+).{8,}";

    public boolean validateFirstName(String fName) throws UserResistrationException {
        return patternChecker(fName, NAME_PATTERN);
    }
    public boolean validateLastName(String lName) throws UserResistrationException {
        return patternChecker(lName, NAME_PATTERN);
    }
    public boolean validateEmailId(String emailId) throws UserResistrationException {
        return patternChecker(emailId, EMAIL_PATTERN);
    }
    public boolean validateMobileNum(String mobileNum) throws UserResistrationException {
        return patternChecker(mobileNum, MOBILE_PATTERN);
    }
    public boolean validatePassword(String password) throws UserResistrationException {
        return patternChecker(password, PASSWORD_PATTERN);
    }
    private boolean patternChecker(String input,String fieldPattern) throws UserResistrationException{
        Pattern pattern = Pattern.compile(fieldPattern);
        Matcher matcher = pattern.matcher(input);
        try {
            boolean result = matcher.matches();
            if (!result)
                throw new UserResistrationException(UserResistrationException.ExceptionType.ENTERED_INVALID, "Please give valid Entry");
            return result;
        }catch (NullPointerException exception){
            throw new UserResistrationException(UserResistrationException.ExceptionType.ENTERED_NULL, "Entry Should be not null ");
        }

    }
}