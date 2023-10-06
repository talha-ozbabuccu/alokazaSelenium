package com.alokaza.tests.day12_pom_design_explicit_wait;

import com.alokaza.pages.LibraryLoginPage;
import com.alokaza.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMPractices {

    LibraryLoginPage libraryLoginPage;

    @BeforeMethod
    public void setupMethod(){
        Driver.getDriver().get("https://library1.alokaza.com");
        libraryLoginPage=new LibraryLoginPage();
    }
    @Test
    public void required_field_error_message_test(){
        //TC #1: Required field error message test
        //1- Open a chrome browser
        //2- Go to: https://library1.alokaza.com

        //3- Do not enter any information
        //4- Click to “Sign in” button
        libraryLoginPage.signInButton.click();

        //5- Verify expected error is displayed:
        //Expected: This field is required.
        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void invalid_email_format_error_message_test(){
        //TC #2: Invalid email format error message test
        //1- Open a chrome browser
        //2- Go to: https://library1.alokaza.com

        //3- Enter invalid email format
        libraryLoginPage.inputUsername.sendKeys("sthwrong");
        libraryLoginPage.signInButton.click();

        //4- Verify expected error is displayed:
        //Expected: Please enter a valid email address.
        Assert.assertTrue(libraryLoginPage.enterValidEmailErrorMessage.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void library_negative_login(){
        //TC #3: Library negative login
        //1- Open a chrome browser
        //2- Go to: https://library1.alokaza.com

        //3- Enter incorrect username or incorrect password
        libraryLoginPage.inputUsername.sendKeys("sthwrong@sth");
        libraryLoginPage.inputPassword.sendKeys("sthwrong");
        libraryLoginPage.signInButton.click();

        //4- Verify title expected error is displayed:
        //Expected: Sorry, Wrong Email or Password
        Assert.assertTrue(libraryLoginPage.wrongEmailPasswordErrorMassage.isDisplayed());
        Driver.closeDriver();

    }
}
