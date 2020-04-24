package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public abstract class BasePage extends BaseDriver{
	protected String url;
	
	public String getUrl() {
		return url;
	}
	
	public void goToUrl() {
		getBrowser().navigate().to(url);
		waitForPageLoad();
	}
	
	public void waitForPageLoad() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	protected void writeOnField(By element, String text) {
		getWait().until(ExpectedConditions.elementToBeClickable(element)).sendKeys(text);
	}
	
	protected void writeOnField(By element, String text, boolean actions) {
		if(actions) {
			WebElement WebEl = getWait().until(ExpectedConditions.elementToBeClickable(element));
			new Actions(getBrowser()).moveToElement(WebEl).sendKeys(text).perform();
		}
	}
	
	protected void clickOnElement(By element, boolean actions) {
		if(actions) {
			WebElement WebEl = getWait().until(ExpectedConditions.elementToBeClickable(element));
			new Actions(getBrowser()).moveToElement(WebEl).click().perform();
		}
	}
	
	protected void clickOnElement(By element) {
		getWait().until(ExpectedConditions.elementToBeClickable(element)).click();
	}
	
	public void waitForElementText(By element, String text) {
		getWait().until(ExpectedConditions.textToBePresentInElementLocated(element, text));
		
	}
	
	
}

