package sergio;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hrmOrange.LoginPage;

public class LoginTests {
	
	private WebDriver driver;
	LoginPage login;
	
	
	@BeforeTest
	public void setup() {
		login = new LoginPage(driver);
		driver = login.chromeDriverConnection("https://opensource-demo.orangehrmlive.com/");
		login = new LoginPage(driver);
	}
	
	@Test
	public void validLogin() {
		login.login("Admin", "admin123");
	}
	
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}
