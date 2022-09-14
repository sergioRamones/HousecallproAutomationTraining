package MikeSelenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hrmOrange.LoginPage;
import hrmOrange.PasswordResetPage;
import utility.CommonMethods;

public class LoginMikeSelenium {
	private WebDriver driver;
	LoginPage login;
	PasswordResetPage passwordResetPage;
	CommonMethods commonMethods= new CommonMethods();
	
	
	
	
	@BeforeTest
	public void setup() {
	 
		driver = commonMethods.chromeDriverConnection("https://opensource-demo.orangehrmlive.com/");
		login = new LoginPage(driver);
		
	}
	
	@Test
	public void validPasswordReset() {
		login.forgotPassword();
		passwordResetPage = new PasswordResetPage(driver);
		passwordResetPage.validResetPassword("TonyTiger");
		

	}
	
	@Test
	public void validLogin() {
		login.login("Admin", "admin123");
	}

}
