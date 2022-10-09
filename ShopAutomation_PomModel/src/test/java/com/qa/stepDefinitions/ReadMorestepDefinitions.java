package com.qa.stepDefinitions;

import org.testng.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.ReadMorePage;
import com.qa.util.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReadMorestepDefinitions extends TestBase{

	ReadMorePage readmorepage = new ReadMorePage();
	HomePage homepage = new HomePage();
	
	
	@When("Clicked on Read More")
	public void clicked_on_read_more() {
	   readmorepage.ReadMore();
	    
	}
	@Then("Item opens with Out of Stock")
	public void item_opens_with_out_of_stock() {
		//String Actual = "https://practice.automationtesting.in/product/android-quick-start-guide/";
		String Actual = driver.getCurrentUrl();
		String Expected = "https://practice.automationtesting.in/product/android-quick-start-guide/";
    	Assert.assertEquals(Actual,Expected);  
    	System.out.println("ReadMore is clicked");
	}
	
	
	
}
