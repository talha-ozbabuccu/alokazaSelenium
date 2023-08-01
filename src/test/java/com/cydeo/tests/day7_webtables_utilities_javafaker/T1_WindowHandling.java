package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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

        //Copy paste the lines from below into your class
        //Create a logic to switch to the tab where Etsy.com is open
        //Assert: Title contains "Etsy"
        //Lines to be pasted:
        //((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');")


    }


}
