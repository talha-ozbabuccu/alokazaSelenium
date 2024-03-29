package com.alokaza.tests.day3_cssSelektor_xpath;

import com.alokaza.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {

    public static void main(String[] args) {

        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify "remember me" label text is as expected:
        //Expected: Remember me on this computer
        WebElement rememberLabel = driver.findElement(By.className("login-item-checkbox-label"));

        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel = rememberLabel.getText();

        if (actualRememberMeLabel.equalsIgnoreCase(expectedRememberMeLabel)){
            System.out.println("Label verification PASSED!");
        }else{
            System.out.println("Label verification FAILED!!!");
        }

        //4- Verify "forgot password" link text is as expected:
        //Expected: Forgot your password?
        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));

        String expectedForgotPasswordLinkText = "Forgot your password?";
        String actualForgotPasswordLinkText = forgotPasswordLink.getText();

        if (actualForgotPasswordLinkText.equalsIgnoreCase(expectedForgotPasswordLinkText)){
            System.out.println("Forgot password link verification PASSED!");
        }else{
            System.out.println("Forgot password link verification FAILED!!!");
        }

    //5- Verify "forgot password" href attribute`s value contains expected:
        //Expected: forgot_password=yes


    }








}
