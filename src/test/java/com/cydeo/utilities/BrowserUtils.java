package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {
/*
In this class only general utility methods that are not related to some specific page
 */

    public void sleep(int second){
        second *=1000;
        try{
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }

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

}
