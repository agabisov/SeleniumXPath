package com.seleniumXPath;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

/**
 * Created by agab on 1/30/2017.
 */
public class SeleniumXPathTest extends BaseSetup {

    /////////Language Tests////////////
    @Test
    public void testJavaLink(){
        SetupProperties setupProperties = new SetupProperties(getDriver());
        setupProperties.downloadJava();
        assertThat(getDriver().findElement(setupProperties.locatorForJava).isEnabled(),equalTo(true));
        assertThat(getDriver().findElement(setupProperties.locatorForJava).getText(),equalTo("Download"));
    }

    @Test
    public void testCLink(){
        SetupProperties setupProperties = new SetupProperties(getDriver());
        setupProperties.downloadC();
        assertThat(getDriver().findElement(setupProperties.locatorForC).isEnabled(),equalTo(true));
        assertThat(getDriver().findElement(setupProperties.locatorForC).getText(),equalTo("Download"));
    }

    @Test
    public void testRubyLink(){
        SetupProperties setupProperties = new SetupProperties(getDriver());
        setupProperties.downloadRuby();
        assertThat(getDriver().findElement(setupProperties.locatorForRuby).isEnabled(),equalTo(true));
        assertThat(getDriver().findElement(setupProperties.locatorForRuby).getText(),equalTo("Download"));
    }

    @Test
    public void testPythonLink(){
        SetupProperties setupProperties = new SetupProperties(getDriver());
        setupProperties.downloadPython();
        assertThat(getDriver().findElement(setupProperties.locatorForPython).isEnabled(),equalTo(true));
        assertThat(getDriver().findElement(setupProperties.locatorForPython).getText(),equalTo("Download"));
    }

    @Test
    public void testJavaScriptLink(){
        SetupProperties setupProperties = new SetupProperties(getDriver());
        setupProperties.downloadJavaScript();
        assertThat(getDriver().findElement(setupProperties.locatorForJavaScript).isEnabled(),equalTo(true));
        assertThat(getDriver().findElement(setupProperties.locatorForJavaScript).getText(),equalTo("Download"));
    }

    //////////////browser tests////////////
    @Test
    public void testMozillaBrowser(){
        SetupProperties setupProperties = new SetupProperties(getDriver());
        setupProperties.browserMozilla();
        assertThat(getDriver().findElement(setupProperties.locatorMozilla).isEnabled(),equalTo(true));
        assertThat(getDriver().findElement(setupProperties.locatorMozilla).getText(),equalTo("Mozilla GeckoDriver"));
    }

    @Test
    public void testChromeDriverBrowser(){
        SetupProperties setupProperties = new SetupProperties(getDriver());
        setupProperties.browserChromeDriver();
        assertThat(getDriver().findElement(setupProperties.locatorChromeDriver).isEnabled(),equalTo(true));
        assertThat(getDriver().findElement(setupProperties.locatorChromeDriver).getText(),equalTo("Google Chrome Driver"));
    }

    @Test
    public void testOperaBrowser(){
        SetupProperties setupProperties = new SetupProperties(getDriver());
        setupProperties.browserOpera();
        assertThat(getDriver().findElement(setupProperties.locatorOpera).isEnabled(),equalTo(true));
        assertThat(getDriver().findElement(setupProperties.locatorOpera).getText(),equalTo("Opera"));
    }

    @Test
    public void testGhostDriverBrowser(){
        SetupProperties setupProperties = new SetupProperties(getDriver());
        setupProperties.browserGhostDriver();
        assertThat(getDriver().findElement(setupProperties.locatorGhostDriver).isEnabled(),equalTo(true));
        assertThat(getDriver().findElement(setupProperties.locatorGhostDriver).getText(),equalTo("GhostDriver"));
    }

    @Test
    public void testMsEdgeDriverBrowser(){
        SetupProperties setupProperties = new SetupProperties(getDriver());
        setupProperties.browserMsEdgeDriver();
        assertThat(getDriver().findElement(setupProperties.locatorMsEdgeDriver).isEnabled(),equalTo(true));
        assertThat(getDriver().findElement(setupProperties.locatorMsEdgeDriver).getText(),equalTo("Microsoft Edge Driver"));
    }

    @Test
    public void testSafariBrowser(){
        SetupProperties setupProperties = new SetupProperties(getDriver());
        setupProperties.browserSafari();
        assertThat(getDriver().findElement(setupProperties.locatorSafari).isEnabled(),equalTo(true));
        assertThat(getDriver().findElement(setupProperties.locatorSafari).getText(),equalTo("SafariDriver"));
    }

    @Test
    public void testWPBrowser(){
        SetupProperties setupProperties = new SetupProperties(getDriver());
        setupProperties.browserWP();
        assertThat(getDriver().findElement(setupProperties.locatorWP).isEnabled(),equalTo(true));
        assertThat(getDriver().findElement(setupProperties.locatorWP).getText(),equalTo("Windows Phone"));
    }

    @Test
    public void testSelendroidBrowser(){
        SetupProperties setupProperties = new SetupProperties(getDriver());
        setupProperties.browserSelendroid();
        assertThat(getDriver().findElement(setupProperties.locatorSelendroid).isEnabled(),equalTo(true));
        assertThat(getDriver().findElement(setupProperties.locatorSelendroid).getText(),equalTo("Selendroid"));
    }

    @Test
    public void testIOSDriverBrowser(){
        SetupProperties setupProperties = new SetupProperties(getDriver());
        setupProperties.browserIOSDriver();
        assertThat(getDriver().findElement(setupProperties.locatorIOSDriver).isEnabled(),equalTo(true));
        assertThat(getDriver().findElement(setupProperties.locatorIOSDriver).getText(),equalTo("ios-driver"));
    }

    @Test
    public void testBlackBerryBrowser(){
        SetupProperties setupProperties = new SetupProperties(getDriver());
        setupProperties.browserBlackBerry();
        assertThat(getDriver().findElement(setupProperties.locatorBlackBerry).isEnabled(),equalTo(true));
        assertThat(getDriver().findElement(setupProperties.locatorBlackBerry).getText(),equalTo("BlackBerry 10"));
    }

    @Test
    public void testAppiumBrowser(){
        SetupProperties setupProperties = new SetupProperties(getDriver());
        setupProperties.browserAppium();
        assertThat(getDriver().findElement(setupProperties.locatorAppium).isEnabled(),equalTo(true));
        assertThat(getDriver().findElement(setupProperties.locatorAppium).getText(),equalTo("Appium"));
    }

    @Test
    public void testCrossWalkBrowser(){
        SetupProperties setupProperties = new SetupProperties(getDriver());
        setupProperties.browserCrossWalk();
        assertThat(getDriver().findElement(setupProperties.locatorCrossWalk).isEnabled(),equalTo(true));
        assertThat(getDriver().findElement(setupProperties.locatorCrossWalk).getText(),equalTo("CrossWalk"));
    }

    @Test
    public void testQtWebDriverBrowser(){
        SetupProperties setupProperties = new SetupProperties(getDriver());
        setupProperties.browserQtWebDriver();
        assertThat(getDriver().findElement(setupProperties.locatorQtWebDriver).isEnabled(),equalTo(true));
        assertThat(getDriver().findElement(setupProperties.locatorQtWebDriver).getText(),equalTo("QtWebDriver"));
    }

    @Test
    public void testJBrowserDriverBrowser(){
        SetupProperties setupProperties = new SetupProperties(getDriver());
        setupProperties.browserJBrowserDriver();
        assertThat(getDriver().findElement(setupProperties.locatorJBrowserDriver).isEnabled(),equalTo(true));
        assertThat(getDriver().findElement(setupProperties.locatorJBrowserDriver).getText(),equalTo("jBrowserDriver"));
    }

    @Test
    public void testWiniumDesktopBrowser(){
        SetupProperties setupProperties = new SetupProperties(getDriver());
        setupProperties.browserWiniumDesktop();
        assertThat(getDriver().findElement(setupProperties.locatorWiniumDesktop).isEnabled(),equalTo(true));
        assertThat(getDriver().findElement(setupProperties.locatorWiniumDesktop).getText(),equalTo("Winium.Desktop"));
    }

    @Test
    public void testWiniumStoreAppsBrowser(){
        SetupProperties setupProperties = new SetupProperties(getDriver());
        setupProperties.browserWiniumStoreApps();
        assertThat(getDriver().findElement(setupProperties.locatorWiniumStoreApps).isEnabled(),equalTo(true));
        assertThat(getDriver().findElement(setupProperties.locatorWiniumStoreApps).getText(),equalTo("Winium.StoreApps"));
    }

    @Test
    public void testStoreAppsCodedUIBrowser(){
        SetupProperties setupProperties = new SetupProperties(getDriver());
        setupProperties.browserStoreAppsCodedUI();
        assertThat(getDriver().findElement(setupProperties.locatorStoreAppsCodedUI).isEnabled(),equalTo(true));
        assertThat(getDriver().findElement(setupProperties.locatorStoreAppsCodedUI).getText(),equalTo("Winium.StoreApps.CodedUi"));
    }
}
