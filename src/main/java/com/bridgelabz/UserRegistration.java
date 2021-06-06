package com.bridgelabz;
import java.util.regex.Pattern;

public class UserRegistration {
           // UserFieldPattern regex;
    public boolean validateFirstName(String fName) {
        UserRegistrationIFun userRegistrationIFun = (namePattern, input) -> Pattern.matches(UserFieldPattern.NAME_PATTERN.patterns, input);
        boolean result = userRegistrationIFun.validate(UserFieldPattern.NAME_PATTERN.patterns, fName);
        customeException(fName, result);
        return result;
    }
    public boolean validateLastName(String lName) {
        UserRegistrationIFun userRegistrationIFun = (namePattern, input) -> Pattern.matches(UserFieldPattern.NAME_PATTERN.patterns, input);
        boolean result = userRegistrationIFun.validate(UserFieldPattern.NAME_PATTERN.patterns, lName);
        customeException(lName,result);
        return result;
    }
    public boolean validateEmailId(String emailId) {
        UserRegistrationIFun userRegistrationIFun = (emailPattern, input) -> Pattern.matches(UserFieldPattern.EMAIL_PATTERN.patterns, input);
        boolean result = userRegistrationIFun.validate(UserFieldPattern.EMAIL_PATTERN.patterns,emailId);
        customeException(emailId, result);
        return result;
    }
    public boolean validateMobileNum(String mobileNum) {
        UserRegistrationIFun userRegistrationIFun = (mobileNoPattern, input) -> Pattern.matches(UserFieldPattern.MOBILE_PATTERN.patterns, input);
        boolean result = userRegistrationIFun.validate(UserFieldPattern.MOBILE_PATTERN.patterns, mobileNum);
        customeException(mobileNum, result);
        return result;
    }
    public boolean validatePassword(String password) {
        UserRegistrationIFun userRegistrationIFun = (passwordPattern, input) -> Pattern.matches(UserFieldPattern.PASSWORD_PATTERN.patterns, input);
        boolean result = userRegistrationIFun.validate(UserFieldPattern.PASSWORD_PATTERN.patterns, password);
        customeException(password, result);
        return result;
    }
    public void customeException(String input, boolean result){
        try {
            if (result){
                System.out.println("You Entered Valid String....");
            }else if(input.isEmpty()){
                throw new UserResistrationException(UserResistrationException.ExceptionType.ENTERED_NULL);

            }
            else {
                throw new UserResistrationException(UserResistrationException.ExceptionType.ENTERED_INVALID);
            }
        }catch (UserResistrationException exception){
            System.out.println(exception.type.toString());
        }

    }
}