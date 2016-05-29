package com;

/**
 * Created by naresh on 5/28/2016.
 */

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class setup {

    private AppiumDriver<MobileElement> driver;

    @BeforeTest
    public void setUp() throws Exception {
        System.out.println("before method called");
        File appDir = new File("C:\\Users\\naresh\\Downloads\\DISK1");
        File app = new File(appDir, "ApiDemos-debug.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "AppSpeed");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.0");
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        System.out.println("Driver loaded");
    }

    @AfterTest

    public void tearDown() throws Exception {
        System.out.println("tearDown Method Called");
        driver.quit();
    }

    @Test(groups={"US","kirthikabalu"})

    public void tapApp() {
        System.out.println("tap App method called");
        driver.findElement(By.name("App")).click();
        driver.findElement(By.name("Action Bar")).click();
        driver.navigate().back();
        driver.navigate().back();

    }
    @Test(groups={"UK","pdTeam"})
    public void tapContent() {
        System.out.println("tap content method called");
        driver.findElement(By.name("Content")).click();
        driver.navigate().back();
    }
    @Test(groups={"UK","pdTeam"})
    public void tapGraphics() {
        System.out.println("tap Graphics method called");
        driver.findElement(By.name("Graphics")).click();
        driver.navigate().back();
    }
    @Test
    public void tapMedia() {
        System.out.println("tap Media method called");
        driver.findElement(By.name("Media")).click();
        driver.navigate().back();
    }
    @Test
    public void tapNFC() {
        System.out.println("tap NFC method called");
        driver.findElement(By.name("NFC")).click();
        driver.navigate().back();
    }
    @Test
    public void tapOS() {
        System.out.println("tap OS method called");
        driver.findElement(By.name("OS")).click();
        driver.navigate().back();
    }
    @Test
    public void tapPreference() {
        System.out.println("tap Preference method called");
        driver.findElement(By.name("Preference")).click();
        driver.navigate().back();
    }
    @Test
    public void tapText() {
        System.out.println("tap Text method called");
        driver.scrollTo("Text");
        driver.findElement(By.name("Text")).click();
        driver.navigate().back();
    }
    @Test
    public void tapViews() {
        System.out.println("tap Views method called");
        driver.scrollTo("Views");
        driver.findElement(By.name("Views")).click();
        driver.navigate().back();
    }
}
