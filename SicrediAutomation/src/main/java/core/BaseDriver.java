package core;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseDriver {
	
	private static ChromeDriver browser;
	private static WebDriverWait wait;
	
	public static ChromeDriver getBrowser() {
		return browser;
	}

	public static WebDriverWait getWait() {
		return wait;
	}
	
	public static void startBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		System.setProperty("webdriver.chrome.driver","src/main/resources/Chromedriver.exe");
		browser = new ChromeDriver(options);
		browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait = new WebDriverWait(browser, 20);
	}
	
	public static void closeBrowser() {
		browser.quit();
	}
}
