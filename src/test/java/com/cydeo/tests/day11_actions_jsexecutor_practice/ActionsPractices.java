package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.testng.annotations.Test;

public class ActionsPractices {

    @Test
    public void task_4_and_5_test(){

        //TC #4: Scrool Practice
        //1. Open a chrome browser
        //2. Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");

        //3. Scroll down to "Powered by CYDEO"
        //4- Scroll using actions class "moveTo(element)" method


    }

}
