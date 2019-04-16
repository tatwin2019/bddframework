package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
	
	public static WebDriver driver = null;
	
	public static void initialize() {
		if (driver == null) {
			if (Utils.browser.contentEquals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\matwo\\selenium\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if (Utils.browser.contentEquals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\matwo\\selenium\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Utils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Utils.IMPLICIT_WAIT, TimeUnit.SECONDS);
			
			driver.get(Utils.url);
		}
	}

	public static void closeWindow(){
		driver.close();
		driver = null;
	}
	
	public static void quitBrowser() {
		driver.quit();
		driver = null;
	}
}
