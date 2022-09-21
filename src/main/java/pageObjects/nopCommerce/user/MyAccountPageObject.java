package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopCommerce.user.MyAccountPageUI;

public class MyAccountPageObject extends BasePage {
	WebDriver driver;

	public MyAccountPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void selectGender() {
		waitForElementClickable(driver, MyAccountPageUI.GENDER_RADIO);
		checkToDefaultCheckboxOrRadio(driver, MyAccountPageUI.GENDER_RADIO);
		
	}

	public void enterFirstNameTextbox(String firstName) {
		waitForElementVisible(driver, MyAccountPageUI.FIRST_NAME_TEXTBOX);
		sendKeyToElement(driver, MyAccountPageUI.FIRST_NAME_TEXTBOX, firstName);
		
	}

	public void enterLastNameTextbox(String lastName) {
		waitForElementVisible(driver, MyAccountPageUI.LAST_NAME_TEXTBOX);
		sendKeyToElement(driver, MyAccountPageUI.LAST_NAME_TEXTBOX, lastName);
		
		
	}

	public void selectDate(String date) {
		waitForElementVisible(driver, MyAccountPageUI.DATE_SELECTION);
		selectItemInDefaultDropdown(driver, MyAccountPageUI.DATE_SELECTION, date);
	}

	public void selectMonth(String month) {
		waitForElementVisible(driver, MyAccountPageUI.MONTH_SELECTION);
		selectItemInDefaultDropdown(driver, MyAccountPageUI.MONTH_SELECTION,  month);
	}

	public void selectYear(String year) {
		waitForElementVisible(driver, MyAccountPageUI.YEAR_SELECTION);
		selectItemInDefaultDropdown(driver, MyAccountPageUI.YEAR_SELECTION, year);
		
	}

	public void enterEmailTextbox(String updateEmail) {
		waitForElementVisible(driver, MyAccountPageUI.EMAIL_TEXTBOX);
		sendKeyToElement(driver, MyAccountPageUI.EMAIL_TEXTBOX, updateEmail);
		
		
	}

	public void enterCompanyTextbox(String companyName) {
		waitForElementVisible(driver, MyAccountPageUI.COMPANY_TEXTBOX);
		sendKeyToElement(driver, MyAccountPageUI.COMPANY_TEXTBOX, companyName);
		
		
	}

	public void clickToSaveButton() {
		waitForElementClickable(driver, MyAccountPageUI.SAVE_BUTTON);
		clickToElement(driver, MyAccountPageUI.SAVE_BUTTON);
	}

	public boolean isSelected() {
		waitForElementVisible(driver, MyAccountPageUI.GENDER_RADIO);
		return isSelectedRadioOrCheckbox(driver, MyAccountPageUI.GENDER_RADIO);
	}

	public boolean isDisplayedFirstNameText(String firstName) {
		waitForElementVisible(driver, MyAccountPageUI.FIRST_NAME_TEXTBOX);
		return isInputContains(driver, MyAccountPageUI.FIRST_NAME_TEXTBOX, firstName);
	}

	public boolean isDisplayedLastNameText(String lastName) {
		waitForElementVisible(driver, MyAccountPageUI.LAST_NAME_TEXTBOX);
		return isInputContains(driver, MyAccountPageUI.LAST_NAME_TEXTBOX, lastName);
	}

	public boolean isDisplayedEmailText(String email) {
		waitForElementVisible(driver, MyAccountPageUI.EMAIL_TEXTBOX);
		return isInputContains(driver, MyAccountPageUI.EMAIL_TEXTBOX, email);
	}

	public boolean isDisplayedCompanyText(String companyName) {
		waitForElementVisible(driver, MyAccountPageUI.COMPANY_TEXTBOX);
		return isInputContains(driver, MyAccountPageUI.COMPANY_TEXTBOX, companyName);
	}

	public String getDateDropdownText() {
		waitForElementVisible(driver, MyAccountPageUI.DATE_SELECTION);
		return getSelectedItemDefaultDropdown(driver, MyAccountPageUI.DATE_SELECTION);
	}

	public String getMonthDropdownText() {
		waitForElementVisible(driver, MyAccountPageUI.MONTH_SELECTION);
		return getSelectedItemDefaultDropdown(driver, MyAccountPageUI.MONTH_SELECTION);
	}

	public String getYearDropdownText() {
		waitForElementVisible(driver, MyAccountPageUI.YEAR_SELECTION);
		return getSelectedItemDefaultDropdown(driver, MyAccountPageUI.YEAR_SELECTION);
	}
	
}
