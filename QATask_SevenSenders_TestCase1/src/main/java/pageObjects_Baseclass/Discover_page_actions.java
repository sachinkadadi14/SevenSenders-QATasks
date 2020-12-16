package pageObjects_Baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Discover_page_actions {

	public WebDriver driver;
	
	By Discover = By.cssSelector("a[href*='discover']");
	By Hiking = By.cssSelector("a[href*='hiking-trails']");
	By location_search = By.xpath("//*[@id=\"pageMountNode\"]/div/div[2]/div[2]/main/div[1]/div[2]/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/form/input");
	By Hiking_trails = By.cssSelector("a[href*='district']");
	By title = By.cssSelector("h1.tw-text-white");
	
	public Discover_page_actions(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getDiscover()
	{
		return driver.findElement(Discover);
	}
	
	public WebElement getHiking()
	{
		return driver.findElement(Hiking);
	}
	
	public WebElement location_search()
	{
		 return driver.findElement(location_search);
		   
	}
	public WebElement get_Hiking_trails()
	{
		 return driver.findElement(Hiking_trails);
		   
	}
	public WebElement get_title()
	{
		 return driver.findElement(title);
		   
	}
}
