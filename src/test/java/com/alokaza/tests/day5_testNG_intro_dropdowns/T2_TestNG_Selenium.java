package com.alokaza.tests.day5_testNG_intro_dropdowns;

import com.alokaza.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T2_TestNG_Selenium {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
    @Test
    public void selenium_test(){

        driver.get("https://www.google.com.tr/  ");
        // Assert title is "Google"
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";

        Assert.assertEquals(actualTitle,expectedTitle,"Title is not matching");

    }
}
