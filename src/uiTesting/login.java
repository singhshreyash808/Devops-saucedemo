package uiTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

    public static void main(String[] args) throws InterruptedException {

        
        WebDriver driver = new ChromeDriver();

              driver.get("https://www.saucedemo.com/");

        Thread.sleep(1000);
        driver.manage().window().maximize();

        Thread.sleep(1000);        
        driver.findElement(By.id("user-name")).sendKeys("error_user");
        Thread.sleep(1000);
        
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);
      
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(1000);
       String currentURL = driver.getCurrentUrl();
       Thread.sleep(1000);
        if (currentURL.contains("inventory.html")) {

            System.out.println("Login Successful");

        } else {

            System.out.println("Login Failed");
        }
       // driver.quit();
    }
}