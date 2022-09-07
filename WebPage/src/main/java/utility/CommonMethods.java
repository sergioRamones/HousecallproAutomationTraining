package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class CommonMethods {
	
	private WebDriver driver;
	private String projectPath = System.getProperty("user.dir");
	private String osName = System.getProperty("os.name");
	private String chromeDriver;
	private String edgeDriver;
	private String firefoxDriver;
	
	
	public CommonMethods() {
		setDriverPaths();
	}
	
	public String getOSName() {
		if(osName.contains("Mac")) {
			osName="Mac";
		}else if (osName.contains("Linux")) {
			osName="Linux";
		}else if(osName.contains("Windows")) {
			osName="Windows";
		}
		
		return osName;
	}
	
	public void setDriverPaths() {
		getOSName();
		switch(osName) {
		case  "Mac":
		case "Linux":
			chromeDriver = projectPath + "/chromedriver/chromedriver";
			edgeDriver = projectPath +"/edgedriver/msedgedriver";
			firefoxDriver = projectPath +"/geckodriver/geckodriver";
			break;
		case"Windows":
			chromeDriver = projectPath + "\\chromedriver\\chromedriver.exe";
			edgeDriver = projectPath +"\\edgedriver\\msedgedriver.exe";
			firefoxDriver = projectPath +"\\geckodriver\\geckodriver.exe";
		}
	}
	
	public WebDriver chromeDriverConnection() {
		System.setProperty("webdriver.chrome.driver", chromeDriver);
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		option.addArguments("--incognito");
		driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));
		return driver;
	}
	
	public WebDriver edgeDriverConnection() {
		System.setProperty("webdriver.edge.driver", edgeDriver);
		EdgeOptions option = new EdgeOptions();
		option.addArguments("--start-maximized");
		option.addArguments("--incognito");
		driver = new EdgeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));
		return driver;
	}
	
	public WebDriver firefoxDriverConnection() {
		System.setProperty("webdriver.chrome.driver", chromeDriver);
		FirefoxOptions option = new FirefoxOptions();
		option.addArguments("--start-maximized");
		option.addArguments("--incognito");
		driver = new FirefoxDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));
		return driver;
	}
	

}
