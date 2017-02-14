package com.seleniumXPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

/**
 * Created by agab on 1/30/2017.
 */
public class BaseSetup {
    private WebDriver driver;
    private String baseUrl = "http://www.seleniumhq.org/download/";
    public WebDriver getDriver(){
        return driver;
    }
    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
