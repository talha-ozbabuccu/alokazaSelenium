package com.alokaza.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BrowserUtils {
/*
In this class only general utility methods that are not related to some specific page
 */

    public static void sleep(int second){
        second *=1000;
        try{
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }

    /*
    This method accepts 3 arguments.
    Arg1: webdriver
    Arg2: expectedInURL: for verify if the URL contains given argument
        - If condition matches, will break loop
     Arg3: expectedInTitle to be compared against actualTitle
     */
    public static void switchWindowAndVerify(WebDriver driver, String expectedInURL, String expectedInTitle){

        Set<String> allWindowHandles=driver.getWindowHandles();

        for (String each : allWindowHandles) {
            driver.switchTo().window(each);
            System.out.println("Current URL: "+driver.getCurrentUrl());
            if (driver.getCurrentUrl().contains(expectedInURL)){
                break;
            }
        }
        //Assert: Title contains "Etsy"
        String actualTitle=driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    /*
    This method accepts a String "expectedTitle" nad Asserts if it is true
     */
    public static void verifyTitle(WebDriver driver, String expectedTitle){
        Assert.assertEquals(driver.getTitle(),expectedTitle);
    }

    /*
    Creating a utility method for ExplicitWait so we don't have to repeat the lines
    */
    public static void waitForInvisibilityOf(WebElement webElement){
        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }
}
