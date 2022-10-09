package com.qa.stepDefinitions;

import org.testng.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.ShopPage;
import com.qa.util.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewPopularProductsstepDefinitions extends TestBase {
	
	 HomePage homepage = new HomePage();
	 ShopPage shoppage = new ShopPage();
	
	
	
	
	@When("Drop Down is Selected Pouplar")
	public void drop_down_is_selected_pouplar() {
		shoppage.DropDown();
		
	   
	}
	@Then("Validate the products displayed")
	public void validate_the_products_displayed() {
		String Actual = driver.getCurrentUrl();
    	//String Actual = "https://practice.automationtesting.in/shop/?orderby=popularity";
		String Expected = "https://practice.automationtesting.in/shop/?orderby=popularity";
    	Assert.assertEquals(Actual,Expected); 
	    System.out.println("Popular Products are displayed");
	  
	}

}
