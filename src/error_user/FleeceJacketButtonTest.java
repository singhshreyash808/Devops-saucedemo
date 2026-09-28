package error_user;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FleeceJacketButtonTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        // Login
        driver.findElement(By.id("user-name"))
                .sendKeys("error_user");

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
                .click();

        // Click Fleece Jacket Add to Cart
        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"))
                .click();

        // Check cart
        String cartCount = driver.findElement(
                By.className("shopping_cart_badge")
        ).getText();

        if (cartCount.equals("1")) {
            System.out.println("PASS: Fleece Jacket button is working.");
        } else {
            System.out.println("FAIL: Fleece Jacket button is not working.");
        }

        driver.quit();
    }
}