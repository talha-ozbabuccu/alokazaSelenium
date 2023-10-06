package com.alokaza.tests.day6_alerts_iframes_windows;

import com.alokaza.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {

     public WebDriver driver;

     @BeforeMethod
     public void setupMethod(){
         //2. Go to https://practice.alokaza.com/dropdown
         driver= WebDriverFactory.getDriver("chrome");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.get("https://practice.alokaza.com/dropdown");
     }

    @Test
    public void dropdown_task5() throws InterruptedException {

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

    @Test
    public void dropdown_task6(){
        //Select "DEcember1 , 1923" and verify it's selected. Select year using : visible text
        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        //Select year using: visible text
        yearDropdown.selectByVisibleText("1924");
        //Select month using : value attribute
        monthDropdown.selectByValue("11");
        //Select day using : index number
        dayDropdown.selectByIndex(0);

        //created expected values
        String expectedYear= "1924";
        String expectedMonth= "December";
        String expectedDay= "1";

        //getting actual values from browser
        String actualYear= yearDropdown.getFirstSelectedOption().getText();
        String actualMonth= monthDropdown.getFirstSelectedOption().getText();
        String actualDay= dayDropdown.getFirstSelectedOption().getText();

        //create assertions
        Assert.assertTrue(actualYear.equals(expectedYear));
        Assert.assertEquals(actualMonth,expectedMonth);
        Assert.assertEquals(actualDay,expectedDay);
     }

     @AfterMethod
    public void teardownMethod(){
         driver.close();
     }
}
