package com.alokaza.tests.day5_testNG_intro_dropdowns;

import com.alokaza.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;
public class T3_RadioButton_cont {
    public static void main(String[] args) {
        //TC #2: Radiobutton handling
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to https://practice.alokaza.com/radio_buttons
        driver.get("https://practice.alokaza.com/radio_buttons");

        //Locate name='sports' radio buttons and store them in a List of Web Element

        clickAdVerifyRadioButton(driver,"sport","hockey");


    }
    private static void clickAdVerifyRadioButton(WebDriver driver,String nameAttribute,String idValue){
        List<WebElement> radioButtons = driver.findElements(By.name(nameAttribute));

        //Loop through the List of Webelement and select matching result "hockey"
        for (WebElement each : radioButtons) {
            String eachId = each.getAttribute("id");

            if (eachId.equals(idValue)) {
                each.click();
                System.out.println(eachId+ " is selected : " + each.isSelected());
                break;
            }
        }

    }

}
