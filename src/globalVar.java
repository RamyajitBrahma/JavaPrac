import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class globalVar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\Jit\\Desktop\\Selenium\\Javab\\src\\globalVar.properties");
        prop.load(fis);
        String browser = prop.getProperty("browser");
        String Url = prop.getProperty("URL");
        
        System.out.println(Url);
        System.out.println(browser);
        
        prop.setProperty("browser", "firefox");
        browser = prop.getProperty("browser");
        System.out.println(browser);
        
      FileOutputStream fos = new FileOutputStream("C:\\Users\\Jit\\Desktop\\Selenium\\Javab\\src\\globalVar.properties");
      prop.store(fos, "it is changed");
        
	}

}
