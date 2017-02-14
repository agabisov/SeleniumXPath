package com.seleniumXPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by agab on 1/30/2017.
 */
public class SetupProperties {
    private WebDriver driver;
    public SetupProperties(WebDriver driver){
        this.driver = driver;
    }

    //////////////////Language locators////////////////////////
    By locatorForJava = By.xpath(".//*[@id='mainContent']/table[1]/tbody/tr[1]/td[4]/a");
    By locatorForC = By.xpath(".//*[@id='mainContent']/table[1]/tbody/tr[2]/td[4]/a");
    By locatorForRuby = By.xpath(".//*[@id='mainContent']/table[1]/tbody/tr[3]/td[4]/a");
    By locatorForPython = By.xpath(".//*[@id='mainContent']/table[1]/tbody/tr[4]/td[4]/a");
    By locatorForJavaScript = By.xpath(".//*[@id='mainContent']/table[1]/tbody/tr[5]/td[4]/a");

    //////////////////Browser locators/////////////////////////
    By locatorMozilla = By.xpath(".//*[@id='mainContent']/table[2]/tbody/tr[1]/td[1]/a");
    By locatorChromeDriver = By.xpath(".//*[@id='mainContent']/table[2]/tbody/tr[2]/td[1]/a");
    By locatorOpera = By.xpath(".//*[@id='mainContent']/table[2]/tbody/tr[3]/td[1]/a");
    By locatorGhostDriver = By.xpath(".//*[@id='mainContent']/table[2]/tbody/tr[4]/td[1]/a");
    By locatorMsEdgeDriver = By.xpath(".//*[@id='mainContent']/table[2]/tbody/tr[5]/td[1]/a");
    By locatorSafari = By.xpath(".//*[@id='mainContent']/table[2]/tbody/tr[6]/td[1]/a");
    By locatorWP = By.xpath(".//*[@id='mainContent']/table[2]/tbody/tr[8]/td[1]/a");
    By locatorSelendroid = By.xpath(".//*[@id='mainContent']/table[2]/tbody/tr[9]/td[1]/a");
    By locatorIOSDriver = By.xpath(".//*[@id='mainContent']/table[2]/tbody/tr[10]/td[1]/a");
    By locatorBlackBerry = By.xpath(".//*[@id='mainContent']/table[2]/tbody/tr[11]/td[1]/a");
    By locatorAppium = By.xpath(".//*[@id='mainContent']/table[2]/tbody/tr[12]/td[1]/a");
    By locatorCrossWalk = By.xpath(".//*[@id='mainContent']/table[2]/tbody/tr[13]/td[1]/a");
    By locatorQtWebDriver = By.xpath(".//*[@id='mainContent']/table[2]/tbody/tr[14]/td[1]/a");
    By locatorJBrowserDriver = By.xpath(".//*[@id='mainContent']/table[2]/tbody/tr[15]/td[1]/a");
    By locatorWiniumDesktop = By.xpath(".//*[@id='mainContent']/table[2]/tbody/tr[16]/td[1]/a");
    By locatorWiniumStoreApps = By.xpath(".//*[@id='mainContent']/table[2]/tbody/tr[17]/td[1]/a");
    By locatorStoreAppsCodedUI = By.xpath(".//*[@id='mainContent']/table[2]/tbody/tr[18]/td[1]/a");



    //////////////////Language Funcs/////////////////////////

    public void downloadJava(){
        String test = driver.findElement(locatorForJava).getAttribute("href");
        System.out.println("javaUrl = "+test);
    }
    public void downloadC(){
        String test = driver.findElement(locatorForC).getAttribute("href");
        System.out.println("cUrl = "+test);
    }
    public void downloadRuby(){
        String test = driver.findElement(locatorForRuby).getAttribute("href");
        System.out.println("rubyUrl = "+test);
    }
    public void downloadPython(){
        String test = driver.findElement(locatorForPython).getAttribute("href");
        System.out.println("pythonUrl = "+test);
    }
    public void downloadJavaScript(){
        String test = driver.findElement(locatorForJavaScript).getAttribute("href");
        System.out.println("javaScriptUrl = "+test);
    }


    //////////////////Browser Funcs/////////////////////////
    public void browserMozilla(){
        String test = driver.findElement(locatorMozilla).getAttribute("href");
        System.out.println("browserMozilla = "+test);
    }
    public void browserChromeDriver(){
        String test = driver.findElement(locatorChromeDriver).getAttribute("href");
        System.out.println("browserChromeDriver = "+test);
    }
    public void browserOpera(){
        String test = driver.findElement(locatorOpera).getAttribute("href");
        System.out.println("browserOpera = "+test);
    }
    public void browserGhostDriver(){
        String test = driver.findElement(locatorGhostDriver).getAttribute("href");
        System.out.println("browserGhostDriver = "+test);
    }
    public void browserMsEdgeDriver(){
        String test = driver.findElement(locatorMsEdgeDriver).getAttribute("href");
        System.out.println("browserMsEdgeDriver = "+test);
    }
    public void browserSafari(){
        String test = driver.findElement(locatorSafari).getAttribute("href");
        System.out.println("browserSafari = "+test);
    }
    public void browserWP(){
        String test = driver.findElement(locatorWP).getAttribute("href");
        System.out.println("browserWP = "+test);
    }
    public void browserSelendroid(){
        String test = driver.findElement(locatorSelendroid).getAttribute("href");
        System.out.println("browserSelendroid = "+test);
    }
    public void browserIOSDriver(){
        String test = driver.findElement(locatorIOSDriver).getAttribute("href");
        System.out.println("browserIOSDriver = "+test);
    }
    public void browserBlackBerry(){
        String test = driver.findElement(locatorBlackBerry).getAttribute("href");
        System.out.println("browserBlackBerry = "+test);
    }
    public void browserAppium(){
        String test = driver.findElement(locatorAppium).getAttribute("href");
        System.out.println("browserAppium = "+test);
    }
    public void browserCrossWalk(){
        String test = driver.findElement(locatorCrossWalk).getAttribute("href");
        System.out.println("browserCrossWalk = "+test);
    }
    public void browserQtWebDriver(){
        String test = driver.findElement(locatorQtWebDriver).getAttribute("href");
        System.out.println("browserQtWebDriver = "+test);
    }
    public void browserJBrowserDriver(){
        String test = driver.findElement(locatorJBrowserDriver).getAttribute("href");
        System.out.println("browserJBrowserDriver = "+test);
    }public void browserWiniumDesktop(){
        String test = driver.findElement(locatorWiniumDesktop).getAttribute("href");
        System.out.println("browserWiniumDesktop = "+test);
    }
    public void browserWiniumStoreApps(){
        String test = driver.findElement(locatorWiniumStoreApps).getAttribute("href");
        System.out.println("browserWiniumStoreApps = "+test);
    }
    public void browserStoreAppsCodedUI(){
        String test = driver.findElement(locatorStoreAppsCodedUI).getAttribute("href");
        System.out.println("browserStoreAppsCodedUI = "+test);
    }

}
