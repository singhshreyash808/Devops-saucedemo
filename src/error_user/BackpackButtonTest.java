package error_user;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackpackButtonTest {

	public static void main(String[] args) {
		
	

	

		        WebDriver driver = new ChromeDriver();

		        driver.get("https://www.saucedemo.com/");
		        driver.manage().window().maximize();

		        
		        driver.findElement(By.id("user-name"))
		                .sendKeys("error_user");

		        driver.findElement(By.id("password"))
		                .sendKeys("secret_sauce");

		        driver.findElement(By.id("login-button"))
		                .click();

		        // Click Backpack Add to Cart
		        driver.findElement(By.id("add-to-cart-sauce-labs-backpack"))
		                .click();

		        // Check cart
		        String cartCount = driver.findElement(
		                By.className("shopping_cart_badge")
		        ).getText();

		        if (cartCount.equals("1")) {
		            System.out.println("PASS: Backpack button is working.");
		        } else {
		            System.out.println("FAIL: Backpack button is not working.");
		        }

		        driver.quit();
		    }
		

	

}
