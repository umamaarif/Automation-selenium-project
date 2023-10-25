import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
    public static void login(WebDriver driver, String username, String password) {
        WebElement userNameTextBox = driver.findElement(By.id("user-name"));
        userNameTextBox.sendKeys(username);

        WebElement userPasswordTextBox = driver.findElement(By.id("password"));
        userPasswordTextBox.sendKeys(password);

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
    }
}
