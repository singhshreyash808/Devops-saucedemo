package standard_user;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SidebarAllItemsTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Open menu
        driver.findElement(By.id("react-burger-menu-btn")).click();
        
        // 1-second pause for the slide animation to finish
        Thread.sleep(1000);

        driver.findElement(By.id("inventory_sidebar_link")).click();

        System.out.println("Returned to inventory: " + driver.getCurrentUrl().contains("inventory.html"));
        driver.quit();
    }
}