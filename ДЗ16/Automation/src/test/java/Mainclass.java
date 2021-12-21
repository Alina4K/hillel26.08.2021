import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mainclass {
    WebDriver driver;
    @BeforeClass
    public static void MainPrecondition () {
        final String path = String.format("%s/bin/chromedriver.exe",System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver", path);

    }
    @Before
    public void precondition () {
        driver = new ChromeDriver();

    }
    @Test
public void test () {
        driver.get("https://lms.ithillel.ua/");
    }
}
