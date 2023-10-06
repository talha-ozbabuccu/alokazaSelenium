    package com.alokaza.tests.day11_actions_jsexecutor_practice;

    import com.alokaza.utilities.Driver;
    import org.openqa.selenium.By;
    import org.openqa.selenium.Keys;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.interactions.Actions;
    import org.testng.annotations.Test;

public class ActionsPractices {

    @Test
    public void task_4_and_5_test(){

        //TC #4: Scrool Practice
        //1. Open a edge browser
        //2. Go to: https://practice.alokaza.com/
        Driver.getDriver().get("https://practice.alokaza.com/");

        //3. Scroll down to "Powered by ALOKAZA"
        //Create object of  Actions  and pass our "driver" instance
        Actions actions= new Actions(Driver.getDriver());

        //Locating alokaza link to be able to pass in the actions method
        WebElement alokazaLink = Driver.getDriver().findElement(By.linkText("ALOKAZA"));

        //4- Scroll using actions class "moveTo(element)" method
        actions.moveToElement(alokazaLink).perform();

        // Scroll back up to "Home" link using PageUp button
        actions.sendKeys(Keys.PAGE_UP).perform();

        //Driver.getDriver().quit();
        Driver.closeDriver();
    }

    @Test
    public void test2(){
        Driver.getDriver().get("https://practice.alokaza.com/");
    }

}
