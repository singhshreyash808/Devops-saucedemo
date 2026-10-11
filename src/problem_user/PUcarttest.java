package problem_user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PUcarttest{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        // 1. Login
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("problem_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(1000);

        // 2. Add a product to the cart
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        Thread.sleep(500);

        // 3. Check cart badge count
        String cartBadge = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).getText();

        if (cartBadge.equals("1")) {
            System.out.println("TC3 Add to Cart Test: PASS");
        } else {
            System.out.println("TC3 Add to Cart Test: FAIL");
        }

        Thread.sleep(2000);
        driver.quit();
    }
}