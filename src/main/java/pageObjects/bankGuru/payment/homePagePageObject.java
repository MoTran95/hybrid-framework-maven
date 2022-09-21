package pageObjects.bankGuru.payment;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManagerBankGuru;
import pageUIs.bankGuru.payment.LoginPageUI;
import pageUIs.bankGuru.payment.addCustomerPageUI;
import pageUIs.bankGuru.payment.homePageUI;

public class homePagePageObject extends BasePage {
	WebDriver driver;

	public homePagePageObject(WebDriver driver) {
		this.driver = driver;
	}
	public AddCustomerPageObject clickToNewCustomerLink() {
		waitForElementVisible(driver, addCustomerPageUI.NEW_CUSTOMER_LINK);
		clickToElement(driver, addCustomerPageUI.NEW_CUSTOMER_LINK);
		return PageGeneratorManagerBankGuru.getAddCustomerPage(driver);
		
	}
	public void acceptAlert() {
		acceptAlert(driver);;
		sleepInSecond(5);
		
	}
	public NewAccountPageObject clickToNewAccount() {
		waitForElementClickable(driver, homePageUI.NEW_ACCOUNT_LINK);
		clickToElement(driver, homePageUI.NEW_ACCOUNT_LINK);
		return PageGeneratorManagerBankGuru.getNewAccountPage(driver);
	}

}

	
