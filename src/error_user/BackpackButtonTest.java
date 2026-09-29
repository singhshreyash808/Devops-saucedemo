package error_user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackpackButtonTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        Thread.sleep(1000);

        // Login
        driver.findElement(By.xpath(
                PropertiesManager.getProperty("username"))).sendKeys("error_user");

        driver.findElement(By.xpath(
                PropertiesManager.getProperty("password"))).sendKeys("secret_sauce");

        driver.findElement(By.xpath(
                PropertiesManager.getProperty("loginButton"))).click();

        Thread.sleep(1500);

        // Add Backpack
        driver.findElement(By.xpath(
                PropertiesManager.getProperty("backpackButton"))).click();

        Thread.sleep(1000);

        System.out.println("Backpack added to cart successfully");

        driver.quit();
    }
}