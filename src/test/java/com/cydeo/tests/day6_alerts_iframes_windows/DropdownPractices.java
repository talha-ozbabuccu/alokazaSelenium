package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {

    @Test
    public void dropdown_task5(){
        //  TC #5: Selecting state from State dropdown and verifing result 1. Open Chrome Browser
        //2. Go to https://practice.cydeo.com/dropdown
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");

        //3.Select Illinois
        //4.Select Virginia
        //5.Select California
        //6.Verify final selected option is California.
        //Use all select options. (visible text, value, index)
    }
}
