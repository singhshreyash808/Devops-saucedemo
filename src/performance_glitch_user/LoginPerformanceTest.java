package performance_glitch_user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPerformanceTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        long startTime = System.currentTimeMillis();

        driver.findElement(By.id("user-name"))
                .sendKeys("performance_glitch_user");

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
                .click();

        Thread.sleep(5000);

        long endTime = System.currentTimeMillis();

        System.out.println("Login Response Time: "
                + (endTime - startTime) + " ms");

        if (driver.getCurrentUrl().contains("inventory.html")) {
            System.out.println("LOGIN TEST PASSED");
        } else {
            System.out.println("LOGIN TEST FAILED");
        }

        driver.quit();
    }
}