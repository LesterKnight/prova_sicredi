package flows;

import pages.GroceryCrudPage;
import pages.asserts.GroceryCrudPageAsserts;

public class GroceryCrudPageFlow extends GroceryCrudPageAsserts{
	private GroceryCrudPage groceryCrudPage = new GroceryCrudPage();	
	
	public void AddCustomerFlow() {
		groceryCrudPage.goToUrl();
		groceryCrudPage.changeBoostrapVersion();
		AssertThatDropdownChangedToV4();
		AssertThatUrlContainsBoostrapV4();
		groceryCrudPage.clickOnAddCustomerButton();
		AssertThatUrlContainsAdd();
		groceryCrudPage.fillAddCustomerForm();	
		AssertThatSuccessMessageAppeared();
	}
	
	public void DeleteCustomerFlow() {
		groceryCrudPage.clickOnBackButton();
		AssertThatUrlContainsSuccess();
		AssertThatSuccessMessageBaloonDisappeared();
		groceryCrudPage.deleteCustomer();
		AssertThatDeleteWasSuccess();
		
		

	}
	
}
