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
import pageObjects.nopCommerce.user.ShoppingCartPageObject;
import pageObjects.nopCommerce.user.ProductDetailsPageObject;
import pageObjects.nopCommerce.user.RegisterPageObject;
import pageObjects.nopCommerce.user.WhishlistPageObject;

public class Order extends BaseTest {
	@Parameters({ "browser", "NopCommerceUrl" })
	@BeforeClass
	public void beforeClass(String browserName, String NopCommerceUrl) {
		email = RegisterNopCommercePage.email;
		password = RegisterNopCommercePage.password;
		firstName = RegisterNopCommercePage.firstName;
		lastName = RegisterNopCommercePage.lastName;
		productName = "Build your own computer";
		ramDropdown = "2 GB";
		hddRadio = "320 GB";
		osRadio = "Vista Home [+$50.00]";
		softwareCheckbox = "Microsoft Office [+$50.00]";
		price = "$1,315.00";

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

	@Test
	public void TC_01_Add_Product_To_Cart() {
		log.info("Add_Product_To_Cart_01: Click to Computer link");
		catetoryPage = homePage.clickToCatetoryProduct("Computers");

		log.info("Add_Product_To_Cart_02: Click to Desktop link");
		catetoryPage.clickToCategorylink("Desktops ");

		log.info("Add_Product_To_Cart_03: Click to Product link");
		productDetailPage = catetoryPage.clickToProductLink(productName);
		
		log.info("Add_Product_To_Cart_04: select ram dropdown");
		productDetailPage.selectRamDropdown(ramDropdown);
		
		log.info("Add_Product_To_Cart_05: select HDD radio");
		productDetailPage.selectHddRadio();
		
		log.info("Add_Product_To_Cart_06: Click to Add to cart");
		productDetailPage.clickToAddToCartButton();
		
		log.info("Add_Product_To_Cart_07: Verify message is shown");
		Assert.assertEquals(productDetailPage.getMessageDisplayed(), "The product has been added to your shopping cart");

		log.info("Add_Product_To_Cart_08: Click close button");
		productDetailPage.clickToCloseButtonMessage();
		
		log.info("Add_Product_To_Cart_09: Click Order link");
		shoppingCartPage = productDetailPage.clickToShoppingLink("Shopping cart");
		
		log.info("Add_Product_To_Cart_10: verify product");
		Assert.assertTrue(shoppingCartPage.isProductTitleDisplayed(productName));
		Assert.assertTrue(shoppingCartPage.getContainDisplayed().contains("Processor: 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]"));
		Assert.assertTrue(shoppingCartPage.getContainDisplayed().contains("RAM: 2 GB"));
		Assert.assertTrue(shoppingCartPage.getContainDisplayed().contains("HDD: 320 GB"));
		Assert.assertTrue(shoppingCartPage.getContainDisplayed().contains("OS: Vista Home [+$50.00]"));
		Assert.assertTrue(shoppingCartPage.getContainDisplayed().contains("Software: Microsoft Office [+$50.00]"));
	}
	

	
	

	@AfterClass(alwaysRun = true)
	public void afterClass() {
//		closeBrowserAndDriver();
	}

	private WebDriver driver;
	String email, password, firstName, lastName, productName, ramDropdown, hddRadio, osRadio, softwareCheckbox, price;
	RegisterPageObject registerPage;
	HomePageObject homePage;
	LoginPageObject loginPage;
	CatetoryPageObject catetoryPage;
	ProductDetailsPageObject productDetailPage;
	ShoppingCartPageObject shoppingCartPage;

}
