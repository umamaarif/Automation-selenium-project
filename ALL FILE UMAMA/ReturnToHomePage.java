import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReturnToHomePage {
    public static void navigateToHomePage(WebDriver driver) {
        // Return to the home page
        WebElement homeButton = driver.findElement(By.id("back-to-products"));
        homeButton.click();
    }
}
