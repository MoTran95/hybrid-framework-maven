package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.bankGuru.payment.AddToCartPageUI;

public class AddToCartPageObject extends BasePage {
	WebDriver driver;

	public AddToCartPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isPageTitleDisplayed() {
		waitForElementVisible(driver, AddToCartPageUI.PAGE_TITLE_BY_TEXT);
		return isElementDisplayed(driver, AddToCartPageUI.PAGE_TITLE_BY_TEXT);
	}

	public void clickToCheckbox(String productName) {
		waitForElementClickable(driver, AddToCartPageUI.ADD_TO_CARD_CHECKBOX_BY_TEXT, productName);
		clickToElement(driver, AddToCartPageUI.ADD_TO_CARD_CHECKBOX_BY_TEXT, productName);
	}

	public void clickToRemoveButton(String productName) {
		waitForElementClickable(driver, AddToCartPageUI.REMOVE_BUTTON_BY_TEXT, productName);
		clickToElement(driver, AddToCartPageUI.REMOVE_BUTTON_BY_TEXT, productName);
		
	}

	public boolean isProductDisplayed(String productName) {
		waitForElementVisible(driver, AddToCartPageUI.PRODUCT_TITLE_BY_TEXT,productName);
		return isElementDisplayed(driver, AddToCartPageUI.PRODUCT_TITLE_BY_TEXT,productName);
	}

	public boolean isEmptyMessageDisplayed() {
		waitForElementVisible(driver, AddToCartPageUI.EMPTY_MESSAGE);
		return isElementDisplayed(driver, AddToCartPageUI.EMPTY_MESSAGE);
	}

}
