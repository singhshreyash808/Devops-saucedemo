package uiTesting;
import java.util.Properties;
import java.io.*;

public class LocatorManager {

	
		// TODO Auto-generated method stub
		static Properties pr = new Properties();
		static {
			
			try {
			FileInputStream fs =new FileInputStream("D:\\CRCDevops\\Xpath.Properties");
			
		
			pr.load(fs);
			fs.close();
		}
			catch(IOException e) {
				
			throw new RuntimeException("File Not found");
			
			}
			
		}
		
		public String getXpath(String key) {
			
			return pr.getProperty(key);
		}

	


}
