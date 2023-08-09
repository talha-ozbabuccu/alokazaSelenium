package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.tests.base.TestBase;
import org.testng.annotations.Test;

public class T3_CRM_LOGIN extends TestBase {

    //TC #3: Login scenario
    @Test
    public void crm_login_test(){

        //2. Go to : http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");

        //3. Enter valid username

        //helpdesk1@cybertekschool.com UserUser
        //Helpdesk2@cybertekschool.com UserUser

        //4. Enter valid password
        //5. Click to `Log In` button
        //6. Verify title is as expected:
        //Expected: Portal
    }
}
