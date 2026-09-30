package standard_user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SidebarAboutTest {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Open menu and click About
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("about_sidebar_link")).click();
        Thread.sleep(5000);
        if (driver.getCurrentUrl().contains("saucelabs.com")) {
            System.out.println("TEST PASSED: Successfully navigated to SauceLabs.");
        } else {
            System.out.println("TEST FAILED: Did not navigate to SauceLabs. Current URL: " + driver.getCurrentUrl());
        }
        driver.quit();
    }
}