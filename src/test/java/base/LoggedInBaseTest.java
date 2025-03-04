package base;

import com.rcgomez.pages.LoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class LoggedInBaseTest extends BaseTest {

    protected LoginPage loginPage;

    @Parameters({"username", "password"})
    @BeforeClass
    public void logInSetUp(String username, String password) {
        loginPage = new LoginPage(driver);
        loginPage.login(username, password);
    }

}
