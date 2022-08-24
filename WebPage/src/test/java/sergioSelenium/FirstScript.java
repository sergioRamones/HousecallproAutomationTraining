package sergioSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstScript {
	
	
	
	
	@Test
	public void fistrScript() throws InterruptedException {
		//Users/sergioramones/git/HousecallproAutomationTraining/WebPage/chormedriver/chromedriver
		String pathChromeDriver= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", pathChromeDriver +"/chromedriver/chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[contains(@class,'login')]")).click();
		
		
		
	}

}
