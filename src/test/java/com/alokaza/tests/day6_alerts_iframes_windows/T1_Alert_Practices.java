package com.alokaza.tests.day6_alerts_iframes_windows;

import com.alokaza.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practices {

    public WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        //2. Go to https://practice.cydeo.com/dropdown
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void alert_test1(){
        //Click to "Click for JS Alert" button
        WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        informationAlertButton.click();
        //To be able to click to Alert OK button we need to switch driver's focus to Alert itself.
        Alert alert = driver.switchTo().alert();
        //Click to OK button from the alert
        alert.accept();
        // Verify "You successfully  clicked an alert" text is displayed.
        WebElement resultText= driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(resultText.isDisplayed(),"Result text is not displayed.");
        String expectedText= "You successfully clicked an alert";
        String actualText= resultText.getText();
        Assert.assertEquals(actualText,expectedText,"Actual result is not as expected!!!");

    }


}
