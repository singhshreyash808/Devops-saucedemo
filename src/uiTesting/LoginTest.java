package uiTesting;
import java.net.MalformedURLException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;


public class LoginTest {
	

	    public static void main(String[] args) throws MalformedURLException {

	    
	        ChromeOptions options = new ChromeOptions();

	        
	        WebDriver driver = new RemoteWebDriver( options);

	   
	        driver.get("https://www.google.com");

	        // Print page title
	        System.out.println("Page Title: " + driver.getTitle());

	        // Close browser
	        driver.quit();
	    }
	}

