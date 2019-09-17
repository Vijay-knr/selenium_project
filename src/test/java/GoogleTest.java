import java.net.MalformedURLException;
import java.net.URL;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GoogleTest {

    private WebDriver driver;

    @Test
    public void googleTest() throws InterruptedException, MalformedURLException {
        browser(DesiredCapabilities.firefox());
        browser(DesiredCapabilities.chrome());
    }

    private void browser(DesiredCapabilities dc) throws MalformedURLException, InterruptedException {

        dc.setPlatform(Platform.LINUX);
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
        driver.get("http://google.co.uk");
//        driver.get("https://int.branchhub.co.uk");
        Thread.sleep(2000);
        System.out.println("Current URL is: " + driver.getCurrentUrl());
        System.out.println("Current title is: " + driver.getTitle());
    }
}