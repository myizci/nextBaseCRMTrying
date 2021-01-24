package com.nextBaseCRM.test.UserStories;

import com.nextBaseCRM.test.Utilities.Data;
import com.nextBaseCRM.test.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserStory2SendMessage {


    WebDriver driver = Driver.setUpDriver();

    @BeforeMethod
    public void setUp() {
        Data.Login();
        Data.implicitWait();
    }

    @Test
    public void SendMessage(){
        WebElement SendMessageArea = driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-message']/span[.='Message']"));
        SendMessageArea.sendKeys("Hi");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
