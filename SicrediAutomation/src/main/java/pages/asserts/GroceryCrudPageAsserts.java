package pages.asserts;
import core.BaseAssert;
import pages.locators.GroceryCrudPageLocators;

public class GroceryCrudPageAsserts extends BaseAssert{
	GroceryCrudPageLocators locators = new GroceryCrudPageLocators();
	
	public void AssertThatDropdownChangedToV4() {
		CheckIfElementIsVisible(locators.getSelectV4());
	}
	public void AssertThatUrlContainsBoostrapV4() {
		AssertThatUrlContains("v4");
	}
	
	public void AssertThatUrlContainsAdd() {
		AssertThatUrlContains("/add");
	}
	
	public void AssertThatUrlContainsSuccess() {
		AssertThatUrlContains("success");
	}
	
	public void AssertThatDeleteWasSuccess() {
		AssertThatTextExistOnElement(locators.getSuccessAssert(),"Your data has been successfully deleted from the database.");
	}
	
	public void AssertThatSuccessMessageAppeared() {
		AssertThatTextExistOnElement(locators.getDivSuccess(),"Your data has been successfully stored into the database.");
	}
	
	public void AssertThatSuccessMessageBaloonDisappeared() {
		AssertThatTextExistOnElement(locators.getSuccessAssert(),"Your data has been successfully stored into the database.");
		AssertThatElementDisappeared(locators.getSuccessAssert());
	}
	
	public void AssertThatOnly1ItemWillBeDeleted() {
		AssertThatTextExistOnElement(locators.getMsgDeletion(),"Are you sure that you want to delete this 1 item?");
	}
}
