package com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shop_page_actions {

	public WebDriver driver;
	
	By Shop = By.cssSelector("a.tw-inline-flex > span:nth-child(1)");
	By get_worldpack = By.cssSelector("a[href*='world-pack']");
	By title_worldpack = By.cssSelector(".css-6812jg");
	By regionbundle = By.cssSelector("a[href*='/product/regions']");
	By title_regionbundle= By.cssSelector("h3.tw-text-primary");
	
	public Shop_page_actions(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getShop()
	{
		return driver.findElement(Shop);
	}
	
	public WebElement worldpack()
	{
		return driver.findElement(get_worldpack);
	}
	
	public WebElement get_title_worldpack()
	{
		return driver.findElement(title_worldpack);
	}
	
	public WebElement get_regionbundle()
	{
		return driver.findElement(regionbundle);
	}
	
	public WebElement get_title_regionbundle()
	{
		return driver.findElement(title_regionbundle);
	}

}

	
