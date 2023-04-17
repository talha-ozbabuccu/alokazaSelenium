package com.cydeo.tests.day3_cssSelektor_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_locators_getText {

    public static void main(String[] args) {
        //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a Chrome browser
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver= new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");


        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Enter incorrect username: "incorrect"
        //driver.findElement(By.className("login-inp")).sendKeys("incorrect");
        WebElement inputUsername= driver.findElement(By.className("login-inp"));

    }
}
