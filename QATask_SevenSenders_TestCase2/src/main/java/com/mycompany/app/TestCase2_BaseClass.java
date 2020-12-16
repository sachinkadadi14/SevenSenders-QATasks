package com.mycompany.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2_BaseClass {
	
	public WebDriver driver;

	
	public WebDriver Initialisedriver() throws IOException 
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("E:\\Selenium\\Workspace\\QATask_SevenSenders_TestCase2\\src\\main\\java\\com\\mycompany\\app\\Data.properties");
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
		
		 return driver;
	}
}
