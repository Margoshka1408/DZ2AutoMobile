import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.nio.charset.MalformedInputException;

public class M2IosTest {
    private static IOSDriver driver;
    private static IosDriverFactory driverFactory;

    @BeforeAll
    public static void setDriver() throws MalformedURLException, MalformedInputException {
        driverFactory = new IosDriverFactory();
        driver = driverFactory.setUp();
    }
    @Test
    public void test() throws InterruptedException {
        Thread.sleep(Long.parseLong("5000"));
    }
    @AfterAll
    public static void tearDown(){
        driver.quit();
    }
}
