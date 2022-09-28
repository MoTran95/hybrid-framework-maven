package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManagerNopCommerce;
import pageUIs.nopCommerce.user.ProductDetailsPageUI;

public class ProductDetailsPageObject extends BasePage {
	WebDriver driver;

	public ProductDetailsPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToProduct(String value) {
		waitForElementClickable(driver,ProductDetailsPageUI.PRODUCT_BY_TITLE ,value);
		clickToElement(driver,ProductDetailsPageUI.PRODUCT_BY_TITLE, value);
		
	}

	public ProductReviewPageObject clickToAddYourReview(String value) {
		waitForElementClickable(driver,ProductDetailsPageUI.ADD_REVIEW_LINK ,value);
		clickToElement(driver,ProductDetailsPageUI.ADD_REVIEW_LINK, value);
		return PageGeneratorManagerNopCommerce.getProductReviewPage(driver);
	}

	public void clickToAddToWhishlist(String productTitle, String addButton) {
		waitForElementClickable(driver,ProductDetailsPageUI.ADD_BUTTON_BY_TEXT ,productTitle, addButton);
		clickToElement(driver,ProductDetailsPageUI.ADD_BUTTON_BY_TEXT, productTitle,addButton);
		
	}

	public String getMessageDisplayed() {
		waitForElementVisible(driver, ProductDetailsPageUI.MESSAGE_BY_TEXT);
		return getElementText(driver, ProductDetailsPageUI.MESSAGE_BY_TEXT);
	}

	public void clickToCloseButtonMessage() {
		waitForElementClickable(driver,ProductDetailsPageUI.CLOSE_MESSAGE_BUTTON);
		scrollToElement(driver, ProductDetailsPageUI.CLOSE_MESSAGE_BUTTON);
		clickToElement(driver,ProductDetailsPageUI.CLOSE_MESSAGE_BUTTON);
		sleepInSecond(2);
		
	}

	public WhishlistPageObject clickToWhishlistLink(String value) {
		waitForElementClickable(driver,ProductDetailsPageUI.FOOTER_MENU_BY_TEXT, value);
		clickToElement(driver,ProductDetailsPageUI.FOOTER_MENU_BY_TEXT, value);
		return PageGeneratorManagerNopCommerce.getWhishlistPage(driver);
	}

	public void selectRamDropdown(String ramDropdown) {
		waitForElementVisible(driver, ProductDetailsPageUI.RAM_DROPDOWN);
		selectItemInDefaultDropdown(driver, ProductDetailsPageUI.RAM_DROPDOWN, ramDropdown);
	}

	public void selectHddRadio() {
		waitForElementVisible(driver, ProductDetailsPageUI.HDD_RADIO);
		checkToDefaultCheckboxOrRadio(driver, ProductDetailsPageUI.HDD_RADIO);
		
	}

	public void clickToAddToCartButton() {
		waitForElementClickable(driver, ProductDetailsPageUI.ADD_TO_CART_BUTTON);
		clickToElement(driver, ProductDetailsPageUI.ADD_TO_CART_BUTTON);
	}

	public ShoppingCartPageObject clickToShoppingLink(String shoppingCart) {
		waitForElementClickable(driver, ProductDetailsPageUI.FOOTER_MENU_BY_TEXT, shoppingCart);
		clickToElement(driver, ProductDetailsPageUI.FOOTER_MENU_BY_TEXT,shoppingCart);
		return PageGeneratorManagerNopCommerce.getShoppingCartPage(driver);
	}
}
