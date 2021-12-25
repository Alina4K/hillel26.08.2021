import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class Main {
    WebDriver driver;

    @Before
    public void testPreconditions() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\OM\\IdeaProjects\\untitled4\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void test() {
        //Создать пользователя(всегда уникально)//
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.findElement(By.className("hero-descriptor_btn")).click();
        driver.findElement(By.id("signupName")).click();
        driver.findElement(By.id("signupName")).sendKeys("Oleg");
        driver.findElement(By.id("signupLastName")).click();
        driver.findElement(By.id("signupLastName")).sendKeys("Che");
        driver.findElement(By.id("signupEmail")).click();
        String randomEmail = RandomStringUtils.randomAlphabetic(8);
        String[] nameOfEmail = new String[]{"google.com", "mail.com", "urk.net", "yandex.ru"};
        int n = (int) Math.floor(Math.random() * nameOfEmail.length);
        String randomTextEmail = randomEmail + "@" + nameOfEmail[n];
        driver.findElement(By.id("signupEmail")).sendKeys(randomTextEmail);
        driver.findElement(By.id("signupPassword")).click();
        driver.findElement(By.id("signupPassword")).sendKeys("Qwertyui45");
        driver.findElement(By.id("signupRepeatPassword")).click();
        driver.findElement(By.id("signupRepeatPassword")).sendKeys("Qwertyui45");
        driver.findElement(By.xpath("//button[contains(text(),'Register')]")).click();
        //Пойти в профайл и проверить что там такие же name и lastName как при регистрации//
        driver.findElement(By.linkText("Profile")).click();
        driver.findElement(By.linkText("Garage")).click();
        //Добавить авто (любое)//
        driver.findElement(By.xpath("//button[contains(text(),'Add car')]")).click();
        driver.findElement(By.id("addCarMileage")).click();
        String randomNum = RandomStringUtils.randomNumeric(2);
        driver.findElement(By.id("addCarMileage")).sendKeys(randomNum);
        driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-car-modal[1]/div[3]/button[2]")).click();
        //Добавить expenses этому авто//
        driver.findElement(By.xpath("//button[contains(text(),'Add fuel expense')]")).click();
        driver.findElement(By.id("addExpenseMileage")).click();
        driver.findElement(By.id("addExpenseMileage")).sendKeys(randomNum + "1");
        driver.findElement(By.id("addExpenseLiters")).click();
        driver.findElement(By.id("addExpenseLiters")).sendKeys(randomNum + "1");
        driver.findElement(By.id("addExpenseTotalCost")).click();
        driver.findElement(By.id("addExpenseTotalCost")).sendKeys(randomNum + "1");
        driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-expense-modal[1]/div[3]/button[2]")).click();
        //Удалить акаунт//
        driver.findElement(By.linkText("Settings")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Remove my account')]")).click();
        driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-remove-account-modal[1]/div[3]/button[2]")).click();
    }

    @After
    public void testAfter() {
        driver.quit();

    }
}

