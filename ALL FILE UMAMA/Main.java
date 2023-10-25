import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        try {
            System.setProperty("webdriver.chrome.driver", AllCredentials.CHROME_DRIVER_PATH);
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--remote-allow-origins=*");

            WebDriver driver = new ChromeDriver(chromeOptions);

            driver.manage().window().maximize();
            driver.get(AllCredentials.BASE_URL);

            // Title checking
            String actualTitle = driver.getTitle();

            if (actualTitle.equals(AllCredentials.EXPECTED_TITLE)) {
                System.out.println("Test Passed");
            } else {
                System.out.println("Test Failed");
            }

            // Perform login
            Login.login(driver, AllCredentials.USER_NAME, AllCredentials.USER_PASSWORD);
            Thread.sleep(1000);

            // Add an item to the cart
            AddToCart.addRandomItemToCart(driver);
            Thread.sleep(2000);

            // Complete the order
            Checkout.completeOrder(driver);
            Thread.sleep(2000);

            // Return to the home page
            ReturnToHomePage.navigateToHomePage(driver);
            Thread.sleep(2000);


            if (actualTitle.equals(AllCredentials.EXPECTED_TITLE)) {
                System.out.println("Test Passed");
            } else {
                System.out.println("Test Failed");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
