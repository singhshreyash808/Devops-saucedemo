package standard_user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Checkouttest {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        // 1. Log in
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(1000);

        // 2. Add an item and open the cart
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(1000);

        // 3. Initiate checkout
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(1000);

        // 4. Fill customer details
        driver.findElement(By.id("first-name")).sendKeys("Shreya");
        driver.findElement(By.id("last-name")).sendKeys("Jha");
        driver.findElement(By.id("postal-code")).sendKeys("12345");
        driver.findElement(By.id("continue")).click();
        Thread.sleep(1000);

        // 5. Complete order
        driver.findElement(By.id("finish")).click();
        Thread.sleep(1000);
        
        System.out.println(driver.findElement(By.className("complete-header")).getText());
        driver.findElement(By.id("generate-pdf-order")).click();
        Thread.sleep(5000);
        System.out.println("pdf is generated");
        driver.quit();
    }
}