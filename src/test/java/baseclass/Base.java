package baseclass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Base {
    public AppiumDriver driver;
    //Appium server start
    public AppiumDriverLocalService service;

    @BeforeClass
    public void appiumConfig() throws MalformedURLException {
        // service = new AppiumServiceBuilder().withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
        //service1.start();
        DesiredCapabilities caps = new DesiredCapabilities();

        URL uri = new URL("http://127.0.0.1:4723/wd/hub/");

        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "12");
        caps.setCapability("deviceName", "sdk_gphone64_arm64");
        caps.setCapability("automationName", "UiAutomator2");
//        caps.setCapability("app", System.getProperty("user.dir") + "/apps/ApiDemos-debug.apk");
        caps.setCapability("appPackage", "io.appium.android.apis");
        caps.setCapability("appActivity", ".ApiDemos");

        driver = new AppiumDriver<MobileElement>(uri, caps);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterClass
    public void tearDown() {
        if (null != driver) {
            System.out.println("Test case passed");
            driver.quit();
            //Appium server stopped
            //service.stop();
        }

    }
}
