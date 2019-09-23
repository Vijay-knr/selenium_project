import java.net.MalformedURLException;
import java.net.URL;
import org.junit.Assert;
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

        System.out.println("*****************************************************************");
        System.out.println(System.getenv());
        System.out.println("*****************************************************************");

//        String url = "selenium-hub";
        String url = "http://172.19.0.2:4444";
//        String url = "http://127.0.0.0:4444";
//        String url = System.getenv("HUB");

        url = url + "/wd/hub";

        driver = new RemoteWebDriver(new URL(url), dc);
        driver.get("http://google.co.uk");
//        driver.get("https://int.branchhub.co.uk");
        Thread.sleep(2000);
        System.out.println("Current URL is: " + driver.getCurrentUrl());
        System.out.println("Current title is: " + driver.getTitle());
        Assert.assertTrue(driver.getCurrentUrl().contains("google"));
        Assert.assertEquals("Google", driver.getTitle());
    }
}