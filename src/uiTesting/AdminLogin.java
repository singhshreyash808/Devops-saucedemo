package uiTesting;
import java.util.*;

import org.openqa.selenium.By;

public class AdminLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocatorManager lm =new LocatorManager();
		dr.findElement(By.xpath(lm.getXpath("Admin_input"))).sendkeys("");
		System.out.println(lm.getXpath("Admin_input"));
		
	}

}
