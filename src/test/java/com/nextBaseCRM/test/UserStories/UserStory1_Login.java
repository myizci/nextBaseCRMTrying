package com.nextBaseCRM.test.UserStories;

import com.nextBaseCRM.test.Utilities.Data;
import com.nextBaseCRM.test.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class UserStory1_Login {

WebDriver driver = Driver.setUpDriver();

@Test
    public void LoginTest(){
   driver.get(Data.url);
    WebElement loginbox = driver.findElement(By.xpath( "//input[@placeholder='Login']"));
    loginbox.sendKeys(Data.helpdesk7);
    WebElement passwordBox = driver.findElement(By.xpath("//input[@placeholder='Password']"));
    passwordBox.sendKeys(Data.password);
    WebElement rememberMe = driver.findElement(By.xpath("//input[@id='USER_REMEMBER']"));
    rememberMe.click();
    Assert.assertTrue(rememberMe.isSelected()); // Testing Remember Me Button
    WebElement button = driver.findElement(By.xpath("//input[@value='Log In']"));
    button.click();
    String expectedMaintitle = "(61) Portal";
    String actualMainTitle = driver.getTitle();
    Assert.assertEquals(expectedMaintitle,actualMainTitle,"Cannot reach the main page, FAIL"); // Testing if the main page title is a match

}

@Test
    public void forgotPasswordLink (){
    driver.get(Data.url);
    WebElement forgotPasswordLink = driver.findElement(By.xpath("//a[.='Forgot your password?']"));
    forgotPasswordLink.click();
    String expectedForgotPasswordTitle = "Get Password";
    String actualForgotPasswordTitle = driver.getTitle();

    Assert.assertEquals(expectedForgotPasswordTitle,actualForgotPasswordTitle,"Cannot reach forgot password link, FAILED");
    //Testing forgot password page title
}

}
