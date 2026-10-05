package error_user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompletePurchaseTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        Thread.sleep(1000);

        // LOGIN
        driver.findElement(By.xpath(
                PropertiesManager.getProperty("username"))).sendKeys("standard_user");

        driver.findElement(By.xpath(
                PropertiesManager.getProperty("password"))).sendKeys("secret_sauce");

        driver.findElement(By.xpath(
                PropertiesManager.getProperty("loginButton"))).click();

        Thread.sleep(1500);

        // ADD PRODUCT
        driver.findElement(By.xpath(
                PropertiesManager.getProperty("backpackButton"))).click();

        // CART
        driver.findElement(By.xpath(
                PropertiesManager.getProperty("shoppingCart"))).click();

        Thread.sleep(1000);

        // CHECKOUT
        driver.findElement(By.xpath(
                PropertiesManager.getProperty("checkoutButton"))).click();

        Thread.sleep(1000);

        // CUSTOMER DETAILS
        driver.findElement(By.xpath(
                PropertiesManager.getProperty("firstName"))).sendKeys("Shreyash");

        driver.findElement(By.xpath(
                PropertiesManager.getProperty("lastName"))).sendKeys("Singh");

        driver.findElement(By.xpath(
                PropertiesManager.getProperty("postalCode"))).sendKeys("201001");

        // CONTINUE
        driver.findElement(By.xpath(
                PropertiesManager.getProperty("checkoutContinue"))).click();

        Thread.sleep(1500);

        // FINISH
        driver.findElement(By.xpath(
                PropertiesManager.getProperty("finishButton"))).click();

        Thread.sleep(1500);

        // VERIFY ORDER
        String message = driver.findElement(By.xpath(
                PropertiesManager.getProperty("orderCompleteMessage"))).getText();

        if (message.equals("Thank you for your order!")) {
            System.out.println("Order completed successfully");
        } else {
            System.out.println("Order failed");
        }

        driver.quit();
    }
}
