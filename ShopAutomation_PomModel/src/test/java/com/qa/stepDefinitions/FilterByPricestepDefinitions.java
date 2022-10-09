package com.qa.stepDefinitions;

import org.testng.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.ShopPage;
import com.qa.util.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FilterByPricestepDefinitions extends TestBase {
	
	
	HomePage homepage = new HomePage();
	ShopPage shoppage = new ShopPage();
	
	
	@Given("Open the Website and Click on Shop")
    public void Open_the_Website_and_Click_on_Shop()  {
		
       TestBase.Initilization();
       homepage.Shop();
	   
    }

    @When("Filter is within Range")
    public void Filter_is_within_Range() {
       shoppage.SlideLink();
       shoppage.Filter();
       
       
    }

    @Then("Display the results")
    public void Display_the_results() {
    	String Actual = driver.getCurrentUrl();
    	String Expected = "https://practice.automationtesting.in/shop/?min_price=150&max_price=449";
    	Assert.assertEquals(Actual,Expected);  
    		
        System.out.println("The products wihin the range of 150rs to 450rs are displayed");
    }
}
