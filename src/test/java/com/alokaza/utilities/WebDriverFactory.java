package com.alokaza.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/*
//TASK: NEW METHOD CREATION
  Method name : getDriver
  Static method
  Accepts string arg: browserType
    - This arg will determine what type of browser is opened
    -if "chrome" passed --> it will open Chrome browser
    -if "firefox" passed --> it will open firefox browser
    RETURN TYPE: "Webdriver"
 */
public class WebDriverFactory {

    public static WebDriver getDriver(String browserType){

        if (browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();

        }else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();

        }else if (browserType.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();

        }


         else {
            System.out.println("Given browser type does not exist/or is not currently supported");
            System.out.println("Driver=null");
            return null;
        }


    }

}
