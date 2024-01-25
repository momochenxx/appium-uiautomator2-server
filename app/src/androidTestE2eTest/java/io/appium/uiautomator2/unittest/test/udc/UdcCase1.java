package io.appium.uiautomator2.unittest.test.udc;

import static io.appium.uiautomator2.unittest.test.internal.TestUtils.waitForSeconds;
import static io.appium.uiautomator2.unittest.test.internal.commands.DeviceCommands.findElement;
import static io.appium.uiautomator2.unittest.test.internal.commands.ElementCommands.click;

import org.json.JSONException;
import org.junit.Test;

import io.appium.uiautomator2.model.By;
import io.appium.uiautomator2.unittest.test.internal.Response;

public class UdcCase1 extends UdcBaseTest {

    @Test
    public void openRightActivityAndJumpEventActivity() throws JSONException {
        startActivityByUserId(UDC_TEST_APP_PACKAGE_NAME, UDC_TEST_APP_MAIN_ACTIVITY, 14);
        waitForSeconds(2);
        Response response = findElement(By.text("Event"));
        click(response.getElementId());
        waitForSeconds(2);
    }

    @Test
    public void openLeftActivityAndJumpEventActivity() throws JSONException {
        startActivityByUserId(UDC_TEST_APP_PACKAGE_NAME, UDC_TEST_APP_MAIN_ACTIVITY, 15);
        waitForSeconds(2);
        Response response = findElement(By.text("Event"));
        click(response.getElementId());
        waitForSeconds(2);
    }
}
