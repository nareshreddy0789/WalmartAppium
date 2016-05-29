package TestCases;

/**
 * Created by naresh on 5/28/2016.
 */



        import io.appium.java_client.android.AndroidDriver;
        import org.openqa.selenium.remote.DesiredCapabilities;

        import java.io.File;
        import java.net.MalformedURLException;
        import java.net.URL;


public class AndroidSetup {
    protected AndroidDriver driver;

    protected void prepareAndroidForAppium() throws MalformedURLException {
        File appDir = new File("C:\\Users\\naresh\\Downloads\\Appium\\src\\test\\resources");
        File app = new File(appDir, "Walmart.3.6.3.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("device","Android");

        //mandatory capabilities
        capabilities.setCapability("deviceName","Android");
        capabilities.setCapability("platformName","Android");

        //other caps
        capabilities.setCapability("app", app.getAbsolutePath());
        driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
}
