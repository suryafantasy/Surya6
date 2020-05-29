package com.stepdefinition;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.HomePage;
import com.utils.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdef extends TestBase{
	Logger log=Logger.getLogger(LoginStepdef.class);
	public LoginStepdef() throws IOException {
		super();
		
	}

	TestBase obj=new TestBase();
	HomePage homepage=new HomePage();
	

	@Given("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		obj.Initialization();
		log.info("Initialize webdriver");
	}
//	@When ("^user click on clear cookies button$")
//	public void user_click_on_clear_cookies_button() throws Throwable{
//		homepage.click();
//	}
	@When("^user click on clear cookies button$")
	public void user_click_on_clear_cookies_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		homepage.click();
		log.info("Clicking action");
	}
	
	
	@When("^User gives input as$")
	public void user_gives_input_as() throws Throwable {
     homepage.search();
	}


	@Then("^user sort the price details$")
	public void user_sort_the_price_details() throws Throwable {
	    homepage.sorting();
	}
}
