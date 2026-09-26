package standard_user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class StandardUserLoginTest {

    public static void main(String[] args) throws InterruptedException {
        // 1. Launch Microsoft Edge
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        // --- PAUSE AT STEP: After opening site ---
        System.out.println("Website opened. Pausing for 3 seconds...");
        Thread.sleep(3000);

        // 2. Type credentials
        driver.findElement(By.id("user-name")).clear();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        // --- PAUSE AT STEP: After filling inputs ---
        System.out.println("Credentials entered. Pausing for 3 seconds before clicking login...");
        Thread.sleep(3000);

        // 3. Click Login
        driver.findElement(By.id("login-button")).click();

        // Check result
        if (driver.getCurrentUrl().contains("inventory.html")) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }

        // --- FINAL PAUSE: Stop at the very end before closing ---
        System.out.println("Test finished. Pausing for 7 seconds before closing browser...");
        Thread.sleep(7000);

        // 4. Close Browser
        driver.quit();
    }
}