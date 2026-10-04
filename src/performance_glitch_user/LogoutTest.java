package performance_glitch_user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoutTest {

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

        driver.findElement(By.id("react-burger-menu-btn"))
                .click();

        Thread.sleep(1000);

        driver.findElement(By.id("logout_sidebar_link"))
                .click();

        Thread.sleep(2000);

        long endTime = System.currentTimeMillis();

        System.out.println("Logout Response Time: "
                + (endTime - startTime) + " ms");

        if (driver.getCurrentUrl().equals("https://www.saucedemo.com/")) {
            System.out.println("LOGOUT TEST PASSED");
        } else {
            System.out.println("LOGOUT TEST FAILED");
        }

        driver.quit();
    }
}