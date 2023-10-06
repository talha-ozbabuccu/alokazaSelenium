package com.alokaza.tests.day6_alerts_iframes_windows;

import com.alokaza.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T5_Windows_Practice {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        //2. Go to https://practice.alokaza.com/dropdown
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.alokaza.com/windows");
    }

    @Test
    public void multiple_window_test(){
        //Storing main page's window handle as string is
        //good practice for future re-usable purposes
        String mainHandle = driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);

        //Assert : Title is "Windows"
        String expectedTitle = "Windows";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);
        System.out.println("Title before click: " + actualTitle);
        //Click to: "Click Here" link
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();

        //Switch to new Window.
        Set<String> allWindowHandles =driver.getWindowHandles();

        for(String each: allWindowHandles){
            driver.switchTo().window(each);
            System.out.println("Current title while switching windows: "+ driver.getTitle());
        }

        //Assert: Title is "New Window"
        String expectedTitleAfterClick = "New Window";
        actualTitle= driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitleAfterClick);

        System.out.println("Title after click: " + actualTitle);
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
