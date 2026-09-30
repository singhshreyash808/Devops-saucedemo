package standard_user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Removeaddtocart {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        // 1. Login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(1000);

 
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();
        
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(1000);

       
        String page = driver.getPageSource();
        if (!page.contains("Sauce Labs Backpack")) {
            System.out.println("Add to Cart Test: PASS");
        } else {
            System.out.println("Add to Cart Test: FAIL");
        }

        Thread.sleep(2000);
        driver.quit();
    }
}