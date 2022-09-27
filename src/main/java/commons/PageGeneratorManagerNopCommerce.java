package commons;


import org.openqa.selenium.WebDriver;

import pageObjects.bankGuru.payment.AddCustomerPageObject;
import pageObjects.bankGuru.payment.LoginPageObject;
import pageObjects.bankGuru.payment.NewAccountPageObject;
import pageObjects.bankGuru.payment.editCustomerPageObject;
import pageObjects.bankGuru.payment.editNewAccountPageObject;
import pageObjects.bankGuru.payment.homePagePageObject;
import pageObjects.nopCommerce.user.RegisterPageObject;
import pageObjects.nopCommerce.user.SearchPageObject;
import pageObjects.nopCommerce.user.WhishlistPageObject;
import pageObjects.nopCommerce.user.AddToCartPageObject;
import pageObjects.nopCommerce.user.CatetoryPageObject;
import pageObjects.nopCommerce.user.CompareProductPageObject;
import pageObjects.nopCommerce.user.HomePageObject;
import pageObjects.nopCommerce.user.MyAccountPageObject;
import pageObjects.nopCommerce.user.ProductDetailsPageObject;
import pageObjects.nopCommerce.user.ProductReviewPageObject;

public class PageGeneratorManagerNopCommerce {
	public static RegisterPageObject getRegisterPage(WebDriver driver) {
		return new RegisterPageObject(driver);
	}
	public static HomePageObject getHomePage(WebDriver driver) {
		return new HomePageObject(driver);
	}
	public static pageObjects.nopCommerce.user.LoginPageObject getLoginPage(WebDriver driver) {
		return new pageObjects.nopCommerce.user.LoginPageObject(driver);
	}
	public static  MyAccountPageObject getMyAccountPage(WebDriver driver) {
		return new MyAccountPageObject(driver);
	}
	public static  CatetoryPageObject getCatetoryPage(WebDriver driver) {
		return new CatetoryPageObject(driver);
	}
	public static  ProductDetailsPageObject getProductDetailsPage(WebDriver driver) {
		return new ProductDetailsPageObject(driver);
	}
	public static  ProductReviewPageObject getProductReviewPage(WebDriver driver) {
		return new ProductReviewPageObject(driver);
	}
	public static  SearchPageObject getSearchPage(WebDriver driver) {
		return new SearchPageObject(driver);
	}
	public static  WhishlistPageObject getWhishlistPage(WebDriver driver) {
		return new WhishlistPageObject(driver);
	}
	public static  AddToCartPageObject getAddToCartPage(WebDriver driver) {
		return new AddToCartPageObject(driver);
	}
	public static  CompareProductPageObject getCompareProductPage(WebDriver driver) {
		return new CompareProductPageObject(driver);
	}

}
