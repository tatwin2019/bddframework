package stepDefinitions;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.LogInPage;
import pages.MainPage;
import util.BasePage;
import util.Utils;

public class LogInStepDefinitions {
	
	LogInPage loginPage;
	MainPage mainPage;
	
	@Given("^User is on Wikipedia main page$")
	public void user_is_on_Wikipedia_main_page() throws Throwable {
		BasePage.initialize();
		mainPage = new MainPage();
	}

	@When("^User clicks on Log In link$")
	public void user_clicks_on_Log_In_link() throws Throwable {
		mainPage.goToLoginPage();
	}

	@Then("^Log In page is displayed$")
	public void log_In_page_is_displayed() throws Throwable {
		loginPage = new LogInPage();
	}

	@When("^User types username$")
	public void user_types_username() throws Throwable {
		loginPage.typeUsername(Utils.username);
	}

	@When("^User types password$")
	public void user_types_password() throws Throwable {
		loginPage.typePassword(Utils.password);
	}

	@When("^User clicks Log in button$")
	public void user_clicks_Log_in_button() throws Throwable {
		loginPage.clickLoginButton();
	}

	@Then("^User is logged and username is displayed$")
	public void user_is_logged_and_username_is_displayed() throws Throwable {
		Assert.assertEquals(Utils.username, BasePage.driver.findElement(By.cssSelector("li#pt-userpage a.new")).getText());
	}

}
