package error_user;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckoutTest {

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

        Thread.sleep(1000);

        // Checkout
        driver.findElement(By.xpath(
                PropertiesManager.getProperty("checkoutButton"))).click();

        Thread.sleep(1000);

        // Enter customer details
        driver.findElement(By.xpath(
                PropertiesManager.getProperty("firstName"))).sendKeys("Shreyash");

        driver.findElement(By.xpath(
                PropertiesManager.getProperty("lastName"))).sendKeys("Singh");

        driver.findElement(By.xpath(
                PropertiesManager.getProperty("postalCode"))).sendKeys("201001");

        // Continue
        driver.findElement(By.xpath(
                PropertiesManager.getProperty("checkoutContinue"))).click();

        Thread.sleep(1500);

        System.out.println("Checkout information submitted successfully");

        driver.quit();
    }
}