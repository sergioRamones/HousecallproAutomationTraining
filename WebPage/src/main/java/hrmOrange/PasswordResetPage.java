package hrmOrange;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.CommonMethods;

public class PasswordResetPage extends CommonMethods {
	
	@FindBy(name ="username")
	WebElement userNameInput;
	
	@FindBy(xpath = "//button[contains(@class,'cancel')]")
	WebElement cancelButton;
	
	@FindBy(xpath="//button[contains(@class,'reset')]")
	WebElement resetPasswordButton;
	
	@FindBy(xpath="//*[text()='Reset Password link sent successfully']")
	WebElement resetSuccessful;
	
	@FindBy(xpath="//li[@class='oxd-main-menu-item-wrapper']//span")
	List<WebElement> retSuccessful;
	
	
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
