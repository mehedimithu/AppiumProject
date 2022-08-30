package android.first;

import baseclass.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwipeAction extends Base {
    @Test
    public void swipeLeft() {
        driver.findElementByAccessibilityId("Views").click();
        driver.findElementByAccessibilityId("Gallery").click();
        driver.findElementByAccessibilityId("1. Photos").click();

        WebElement firstImage = driver.findElement(By.xpath("(//android.widget.ImageView) [1]"));

        Assert.assertEquals(firstImage.getAttribute("focusable"), "true");

        //Swipe
        swipeAction(firstImage, "left");

        Assert.assertEquals(firstImage.getAttribute("focusable"), "false");

    }
}
