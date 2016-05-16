package io.appium.uiautomator2.handler;

import android.os.RemoteException;

import io.appium.uiautomator2.http.AppiumResponse;
import io.appium.uiautomator2.http.IHttpRequest;
import io.appium.uiautomator2.server.WDStatus;
import io.appium.uiautomator2.utils.Device;
import io.appium.uiautomator2.utils.Logger;

public class RotateScreen extends SafeRequestHandler {

    public RotateScreen(String mappedUri) {
        super(mappedUri);
    }

    @Override
    public AppiumResponse safeHandle(IHttpRequest request) {

        try {
            Device.getUiDevice().setOrientationRight();
        } catch (RemoteException e) {
            Logger.error("Exception while reading JSON: ", e);
            return new AppiumResponse(getSessionId(request), WDStatus.UNKNOWN_ERROR, e);
        }
        return new AppiumResponse(getSessionId(request), "Orientation has been changed");
    }
}
