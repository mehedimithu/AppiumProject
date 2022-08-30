package android.first;

import baseclass.Base;
import org.testng.annotations.Test;

public class ScrollDown extends Base {
    @Test
    public void scrollAction() {
        driver.findElementByAccessibilityId("Views").click();
       // scrollDown();
        scrollToEnd();

    }
}
