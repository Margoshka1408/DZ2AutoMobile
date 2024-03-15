import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;

import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_ACTIVITY;
import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_PACKAGE;
import static io.appium.java_client.remote.IOSMobileCapabilityType.BUNDLE_ID;
import static io.appium.java_client.remote.MobileCapabilityType.*;

public class IosDriverFactory {
    public IOSDriver setUp() throws MalformedInputException, MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "IOS");
        capabilities.setCapability(DEVICE_NAME, "iPhone 12 Pro Max");
        capabilities.setCapability(PLATFORM_VERSION, "14.4");
        capabilities.setCapability(UDID, "5E854D79-5FE2-43A9-9EB7-1C663B3D8DE5");
        capabilities.setCapability(BUNDLE_ID, "com.apple.MobileSMS");
        URL remoteURL = new URL("http://localhost:4723/wd/hub");

        return new IOSDriver(remoteURL, capabilities);
    }
}
