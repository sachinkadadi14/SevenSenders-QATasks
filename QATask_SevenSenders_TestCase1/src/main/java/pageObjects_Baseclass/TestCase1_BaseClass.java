package pageObjects_Baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase1_BaseClass {
	
	public WebDriver driver;

	
	public WebDriver Initialisedriver() throws IOException 
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Sachin Kadadi\\QATask_SevenSenders_TestCase1\\src\\main\\java\\pageObjects_Baseclass\\Data.properties");
		prop.load(fis);
		String BrowserName=prop.getProperty("browser");
		
		
		 if (BrowserName.equals ("chrome"))
		 {  
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Kadadi\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
		 }
		 else
		 {
			 System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			 driver=new FirefoxDriver();
		 }
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 return driver;
	}
}
