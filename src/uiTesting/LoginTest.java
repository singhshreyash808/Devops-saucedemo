package uiTesting;
import java.net.MalformedURLException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;


public class LoginTest {
	

	    public static void main(String[] args) throws MalformedURLException {

	        // Configure Chrome browser options 
	        ChromeOptions options = new ChromeOptions();

<<<<<<< HEAD
    	    // Initialize RemoteWebDriver with the configured options
	        WebDriver driver = new RemoteWebDriver( options);

	        // Navigate to Google homepage
=======
	     // Initialize RemoteWebDriver with the configured options
	        WebDriver driver = new RemoteWebDriver( options);

	        // Navigate the browser to the Google homepage
>>>>>>> hreya
	        driver.get("https://www.google.com");

	        // Print page title
	        System.out.println("Page Title: " + driver.getTitle());

	        // Close the browser session
	        driver.quit();
	    }
	}

