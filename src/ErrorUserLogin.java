import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorUserLogin {

    public static void main(String[] args) {

        // Step 1: Open Chrome
        WebDriver driver = new ChromeDriver();

        // Step 2: Open SauceDemo website
        driver.get("https://www.saucedemo.com/");

        // Step 3: Maximize the browser
        driver.manage().window().maximize();

        // Step 4: Enter username
        driver.findElement(By.id("user-name"))
              .sendKeys("error_user");

        // Step 5: Enter password
        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

        // Step 6: Click Login button
        driver.findElement(By.id("login-button"))
              .click();

        // Step 7: Check whether login was successful
        String currentURL = driver.getCurrentUrl();

        if (currentURL.contains("inventory.html")) {

            System.out.println("Login Successful");

        } else {

            System.out.println("Login Failed");
        }

        // Step 8: Close browser
        driver.quit();
    }
}