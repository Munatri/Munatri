package com.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.TestBase;

public class ShopPage extends TestBase{

	
	By Filter = By.xpath("//button[normalize-space()='Filter']");
	By Sale = By.xpath("//span[@class='onsale']");
	By AddingtoCart = By.xpath("//a[@href='/shop/?add-to-cart=182']");
	
	
	public ShopPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void SlideLink()
	{
		WebElement slider = driver.findElement(By.xpath("//div[@class='price_slider ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content']//span[2]"));
				
		Actions move = new Actions(driver);
		
		move.dragAndDropBy(slider,-29, 0).release().perform();
	}
	
	public void Filter()
	{
		driver.findElement(Filter).click();
		
	}
	
	public void DropDown()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	Select Order = new Select(driver.findElement(By.xpath("//select[@class='orderby']")));
   	    Order.selectByVisibleText("Sort by popularity");
   	    
		
	}
	
	public void Sale()
	{
		driver.findElement(Sale).click();
	}
	
	public void AddToBasket()
	{
		driver.findElement(AddingtoCart).click();
	}
	
	public void ViewBasket()
	{
		//WebElement ViewCart = driver.findElement( By.xpath("//a[href='https://practice.automationtesting.in/basket/']"));
		WebElement ViewCart = driver.findElement( By.xpath("//a[@title='View Basket']"));
		Actions shift = new Actions(driver);
		shift.moveToElement(ViewCart);
		ViewCart.click();
	}
	
}
