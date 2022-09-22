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
}
