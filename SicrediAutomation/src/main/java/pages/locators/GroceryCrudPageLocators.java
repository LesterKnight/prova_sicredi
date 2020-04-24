package pages.locators;

import org.openqa.selenium.By;

public class GroceryCrudPageLocators{
	private By header = By.cssSelector(".floatL.l5");
	private By dropDown = By.cssSelector("#switch-version-select");
	private By selectV3 = By.cssSelector("[value='bootstrap_theme_v3']");
	private By selectV4 = By.cssSelector("[value='bootstrap_theme_v4']");
	private By btnAddCustomer = By.cssSelector(".btn");
	private By txtName = By.cssSelector("#field-customerName");
	private By txtLastName = By.cssSelector("#field-contactLastName");
	private By txtFirstName = By.cssSelector("#field-contactFirstName");
	private By txtPhone = By.cssSelector("#field-phone");
	private By txtAddress1 = By.cssSelector("#field-addressLine1");
	private By txtAddress2 = By.cssSelector("#field-addressLine2");
	private By txtCity = By.cssSelector("#field-city");
	private By txtState = By.cssSelector("#field-state");
	private By txtPostal = By.cssSelector("#field-postalCode");
	private By txtCountry = By.cssSelector("#field-country");
	private By dropDownEmployee = By.cssSelector("#field_salesRepEmployeeNumber_chosen");
	private By txtCreditLimit = By.cssSelector("#field-creditLimit");
	private By btnSave = By.cssSelector("#form-button-save");
	private By divSuccess = By.cssSelector("#report-success p");
	private By btnBack = By.cssSelector("#save-and-go-back-button");
	private By txtSearchName = By.cssSelector("[placeholder='Search Name']");
	private By checkBoxAll = By.cssSelector(("input[type='checkbox']"));
	private By btnDelete = By.cssSelector("[title='Delete']");
	private By btnDeleteDanger = By.cssSelector(".delete-multiple-confirmation-button");
	private By textDeleteMultiple = By.cssSelector(".alert-delete-multiple");
	private By successAssert = By.cssSelector(".alert.alert-success.growl-animated.animated.bounceInDown");

	
	public By getSuccessAssert() {
		return successAssert;
	}
	
	public By getTxtSearchName() {
		return txtSearchName;
	}

	public By getCheckBoxAll() {
		return checkBoxAll;
	}

	public By getBtnDelete() {
		return btnDelete;
	}

	public By getBtnDeleteDanger() {
		return btnDeleteDanger;
	}

	public By getTextDeleteMultiple() {
		return textDeleteMultiple;
	}

	public By getBtnBack() {
		return btnBack;
	}

	public By getHeader() {
		return header;
	}
	
	public By getBtnSave() {
		return btnSave;
	}
	public By getDivSuccess() {
		return divSuccess;
	}
	public By getDropDown() {
		return dropDown;
	}
	public By getSelectV3() {
		return selectV3;
	}
	public By getSelectV4() {
		return selectV4;
	}
	public By getBtnAddCustomer() {
		return btnAddCustomer;
	}
	public By getTxtName() {
		return txtName;
	}
	public By getTxtLastName() {
		return txtLastName;
	}
	public By getTxtFirstName() {
		return txtFirstName;
	}
	public By getTxtPhone() {
		return txtPhone;
	}
	public By getTxtAddress1() {
		return txtAddress1;
	}
	public By getTxtAddress2() {
		return txtAddress2;
	}
	public By getTxtCity() {
		return txtCity;
	}
	public By getTxtState() {
		return txtState;
	}
	public By getTxtPostal() {
		return txtPostal;
	}
	public By getTxtCountry() {
		return txtCountry;
	}
	public By getDropDownEmployee() {
		return dropDownEmployee;
	}
	public By getTxtCreditLimit() {
		return txtCreditLimit;
	}
	
}
