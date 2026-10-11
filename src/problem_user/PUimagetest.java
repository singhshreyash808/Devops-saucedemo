package problem_user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class PUimagetest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        // 1. Login with problem_user
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("problem_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(1000);

        // 2. Check product images
        List<WebElement> images = driver.findElements(By.xpath("//div[@class='inventory_item_img']//img"));

        boolean allImagesCorrect = true;
        for (WebElement img : images) {
            String src = img.getAttribute("src");
            // Known problem_user bug: all images point to the same "sl-404" placeholder image
            if (src != null && src.contains("sl-404")) {
                allImagesCorrect = false;
                break;
            }
        }

        if (allImagesCorrect) {
            System.out.println("TC2 Image Test: PASS");
        } else {
            System.out.println("TC2 Image Test: FAIL - Images are incorrect/duplicated");
        }

        Thread.sleep(2000);
        driver.quit();
    }
}