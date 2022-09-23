package com.nopCommerce.user;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.PageGeneratorManagerNopCommerce;
import commons.RegisterNopCommercePage;
import pageObjects.nopCommerce.user.CatetoryPageObject;
import pageObjects.nopCommerce.user.HomePageObject;
import pageObjects.nopCommerce.user.LoginPageObject;
import pageObjects.nopCommerce.user.RegisterPageObject;
import pageObjects.nopCommerce.user.SearchPageObject;

public class Sort extends BaseTest {
	@Parameters({ "browser", "NopCommerceUrl" })
	@BeforeClass
	public void beforeClass(String browserName, String NopCommerceUrl) {
		email = RegisterNopCommercePage.email;
		password = RegisterNopCommercePage.password;

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

	
	public void TC_01_Sort_A_Z() {
		log.info("Sort_A_Z_01: Click to Computer link");
		catetoryPage = homePage.clickToCatetoryProduct("Computers");

		log.info("Sort_A_Z_02: Click to Notebook link");
		catetoryPage.clickToCategorylink("Notebooks ");

		log.info("Sort_A_Z_03: Select A-Z in Dropdown");
		catetoryPage.clickToSortDropdown("Name: A to Z");

		log.info("Sort_A_Z_04: Verify result");
		Assert.assertTrue(catetoryPage.isProductNameSortByAscending());

	}

	
	public void TC_02_Sort_Z_A() {
		log.info("Sort_Z_A_01: Click to Computer link");
		catetoryPage = homePage.clickToCatetoryProduct("Computers");

		log.info("Sort_Z_A_02: Click to Notebook link");
		catetoryPage.clickToCategorylink("Notebooks ");

		log.info("Sort_Z_A_03: Select A-Z in Dropdown");
		catetoryPage.clickToSortDropdown("Name: Z to A");

		log.info("Sort_Z_A_04: Verify result");
		Assert.assertTrue(catetoryPage.isProductNameSortByDescending());

	}

	
	public void TC_03_Sort_Low_To_Price() {
		log.info("Sort_Low_To_Price_01: Click to Computer link");
		catetoryPage = homePage.clickToCatetoryProduct("Computers");

		log.info("Sort_Low_To_Price_02: Click to Notebook link");
		catetoryPage.clickToCategorylink("Notebooks ");

		log.info("Sort_Low_To_Price_03: Select low to high in Dropdown");
		catetoryPage.clickToSortDropdown("Price: Low to High");

		log.info("Sort_Low_To_Price_04: Verify result");
		Assert.assertTrue(catetoryPage.isPriceSortByAscending());

	}

	
	public void TC_04_Sort_High_To_Low() {
		log.info("Sort_High_To_Low_01: Click to Computer link");
		catetoryPage = homePage.clickToCatetoryProduct("Computers");

		log.info("Sort_High_To_Low_02: Click to Notebook link");
		catetoryPage.clickToCategorylink("Notebooks ");

		log.info("Sort_High_To_Low_03: Select High to Low in Dropdown");
		catetoryPage.clickToSortDropdown("Price: High to Low");

		log.info("Sort_High_To_Low_04: Verify result");
		Assert.assertTrue(catetoryPage.isPriceSortByDescending());

	}

	
	public void TC_05_Displayed_3_Products() {
		log.info("Displayed_3_01: Click to Computer link");
		catetoryPage = homePage.clickToCatetoryProduct("Computers");
		
		log.info("Displayed_3_02: Click to Notebook link");
		catetoryPage.clickToCategorylink("Notebooks ");
		
		log.info("Displayed_3_03: Select 3 in Dropdown");
		catetoryPage.clickToDisplayedDropdown("3");
		
		log.info("Displayed_3_04: Verify total product is shown correct");
		Assert.assertTrue(catetoryPage.isNumberProduct(3));
		
		log.info("Displayed_3_05: Verify next button is displayed");
		Assert.assertTrue(catetoryPage.isNextButtonDisplayed());
		
		log.info("Displayed_3_06: Click to page 2");
		catetoryPage.clickToPageDisplayed("2");
		
		log.info("Displayed_3_07: Verify previous button is displayed");
		Assert.assertTrue(catetoryPage.isPreviousButtonDisplayed());
		
		
	}
	@Test
	public void TC_06_Displayed_6_Products() {
		log.info("Displayed_6_01: Click to Computer link");
		catetoryPage = homePage.clickToCatetoryProduct("Computers");
		
		log.info("Displayed_6_02: Click to Notebook link");
		catetoryPage.clickToCategorylink("Notebooks ");
		
		log.info("Displayed_6_03: Select 3 in Dropdown");
		catetoryPage.clickToDisplayedDropdown("6");
		
		log.info("Displayed_6_04: Verify result");
		Assert.assertTrue(catetoryPage.isNumberProduct(6));
		
		log.info("Displayed_3_05: Verify next button is NOT displayed");
		Assert.assertTrue(catetoryPage.isNextButtonUnDisplayed());
		
		log.info("Displayed_3_06: Verify page 1,2 is NOT displayed");
		Assert.assertTrue(catetoryPage.isPageUnDisplayed("1","1"));
		Assert.assertTrue(catetoryPage.isPageUnDisplayed("2","2"));
	}
	@Test
	public void TC_07_Displayed_9_Products() {
		log.info("Displayed_9_01: Click to Computer link");
		catetoryPage = homePage.clickToCatetoryProduct("Computers");

		log.info("Displayed_9_02: Click to Notebook link");
		catetoryPage.clickToCategorylink("Notebooks ");

		log.info("Displayed_9_03: Select 3 in Dropdown");
		catetoryPage.clickToDisplayedDropdown("9");

		log.info("Displayed_9_04: Verify result");
		Assert.assertTrue(catetoryPage.isNumberProduct(9));
		
		log.info("Displayed_9_05: Verify next button is NOT displayed");
		Assert.assertTrue(catetoryPage.isNextButtonUnDisplayed());
		
		log.info("Displayed_9_06: Verify page 1,2 is NOT displayed");
		Assert.assertTrue(catetoryPage.isPageUnDisplayed("1","1"));
		Assert.assertTrue(catetoryPage.isPageUnDisplayed("2","2"));
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
//		closeBrowserAndDriver();
	}

	private WebDriver driver;
	String email, password;
	RegisterPageObject registerPage;
	HomePageObject homePage;
	LoginPageObject loginPage;
	CatetoryPageObject catetoryPage;

}
