package testpackage;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import util.Driveconect;

    public class LoginTest{

    @Test
    public void test()
    {
        WebDriver driver = Driveconect.connect("https://www.facebook.com/");
       // LoginPage lg = new LoginPage(driver);
        LoginpageFactory lg = new LoginpageFactory(driver);
        lg.enterEmail("test@email.com");
        lg.enterPass("test");
        lg.login();
    }
}
