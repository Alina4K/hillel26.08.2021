import dto.User;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class HillelAutoTests {
    private WebDriver driver;
    private User user;

    @BeforeClass
    public static void mainPrecondition() {
        final String path = String.format("%s/bin/chromedriver.exe", System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver", path);
    }

    @Before
    public void preconditions() {
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1920,1080));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        user = generateRandomUser();
    }

    @Test
    public void testSignUpCreateCarAddExpensesAndDelete() {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        System.out.println("Page loaded!");

        driver.findElement(By.cssSelector(".hero-descriptor_btn")).click();
        System.out.println("'Sign Up' button found!");

        modalBody().findElement(By.id("signupName")).sendKeys(user.getName());
        modalBody().findElement(By.id("signupLastName")).sendKeys(user.getLastName());
        modalBody().findElement(By.id("signupEmail")).sendKeys(user.getEmail());
        modalBody().findElement(By.id("signupPassword")).sendKeys(user.getPassword());
        modalBody().findElement(By.id("signupRepeatPassword")).sendKeys(user.getPassword());
        System.out.println("Profile filled!");

        modalFooter().findElement(By.cssSelector(".btn-primary")).click();
        System.out.println("Registered!");

        sideBar().findElement(By.linkText("Profile")).click();
        System.out.println("Profile opened!");

        String profileName = mainBar().findElement(By.cssSelector(".profile_name")).getText();
        Assert.assertEquals("User profile assertion", user.getFullName(), profileName);
        System.out.println("Profile is valid!");

        sideBar().findElement(By.linkText("Garage")).click();
        System.out.println("Garage opened!");

        mainBar().findElement(By.cssSelector(".btn-primary")).click();
        int mileage = generateRandomValue(10000);
        modalBody().findElement(By.id("addCarMileage")).sendKeys(String.valueOf(mileage));
        modalFooter().findElement(By.cssSelector(".btn-primary")).click();
        System.out.println("Car added!");

        mainBar().findElement(By.className("car-item"))
                .findElement(By.cssSelector(".car_add-expense")).click();
        System.out.println("Expense modal window opened!");

        mileage = mileage + generateRandomValue(10000);
        int liters = generateRandomValue(9999);
        int totalCost = generateRandomValue(1000000);
        modalBody().findElement(By.id("addExpenseMileage")).clear();
        modalBody().findElement(By.id("addExpenseMileage")).sendKeys(String.valueOf(mileage));
        modalBody().findElement(By.id("addExpenseLiters")).sendKeys(String.valueOf(liters));
        modalBody().findElement(By.id("addExpenseTotalCost")).sendKeys(String.valueOf(totalCost));
        modalFooter().findElement(By.cssSelector(".btn-primary")).click();
        System.out.println("Expense added!");

        sideBar().findElement(By.linkText("Settings")).click();
        System.out.println("Settings opened!");

        mainBar().findElement(By.cssSelector(".btn-danger-bg")).click();
        modalFooter().findElement(By.cssSelector(".btn-danger")).click();
        System.out.println("Account deleted!");
    }

    @After
    public void postCondition() {
        driver.quit();
    }

    private int generateRandomValue(int maxValue) {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(maxValue);
    }
    private User generateRandomUser() {
        int random = generateRandomValue(9999);

        String randomEmail = "generatedEmail" + random + "@gmail.com";
        String randomPassword = "Password" + random;
        String randomName = "User";
        String randomLastName = "Unknown";
        return new User(randomEmail, randomPassword, randomName, randomLastName);
    }

    private WebElement modalDialog() {
        return driver.findElement(By.className("modal-dialog"));
    }
    private WebElement modalBody() {
        return modalDialog().findElement(By.className("modal-body"));
    }
    private WebElement modalFooter() {
        return modalDialog().findElement(By.className("modal-footer"));
    }
    private WebElement sideBar() {
        return driver.findElement(By.className("sidebar-wrapper"));
    }
    private WebElement mainBar() {
        return driver.findElement(By.className("main-wrapper"));
    }
}
