package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T1_Registration_Form {

    @Test
    public void resgistration_form_test(){
        //TC#1: Registration form confirmation
        //Note: Use JavaFaker OR read from configuration.properties file when possible.
        //1. Open browser
        //2. Go to website: https://practice.cydeo.com/registration_form
        //Driver.getDriver() ----> driver.get(url).
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        //Create JavaFaker object
        Faker faker=new Faker();

        //3. Enter first name
        WebElement inputFirstname=Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        inputFirstname.sendKeys(faker.name().firstName());

        //4. Enter last name
        WebElement inputLastname=Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastname.sendKeys(faker.name().lastName());

        //5. Enter username
        WebElement inputUsername=Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        //inputUsername.sendKeys(faker.name().username().replaceAll(".",""));
        inputUsername.sendKeys(faker.bothify("helpdesk###"));

        //6. Enter email address
        WebElement inputEmail = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));

        //7. Enter password
        //8. Enter phone number
        //9. Select a gender from radio buttons
        //10.Enter date of birth
        //11.Select Department/Office
        //12.Select Job Title
        //13.Select programming language from checkboxes
        //14.Click to sign up button
        //15.Verify success message “You’ve successfully completed registration.” is
        //displayed.
    }

}
