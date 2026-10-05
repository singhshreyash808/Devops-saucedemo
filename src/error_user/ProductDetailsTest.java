package error_user;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductDetailsTest {

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

        // Click Backpack
        driver.findElement(By.xpath(
                PropertiesManager.getProperty("backpackProduct"))).click();

        Thread.sleep(1500);

        if (driver.getCurrentUrl().contains("inventory-item")) {
            System.out.println("Product details opened successfully");
        } else {
            System.out.println("Product details failed");
        }

        driver.quit();
    }
}