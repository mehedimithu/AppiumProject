package android.first;

import baseclass.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragDrop extends Base {
    @Test
    public void dragAndDrop() throws InterruptedException {
        driver.findElementByAccessibilityId("Views").click();
        driver.findElementByAccessibilityId("Drag and Drop").click();
        WebElement source = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
        dragDropAction(source, 619, 560);
        Thread.sleep(2000);
        String dropTitle = driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
        Assert.assertEquals(dropTitle, "Dropped!");

    }
}
