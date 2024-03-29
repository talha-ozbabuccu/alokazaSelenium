package com.alokaza.tests.day10_upload_actions_jsexecutor;

import com.alokaza.utilities.BrowserUtils;
import com.alokaza.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T6_JavascriptExecutor {

    @Test
    public void javascript_executer_test1(){

        //TC #6: Scroll using JavascriptExecutor
        //1- Open a chrome browser
        //2- Go to: https://practice.alokaza.com/infinite_scroll
        Driver.getDriver().get("https://practice.alokaza.com/infinite_scroll");

        //((JavascriptExecutor)Driver.getDriver()).executeScript("");

        //3- Use below JavaScript method and scroll
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        BrowserUtils.sleep(1);
        js.executeScript("window.scrollBy(0,750)");


        //a. 750 pixels down 10 times.
        //b. 750 pixels up 10 times
        //JavaScript method to use : window.scrollBy(0,0)
    }

}
