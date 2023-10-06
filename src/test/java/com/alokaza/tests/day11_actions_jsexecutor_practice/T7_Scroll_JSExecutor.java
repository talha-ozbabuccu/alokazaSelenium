package com.alokaza.tests.day11_actions_jsexecutor_practice;

import com.alokaza.utilities.BrowserUtils;
import com.alokaza.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_Scroll_JSExecutor {

    @Test
    public void task7_scroll_test(){
        //TC #7: Scroll using JavascriptExecutor
        //1- Open a chrome browser
        //2- Go to: https://practice.alokaza.com/large
        Driver.getDriver().get("https://practice.alokaza.com/large");

        WebElement alokazaLink= Driver.getDriver().findElement(By.linkText("ALOKAZA"));
        WebElement homeLink= Driver.getDriver().findElement(By.linkText("Home"));

        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        //3- Scroll down to “Alokaza” link
        BrowserUtils.sleep(2);
        js.executeScript("arguments[0].scrollIntoView(true)", alokazaLink);

        //4- Scroll up to “Home” link
        BrowserUtils.sleep(2);
        js.executeScript("arguments[1].scrollIntoView(true)", alokazaLink, homeLink);

        //5- Use below provided JS method only
        //JavaScript method to use : arguments[0].scrollIntoView(true)
        //Note: You need to locate the links as web elements and pass them as
        //arguments into executeScript() method


    }

}
