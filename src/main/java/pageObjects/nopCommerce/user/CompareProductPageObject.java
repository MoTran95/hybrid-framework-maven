package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopCommerce.user.CompareProductPageUI;

public class CompareProductPageObject extends BasePage {
	WebDriver driver;

	public CompareProductPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isProductNameDisplayed(String productName) {
		waitForElementVisible(driver, CompareProductPageUI.PRODUCT_NAME_BY_TEXT, productName);
		return isElementDisplayed(driver, CompareProductPageUI.PRODUCT_NAME_BY_TEXT, productName);
	}

	public void clickToClearButton() {
		waitForElementClickable(driver, CompareProductPageUI.CLEAR_LIST_BUTTON);
		clickToElement(driver,CompareProductPageUI.CLEAR_LIST_BUTTON);
		
	}

	public boolean isMessageDisplayed() {
		waitForElementVisible(driver, CompareProductPageUI.EMPTY_MESSAGE);
		return isElementDisplayed(driver, CompareProductPageUI.EMPTY_MESSAGE);
	}

}
