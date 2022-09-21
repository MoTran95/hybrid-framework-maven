package pageObjects.bankGuru.payment;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManagerBankGuru;
import pageUIs.bankGuru.payment.LoginPageUI;

public class LoginPageObject extends BasePage {
	WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void inputUserID(String userID) {
		waitForElementVisible(driver, LoginPageUI.USER_ID_TEXTBOX);
		sendKeyToElement(driver, LoginPageUI.USER_ID_TEXTBOX, userID);
		
	}

	public void inputPassword(String password) {
		waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		sendKeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);
		
	}

	public homePagePageObject clickLoginPage() {
		waitForElementClickable(driver, LoginPageUI.SUBMIT_BUTTON);
		clickToElement(driver, LoginPageUI.SUBMIT_BUTTON);
		return PageGeneratorManagerBankGuru.getHomePage(driver);
	}
}
