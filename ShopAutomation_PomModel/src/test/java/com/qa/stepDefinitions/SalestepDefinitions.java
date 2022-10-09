package com.qa.stepDefinitions;

import org.testng.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.ShopPage;
import com.qa.util.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalestepDefinitions extends TestBase{
	
	HomePage homepage = new HomePage();
	ShopPage shoppage = new ShopPage();

	
	@When("Click on Sale")
	public void Click_on_Sale() {
		shoppage.Sale();
	}
	
	@Then("validate the display")
	public void validate_the_display() {
		//String Actual = "https://practice.automationtesting.in/product/android-quick-start-guide/";
		String Actual = driver.getCurrentUrl();
		String Expected = "https://practice.automationtesting.in/product/android-quick-start-guide/";
    	Assert.assertEquals(Actual,Expected); 
	    System.out.println("Sale Product is diplayed");
	}
}
