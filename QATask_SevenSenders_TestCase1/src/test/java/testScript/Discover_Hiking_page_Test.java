package testScript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects_Baseclass.Discover_page_actions;
import pageObjects_Baseclass.TestCase1_BaseClass;

public class Discover_Hiking_page_Test extends TestCase1_BaseClass {
	
	@Test
	
	public void Hike_page_Navigation () throws IOException, InterruptedException
	{
		driver = Initialisedriver();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Sachin Kadadi\\QATask_SevenSenders_TestCase1\\src\\main\\java\\pageObjects_Baseclass\\Data.properties");
		prop.load(fis); 
		String URL=prop.getProperty("url");
		//String Location=prop.getProperty("location");
		String title=prop.getProperty("Title");
		
		driver.get(URL); //Get URl of Komoot.com
		
		
		Discover_page_actions l = new Discover_page_actions(driver); 
		
		l.getDiscover().click(); 									//User Click on Discover tab
		l.getHiking().click(); 										//User Click on Hiking trails and routes tab
		l.location_search().sendKeys("Berlin");						//User enters location to search
		l.get_Hiking_trails().click();								//User clicks on Hiking in Peak District tab	
		Assert.assertEquals(l.get_title().getText(), title); 		// Validate if user is able to successfully view the page
			
	
	}

}
