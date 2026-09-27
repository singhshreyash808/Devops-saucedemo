package uiTesting;
import java.util.Properties;
import java.io.*;

public class LocatorManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties pr = new Properties();
		static {
			
			try {
			FileInputStream fs =new FileInputStream("D:\\CRCDevops\\Xpath.Properties");
			
		
			pr.load(fs);
		}
			catch(IOException e) {
				
			return new RuntimeException("File Not found");
			
			}
			}
		
		
		public static String getXpath(String key) {
			
			return pr.getProperty(key);
		}

	}
	

}
