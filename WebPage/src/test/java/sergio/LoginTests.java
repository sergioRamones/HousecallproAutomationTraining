package sergio;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hrmOrange.LoginPage;
import menu.LeftMenu;
import utility.BaseWebTest;

public class LoginTests {
	
	private WebDriver driver;
	LoginPage login;
	BaseWebTest baseWebTest = new BaseWebTest(); 
	LeftMenu leftMenu;
	
	
	@BeforeTest
	public void setup() {

		driver = baseWebTest.setupBrowser("https://opensource-demo.orangehrmlive.com/");
		login = new LoginPage(driver);
		leftMenu = new LeftMenu(driver);
	}
	
	@Test
	public void validLogin() {
		login.login("Admin", "admin123");
		leftMenu.selectOptionFromMenu("Leave");
	}
	
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}
