package sergioSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FirstScript {
	
	WebDriver driver;
	WebDriverWait wait;
	
	
	@Test
	public void fistrScript() throws InterruptedException {

		startBrowser("https://opensource-demo.orangehrmlive.com/","chrome");		
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[contains(@class,'login')]")).click();
		
		
		
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
