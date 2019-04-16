package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import util.BasePage;

public class MainPage extends BasePage {
	
	@FindBy(className="mw-wiki-logo")
	WebElement wikipediaLogo;
	
	@FindBy(id="pt-login")
	WebElement login;
	
	@FindBy(id="pt-logout")
	WebElement logout;
	
	@FindBy(id="firstHeading")
	WebElement titleHeader;
	
/*	@FindBy(xpath="//div[@id='p-personal']")
	WebElement personalHeader;*/
	
	public MainPage() {
		PageFactory.initElements(driver, this);
		Assert.assertEquals("Wikipedia, wolna encyklopedia", driver.getTitle());
	}
	
	public boolean wikipediaLogoIsVisible() {
		return wikipediaLogo.isDisplayed();
	}
	
	public void goToHomePage() {
		wikipediaLogo.click();
	}
	
	public void goToLoginPage() {		
		login.click();
	}
	
	public void logOut() {
		logout.click();
	}

}
