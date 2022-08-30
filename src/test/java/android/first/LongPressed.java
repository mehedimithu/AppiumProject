package android.first;

import baseclass.Base;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LongPressed extends Base {

    @Test
    public void  longPressGesture(){
        driver.findElementByAccessibilityId("Views").click();
        driver.findElementByAccessibilityId("Expandable Lists").click();
        driver.findElementByAccessibilityId("1. Custom Adapter").click();
        MobileElement eleValue = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
        longPressAction(eleValue);

        String popupTitle = driver.findElement(By.id("android:id/title")).getText();
        Assert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed());
        Assert.assertEquals(popupTitle, "Sample menu");

    }
}
