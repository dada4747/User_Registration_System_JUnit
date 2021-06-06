package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;
public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    @Test
    public void givenFirstName_WhenFirstLetterUpperCase_ShouldReturnTrue() {
    boolean output = userRegistration.validateFirstName("Rahul");
        Assert.assertEquals(true, output);
    }
    @Test
    public void givenFirstName_WhenEntryFieldNull_shouldReturnFalse(){
        boolean output = userRegistration.validateFirstName("");
        Assert.assertEquals(false, output);
    }
    @Test
    public void givenFirstName_WhenLessThanThreeChars_ShouldReturnFalse() {
        boolean output = userRegistration.validateFirstName("Ra");
        Assert.assertEquals(false,output);
    }
    @Test
    public void givenFirstName_WhenHasNumber_ShouldReturnFalse() {
        boolean output = userRegistration.validateFirstName("Rahu1");
        Assert.assertEquals(false, output);
    }

    @Test
    public void givenFirstName_WhenHasSpecialChar_ShouldReturnFalse() {
        boolean output = userRegistration.validateFirstName("Rahul@");
        Assert.assertEquals(false,output);
    }
    @Test
    public void givenLastName_WhenFirstLetterUpperCase_ShouldReturnTrue(){
        boolean output = userRegistration.validateLastName("Adsure");
        Assert.assertEquals(true, output);
    }
    @Test
    public void givenLastName_WhenLessThanThreeChars_ShouldReturnFalse() {
        boolean output = userRegistration.validateFirstName("Ad");
        Assert.assertEquals(false,output);

    }
    @Test
    public void givenLastName_WhenHasNumber_ShouldReturnFalse() {
        boolean output =  userRegistration.validateFirstName("Adsure1");
        Assert.assertEquals(false,output);

    }
    @Test
    public void givenLastName_WhenHasSpecialChar_ShouldReturnFalse() {
        boolean output = userRegistration.validateFirstName("Adsure@");
        Assert.assertEquals(false,output);

    }
    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue(){
        boolean output = userRegistration.validateEmailId("abc.syz@bl.co.in");
        Assert.assertEquals(true, output);

    }
    @Test
    public void givenMobileNum_WhenSpaceIsMentioned_ShouldReturnTrue(){
        boolean output = userRegistration.validateMobileNum("91 9960077482");
        Assert.assertEquals(true, output);

    }
    @Test
    public void givenMobileNum_WhenSpaceNotMentioned_ShouldReturnFalse() {
        boolean output = userRegistration.validateMobileNum("919960077482");
        Assert.assertEquals(false, output);

    }
    @Test
    public void givenMobileNum_WhenLessDigits_ShouldReturnFalse() {
        boolean output = userRegistration.validateMobileNum("9960077482");
        Assert.assertEquals(false,output);

    }
    @Test
    public void givenMobileNum_WhenNotStartWith91_ShouldReturnFalse() {
        boolean output = userRegistration.validateMobileNum("1234507748");
        Assert.assertEquals(false,output);

    }
    @Test
    public void givenPassword_WhenMin8Chars_ShouldReturnTrue() {
        boolean output = userRegistration.validatePassword("nDj1k2*jf");
        Assert.assertEquals(true, output);

    }
    @Test
    public void givenPassword_WhenHasLessChars_ShouldReturnFalse() {
        boolean output = userRegistration.validatePassword("Kd1%f");
        Assert.assertEquals(false,output);

    }
    @Test
    public void givenPassword_WhenAtleast1UpperCase_ShouldReturnTrue() {
        boolean output = userRegistration.validatePassword("3Rmdg*nK");
        Assert.assertEquals(true,output);

    }
    @Test
    public void givenPassword_WhenAtleast1Number_ShouldReturnTrue() {
        boolean output = userRegistration.validatePassword("Mas1bt&Bx");
        Assert.assertEquals(true, output);

    }
    @Test
    public void givenPassword_WhenNoNumeric_ShouldReturnFalse() {
        boolean output = userRegistration.validatePassword("mDkk%fDB");
        Assert.assertEquals(false,output);

    }
    @Test
    public void givenPassword_WhenHasExact1SpecialChar_ShouldReturnTrue() {
        boolean output = userRegistration.validatePassword("mDkk%fD1");
        Assert.assertEquals(true,output);

    }
    @Test
    public void givenPassword_WhenNoSpecialChar_ShouldReturnFalse() {
        boolean output = userRegistration.validatePassword("Rahul1ds");
        Assert.assertEquals(false,output);

    }
    @Test
    public void givenPassword_WhenHasMoreThan1SpecialChar_ShouldReturnFalse() {
        boolean output = userRegistration.validatePassword("Rahul12#@");
        Assert.assertEquals(false,output);

    }
}