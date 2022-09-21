package pageObjects.bankGuru.payment;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManagerBankGuru;
import pageUIs.bankGuru.payment.LoginPageUI;
import pageUIs.bankGuru.payment.addCustomerPageUI;
import pageUIs.bankGuru.payment.editCustomerPageUI;

public class editCustomerPageObject extends BasePage {
	WebDriver driver;

	public editCustomerPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void inputCustomerName(String customerName) {
		waitForElementVisible(driver, addCustomerPageUI.CUSTOMER_NAME_TEXTBOX);
		sendKeyToElement(driver, addCustomerPageUI.CUSTOMER_NAME_TEXTBOX, customerName);
		
	}

	public void inputDateOfBirth(String date, String atrribute) {
		waitForElementVisible(driver, addCustomerPageUI.DATE_OF_BIRTH_TEXTBOX);
		removeAttributeInDOM(driver, addCustomerPageUI.DATE_OF_BIRTH_TEXTBOX, atrribute);
		sendKeyToElement(driver, addCustomerPageUI.DATE_OF_BIRTH_TEXTBOX, date);
		
	}
	public void inputEditDateOfBirth(String date) {
		waitForElementVisible(driver, addCustomerPageUI.DATE_OF_BIRTH_TEXTBOX);
		sendKeyToElement(driver, addCustomerPageUI.DATE_OF_BIRTH_TEXTBOX, date);
		
	}

	public void inputAddress(String address) {
		waitForElementVisible(driver, addCustomerPageUI.ADDRESS_TEXT_AREA);
		sendKeyToElement(driver, addCustomerPageUI.ADDRESS_TEXT_AREA, address);
	}

	public void inputCity(String city) {
		waitForElementVisible(driver, addCustomerPageUI.CITY_TEXTBOX);
		sendKeyToElement(driver, addCustomerPageUI.CITY_TEXTBOX, city);
		
	}

	public void inputState(String state) {
		waitForElementVisible(driver, addCustomerPageUI.STATE_TEXTBOX);
		sendKeyToElement(driver, addCustomerPageUI.STATE_TEXTBOX, state);
		
	}

	public void inputPin(String pin) {
		waitForElementVisible(driver, addCustomerPageUI.PIN_TEXTBOX);
		sendKeyToElement(driver, addCustomerPageUI.PIN_TEXTBOX, pin);
		
	}

	public void inputMobile(String mobile) {
		waitForElementVisible(driver, addCustomerPageUI.MOBILE_TEXTBOX);
		sendKeyToElement(driver, addCustomerPageUI.MOBILE_TEXTBOX, mobile);
	}

	public void inputEmail(String email) {
		waitForElementVisible(driver, addCustomerPageUI.EMAIL_TEXTBOX);
		sendKeyToElement(driver, addCustomerPageUI.EMAIL_TEXTBOX, email);
		
	}

	public void inputpassword(String password) {
		waitForElementVisible(driver, addCustomerPageUI.PASSWORD_TEXTBOX);
		sendKeyToElement(driver, addCustomerPageUI.PASSWORD_TEXTBOX, password);
		
	}

	public void clickToSubmitButton() {
		waitForElementClickable(driver, addCustomerPageUI.SUBMIT_BUTTON);
		clickToElement(driver, addCustomerPageUI.SUBMIT_BUTTON);
		
	}

	public boolean isMessageSuccessDisplayed() {
		waitForElementVisible(driver, addCustomerPageUI.SUCCESS_MESSAGE);
		return isElementDisplayed(driver, addCustomerPageUI.SUCCESS_MESSAGE);
	}

	public boolean isDisplayedWithCustomerName(String value) {
		waitForElementVisible(driver, addCustomerPageUI.CUSTOMER_NAME_TEXT, value);
		return isElementDisplayed(driver, addCustomerPageUI.CUSTOMER_NAME_TEXT,value);
	}

	public boolean isDisplayedWithAddress(String address) {
		waitForElementVisible(driver, addCustomerPageUI.ADDRESS_TEXT, address);
		return isElementDisplayed(driver, addCustomerPageUI.ADDRESS_TEXT,address);
	}

	public boolean isDisplayedWithCity(String city) {
		waitForElementVisible(driver, addCustomerPageUI.CITY_TEXT, city);
		return isElementDisplayed(driver, addCustomerPageUI.CITY_TEXT,city);
	}

	public boolean isDisplayedWithState(String state) {
		waitForElementVisible(driver, addCustomerPageUI.STATE_TEXT, state);
		return isElementDisplayed(driver, addCustomerPageUI.STATE_TEXT,state);
	}

	public boolean isDisplayedWithPin(String pin) {
		waitForElementVisible(driver, addCustomerPageUI.PIN_TEXT, pin);
		return isElementDisplayed(driver, addCustomerPageUI.PIN_TEXT,pin);
	}

	public boolean isDisplayedWithMobile(String mobile) {
		waitForElementVisible(driver, addCustomerPageUI.MOBILE_TEXT, mobile);
		return isElementDisplayed(driver, addCustomerPageUI.MOBILE_TEXT,mobile);
	}

	public boolean isDisplayedWithEmail(String email) {
		waitForElementVisible(driver, addCustomerPageUI.EMAIL_TEXT, email);
		return isElementDisplayed(driver, addCustomerPageUI.EMAIL_TEXT,email);
	}

	public boolean isDisplayedWithDateOfBirthdate(String dateOfBirthA) {
		waitForElementVisible(driver, addCustomerPageUI.BIRTHDATE_TEXT, dateOfBirthA);
		return isElementDisplayed(driver, addCustomerPageUI.BIRTHDATE_TEXT,dateOfBirthA);
	}

	public void enterCustomerID(String customerID) {
		waitForElementVisible(driver, editCustomerPageUI.CUSTOMER_ID_TEXTBOX);
		sendKeyToElement(driver,editCustomerPageUI.CUSTOMER_ID_TEXTBOX, customerID);
		
	}

	public void clickToSubmitPage() {
		waitForElementClickable(driver, editCustomerPageUI.SUBMIT_EDIT_BUTTON);
		clickToElement(driver, editCustomerPageUI.SUBMIT_EDIT_BUTTON);
	}

	
}

	
