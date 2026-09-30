package error_user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FleeceJacketButtonTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        Thread.sleep(1000);

        driver.findElement(By.xpath(
                PropertiesManager.getProperty("username"))).sendKeys("error_user");

        driver.findElement(By.xpath(
                PropertiesManager.getProperty("password"))).sendKeys("secret_sauce");

        driver.findElement(By.xpath(
                PropertiesManager.getProperty("loginButton"))).click();

        Thread.sleep(1500);

        driver.findElement(By.xpath(
                PropertiesManager.getProperty("fleeceJacketButton"))).click();

        Thread.sleep(1000);

        System.out.println("fleeceJacket added successfully");

        driver.quit();
    }
}