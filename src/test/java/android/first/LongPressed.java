package android.first;

import baseclass.Base;
import org.testng.annotations.Test;

public class LongPressed extends Base {

    @Test
    public void  longPressGesture(){
        driver.findElementByAccessibilityId("Views").click();
        driver.findElementByAccessibilityId("Expandable Lists").click();
        driver.findElementByAccessibilityId("1. Custom Adapter").click();

    }
}
