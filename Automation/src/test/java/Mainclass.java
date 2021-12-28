import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Mainclass {
    WebDriver driver;

    @BeforeClass
    public static void MainPrecondition() {
        final String path = String.format("%s/bin/chromedriver.exe", System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver", path);

    }

    @Before
    public void precondition() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");

    }

    @Test
public void test () {
        driver.get("https://qauto.forstudy.space/");
        driver.findElement(By.xpath("//button[text()='Sign In'] ")).click();
        driver.findElement(By.xpath("//button[text()='Registration']")).click();
        driver.findElement(By.id("signupName")).sendKeys("Svyatoslav");
        driver.findElement(By.id("signupLastName")).sendKeys("Kryachev");
        String generatedstring = RandomStringUtils.randomAlphabetic(8);
        String email = generatedstring + "@gmail.com";
        driver.findElement(By.id("signupEmail")).sendKeys(email);
        driver.findElement(By.id("signupPassword")).sendKeys("Qwerty12345");
        driver.findElement(By.id("signupRepeatPassword")).sendKeys("Qwerty12345");
        driver.findElement(By.xpath("//button[text()='Register']")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-global-layout/div/div/div/app-panel-layout/div/div/div/div[1]/nav/div/a[1]")).click();
        String checkName = driver.findElement(By.xpath("//p[text()='Svyatoslav Kryachev']")).getText();
        Assert.assertEquals("Wrong Profile Text", "Svyatoslav Kryachev", checkName);
        driver.findElement(By.xpath("//a[text()='Garage']")).click();
        driver.findElement(By.xpath("//button[text()='Add car']")).click();
        driver.findElement(By.id("addCarMileage")).click();

        driver.findElement(By.id("addCarMileage")).sendKeys("40");
        driver.findElement(By.xpath("//button[text()='Add']")).click();
        driver.findElement(By.xpath("//button[text()='Add fuel expense']")).click();
        //String mileage = RandomStringUtils.randomNumeric(2,3)
        driver.findElement(By.id("addExpenseMileage")).sendKeys("45");
        driver.findElement(By.id("addExpenseLiters")).sendKeys("10");
        driver.findElement(By.id("addExpenseTotalCost")).sendKeys("10");;
        driver.findElement(By.xpath("//button[text()='Add']")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-global-layout/div/div/div/app-panel-layout/div/div/div/div[1]/nav/div/a[2]")).click();
        driver.findElement(By.xpath("//button[text()='Remove my account']")).click();
        driver.findElement(By.xpath("//button[text()='Remove']")).click();

//
//        id="addExpenseMileage" должен быть больше чем при создании машины
//        id="addExpenseLiters" литры количество литров
//                addExpenseTotalCost стоимо


    }
}
