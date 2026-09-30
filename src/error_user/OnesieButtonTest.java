package error_user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnesieButtonTest {

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

        // Click Onesie Add to Cart
        driver.findElement(By.id("add-to-cart-sauce-labs-onesie"))
                .click();

        // Check cart
        String cartCount = driver.findElement(
                By.className("shopping_cart_badge")
        ).getText();

        if (cartCount.equals("1")) {
            System.out.println("PASS: Onesie button is working.");
        } else {
            System.out.println("FAIL: Onesie button is not working.");
        }

        driver.quit();
    }
}