package com.qa.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.TestBase;

public class CheckoutPage extends TestBase {

	By ProceedtoCheckout = By.xpath("//a[@class='checkout-button button alt wc-forward']");
	By PlaceOrder = By.xpath("//input[@id='place_order']");
	By COD = By.xpath("//input[@id='payment_method_cod']");
	
	public void SelectDropDown(String xpath, String x)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	Select Order = new Select(driver.findElement(By.xpath(xpath)));
   	    Order.selectByVisibleText(x);
		
	}
	
	public static void InsertItem(String xpath,String a)
	{
		   
		driver.findElement(By.xpath(xpath)).sendKeys(a);
		
	}
	
	
	public CheckoutPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void Checkout()
	{
		driver.findElement(ProceedtoCheckout).click();
	}
	
	public void FillupDetails()
	{
		
		InsertItem("//input[@name='billing_first_name']", "Munatri");
		InsertItem("//input[@name='billing_last_name']", "Baruah");
		InsertItem("//input[@name='billing_email']", "munatrib@gmail.com");
		InsertItem("//input[@name='billing_phone']", "1234567890");
		InsertItem("//input[@id='billing_address_1']", "Bangalore");
		InsertItem("//input[@id='billing_city']", "Bangalore");
		InsertItem("//input[@id='billing_postcode']", "560048");
		
		SelectDropDown("//select[@id='billing_country']", "India");
		//SelectDropDown("//ul[@id='select2-results-2']", "Karnataka");
		//InsertItem("//ul[@id='select2-results-2']", "Karnataka");
		driver.findElement(COD).click();
		driver.findElement(PlaceOrder).click();
		
		
		
		
	}
}
