package com.alokaza.tests.day10_upload_actions_jsexecutor;

import com.alokaza.utilities.BrowserUtils;
import com.alokaza.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Upload_Practice {

    @Test
    public void upload_test(){
        //TC #2 Upload Test
        //1. Go to https://practice.alokaza.com/upload
        Driver.getDriver().get("https://practice.alokaza.com/upload");

        //2. Find some small file from your computer, and get the path of it.
        String path= "C:\\Users\\Ozbabuccu\\Desktop\\t1.jpg";

        //3. Upload the file.
        WebElement fileUpload = Driver.getDriver().findElement(By.id("file-upload"));

        BrowserUtils.sleep(2);
        fileUpload.sendKeys(path);

        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));
        uploadButton.click();

        WebElement fileUploadedHeader = Driver.getDriver().findElement(By.tagName("h3"));

        //4. Assert:
        //-File uploaded text is displayed on the page
        Assert.assertTrue(fileUploadedHeader.isDisplayed());

    }

}
