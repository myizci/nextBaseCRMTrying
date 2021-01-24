package com.nextBaseCRM.test.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Data {

    static WebDriver driver = Driver.setUpDriver();
    public static final String url = "https://login2.nextbasecrm.com/";

    //Log Elements
    String loginBoxXpath = "//input[@placeholder='Login']";
    String passWordBoxXpath = "//input[@placeholder='Password']";
    String loginButtonXpath = "//input[@value='Log In']";
    String avatarCSS = "div[id='user-block']>span";
    String LogOutXpath = "//span[contains(text(),'Log out')]";

    //Credentials

    public static final String hr7 = "hr7@cybertekschool.com";
    public static final String hr8 = "hr8@cybertekschool.com";
    public static final String helpdesk7 = "helpdesk7@cybertekschool.com";
    public static final String helpdesk8 = "helpdesk8@cybertekschool.com";
    public static final String marketing7 = "marketing7@cybertekschool.com";
    public static final String marketing8 = "marketing8@cybertekschool.com";
    public static final String password = "UserUser";

    public static void Login(){
        driver.get(Data.url);
        WebElement loginbox = driver.findElement(By.xpath( "//input[@placeholder='Login']"));
        loginbox.sendKeys(Data.helpdesk7);
        WebElement passwordBox = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passwordBox.sendKeys(Data.password);
        WebElement rememberMe = driver.findElement(By.xpath("//input[@id='USER_REMEMBER']"));
        rememberMe.click();
        WebElement button = driver.findElement(By.xpath("//input[@value='Log In']"));
        button.click();

    }

    public static void implicitWait(){
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

}
