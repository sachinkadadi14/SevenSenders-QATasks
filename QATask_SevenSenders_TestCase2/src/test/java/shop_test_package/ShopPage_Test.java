package shop_test_package;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mycompany.app.Shop_page_actions;
import com.mycompany.app.TestCase2_BaseClass;

public class ShopPage_Test extends TestCase2_BaseClass {
	
	@Test
	
	public void Hike_page_Navigation () throws IOException, InterruptedException
	{
		driver = Initialisedriver();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("E:\\Selenium\\Workspace\\QATask_SevenSenders_TestCase2\\src\\main\\java\\com\\mycompany\\app\\Data.properties");
		prop.load(fis); 
		String URL=prop.getProperty("url");
		
		driver.get(URL); //Get URl of Komoot.com
		driver.manage().window().maximize();
		
		Shop_page_actions l = new Shop_page_actions(driver); 
		
		l.getShop().click();
		l.worldpack().click();
		Assert.assertEquals(l.get_title_worldpack().getText(), "Sign up or log in to unlock a region"); //Validate successfully display of worldpack page
		driver.navigate().back();
		l.get_regionbundle().click();
		Assert.assertEquals(l.get_title_regionbundle().getText(), "Explore the whole world for one low price"); //Validate successfully display of regionalbundle page
		
		
											
		
			
	
	}

}
