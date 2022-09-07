package utility;

import org.openqa.selenium.WebDriver;

public class CommonMethods {
	
	private WebDriver driver;
	private String projectPath = System.getProperty("user.dir");
	private String osName = System.getProperty("os.name");
	private String chromeDriver;
	private String edgeDriver;
	private String firefoxDriver;
	
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
	

}
