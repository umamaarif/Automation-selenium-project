import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Random;

public class AddToCart {
    public static void addRandomItemToCart(WebDriver driver) {
        // Assuming there's a common class name for the "Add to Cart" buttons
        List<WebElement> addToCartButtons = driver.findElements(By.className("btn_inventory"));
        if (addToCartButtons.size() == 6) {
            Random rand = new Random();
            int randomIndex = rand.nextInt(6); // Generate a random number between 0 and 5
            addToCartButtons.get(randomIndex).click();
        } else {
            System.out.println("The number of products is not 6 as expected.");
        }
    }

    public static void AddToCart(WebDriver driver) {
    }
}
