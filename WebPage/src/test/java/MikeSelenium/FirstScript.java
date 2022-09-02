package MikeSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstScript {
	
	WebDriver driver;
	WebDriverWait wait;
	
	
	@Test
	public void fistrScript() throws InterruptedException {

		startBrowser("https://opensource-demo.orangehrmlive.com/","chrome");		
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h5"), "Login"));
		typeText(By.xpath("//*[@name='username']"),"Admin");
		typeText(By.name("password"),"admin123");

		
	//	driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
	
		driver.findElement(By.xpath("//button[contains(@class,'login')]")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("oxd-userdropdown-name"))));
		
		selectFromDropDown("Sub Unit","Development");
		selectFromDropDown("Sub Unit","Administration");
		
		selectFromDropDown("Employment Status","Full-Time Contract");
		selectFromDropDown("Job Title","Chief Executive Officer");
		
		//new method for testing name fields
		typeName("Employee Name", "Type for hints...", "Mike");
		typeName("Supervisor Name", "Type for hints...", "Rachana");
		typeText(By.xpath("//label[text()='Employee Id']/following::*//input[@class='oxd-input oxd-input--active']"), "qa@Hcp1234");
		
		//Finish
		click(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
	}
	
	
	public void selectFromDropDown(String SubUnit, String Option) throws InterruptedException {
		click(By.xpath("//label[text()='"+SubUnit+"']/parent::*/parent::*//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']"));
		click(By.xpath("//span[contains(text(),'"+Option+"')]"));
		Thread.sleep(1000);
	}
	
	public void typeName(String labelText, String placeHolder, String text) throws InterruptedException {
		driver.findElement(By.xpath("//label[text()='"+labelText+"']/following::*/descendant::*//input[@placeholder='"+placeHolder+"']")).sendKeys(text);
		
		
	}
	
	public void typeText(By locator, String word) {
		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(word);
		Reporter.log("The word was typed [ "+word+" ]",true);
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	
	public void startBrowser(String url,  String  browser){
		
		switch(browser) {
		
		case "chrome":
			String pathChromeDriver= System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", pathChromeDriver +"/chromedriver/chromedriver");
			
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--start-maximized");
			option.addArguments("--incognito");
			driver = new ChromeDriver(option);
			driver.get(url);
			
			break;
			
		case "edge":
			
			//EdgeDrvier
			break;
			
		case "firefox":
			
			//FirefoxDriver
			break;
			
		default: System.out.println("Option is not allowed");
		
		}
		
		
	}
}