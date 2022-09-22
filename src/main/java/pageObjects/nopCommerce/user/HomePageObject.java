package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManagerNopCommerce;
import pageUIs.nopCommerce.user.HomePageUI;

public class HomePageObject extends BasePage {
	WebDriver driver;

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public RegisterPageObject clickToRegisterLink() {
		waitForElementClickable(driver, HomePageUI.REGISTER_LINK);
		clickToElement(driver, HomePageUI.REGISTER_LINK);
		return PageGeneratorManagerNopCommerce.getRegisterPage(driver);
	}

	public LoginPageObject clickToLoginLink() {
		waitForElementClickable(driver, HomePageUI.LOGIN_LINK);
		clickToElement(driver, HomePageUI.LOGIN_LINK);
		return PageGeneratorManagerNopCommerce.getLoginPage(driver);
	} 
	public boolean isDisplayedMyAccount() {
		waitForElementVisible(driver, HomePageUI.MY_ACCOUNT_LINK);
		return isElementDisplayed(driver,HomePageUI.MY_ACCOUNT_LINK);
	}
	public MyAccountPageObject clickToMyAccountLink() {
		waitForElementClickable(driver, HomePageUI.MY_ACCOUNT_LINK);
		clickToElement(driver, HomePageUI.MY_ACCOUNT_LINK);
		return PageGeneratorManagerNopCommerce.getMyAccountPage(driver);
	}

	public CatetoryPageObject clickToCatetoryProduct(String value) {
		waitForElementClickable(driver, HomePageUI.TOP_MENU_BY_TEXT,value);
		clickToElement(driver, HomePageUI.TOP_MENU_BY_TEXT,value);
		return PageGeneratorManagerNopCommerce.getCatetoryPage(driver);
	}

	public SearchPageObject clickToSearchLink(String menu) {
		waitForElementClickable(driver, HomePageUI.FOOTER_MENU_BY_TEXT, menu);
		scrollToBottomPage(driver);
		clickToElement(driver, HomePageUI.FOOTER_MENU_BY_TEXT, menu);
		sleepInSecond(2);
		return PageGeneratorManagerNopCommerce.getSearchPage(driver);
	}

	
}
