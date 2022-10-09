package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class OpenaProductPage extends TestBase{
	
	public OpenaProductPage()
	{
		PageFactory.initElements(driver,this);
	}

	By Product = By.xpath("//img[@title= 'Android Quick Start Guide']");
	
	public void ViewProduct()
	{
		driver.findElement(Product).click();
	}
	
}
