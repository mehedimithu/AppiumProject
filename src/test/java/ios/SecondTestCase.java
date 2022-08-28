package ios;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SecondTestCase {

    AppiumDriver driver;


    @BeforeTest
    public void setUp() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();

        URL uri = new URL("http://127.0.0.1:4723/wd/hub/");

        caps.setCapability("platformName", "iOS");
        caps.setCapability("platformVersion", "15.4");
        caps.setCapability("deviceName", "iPhone SE");
        caps.setCapability("automationName", "XCUITest");
       caps.setCapability("app", System.getProperty("user.dir") + "/apps/bitbar-ios-sample.ipa");

        driver = new AppiumDriver<MobileElement>(uri, caps);

    }

    @Test
    public void  test1(){
        System.out.println("Test1");
    }



}
