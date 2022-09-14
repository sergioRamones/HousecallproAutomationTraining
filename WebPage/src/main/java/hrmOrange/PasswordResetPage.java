package hrmOrange;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.CommonMethods;

public class PasswordResetPage extends CommonMethods {
	
	@FindBy(name ="username")
	WebElement userNameInput;
	
	@FindBy(className = "oxd-button oxd-button--large oxd-button--ghost orangehrm-forgot-password-button orangehrm-forgot-password-button--cancel")
	WebElement cancelButton;
	
	@FindBy(xpath="oxd-button oxd-button--large oxd-button--secondary orangehrm-forgot-password-button orangehrm-forgot-password-button--reset")
	WebElement resetPasswordButton;
	
	@FindBy(xpath="//*[text()='Reset Password link sent successfully']")
	WebElement resetSuccessful;
	
	public PasswordResetPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void validResetPassword(String user) {
		reviewElementExist(userNameInput);
		type(user,userNameInput);
		click(resetPasswordButton);
		reviewElementExist(resetSuccessful);
		
		
	}

	
	

}
