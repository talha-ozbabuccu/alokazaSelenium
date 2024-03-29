package com.alokaza.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_AlokazaVerifications {

    /*
    IN THIS CLASS WE ARE SOLVING THE DAY2_Veifications

    */
    public static void main(String[] args) {

        //TC    #1: Alokaza practice tool verifications
        //1. Open chrome brewser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();


        //2. Go to https://paractice.alokaza.com
        driver.navigate().to("https://practice.alokaza.com");

        //3. Verify URL contains
        //Expected: alokaza
        String expectedURL="alokaza";
        String actualURL= driver.getCurrentUrl();

        if (actualURL.contains(expectedURL)) {
            System.out.println("Url verification Passed!");
        }else{
            System.out.println("URL verification FAILED!!!");
        }


        //4. Verify title:
        //Expected: Practice
        String expectedTitle="Practice";
        String actualTitle= driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else {
            System.out.println("Title verification FAILED");
        }

        driver.close();



    }
}
