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
        boolean result = userRegistration.valudateEmailId("abc.syz@bl.co.in");
        Assertions.assertTrue(result);
    }

}
