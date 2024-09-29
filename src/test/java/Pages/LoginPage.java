package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver = null;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    By email = By.id("email");
    By pass = By.id("pass");
    By login = By.name("login");


    public void enterEmail(String userEmail) {
        driver.findElement(email).sendKeys(userEmail);
    }

    public void enterPass(String userPass) {
        driver.findElement(pass).sendKeys(userPass);
    }

    public void login() {
        driver.findElement(login).click();
    }
}