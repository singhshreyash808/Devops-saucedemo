package performance_glitch_user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartLoadTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name"))
                .sendKeys("performance_glitch_user");

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        Thread.sleep(5000);

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack"))
                .click();

        long startTime = System.currentTimeMillis();

        driver.findElement(By.className("shopping_cart_link"))
                .click();

        Thread.sleep(2000);

        long endTime = System.currentTimeMillis();

        System.out.println("Cart Load Time: "
                + (endTime - startTime) + " ms");

        if (driver.getCurrentUrl().contains("cart.html")) {
            System.out.println("CART LOAD TEST PASSED");
        } else {
            System.out.println("CART LOAD TEST FAILED");
        }

        driver.quit();
    }
}