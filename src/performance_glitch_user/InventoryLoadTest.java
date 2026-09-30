package performance_glitch_user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InventoryLoadTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name"))
                .sendKeys("performance_glitch_user");

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        long startTime = System.currentTimeMillis();

        driver.findElement(By.id("login-button")).click();

        Thread.sleep(5000);

        long endTime = System.currentTimeMillis();

        System.out.println("Inventory Load Time: "
                + (endTime - startTime) + " ms");

        boolean inventoryLoaded =
                driver.findElement(By.className("inventory_list")).isDisplayed();

        if (inventoryLoaded) {
            System.out.println("INVENTORY LOAD TEST PASSED");
        } else {
            System.out.println("INVENTORY LOAD TEST FAILED");
        }

        driver.quit();
    }
}