package MikeSelenium;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateCustomer {
	
	//This is a to do exercise where I will create methods to create a new customer
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Test
	public void createCustomer() throws InterruptedException {

		startBrowser("https://opensource-demo.orangehrmlive.com/","chrome");		
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		//Login and navigate to dashboard
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h5"), "Login"));
		typeText(By.xpath("//*[@name='username']"),"Admin");
		typeText(By.name("password"),"admin123");
		driver.findElement(By.xpath("//button[contains(@class,'login')]")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("oxd-userdropdown-name"))));
		
		//Add employee: Employee full name inputs
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();		
		typeText(By.xpath("//input[@placeholder='First Name']"), "Tony");
		typeText(By.xpath("//input[@placeholder='Middle Name']"), "Timbo");
		typeText(By.xpath("//input[@placeholder='Last Name']"), "Tiger");
		driver.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//label[text()='Username']"))));
		
		
		//Add employee: Log in credentials
		typeText(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]"), "ttiger123");
		typeText(By.xpath("//label[text()='Password']/following::*//input[@type='password']"), "qa@Hcp1234");
		typeText(By.xpath("//label[text()='Confirm Password']/following::*//input[@type='password']"), "qa@Hcp1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Validate that the profile is created
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title'])[1]"))));
		
		//Unsure why this keeps failing???
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[text()='Tony Tiger']"))));
		
	}
		
		public void typeText(By locator, String word) {
			driver.findElement(locator).clear();
			driver.findElement(locator).sendKeys(word);
			Reporter.log("The word was typed [ "+word+" ]",true);
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
