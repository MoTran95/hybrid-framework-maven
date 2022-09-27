package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManagerNopCommerce;
import pageUIs.nopCommerce.user.WhishlishPageUI;

public class WhishlistPageObject extends BasePage{
	WebDriver driver;

	public WhishlistPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isProductTitleDisplayed(String value) {
		waitForElementVisible(driver, WhishlishPageUI.PRODUCT_TITLE_BY_TEXT, value);
		return isElementDisplayed(driver, WhishlishPageUI.PRODUCT_TITLE_BY_TEXT, value);
	}

	public void clickToWhishlistLink() {
		waitForElementClickable(driver, WhishlishPageUI.WHISHLISH_LINK);
		clickToElement(driver,WhishlishPageUI.WHISHLISH_LINK);
		
	}

	public boolean isPageTitleDisplayed(String value) {
		sleepInSecond(2);
		waitForElementVisible(driver, WhishlishPageUI.PAGE_TITLE_BY_TEXT,value);
		return isElementDisplayed(driver, WhishlishPageUI.PAGE_TITLE_BY_TEXT,value);
	}

	public void clickToCheckbox(String productName) {
		waitForElementVisible(driver,WhishlishPageUI.ADD_TO_CARD_CHECKBOX_BY_TEXT, productName);
		checkToDefaultCheckboxOrRadio(driver, WhishlishPageUI.ADD_TO_CARD_CHECKBOX_BY_TEXT, productName);
	}

	public AddToCartPageObject clickToAddToCartButton() {
		waitForElementClickable(driver, WhishlishPageUI.ADD_TO_CARD_BUTTON);
		clickToElement(driver,WhishlishPageUI.ADD_TO_CARD_BUTTON);
		return PageGeneratorManagerNopCommerce.getAddToCartPage(driver);
	}

	public void clickToRemoveButton(String productName) {
		waitForElementClickable(driver, WhishlishPageUI.REMOVE_BUTTON_BY_TEXT,productName);
		clickToElement(driver,WhishlishPageUI.REMOVE_BUTTON_BY_TEXT,productName);
		
	}

	public boolean isRemoveProductMessage() {
		waitForElementVisible(driver, WhishlishPageUI.EMPTY_MESSAGE);
		return isElementDisplayed(driver, WhishlishPageUI.EMPTY_MESSAGE);
	}


	

}
