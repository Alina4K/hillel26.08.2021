import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    public void test() {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.findElement(By.cssSelector(".hero-descriptor_btn")).click();
        driver.findElement(By.cssSelector("#signupName")).sendKeys("Liubov");
        driver.findElement(By.cssSelector("#signupLastName")).sendKeys("Lebedieva");
        String randomEmail = RandomStringUtils.randomAlphabetic(10);
        String email = randomEmail + "@gmail.com";
        driver.findElement(By.id("signupEmail")).sendKeys(email);
        driver.findElement(By.id("signupPassword")).sendKeys("Qwerty123");
        driver.findElement(By.id("signupRepeatPassword")).sendKeys("Qwerty123");
        WebElement RegisterButton = driver.findElement(By.xpath("//button[contains(text(),'Register')]"));
        WebDriverWait wait = new WebDriverWait(driver, 3000);
        wait.until(ExpectedConditions.elementToBeClickable(RegisterButton));
        RegisterButton.click();
//2
        //driver.get("https://qauto.forstudy.space/panel/profile");
        driver.findElement(By.linkText("Profile")).click();
        String actualProfile = driver.findElement(By.cssSelector(".profile_name")).getText();
        Assert.assertEquals("Valid name", "Liubov Lebedieva", actualProfile);

//3
        //driver.get("https://qauto.forstudy.space/panel/garage");
        driver.findElement(By.linkText("Garage")).click();
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        String mili = "17";
        driver.findElement(By.id("addCarMileage")).sendKeys(mili);
        driver.findElement(By.cssSelector("button.btn-primary[type='button']")).click();

        //4
        // driver.get("https://qauto.forstudy.space/panel/expenses");
        driver.findElement(By.cssSelector("button.car_add-expense.btn.btn-success")).click();
        String mil = "111";
        driver.findElement(By.id("addExpenseMileage")).sendKeys(mil);
        // driver.findElement(By.cssSelector("#addExpenseMileage")).sendKeys("25");
        driver.findElement(By.cssSelector("#addExpenseLiters")).sendKeys("2");
        driver.findElement(By.cssSelector("#addExpenseTotalCost")).sendKeys("3");
        driver.findElement(By.cssSelector("button.btn.btn-primary[type='button']")).click();

        //5
        driver.findElement(By.linkText("Settings")).click();
        driver.findElement(By.cssSelector("button.btn.btn-danger-bg")).click();
        driver.findElement(By.cssSelector("button.btn.btn-danger")).click();

    }
    @After
    public void postCondition(){
        driver.quit();
    }

}
