package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    @Test
    public void givenFirstName_WhenFirstLatterUpperCase_ShouldReturnTrue() {
        boolean result = userRegistration.validateFirstName("Rahul");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenLessThanThreeChars_ShouldReturnFalse() {
        boolean result = userRegistration.validateFirstName("Ra");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenHasNumber_ShouldReturnFalse() {
        boolean result = userRegistration.validateFirstName("Rahu1");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenHasSpecialChar_ShouldReturnFalse() {
        boolean result = userRegistration.validateFirstName("Rahul@");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenLastName_WhenFirstLetterUpperCase_ShouldReturnTrue(){
        boolean result = userRegistration.validateLastName("Adsure");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenLessThanThreeChars_ShouldReturnFalse() {
        boolean result = userRegistration.validateFirstName("Ad");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenHasNumber_ShouldReturnFalse() {
        boolean result = userRegistration.validateFirstName("Adsure1");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenHasSpecialChar_ShouldReturnFalse() {
        boolean result = userRegistration.validateFirstName("Adsure@");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.validateEmailId("abc.syz@bl.co.in");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenMobileNum_WhenSpaceIsMentioned_ShouldReturnTrue(){
        boolean result = userRegistration.validateMobileNum("91 9960077482");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenMobileNum_WhenSpaceNotMentioned_ShouldReturnFalse() {
        boolean result = userRegistration.validateMobileNum("919960077482");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenMobileNum_WhenLessDigits_ShouldReturnFalse() {
        boolean result = userRegistration.validateMobileNum("9960077482");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenMobileNum_WhenNotStartWith91_ShouldReturnFalse() {
        boolean result = userRegistration.validateMobileNum("1234507748");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenPassword_WhenMin8Chars_ShouldReturnTrue() {
        boolean result = userRegistration.validatePassword("nDj1k2*jf");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenHasLessChars_ShouldReturnFalse() {
        boolean result = userRegistration.validatePassword("Kd1%f");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenPassword_WhenAtleast1UpperCase_ShouldReturnTrue() {
        boolean result = userRegistration.validatePassword("3Rmdg*nK");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenAtleast1Number_ShouldReturnTrue() {
        boolean result = userRegistration.validatePassword("Mas1bt&Bx");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenNoNumeric_ShouldReturnFalse() {
        boolean result = userRegistration.validatePassword("mDkk%fDB");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenPassword_WhenHasExact1SpecialChar_ShouldReturnTrue() {
        boolean result = userRegistration.validatePassword("mDkk%fD1");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenNoSpecialChar_ShouldReturnFlase() {
        boolean result = userRegistration.validatePassword("mDkkfD12");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenPassword_WhenHasMoreThan1SpecialChar_ShouldReturnFalse() {
        boolean result = userRegistration.validatePassword("mDkk%f#D1");
        Assertions.assertFalse(result);
    }
}
