import org.apache.commons.lang3.RandomStringUtils;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {

    //   Пасхалочка
    //   https://cs7.pikabu.ru/post_img/2019/05/07/8/1557232367117425055.jpg


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
        driver.manage().timeouts().implicitlyWait('1', TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".hero-descriptor_btn")).click();
        Thread.sleep(500);
        driver.findElement(By.id("signupName")).sendKeys("Yuri");
        Thread.sleep(500);
        driver.findElement(By.id("signupLastName")).sendKeys("Linsky");
        Thread.sleep(500);
        String randomEmail = RandomStringUtils.randomAlphabetic(9);
        Thread.sleep(500);
        String randomTextEmail = randomEmail + "@gmail.com";
        Thread.sleep(500);
        driver.findElement(By.id("signupEmail")).sendKeys(randomTextEmail);
        Thread.sleep(500);
        driver.findElement(By.id("signupPassword")).sendKeys("Qwerty12345");
        Thread.sleep(500);
        driver.findElement(By.id("signupRepeatPassword")).sendKeys("Qwerty12345");
        Thread.sleep(500);
        driver.findElement(By.cssSelector("button.btn-primary[type='button']")).click();
        Thread.sleep(500);

        driver.findElement(By.cssSelector(".-profile")).click();
        Thread.sleep(1000);
        String text = driver.findElement(By.cssSelector(".profile_name")).getText();
        Assert.assertEquals("Имя Совпадает","Yuri Linsky",text);

        driver.findElement(By.linkText("Garage")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Add car')]")).click();
        Thread.sleep(1000);
        String  mil = "200";
        driver.findElement(By.id("addCarMileage")).sendKeys(mil);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.btn-primary[type='button']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Add fuel expense')]")).click();
        String mil2 = "1";
        Thread.sleep(1000);
        driver.findElement(By.id("addExpenseMileage")).sendKeys(mil2);
        Thread.sleep(1000);
        driver.findElement(By.id("addExpenseLiters")).sendKeys("111");
        Thread.sleep(1000);
        driver.findElement(By.id("addExpenseTotalCost")).sendKeys("222");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.btn-primary[type='button']")).click();

        driver.findElement(By.linkText("Settings")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Remove my account')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.btn-danger[type='button']")).click();
    }

    @After
    public void postCondition() {
        driver.quit();

    }
}