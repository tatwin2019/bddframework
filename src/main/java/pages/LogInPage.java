package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import util.BasePage;

public class LogInPage extends BasePage {
	
	@FindBy(id="wpName1")
	WebElement usernameTextBox;

	@FindBy(id="wpPassword1")
	WebElement passwordTextBox;
	
	@FindBy(id="wpLoginAttempt")
	WebElement loginButton;
	
	@FindBy(id="firstHeading")
	WebElement titleHeader;
	
	public LogInPage() {
		PageFactory.initElements(driver, this);
		Assert.assertEquals("Zaloguj się", titleHeader.getText());
	}
	
	public void typeUsername(String username) {
		usernameTextBox.sendKeys(username);
	}
	
	public void typePassword(String password) {
		passwordTextBox.sendKeys(password);
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}
}
