package uiTesting;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ChromeDriver dr =new ChromeDriver();
		LocatorManager lm =new LocatorManager();
		dr.findElement(By.xpath(lm.getXpath("Admin_input"))).sendKeys("");
		System.out.println(lm.getXpath("Admin_input"));
		
	}

}
