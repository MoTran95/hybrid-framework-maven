package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopCommerce.user.RegisterPageUI;

public class RegisterPageObject extends BasePage {
	WebDriver driver;

	public RegisterPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToRegisterButton() {
		waitForElementClickable(driver, RegisterPageUI.REGISTER_BUTTON);
		clickToElement(driver, RegisterPageUI.REGISTER_BUTTON);
	}

	public boolean isDisplayedRequireErrorMessage(String message) {
		waitForElementVisible(driver, RegisterPageUI.REQUIRED_ERROR_BY_TEXT, message);
		return isElementDisplayed(driver, RegisterPageUI.REQUIRED_ERROR_BY_TEXT, message);
	}

	public void enterFistNameTextbox(String firstName) {
		waitForElementVisible(driver, RegisterPageUI.FIRST_NAME_TEXTBOX);
		sendKeyToElement(driver, RegisterPageUI.FIRST_NAME_TEXTBOX, firstName);
	}

	public void enterLastNameTextbox(String lastName) {
		waitForElementVisible(driver, RegisterPageUI.LAST_NAME_TEXTBOX);
		sendKeyToElement(driver, RegisterPageUI.LAST_NAME_TEXTBOX, lastName);

	}

	public void selectDate(String date) {
		waitForElementClickable(driver, RegisterPageUI.DATE_SELECTION);
		selectItemInDefaultDropdown(driver, RegisterPageUI.DATE_SELECTION, date);
	}

	public void selectMonth(String month) {
		waitForElementClickable(driver, RegisterPageUI.MONTH_SELECTION);
		selectItemInDefaultDropdown(driver, RegisterPageUI.MONTH_SELECTION, month);

	}

	public void selectYear(String year) {
		waitForElementClickable(driver, RegisterPageUI.YEAR_SELECTION);
		selectItemInDefaultDropdown(driver, RegisterPageUI.YEAR_SELECTION, year);

	}

	public void enterEmailTextbox(String email) {
		waitForElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
		sendKeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, email);

	}

	public void selectGenderRadio() {
		waitForElementClickable(driver, RegisterPageUI.GENDER_RADIO_BY_ID);
		checkToDefaultCheckboxOrRadio(driver, RegisterPageUI.GENDER_RADIO_BY_ID);
		
	}

	public void enterCompanyNameTextbox(String companyName) {
		waitForElementVisible(driver, RegisterPageUI.COMPANY_TEXTBOX);
		sendKeyToElement(driver, RegisterPageUI.COMPANY_TEXTBOX, companyName);
		
	}

	public void enterPasswordTextbox(String password) {
		waitForElementVisible(driver, RegisterPageUI.PASSWORD_TEXTBOX);
		sendKeyToElement(driver, RegisterPageUI.PASSWORD_TEXTBOX, password);
		
	}

	public void enterConfirmPasswordTextbox(String password) {
		waitForElementVisible(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX);
		sendKeyToElement(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX, password);
		
	}

	public void clickToLogoutButton() {
		waitForElementClickable(driver, RegisterPageUI.LOGOUT_BUTTON);
		clickToElement(driver, RegisterPageUI.LOGOUT_BUTTON);
		sleepInSecond(5);
		
	}

	public boolean isDisplayedExistsErrorMessage() {
		waitForElementVisible(driver, RegisterPageUI.EXISTS_EMAIL_ERROR);
		return isElementDisplayed(driver, RegisterPageUI.EXISTS_EMAIL_ERROR);
	}

	public String isDisplayedInvalidPasswordMessgae() {
		waitForElementVisible(driver, RegisterPageUI.INVALID_PASSWORD_MESSAGE);
		return getElementText(driver, RegisterPageUI.INVALID_PASSWORD_MESSAGE);
	}

}
