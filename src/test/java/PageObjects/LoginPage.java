package PageObjects;

/**
 * Created by naresh on 5/28/2016.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    By userId = By.id(app_package_name + "user_id");
    By password = By.id(app_package_name + "user_password");
    By showPassword = By.id(app_package_name + "show_password");
    By login_Button = By.id(app_package_name + "btn_login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage invalidLogin() {
        waitForVisibilityOf(userId);
        driver.findElement(userId).sendKeys("nareshtest@gmail.com");
        driver.findElement(password).sendKeys("nareshtest123");
        driver.findElement(showPassword).click();
        driver.findElement(login_Button).click();
        return new LoginPage(driver);
    }
}
