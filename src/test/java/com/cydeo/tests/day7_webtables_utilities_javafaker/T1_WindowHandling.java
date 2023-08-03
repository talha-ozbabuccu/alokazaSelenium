package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T1_WindowHandling {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void window_handling_test(){
        //Go to : https://www.amazon.com
        driver.get("https://www.amazon.com");

        //Copy and paste the lines from below into your class
        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");

        //Create a logic to switch to the tab where Etsy.com is open
        Set<String>allWindowHandles=driver.getWindowHandles();
        for (String each : allWindowHandles) {
            driver.switchTo().window(each);
            System.out.println("Current URL: "+driver.getCurrentUrl());
            if (driver.getCurrentUrl().contains("etsy")){
                break;
            }
        }
        //Assert: Title contains "Etsy"
        String actualTitle=driver.getTitle();
        String expectedInTitle= "Etsy";
        Assert.assertTrue(actualTitle.contains(expectedInTitle));

        //Assert.assertTrue(driver.getTitle().contains("Etsy"));
        //Lines to be pasted:

    }


}
