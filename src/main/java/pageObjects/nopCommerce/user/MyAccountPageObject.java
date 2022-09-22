package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManagerNopCommerce;
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
		selectItemInDefaultDropdown(driver, MyAccountPageUI.MONTH_SELECTION, month);
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

	public void clickToAddressLink() {
		waitForElementClickable(driver, MyAccountPageUI.ADDRESSES_LINK);
		clickToElement(driver, MyAccountPageUI.ADDRESSES_LINK);
		
	}

	public void clickToAddButton() {
		waitForElementClickable(driver, MyAccountPageUI.ADD_BUTTON);
		clickToElement(driver, MyAccountPageUI.ADD_BUTTON);
		
	}

	public void enterFistNameAddressTextbox(String firstName) {
		waitForElementVisible(driver, MyAccountPageUI.FIRST_NAME_ADDRESS_TEXTBOX);
		sendKeyToElement(driver, MyAccountPageUI.FIRST_NAME_ADDRESS_TEXTBOX, firstName);

		
	}

	public void enterLastNameAddressTextbox(String lastName) {
		waitForElementVisible(driver, MyAccountPageUI.LAST_NAME_ADDRESS_TEXTBOX);
		sendKeyToElement(driver, MyAccountPageUI.LAST_NAME_ADDRESS_TEXTBOX, lastName);

		
	}

	public void enterEmailAddressTextbox(String email) {
		waitForElementVisible(driver, MyAccountPageUI.EMAIL_ADDRESS_TEXTBOX);
		sendKeyToElement(driver, MyAccountPageUI.EMAIL_ADDRESS_TEXTBOX, email);

		
	}

	public void enterCompanyAddressTextbox(String companyName) {
		waitForElementVisible(driver, MyAccountPageUI.COMPANY_ADDRESS_TEXTBOX);
		sendKeyToElement(driver, MyAccountPageUI.COMPANY_ADDRESS_TEXTBOX, companyName);

		
	}

	public void selectCountryAddressTextbox(String country) {
		waitForElementVisible(driver, MyAccountPageUI.COUNTRY_ADDRESS_DROPDOWN);
		selectItemInDefaultDropdown(driver, MyAccountPageUI.COUNTRY_ADDRESS_DROPDOWN, country);
		
	}

	public void selectStateAddressTextbox(String state) {
		waitForElementVisible(driver, MyAccountPageUI.STATE_ADDRESS_DROPDOWN);
		selectItemInDefaultDropdown(driver, MyAccountPageUI.STATE_ADDRESS_DROPDOWN, state);
		
	}

	public void enterCityAddressTextbox(String city) {
		waitForElementVisible(driver, MyAccountPageUI.CITY_ADDRESS_TEXTBOX);
		sendKeyToElement(driver, MyAccountPageUI.CITY_ADDRESS_TEXTBOX, city);
		
	}

	public void enterAddress1AddressTextbox(String address1) {
		waitForElementVisible(driver, MyAccountPageUI.ADDRESS1_ADDRESS_TEXTBOX);
		sendKeyToElement(driver, MyAccountPageUI.ADDRESS1_ADDRESS_TEXTBOX, address1);
		
	}

	public void enterAddress2AddressTextbox(String address2) {
		waitForElementVisible(driver, MyAccountPageUI.ADDRESS2_ADDRESS_TEXTBOX);
		sendKeyToElement(driver, MyAccountPageUI.ADDRESS2_ADDRESS_TEXTBOX, address2);
		
	}

	public void enterZipCodeAddressTextbox(String zip) {
		waitForElementVisible(driver, MyAccountPageUI.ZIPCODE_ADDRESS_TEXTBOX);
		sendKeyToElement(driver, MyAccountPageUI.ZIPCODE_ADDRESS_TEXTBOX, zip);
		
	}

	public void enterPhoneAddressTextbox(String phone) {
		waitForElementVisible(driver, MyAccountPageUI.PHONE_ADDRESS_TEXTBOX);
		sendKeyToElement(driver, MyAccountPageUI.PHONE_ADDRESS_TEXTBOX, phone);
		
	}

	public void enterFaxAddressTextbox(String fax) {
		waitForElementVisible(driver, MyAccountPageUI.FAX_ADDRESS_TEXTBOX);
		sendKeyToElement(driver, MyAccountPageUI.FAX_ADDRESS_TEXTBOX, fax);
		
	}

	public void clickToSaveAddressButton() {
		waitForElementClickable(driver, MyAccountPageUI.SAVE_ADDRESS_BUTTON);
		clickToElement(driver, MyAccountPageUI.SAVE_ADDRESS_BUTTON);
		
	}

	public String getTextInAddressPage(String value) {
		waitForElementVisible(driver, MyAccountPageUI.ADDRESS_TEXT_DYNAMIC, value);
		return getElementText(driver,  MyAccountPageUI.ADDRESS_TEXT_DYNAMIC, value);
	}

	public String getTextInEmailAddressPage(String email) {
		waitForElementVisible(driver, MyAccountPageUI.EMAIL_ADDRESS_TEXT, email);
		return getElementText(driver,  MyAccountPageUI.EMAIL_ADDRESS_TEXT, email);
	}

	public void clickToChangePasswordLink() {
		waitForElementClickable(driver, MyAccountPageUI.CHANGE_PASSWORD_LINK);
		clickToElement(driver, MyAccountPageUI.CHANGE_PASSWORD_LINK);
		
	}

	public void enterPasswordTextbox(String lable, String password) {
		waitForElementVisible(driver, MyAccountPageUI.PASSWORD_TEXTBOX_BY_TEXT,lable);
		sendKeyToElement(driver, MyAccountPageUI.PASSWORD_TEXTBOX_BY_TEXT, password, lable);
		
	}

	public void clickToChangePasswordButton() {
		waitForElementClickable(driver, MyAccountPageUI.CHANGE_PASSWORD_BUTTON);
		clickToElement(driver, MyAccountPageUI.CHANGE_PASSWORD_BUTTON);
		
		
	}

	public LoginPageObject clickToLogoutButton() {
		waitForElementClickable(driver, MyAccountPageUI.LOG_OUT_LINK);
		clickToElement(driver, MyAccountPageUI.LOG_OUT_LINK);
		return PageGeneratorManagerNopCommerce.getLoginPage(driver);
	}

	public void clickClosePopup() {
		waitForElementVisible(driver, MyAccountPageUI.CLOSE_BUTTON);
		clickToElementByJS(driver, MyAccountPageUI.CLOSE_BUTTON);
		sleepInSecond(3);
	}

	public void clickToMyProductReview() {
		waitForElementClickable(driver, MyAccountPageUI.MY_PRODUCT_REVEW_LINK);
		clickToElement(driver, MyAccountPageUI.MY_PRODUCT_REVEW_LINK);
		
	}

	public String getVerifyReviewTitle() {
		waitForElementVisible(driver, MyAccountPageUI.REVIEW_TITLE_TEXT);
		return getElementText(driver,  MyAccountPageUI.REVIEW_TITLE_TEXT);
	}

	public String getVerifyReviewText() {
		waitForElementVisible(driver, MyAccountPageUI.REVIEW_TEXT);
		return getElementText(driver,  MyAccountPageUI.REVIEW_TEXT);
	}

	

}
