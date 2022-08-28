package android.first;

import baseclass.Base;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.List;

public class FirstTest extends Base {

    @Test
    public void Test1() {
        driver.findElementByAccessibilityId("Preference").click();
        driver.findElementByAccessibilityId("3. Preference dependencies").click();
        driver.findElement(By.id("android:id/checkbox")).click();

       /* valid xPath
       //tagName[@attribute='value'] or  //tagName
        */

        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        driver.findElement(By.id("android:id/edit")).sendKeys("SunnySide");
        List<MobileElement> index = driver.findElements(By.className("android.widget.Button"));
        index.get(1).click();

    }

}
