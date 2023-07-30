package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {

    @Test
    public void dropdown_task5() throws InterruptedException {
        //  TC #5: Selecting state from State dropdown and verifing result 1. Open Chrome Browser
        //2. Go to https://practice.cydeo.com/dropdown
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");

        Select stateDropdown= new Select(driver.findElement(By.xpath("//select[@id='state']")));
        //3.Select Illinois
        Thread.sleep(1000);
        stateDropdown.selectByVisibleText("Illinois");
        //4.Select Virginia
        stateDropdown.selectByValue("VA");
        //5.Select California
        stateDropdown.selectByIndex(5);
        //6.Verify final selected option is California.
        String expectedOptionText="California";
        String actualOptionText= stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText,expectedOptionText);

    }
}
