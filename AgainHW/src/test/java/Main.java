import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

import static java.awt.SystemColor.text;


public class Main {

    WebDriver drive;
    public ChromeDriver driver;

    @BeforeClass
    public static void mainPrecondition() {
        final String path = String.format("%s/Bin/chromedriver.exe", System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver", path);
    }

    @Before
    public void preconditions() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);


    }

    @Test
    public void test() throws InterruptedException {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.findElement(By.cssSelector(".hero-descriptor_btn")).click();
        driver.findElement(By.id("signupName")).sendKeys("Cloud");
        driver.findElement(By.id("signupLastName")).sendKeys("Bu");
        String random = RandomStringUtils.randomAlphabetic(6);
        String email = random + "@gmail.com";
        driver.findElement(By.id("signupEmail")).sendKeys(email);
        driver.findElement(By.id("signupPassword")).sendKeys("Qagon951753");
        driver.findElement(By.id("signupRepeatPassword")).sendKeys("Qagon951753");
        WebElement RegisterButton = driver.findElement(By.xpath("//button[contains(text(),'Register')]"));
        WebDriverWait wait = new WebDriverWait(driver, 180);
        wait.until(ExpectedConditions.elementToBeClickable(RegisterButton));
        RegisterButton.click();
        driver.findElement(By.cssSelector(".-profile")).click();
        String text = driver.findElement(By.cssSelector(".profile_name.display-4")).getText();
        Assert.assertEquals("name invalid", "Cloud Bu", text);
        driver.findElement(By.linkText("Garage")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Add car')]")).click();
        driver.findElement(By.xpath("//body/ngb-modal-window/div/div/app-add-car-modal/div[2]/app-add-car-form/form/div[1]/select/option[3]")).click();
        String  mil = "10";
        driver.findElement(By.id("addCarMileage")).sendKeys(mil);
        driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-car-modal[1]/div[3]/button[2]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Add fuel expense')]")).click();
        String mil2 = "20";
        driver.findElement(By.id("addExpenseMileage")).sendKeys(mil2);
        driver.findElement(By.id("addExpenseLiters")).sendKeys("50");
        driver.findElement(By.id("addExpenseTotalCost")).sendKeys("100");
        driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-expense-modal[1]/div[3]/button[2]")).click();
        driver.findElement(By.linkText("Settings")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Remove my account')]")).click();
        driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-remove-account-modal[1]/div[3]/button[2]")).click();

    }

     @After
    public void postConditions() {
        driver.quit();
    }
}