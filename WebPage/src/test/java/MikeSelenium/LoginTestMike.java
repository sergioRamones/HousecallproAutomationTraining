package MikeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hrmOrange.LoginPage;
import hrmOrange.PasswordResetPage;
import utility.CommonMethods;

public class LoginTestMike {
	
	private WebDriver driver;
	LoginPage login;
	LoginPage forgotPassword;
	PasswordResetPage validResetPassword;
	
	
	
	
	
	@BeforeTest
	public void setup() {
		login = new LoginPage(driver);
		driver = login.chromeDriverConnection("https://opensource-demo.orangehrmlive.com/");
		login = new LoginPage(driver);
		
	}
	
	@Test
	public void validPasswordReset() {
		forgotPassword.forgotPassword(forgotPassButton);
		validResetPassword.validResetPassword(userNameInput, resetPasswordButton, element3, "TonyTiger");
		

	}

} //end class
