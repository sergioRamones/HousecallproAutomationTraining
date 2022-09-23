package utility;

import static java.time.Duration.ofSeconds;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseWebTest {

	private WebDriver driver;
	private WebDriverWait wait;
	protected static BrowserNames targetBrowser = BrowserNames.valueOf("EDGE");

	enum BrowserNames {
		CHROME, FIREFOX, SAFARI, EDGE
	}

	public WebDriver setupBrowser(String url) {
		switch (targetBrowser) {
		case CHROME:
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--headless");
			options.addArguments("--start-maximized");
			options.addArguments("--incognito");
			driver = new ChromeDriver(options);
			break;

		case SAFARI:// Safari does not support headless mode run locally only. not working correctly
			SafariOptions safariOptions = new SafariOptions();
			driver = new SafariDriver(safariOptions);
			break;

		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.addArguments("--headless");
			firefoxOptions.addArguments("--disable-gpu");
			driver = new FirefoxDriver(firefoxOptions);
			break;
		case EDGE:
			WebDriverManager.edgedriver().setup();
			EdgeOptions option = new EdgeOptions();
			option.addArguments("--start-maximized");
			option.addArguments("--incognito");
			driver = new EdgeDriver(option);
			driver.get(url);
			break;

		default:
			Reporter.log("Browser Not Supported", true);
			System.exit(0);
		}
		driver.manage().timeouts().implicitlyWait(ofSeconds(15));
		driver.get(url);
		return driver;

	}

	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}

	public void reporter(String message, String value) {
		Reporter.log(message + "<b> [ " + value + " ] </b>");
	}

	public void type(String inputText, By locator) {
		findElement(locator).clear();
		findElement(locator).sendKeys(inputText);
		reporter("Text typed", inputText);
	}

	public void type(String inputText, WebElement element) {
		element.clear();
		element.sendKeys(inputText);
		reporter("Text typed", inputText);
	}

	public void click(WebElement element) {
		element.click();
	}

	public void reviewElementExist(WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
