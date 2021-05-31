package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    @Test
    public void givenFirstName_WhenFirstLatterUpperCase_ShouldReturnTrue() throws UserResistrationException {
        boolean result = userRegistration.validateFirstName.validate("Rahul");
        Assertions.assertTrue(result);
        userRegistration.checkException(result);
    }
    @Test
    public void givenFirstName_WhenEntryFieldNull_shouldReturnFalse() throws UserResistrationException {
        boolean result = (userRegistration.validateFirstName.validate(""));
        Assertions.assertFalse(result);
//        userRegistration.checkException(result);
    }
    @Test
    public void givenFirstName_WhenLessThanThreeChars_ShouldReturnFalse() throws UserResistrationException {
        boolean result = (userRegistration.validateFirstName.validate("Ra"));
        Assertions.assertFalse(result);
//        userRegistration.checkException(result);
    }
    @Test
    public void givenFirstName_WhenHasNumber_ShouldReturnFalse() throws UserResistrationException {
        boolean result = (userRegistration.validateFirstName.validate("Rahu1"));
        Assertions.assertFalse(result);
//        userRegistration.checkException(result);
    }
    @Test
    public void givenFirstName_WhenHasSpecialChar_ShouldReturnFalse() throws UserResistrationException {
        boolean result = userRegistration.validateFirstName.validate("Rahul@");
        Assertions.assertFalse(result);
//        userRegistration.checkException(result);
    }
    @Test
    public void givenLastName_WhenFirstLetterUpperCase_ShouldReturnTrue() throws UserResistrationException {
        boolean result = userRegistration.validateLastName.validate("Adsure");
        Assertions.assertTrue(result);
        userRegistration.checkException(result);
    }
    @Test
    public void givenLastName_WhenLessThanThreeChars_ShouldReturnFalse() throws UserResistrationException {
        boolean result = userRegistration.validateFirstName.validate("Ad");
        Assertions.assertFalse(result);
//        userRegistration.checkException(result);
    }
    @Test
    public void givenLastName_WhenHasNumber_ShouldReturnFalse() throws UserResistrationException {
        boolean result = userRegistration.validateFirstName.validate("Adsure1");
        Assertions.assertFalse(result);
//        userRegistration.checkException(result);
    }
    @Test
    public void givenLastName_WhenHasSpecialChar_ShouldReturnFalse() throws UserResistrationException {
        boolean result = userRegistration.validateFirstName.validate("Adsure@");
        Assertions.assertFalse(result);
//        userRegistration.checkException(result);
    }
    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() throws UserResistrationException {
        boolean result = userRegistration.validateEmailId.validate("abc.syz@bl.co.in");
        Assertions.assertTrue(result);
        userRegistration.checkException(result);
    }
    @Test
    public void givenMobileNum_WhenSpaceIsMentioned_ShouldReturnTrue() throws UserResistrationException {
        boolean result =  userRegistration.validateMobileNum.validate("91 9960077482");
        Assertions.assertTrue(result);
        userRegistration.checkException(result);
    }
    @Test
    public void givenMobileNum_WhenSpaceNotMentioned_ShouldReturnFalse() throws UserResistrationException {
        boolean result = userRegistration.validateMobileNum.validate("919960077482");
        Assertions.assertFalse(result);
//        userRegistration.checkException(result);
    }
    @Test
    public void givenMobileNum_WhenLessDigits_ShouldReturnFalse() throws UserResistrationException {
        boolean result = userRegistration.validateMobileNum.validate("9960077482");
        Assertions.assertFalse(result);
//        userRegistration.checkException(result);
    }

    @Test
    public void givenMobileNum_WhenNotStartWith91_ShouldReturnFalse() throws UserResistrationException {
        boolean result = userRegistration.validateMobileNum.validate("1234507748");
        Assertions.assertFalse(result);
//        userRegistration.checkException(result);
    }
    @Test
    public void givenPassword_WhenMin8Chars_ShouldReturnTrue() throws UserResistrationException {
        boolean result = userRegistration.validatePassword.validate("nDj1k2*jf");
        Assertions.assertTrue(result);
        userRegistration.checkException(result);
    }
    @Test
    public void givenPassword_WhenHasLessChars_ShouldReturnFalse() throws UserResistrationException {
        boolean result = userRegistration.validatePassword.validate("Kd1%f");
        Assertions.assertFalse(result);
//        userRegistration.checkException(result);
    }
    @Test
    public void givenPassword_WhenAtleast1UpperCase_ShouldReturnTrue() throws UserResistrationException {
        boolean result = userRegistration.validatePassword.validate("3Rmdg*nK");
        Assertions.assertTrue(result);
        userRegistration.checkException(result);
    }
    @Test
    public void givenPassword_WhenAtleast1Number_ShouldReturnTrue() throws UserResistrationException {
        boolean result = userRegistration.validatePassword.validate("Mas1bt&Bx");
        Assertions.assertTrue(result);
        userRegistration.checkException(result);
    }
    @Test
    public void givenPassword_WhenNoNumeric_ShouldReturnFalse() throws UserResistrationException {
        boolean result = userRegistration.validatePassword.validate("mDkk%fDB");
        Assertions.assertFalse(result);
//        userRegistration.checkException(result);
    }
    @Test
    public void givenPassword_WhenHasExact1SpecialChar_ShouldReturnTrue() throws UserResistrationException {
        boolean result = userRegistration.validatePassword.validate("mDkk%fD1");
        Assertions.assertTrue(result);
        userRegistration.checkException(result);
    }
    @Test
    public void givenPassword_WhenNoSpecialChar_ShouldReturnFlase() throws UserResistrationException {
        boolean result = userRegistration.validatePassword.validate("mDkkfD12");
//        Assertions.assertFalse(result);
        userRegistration.checkException(result);
    }
    @Test
    public void givenPassword_WhenHasMoreThan1SpecialChar_ShouldReturnFalse() throws UserResistrationException {
        boolean result = userRegistration.validatePassword.validate("mDkkf#D1");
        Assertions.assertFalse(result);
//        userRegistration.checkException(result);
    }
}
