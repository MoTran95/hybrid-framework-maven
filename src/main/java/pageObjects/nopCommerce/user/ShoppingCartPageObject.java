package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopCommerce.user.ShoppingCartUI;

public class ShoppingCartPageObject extends BasePage {
	WebDriver driver;

	public ShoppingCartPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isProductTitleDisplayed(String productName) {
		waitForElementVisible(driver, ShoppingCartUI.PRODUCT_TITLE_BY_TEXT,productName);
		return isElementDisplayed(driver, ShoppingCartUI.PRODUCT_TITLE_BY_TEXT, productName);
	}

	public String getContainDisplayed() {
		waitForElementVisible(driver, ShoppingCartUI.CONTAIN_PRODUCT);
		return getElementText(driver, ShoppingCartUI.CONTAIN_PRODUCT);
	}

	

}
