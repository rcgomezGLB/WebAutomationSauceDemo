package base;

import com.rcgomez.pages.BasePage;
import com.rcgomez.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {
    private WebDriver driver;
    private LoginPage loginPage;


    @Parameters({"baseUrl"})
    @BeforeClass
    public void setUp(String baseUrl) {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);

        driver.get(baseUrl);
    }

    public void logIn(String user, String password) {
        loginPage.login(user, password);
    }

    @AfterClass
    public void EndTests() {
        if (driver != null) {
            driver.quit();
        }
    }
}
