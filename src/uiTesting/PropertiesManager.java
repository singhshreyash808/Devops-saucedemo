package uiTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesManager {

    static Properties pr = new Properties();

    static {
        try {
            FileInputStream fs = new FileInputStream(
                "D:\\CRCDevops\\Devops-saucedemo\\Xpath.Properties"
            );

            pr.load(fs);
            fs.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}