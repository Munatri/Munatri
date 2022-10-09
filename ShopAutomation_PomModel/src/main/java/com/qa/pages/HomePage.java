package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase {

	
	By Shop = By.xpath("//a[@href= 'https://practice.automationtesting.in/shop/']");
	//By Shopping = By.xpath("//li[@id='menu-item-40']");
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
		
	}
	public void OpenUrl()
	{
		
		   TestBase.Initilization();
		   
	}
	
	public void Shop()
	{
		
		 driver.findElement(Shop).click();
	}
	
	
	
}
