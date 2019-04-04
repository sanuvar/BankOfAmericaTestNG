package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	static WebDriver driver;
	public static WebDriver startBrowser(String browserName, String url) {
		if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webDriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		    driver= new ChromeDriver();
	}
	driver.get(url);
	return driver;

	}

}
