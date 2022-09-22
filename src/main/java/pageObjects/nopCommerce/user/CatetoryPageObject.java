package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManagerNopCommerce;
import pageUIs.nopCommerce.user.CatetoryPageUI;

public class CatetoryPageObject extends BasePage{
	WebDriver driver;

	public CatetoryPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public ProductDetailsPageObject clickToProductsInCatetory(String value) {
		waitForElementClickable(driver,CatetoryPageUI.PRODUCT_BY_TITLE ,value);
		clickToElement(driver, CatetoryPageUI.PRODUCT_BY_TITLE,value);
		return PageGeneratorManagerNopCommerce.getProductDetailsPage(driver);
	}
}
