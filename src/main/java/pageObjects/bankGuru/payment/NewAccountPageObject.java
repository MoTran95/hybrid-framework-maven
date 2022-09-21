package pageObjects.bankGuru.payment;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManagerBankGuru;
import pageUIs.bankGuru.payment.LoginPageUI;
import pageUIs.bankGuru.payment.NewAccountPageUI;
import pageUIs.bankGuru.payment.addCustomerPageUI;
import pageUIs.bankGuru.payment.editCustomerPageUI;

public class NewAccountPageObject extends BasePage {
	WebDriver driver;

	public NewAccountPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void enterCustomerID(String customerID) {
		waitForElementVisible(driver, NewAccountPageUI.CUSTOMER_ID_TEXTBOX);
		sendKeyToElement(driver,NewAccountPageUI.CUSTOMER_ID_TEXTBOX, customerID);
	}

	public void enterAmountDeposit(String amount) {
		waitForElementVisible(driver, NewAccountPageUI.INITIAL_DEPOSIT_TEXTBOX);
		sendKeyToElement(driver,NewAccountPageUI.INITIAL_DEPOSIT_TEXTBOX, amount);
		
	}

	public void clickToSubmitButton() {
		waitForElementClickable(driver, NewAccountPageUI.SUBMIT_BUTTON);
		clickToElement(driver, NewAccountPageUI.SUBMIT_BUTTON);
		
	}

	public boolean isMessageSuccessDisplayed() {
		waitForElementVisible(driver, NewAccountPageUI.SUCCESS_MESSAGE_TEXT);
		return isElementDisplayed(driver, NewAccountPageUI.SUCCESS_MESSAGE_TEXT);
	}

	public boolean isCurrentAmountDisplayed(String amount) {
		waitForElementVisible(driver, NewAccountPageUI.CURRENT_AMOUNT_TEXT,amount);
		return isElementDisplayed(driver, NewAccountPageUI.CURRENT_AMOUNT_TEXT,amount);
	}

	public String getAccountID() {
		waitForElementVisible(driver, NewAccountPageUI.ACCOUNT_ID_TEXT);
		return getElementText(driver, NewAccountPageUI.ACCOUNT_ID_TEXT);
	}

	

	
}

	
