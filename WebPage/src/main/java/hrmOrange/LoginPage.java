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
	
	@FindBy(xpath="oxd-userdropdown-name")
	WebElement userNameLink;
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void login(String user, String password) {
		type(user,userNameTxt);
		type(password,passwordTxt);
		click(loginBtn);
		reviewElementExist(userNameLink);
	}
	
	
	

}
