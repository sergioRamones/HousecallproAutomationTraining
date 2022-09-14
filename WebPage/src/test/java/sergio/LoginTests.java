package sergio;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hrmOrange.LoginPage;
import utility.CommonMethods;

public class LoginTests {
	
	private WebDriver driver;
	LoginPage login;
	CommonMethods commonMethods = new CommonMethods(); 
	
	
	@BeforeTest
	public void setup() {

		driver = commonMethods.chromeDriverConnection("https://opensource-demo.orangehrmlive.com/");
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
