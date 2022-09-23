package menu;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utility.BaseWebTest;

public class LeftMenu extends BaseWebTest{
	
	@FindBy(xpath="//li[@class='oxd-main-menu-item-wrapper']//span")
	List<WebElement> leftMenuList;
	

	public LeftMenu(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	public void selectOptionFromMenu(String option) {
		
//	if(leftMenuList.toString().contains(option)) {
		for(WebElement element : leftMenuList) {
			System.out.println(element.getText());
			if(element.getText().equals(option)) {
				element.click();
				break;
			}
		}//for ends
//		}else {
//			Assert.fail("The options that you selected no exist " +option);
//		}
	}

}
