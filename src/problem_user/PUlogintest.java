package problem_user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PUlogintest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        // 1. Login with valid credentials
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("problem_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(1000);

        // 2. Check: did login succeed and redirect to Products page?
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("inventory.html")) {
            System.out.println("TC1 Login Test: PASS");
        } else {
            System.out.println("TC1 Login Test: FAIL");
        }

        Thread.sleep(2000);
        driver.quit();
    }
}