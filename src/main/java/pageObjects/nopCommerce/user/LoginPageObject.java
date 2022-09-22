package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManagerNopCommerce;
import pageUIs.nopCommerce.user.HomePageUI;
import pageUIs.nopCommerce.user.LoginPageUI;

public class LoginPageObject extends BasePage {
	WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public HomePageObject clickToLoginButton() {
		waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
		return PageGeneratorManagerNopCommerce.getHomePage(driver);
	}

	public boolean isErrorMessageDisplay(String message) {
		waitForElementVisible(driver, LoginPageUI.ERROR_MESSAGE_BY_TEXT, message);
		return isElementDisplayed(driver,LoginPageUI.ERROR_MESSAGE_BY_TEXT , message);
	}

	public void enterEmailTextbox(String invalidEmail) {
		waitForElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
		sendKeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, invalidEmail);
	}

	public String isDisplayedNotExistsEmail() {
		waitForElementVisible(driver,LoginPageUI.ERROR_MESSAGE_EMAIL_NOT_EXISTS);
		return getElementText(driver,LoginPageUI.ERROR_MESSAGE_EMAIL_NOT_EXISTS);
	}

	public void enterPasswordTextbox(String inValidPassword) {
		waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		sendKeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, inValidPassword);
		
	}

	
}
