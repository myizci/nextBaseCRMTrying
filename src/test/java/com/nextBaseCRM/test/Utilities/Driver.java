package com.nextBaseCRM.test.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private static WebDriver chromeDriver;

    public static WebDriver setUpDriver(){
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        return chromeDriver;
    }

    public static WebDriver getDriver(){

        return chromeDriver;
    }

    public static void navigateToURL(String url){
        chromeDriver.get(url);
    }

    public static void implicitWait(){

        chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
