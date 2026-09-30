import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LocatorManager {

	
		
		static Properties pr = new Properties();
		
		static {	
			try {
			FileInputStream fs =new FileInputStream("D:\\CRCDevops\\Devops-saucedemo\\Xpath.Properties");
			
		
			pr.load(fs);
		}
			catch(IOException e) {
				
			throw new RuntimeException("File Not found");
			
			}
			
		}
			
		
		
		public static String getXpath(String key) {
			
			return pr.getProperty(key);
		}

	
	

}
