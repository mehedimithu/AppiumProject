package android.first;

import baseclass.Base;
import io.appium.java_client.android.Activity;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MiscellaneousActions extends Base {

    @Test
    public void miscellaneousActivities() {
        driver.findElementByAccessibilityId("Preference").click();
        driver.findElementByAccessibilityId("3. Preference dependencies").click();
        driver.findElement(By.id("android:id/checkbox")).click();
        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle, "WiFi settings");

        //copy to clipboard --- paste it clipboard
      //  ((HasClipboard) driver).setClipboardText("happyTesting");

        System.out.println("Alert Title" + " " + alertTitle);
        driver.findElement(By.id("android:id/edit")).sendKeys("SunnySide");

        //device rotation
        deviceRotation = new DeviceRotation(0, 0, 90);
        driver.rotate(deviceRotation);

        //PressKey physical button
        driver.getKeyboard().sendKeys(Keys.ENTER);


    }

    @Test
    public void miscellaneousActivities2(){

      /*  How to find appPackage and appActivity:
        Mac: adb shell dumpsys window | grep -E 'mCurrentFocus'
        Windows: adb shell dumpsys window | find "mCurrentFocus"*/

        activity = new Activity("io.appium.android.apis", "io.appium.android.apis.view.Gallery1");
        //driver.startActivity(activity);
    }

}
