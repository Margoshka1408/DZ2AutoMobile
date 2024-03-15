import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;

import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_ACTIVITY;
import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_PACKAGE;

public class DriverFactory {
    public AndroidDriver setUp() throws MalformedInputException, MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "ANDROID");
        capabilities.setCapability(APP_PACKAGE, "com.android.settings");
        capabilities.setCapability(APP_ACTIVITY, "com.android.settings.Settings");
        URL remoteURL = new URL("http://localhost:4723/wd/hub");

        return new AndroidDriver(remoteURL, capabilities);
    }
}
