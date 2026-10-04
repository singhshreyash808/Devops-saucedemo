package performance_glitch_user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckoutInformationTest {

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

        driver.findElement(By.className("shopping_cart_link"))
                .click();

        Thread.sleep(1000);

        driver.findElement(By.id("checkout")).click();

        Thread.sleep(2000);

        driver.findElement(By.id("first-name"))
                .sendKeys("Ayush");

        driver.findElement(By.id("last-name"))
                .sendKeys("Rathore");

        driver.findElement(By.id("postal-code"))
                .sendKeys("201001");

        driver.findElement(By.id("continue")).click();

        Thread.sleep(2000);

        if (driver.getCurrentUrl().contains("checkout-step-two.html")) {
            System.out.println("CHECKOUT INFORMATION TEST PASSED");
        } else {
            System.out.println("CHECKOUT INFORMATION TEST FAILED");
        }

        driver.quit();
    }
}