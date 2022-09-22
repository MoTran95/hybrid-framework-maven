package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManagerNopCommerce;
import lombok.val;
import pageUIs.nopCommerce.user.CatetoryPageUI;
import pageUIs.nopCommerce.user.HomePageUI;
import pageUIs.nopCommerce.user.SearchPageUI;

public class SearchPageObject extends BasePage{
	WebDriver driver;

	public SearchPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToSearchButton() {
		waitForElementClickable(driver, SearchPageUI.SEARCH_BUTTON );
		clickToElement(driver, SearchPageUI.SEARCH_BUTTON);
		sleepInSecond(2);
		
	}

	public boolean isErrorMessageDisplayed(String value) {
		waitForElementVisible(driver, SearchPageUI.SEARCH_ERROR_MESSAGE_BY_TEXT,value);
		return isElementDisplayed(driver,SearchPageUI.SEARCH_ERROR_MESSAGE_BY_TEXT, value);
	}

	public void enterSearchTextbox(String data) {
		waitForElementVisible(driver, SearchPageUI.SEARCH_TEXTBOX);
		sendKeyToElement(driver, SearchPageUI.SEARCH_TEXTBOX, data);
		
	}

	public int getNumberProduct() {
		waitForAllElementVisible(driver, SearchPageUI.PRODUCT_NUMBER);
		return getElementSize(driver, SearchPageUI.PRODUCT_NUMBER);
	}

	public boolean isProductDisplayed(String product) {
		waitForElementVisible(driver, SearchPageUI.PRODUCT_TITLE_BY_TEXT,product);
		return isElementDisplayed(driver,SearchPageUI.PRODUCT_TITLE_BY_TEXT, product);
	}

	public void selectValueInCategoryDropdown(String value) {
		waitForElementVisible(driver, SearchPageUI.CATEGORY_DROPDOWN);
		selectItemInDefaultDropdown(driver, SearchPageUI.CATEGORY_DROPDOWN, value);
	}

	public void clickToAdvancedCheckbox() {
		waitForElementVisible(driver, SearchPageUI.SEARCH_ADVANCED_CHECKBOX);
		checkToDefaultCheckboxOrRadio(driver, SearchPageUI.SEARCH_ADVANCED_CHECKBOX);
		
	}

	public void clickToAutoCheckbox() {
		waitForElementVisible(driver, SearchPageUI.AUTOMATICALLY_CHECKBOX);
		checkToDefaultCheckboxOrRadio(driver, SearchPageUI.AUTOMATICALLY_CHECKBOX);
		
	}

	public void selectValueInManuafacturerDropdown(String value) {
		waitForElementVisible(driver, SearchPageUI.MANUAFACTURER_DROPDOWN);
		selectItemInDefaultDropdown(driver, SearchPageUI.MANUAFACTURER_DROPDOWN, value);
		
	}
}
