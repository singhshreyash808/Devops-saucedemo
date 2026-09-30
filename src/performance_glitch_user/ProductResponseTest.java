package performance_glitch_user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductResponseTest {

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

        long startTime = System.currentTimeMillis();

        driver.findElement(By.id("item_4_title_link")).click();

        Thread.sleep(3000);

        long endTime = System.currentTimeMillis();

        System.out.println("Product Response Time: "
                + (endTime - startTime) + " ms");

        if (driver.getCurrentUrl().contains("inventory-item.html")) {
            System.out.println("PRODUCT RESPONSE TEST PASSED");
        } else {
            System.out.println("PRODUCT RESPONSE TEST FAILED");
        }

        driver.quit();
    }
}