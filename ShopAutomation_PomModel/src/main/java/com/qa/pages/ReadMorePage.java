package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class ReadMorePage extends TestBase{

	
	public ReadMorePage()
	{
		PageFactory.initElements(driver,this);
		
	}
	//By Read = By.xpath("//a[@class='button product_type_simple ajax_add_to_cart']");
	//By Read = By.xpath("//a[@href='https://practice.automationtesting.in/product/android-quick-start-guide/']");
	By Read = By.xpath("//a[@href='https://practice.automationtesting.in/product/android-quick-start-guide/'][normalize-space()='Read more']");
	
	public void ReadMore()
	{
		driver.findElement(Read).click();
	}
}

