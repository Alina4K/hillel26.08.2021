import net.bytebuddy.ByteBuddy;
import net.bytebuddy.utility.RandomString;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {


    WebDriver driver;

    @BeforeClass
    public static void mainPrecondition() {
        final String path = String.format("%s/bin/chromedriver.exe", System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver", path);

    }

    @Before
    public void precondition() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    public void test() throws InterruptedException {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.manage().timeouts().implicitlyWait('2', TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".hero-descriptor_btn")).click();
        driver.findElement(By.id("signupName")).sendKeys("John");
        driver.findElement(By.id("signupLastName")).sendKeys("Snow");
        String generatedstring = RandomStringUtils.randomAlphabetic(6);
        String email = generatedstring + "@gmail.com";
        driver.findElement(By.id("signupEmail")).sendKeys(email);
        driver.findElement(By.id("signupPassword")).sendKeys("Snow12345");
        driver.findElement(By.id("signupRepeatPassword")).sendKeys("Snow12345");
        WebElement registerButton = driver.findElement(By.xpath("//button[contains(text(),'Register')]"));
        WebDriverWait wait=new WebDriverWait(driver, 300);
        wait.until(ExpectedConditions.elementToBeClickable(registerButton));
        registerButton.click();
        driver.findElement(By.cssSelector(".-profile")).click();
        String text = driver.findElement(By.cssSelector(".profile_name")).getText();
        Assert.assertEquals("Name invalid","John Snow",text);
        driver.findElement(By.linkText("Garage")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Add car')]")).click();
        String  mil = "111";
        driver.findElement(By.id("addCarMileage")).sendKeys(mil);
        driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-car-modal[1]/div[3]/button[2]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Add fuel expense')]")).click();
        String mil2 = "115";
        driver.findElement(By.id("addExpenseMileage")).sendKeys(mil2);
        driver.findElement(By.id("addExpenseLiters")).sendKeys("33");
        driver.findElement(By.id("addExpenseTotalCost")).sendKeys("99");
        driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-expense-modal[1]/div[3]/button[2]")).click();
        driver.findElement(By.linkText("Settings")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Remove my account')]")).click();
        driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-remove-account-modal[1]/div[3]/button[2]")).click();
    }






    @After
    public void postCondition() {
        driver.quit();

    }
}


