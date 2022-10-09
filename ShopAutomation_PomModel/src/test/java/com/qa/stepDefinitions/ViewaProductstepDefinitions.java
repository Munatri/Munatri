package com.qa.stepDefinitions;

import org.testng.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.OpenaProductPage;
import com.qa.util.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewaProductstepDefinitions extends TestBase{

	 HomePage homepage = new HomePage();
	
	 OpenaProductPage openaproductpage = new OpenaProductPage();
	
	@When("Clicked on an Item")
	public void Clicked_on_an_Item() {
		openaproductpage.ViewProduct();
	}
	
	@Then("Only that item opens")
	public void Only_that_item_opens() {
		//String Actual = "https://practice.automationtesting.in/product/android-quick-start-guide/";
    	String Actual = driver.getCurrentUrl();
		String Expected = "https://practice.automationtesting.in/product/android-quick-start-guide/";
    	Assert.assertEquals(Actual,Expected); 
	    System.out.println("Products can be viewed");
	}
}
