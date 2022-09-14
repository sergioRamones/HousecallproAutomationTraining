package hrmOrange;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.CommonMethods;

public class LoginPage extends CommonMethods{
	
	@FindBy(xpath="//*[@name='username']")
	WebElement userNameTxt;
	
	@FindBy(name = "password")
	WebElement passwordTxt;
	
	@FindBy(xpath="//button[contains(@class,'login')]")
	WebElement loginBtn;
	
	@FindBy(className ="oxd-userdropdown-name")
	WebElement userNameLink;
	
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
	WebElement forgotPassButton;
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void login(String user, String password) {
		reviewElementExist(userNameTxt);
		type(user,userNameTxt);
		type(password,passwordTxt);
		click(loginBtn);
		reviewElementExist(userNameLink);
	
	}
	
	public void forgotPassword(WebElement element) {
		reviewElementExist(element);
		click(element);
	}

}
