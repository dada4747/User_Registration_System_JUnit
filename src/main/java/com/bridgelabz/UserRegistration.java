package com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
    private static final String MOBILE_PATTERN = "^[0-9]{0,2}[ ][0-9]{10}";
    private static final String PASSWORD_PATTERN = "(?=.*[A-Z]+)(?=.*[0-9]+).{8,}";


    public UserRegistrationIFun validateFirstName  = (fName) -> Pattern.matches(NAME_PATTERN, fName);
    public UserRegistrationIFun validateEmailId = (emailId) -> Pattern.matches(EMAIL_PATTERN, emailId);
    public UserRegistrationIFun validateMobileNum = (mobileNum) -> Pattern.matches(MOBILE_PATTERN, mobileNum);
    public UserRegistrationIFun validatePassword = (password) -> Pattern.matches(PASSWORD_PATTERN, password);
    public UserRegistrationIFun validateLastName = (lName) -> Pattern.matches(NAME_PATTERN, lName);

    public void checkException(boolean result) throws UserResistrationException {
        try {
            if (result == false)
                throw new UserResistrationException(UserResistrationException.ExceptionType.ENTERED_INVALID, "Please give valid Entry");
        }catch (UserResistrationException exception){
            throw new UserResistrationException(UserResistrationException.ExceptionType.ENTERED_NULL, "Entry Should be not null ");
        }
    }
}