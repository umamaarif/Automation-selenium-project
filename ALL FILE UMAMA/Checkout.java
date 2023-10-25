import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkout {
    public static void completeOrder(WebDriver driver) {
        // Go to the cart
        WebElement cartButton = driver.findElement(By.id("shopping_cart_container"));
        cartButton.click();

        // Proceed to checkout
        WebElement checkoutButton = driver.findElement(By.id("checkout"));
        checkoutButton.click();

        // Fill out the form
        WebElement firstNameInput = driver.findElement(By.id("first-name"));
        WebElement lastNameInput = driver.findElement(By.id("last-name"));
        WebElement postalCodeInput = driver.findElement(By.id("postal-code"));

        // Hardcoded values for the form fields
        String firstName = "umama";
        String lastName = "arif";
        String postalCode = "helloworld";

        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        postalCodeInput.sendKeys(postalCode);

        // Continue to the next step
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        // Finish the order
        WebElement finishButton = driver.findElement(By.id("finish"));
        finishButton.click();
    }
}
