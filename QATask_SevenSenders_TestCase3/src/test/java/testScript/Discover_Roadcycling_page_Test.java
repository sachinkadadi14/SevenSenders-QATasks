package testScript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects_Baseclass.Discover_page_actions;
import pageObjects_Baseclass.TestCase3_BaseClass;

public class Discover_Roadcycling_page_Test extends TestCase3_BaseClass {
	
	@Test
	
	public void Hike_page_Navigation () throws IOException, InterruptedException
	{
		driver = Initialisedriver();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("E:\\Selenium\\Workspace\\QATask_SevenSenders_TestCase3\\src\\main\\java\\pageObjects_Baseclass\\Data.properties");
		prop.load(fis); 
		String URL=prop.getProperty("url");
		
		driver.get(URL); //Get URl of Komoot.com
		
		
		Discover_page_actions l = new Discover_page_actions(driver); 
		
		l.getDiscover().click(); 									//User Click on Discover tab
		l.get_roadcycling().click(); 										//User Click on Hiking trails and routes tab
		l.get_dropdown().click();
		Thread.sleep(3000);
		l.get_German().click();
		Assert.assertEquals(l.get_title_German().getText(), "Rennradtouren");
		
		
	}

}
