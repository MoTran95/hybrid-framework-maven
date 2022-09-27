package com.nopCommerce.user;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.PageGeneratorManagerNopCommerce;
import commons.RegisterNopCommercePage;
import pageObjects.nopCommerce.user.AddToCartPageObject;
import pageObjects.nopCommerce.user.CatetoryPageObject;
import pageObjects.nopCommerce.user.CompareProductPageObject;
import pageObjects.nopCommerce.user.HomePageObject;
import pageObjects.nopCommerce.user.LoginPageObject;
import pageObjects.nopCommerce.user.ProductDetailsPageObject;
import pageObjects.nopCommerce.user.RegisterPageObject;
import pageObjects.nopCommerce.user.WhishlistPageObject;

public class WhishlistComPareRecentView extends BaseTest {
	@Parameters({ "browser", "NopCommerceUrl" })
	@BeforeClass
	public void beforeClass(String browserName, String NopCommerceUrl) {
		email = RegisterNopCommercePage.email;
		password = RegisterNopCommercePage.password;
		firstName = RegisterNopCommercePage.firstName;
		lastName = RegisterNopCommercePage.lastName;
		productName = "Lenovo IdeaCentre 600 All-in-One PC";
		productName2 = "Build your own computer";

		driver = getBrowserDriver(browserName, NopCommerceUrl);
		homePage = PageGeneratorManagerNopCommerce.getHomePage(driver);

		log.info("Pre-condition-01: click to login link");
		loginPage = homePage.clickToLoginLink();

		log.info("Pre-condition-02: enter to email " + email);
		loginPage.enterEmailTextbox(email);

		log.info("Pre-condition-03: enter to password " + password);
		loginPage.enterPasswordTextbox(password);

		log.info("Pre-condition-04: click to Login Button");
		homePage = loginPage.clickToLoginButton();

	}

	
	public void TC_01_Add_To_Whishlist() {
		log.info("Add_To_Whishlist_01: Click to Computer link");
		catetoryPage = homePage.clickToCatetoryProduct("Computers");

		log.info("Add_To_Whishlist_02: Click to Desktop link");
		catetoryPage.clickToCategorylink("Desktops ");

		log.info("Add_To_Whishlist_02: Click to Product link");
		productDetailPage = catetoryPage.clickToProductLink(productName);

		log.info("Add_To_Whishlist_03: Click add to whishlist link");
		productDetailPage.clickToAddToWhishlist(productName, "Add to wishlist");

		log.info("Add_To_Whishlist_04: Verify message is shown");
		Assert.assertEquals(productDetailPage.getMessageDisplayed(), "The product has been added to your wishlist");

		log.info("Add_To_Whishlist_05: Click close button");
		productDetailPage.clickToCloseButtonMessage();

		log.info("Add_To_Whishlist_06: Click to whishlist link");
		whishlistPage = productDetailPage.clickToWhishlistLink("Wishlist");

		log.info("Add_To_Whishlist_07: Verify product is added");
		Assert.assertTrue(whishlistPage.isProductTitleDisplayed(productName));

		log.info("Add_To_Whishlist_08: Click to whishlist link");
		whishlistPage.clickToWhishlistLink();

		log.info("Add_To_Whishlist_08: Verify page title text");
		Assert.assertTrue(whishlistPage.isPageTitleDisplayed("Wishlist of " + firstName + " " + lastName));

	}

	
	public void TC_02_Add_To_Whishlist() {
		log.info("Add_To_Cart_01: click to checkbox");
		whishlistPage.clickToCheckbox(productName);

		log.info("Add_To_Cart_02: click to Add to cart");
		addToCartPage = whishlistPage.clickToAddToCartButton();

		log.info("Add_To_Cart_03: Verify page title");
		Assert.assertTrue(addToCartPage.isPageTitleDisplayed());

		log.info("Add_To_Cart_04: Verify the product is added");
		Assert.assertTrue(addToCartPage.isProductDisplayed(productName));

		log.info("Add_To_Cart_05: click to remove button");
		addToCartPage.clickToRemoveButton(productName);
		
		log.info("Add_To_Cart_06: verify message product is remove");
		Assert.assertTrue(addToCartPage.isEmptyMessageDisplayed());

	}
	
	
	public void TC_03_Remove_To_Whishlist() {
		log.info("Remove_To_Whishlist_01: Click to Computer link");
		catetoryPage = homePage.clickToCatetoryProduct("Computers");

		log.info("Remove_To_Whishlist_02: Click to Desktop link");
		catetoryPage.clickToCategorylink("Desktops ");

		log.info("Remove_To_Whishlist_02: Click to Product link");
		productDetailPage = catetoryPage.clickToProductLink(productName);

		log.info("Remove_To_Whishlist_03: Click add to whishlist link");
		productDetailPage.clickToAddToWhishlist(productName, "Add to wishlist");

		log.info("Remove_To_Whishlist_04: Verify message is shown");
		Assert.assertEquals(productDetailPage.getMessageDisplayed(), "The product has been added to your wishlist");

		log.info("Remove_To_Whishlist_05: Click close button");
		productDetailPage.clickToCloseButtonMessage();
		
		log.info("Remove_To_Whishlist_06: Click to whishlist link");
		whishlistPage = productDetailPage.clickToWhishlistLink("Wishlist");

		log.info("Remove_To_Whishlist_07: Verify product is added");
		Assert.assertTrue(whishlistPage.isProductTitleDisplayed(productName));
		
		log.info("Remove_To_Whishlist_08: Click to checkbox product");
		whishlistPage.clickToCheckbox(productName);
		
		log.info("Remove_To_Whishlist_09: Click to remove button");
		whishlistPage.clickToRemoveButton(productName);
		
		log.info("Remove_To_Whishlist_10: Verify product is remove");
		Assert.assertTrue(whishlistPage.isRemoveProductMessage());
	}
	
	@Test
	public void TC_04_Add_Product_Compare() {
		log.info("Add_Product_Compare_01: Click to Computer link");
		catetoryPage = homePage.clickToCatetoryProduct("Computers");

		log.info("Add_Product_Compare_02: Click to Desktop link");
		catetoryPage.clickToCategorylink("Desktops ");
		
		log.info("Add_Product_Compare_03: Click to add compare button");
		catetoryPage.clickToAddCompareButton(productName,"Add to compare list");
		
		log.info("Add_Product_Compare_04: Verify message is shown");
		Assert.assertEquals(catetoryPage.getSuccessMessageDisplayed(), "The product has been added to your product comparison");
		
		log.info("Add_Product_Compare_05: Click close to add compare button message");
		catetoryPage.clickCloseButtonMessage();
		
		log.info("Add_Product_Compare_06: Click to add compare button");
		catetoryPage.clickToAddCompareButton(productName2,"Add to compare list");
		
		log.info("Add_Product_Compare_07: Verify message is shown");
		Assert.assertEquals(catetoryPage.getSuccessMessageDisplayed(), "The product has been added to your product comparison");
		
		log.info("Add_Product_Compare_08: Click close to add compare button message");
		catetoryPage.clickCloseButtonMessage();
		
		log.info("Add_Product_Compare_09: Click Compare product page");
		compareProductPage = catetoryPage.clickToCompareProductLink("Compare products list");
		
		log.info("Add_Product_Compare_10: Verify product is shown");
		Assert.assertTrue(compareProductPage.isProductNameDisplayed(productName));
		Assert.assertTrue(compareProductPage.isProductNameDisplayed(productName2));
		
		log.info("Add_Product_Compare_11: Click to clear button");
		compareProductPage.clickToClearButton();
		
		log.info("Add_Product_Compare_12: Verify message is shown");
		Assert.assertTrue(compareProductPage.isMessageDisplayed());
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
//		closeBrowserAndDriver();
	}

	private WebDriver driver;
	String email, password, firstName, lastName, productName, productName2;
	RegisterPageObject registerPage;
	HomePageObject homePage;
	LoginPageObject loginPage;
	CatetoryPageObject catetoryPage;
	ProductDetailsPageObject productDetailPage;
	WhishlistPageObject whishlistPage;
	AddToCartPageObject addToCartPage;
	CompareProductPageObject compareProductPage;

}
