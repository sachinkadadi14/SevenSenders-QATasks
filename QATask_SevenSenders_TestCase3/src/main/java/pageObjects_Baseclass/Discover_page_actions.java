package pageObjects_Baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Discover_page_actions {

	public WebDriver driver;
	
	By Discover = By.cssSelector("a[href*='discover']");
	By road_cycling = By.cssSelector("a[href*='road-cycling-routes']");
	By dropdown = By.cssSelector("span.tw-font-bold:nth-child(2)");
	By German = By.xpath("/html/body/div[1]/div/div[1]/div/div/div[2]/div[3]/div/div/ul/li[1]/a");
	By title_German = By.cssSelector("h1.tw-text-white");					
	
	
	public Discover_page_actions(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getDiscover()
	{
		return driver.findElement(Discover);
	}
	
	public WebElement get_roadcycling()
	{
		return driver.findElement(road_cycling);
	}
	public WebElement get_dropdown()
	{
		return driver.findElement(dropdown);
	}
	public WebElement get_German()
	{
		return driver.findElement(German);
	}
	public WebElement get_title_German()
	{
		return driver.findElement(title_German);
	}
	
	
	
}
