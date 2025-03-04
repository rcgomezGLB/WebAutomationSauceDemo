package base;

import com.rcgomez.pages.InventoryPage;
import com.rcgomez.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected WebDriver driver;

    @Parameters({"baseUrl"})
    @BeforeClass
    public void setUp(String baseUrl) {
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @AfterClass
    public void EndTests() {
        if (driver != null) {
            driver.quit();
        }
    }
}
