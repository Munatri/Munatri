package com.qa.stepDefinitions;

import org.testng.Assert;

import com.qa.pages.CheckoutPage;
import com.qa.pages.HomePage;
import com.qa.pages.ShopPage;
import com.qa.util.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlacingOrderstepDefinitions extends TestBase {

	HomePage homepage = new HomePage();
	CheckoutPage checkoutpage = new CheckoutPage();
	ShopPage shoppage = new ShopPage();

	

	@Given("Click on Add to Basket")
	public void click_on_add_to_basket() {
		
	    shoppage.AddToBasket();
	}
	
	@Given("Click on View Basket")
	public void click_on_view_basket() {
		shoppage.ViewBasket();
	}
	@When("Clicked on Proceed to Checkout page")
	public void clicked_on_proceed_to_checkout_page() {
	   checkoutpage.Checkout();
	}
	@When("Checkout Page opens with details to be filled")
	public void checkout_page_opens_with_details_to_be_filled() {
	   String Actual = driver.getCurrentUrl();
	   String Expected = "https://practice.automationtesting.in/checkout/";
	   Assert.assertEquals(Actual,Expected); 
	}
	@Then("Fill Details and Place Order")
	public void fill_details_and_place_order() {
		checkoutpage.FillupDetails();
	}
	@Then("Order Confirmation details will be displayed")
	public void order_confirmation_details_will_be_displayed() {
		String Expected = "https://practice.automationtesting.in/checkout/";
		String Actual = driver.getCurrentUrl();
		Assert.assertEquals(Actual,Expected); 

	}
}
