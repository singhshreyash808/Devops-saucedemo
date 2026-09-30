package uiTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingCartTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        Thread.sleep(1000);

        // Login
        driver.findElement(By.xpath(
                PropertiesManager.getProperty("username"))).sendKeys("standard_user");

        driver.findElement(By.xpath(
                PropertiesManager.getProperty("password"))).sendKeys("secret_sauce");

        driver.findElement(By.xpath(
                PropertiesManager.getProperty("loginButton"))).click();

        Thread.sleep(1500);

        // Add product
        driver.findElement(By.xpath(
                PropertiesManager.getProperty("backpackButton"))).click();

        // Open cart
        driver.findElement(By.xpath(
                PropertiesManager.getProperty("shoppingCart"))).click();

        Thread.sleep(1500);

        if (driver.getCurrentUrl().contains("cart.html")) {
            System.out.println("Shopping Cart opened successfully");
        } else {
            System.out.println("Shopping Cart failed");
        }

        driver.quit();
    }
}