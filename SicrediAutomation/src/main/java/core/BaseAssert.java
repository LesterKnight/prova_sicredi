package core;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BaseAssert extends BaseDriver{
	
	public void CheckIfElementIsVisible(By locator) {
		try {
			WebElement el = getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
			Assert.assertTrue("Element is not visible",el.isDisplayed());
		}catch(ElementNotVisibleException e){
			Assert.fail("Element is not visible");
		}
	}
	
	public void AssertThatUrlContains(String match) {
		try {
			getWait().until(ExpectedConditions.urlContains(match));
			Assert.assertTrue("url assert fail",getBrowser().getCurrentUrl().contains(match));
		}catch(Exception e) {
			Assert.fail("url assert fail");
		}		
	}
	
	public void AssertThatTextExistOnElement(By locator, String match) {
		try {
			WebElement webEl = getWait().until(ExpectedConditions.elementToBeClickable(locator));
			Assert.assertTrue(webEl.getText().contains(match));
		}catch(Exception e) {
			Assert.fail("text on element assert");
		}	
	}
	
	public void AssertThatElementDisappeared(By locator) {
		try {
			WebElement webEl = getWait().until(ExpectedConditions.elementToBeClickable(locator));
			getWait().until(ExpectedConditions.stalenessOf(webEl));
		}catch(Exception e) {
			Assert.fail("element didn't disappear");
		}			
	}
	
}
