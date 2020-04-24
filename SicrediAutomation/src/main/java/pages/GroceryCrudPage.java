package pages;
import core.BasePage;
import pages.locators.GroceryCrudPageLocators;

public class GroceryCrudPage extends BasePage{
	private GroceryCrudPageLocators locators;
	
	public GroceryCrudPage() {
		this.url = "https://www.grocerycrud.com/demo/bootstrap_theme";
		locators = new GroceryCrudPageLocators();
	}
	
	public void changeBoostrapVersion() {
		clickOnElement(locators.getDropDown());
		clickOnElement(locators.getSelectV4());
		waitForPageLoad();
	}
	
	public void clickOnAddCustomerButton() {
		clickOnElement(locators.getBtnAddCustomer());
		waitForPageLoad();
	}
	
	public void fillAddCustomerForm() {
		waitForPageLoad();
		writeOnField(locators.getTxtName(),"Teste Sicredi");
		writeOnField(locators.getTxtLastName(),"Teste");
		writeOnField(locators.getTxtFirstName(),"Cristiano");
		writeOnField(locators.getTxtPhone(),"51 9999-9999");
		writeOnField(locators.getTxtAddress1(),"Av Assis Brasil, 3970");
		writeOnField(locators.getTxtAddress2(),"Torre D");
		writeOnField(locators.getTxtCity(),"Porto Alegre");
		writeOnField(locators.getTxtState(),"RS");
		writeOnField(locators.getTxtPostal(),"91000-000");
		writeOnField(locators.getTxtCountry(),"Brasil");
		clickOnElement(locators.getDropDownEmployee(),true);
		writeOnField(locators.getTxtCreditLimit(),"200");
		clickOnElement(locators.getBtnSave(),true);
	}
	
	public void deleteCustomer() {
		waitForPageLoad();
		writeOnField(locators.getTxtSearchName(),"Teste Sicredi");
		waitForPageLoad();
		waitForPageLoad();
		clickOnElement(locators.getCheckBoxAll());
		clickOnElement(locators.getBtnDelete());
		}
	
	public void confirmDelete() {
		clickOnElement(locators.getBtnDeleteDanger());
		waitForPageLoad();
	}
	
	
	public void clickOnBackButton() {
		clickOnElement(locators.getBtnBack());
		waitForPageLoad();
	}
	
	

}
