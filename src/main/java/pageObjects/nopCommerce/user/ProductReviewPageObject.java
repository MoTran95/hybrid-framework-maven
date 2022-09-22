package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManagerNopCommerce;
import pageUIs.nopCommerce.user.ProductReviewPageUI;


public class ProductReviewPageObject extends BasePage {
	WebDriver driver;

	public ProductReviewPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void enterReviewTitle(String reviewTitle) {
		waitForElementVisible(driver, ProductReviewPageUI.REVIEW_TITLE, reviewTitle);
		sendKeyToElement(driver, ProductReviewPageUI.REVIEW_TITLE, reviewTitle);
		
	}

	public void enterReviewText(String reviewText) {
		waitForElementVisible(driver, ProductReviewPageUI.REVIEW_TEXT, reviewText);
		sendKeyToElement(driver, ProductReviewPageUI.REVIEW_TEXT, reviewText);
		
	}

	public HomePageObject clickToSubmitButton() {
		waitForElementClickable(driver,ProductReviewPageUI.SUBMIT_REVIEW_BUTTON);
		clickToElement(driver,ProductReviewPageUI.SUBMIT_REVIEW_BUTTON);
		return PageGeneratorManagerNopCommerce.getHomePage(driver);
	}
}
