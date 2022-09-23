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
import pageObjects.nopCommerce.user.HomePageObject;
import pageObjects.nopCommerce.user.LoginPageObject;
import pageObjects.nopCommerce.user.RegisterPageObject;
import pageObjects.nopCommerce.user.SearchPageObject;

public class Search extends BaseTest{
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

	@Test
	public void TC_01_Search_Empty_Data() {
		log.info("Search_Empty_Data_01: click to search link");
		searchPage = homePage.clickToSearchLink("Search");
		
		log.info("Search_Empty_Data_02: click to search button");
		searchPage.clickToSearchButton();
		
		log.info("Search_Empty_Data_03: Verify error message");
		Assert.assertTrue(searchPage.isErrorMessageDisplayed("Search term minimum length is 3 characters"));

		
		
	}
	@Test
	public void TC_02_Search_Data_Not_Exists() {
		log.info("Search_Data_Not_Exists_01: click to search link");
		searchPage = homePage.clickToSearchLink("Search");
		
		log.info("Search_Data_Not_Exists_02: enter data not exist into search textbox");
		searchPage.enterSearchTextbox("Mac2025");
		
		log.info("Search_Data_Not_Exists_03: click to search button");
		searchPage.clickToSearchButton();
		
		log.info("Search_Data_Not_Exists_04: Verify error message");
		Assert.assertTrue(searchPage.isErrorMessageDisplayed("No products were found that matched your criteria."));
	}
	@Test
	public void TC_03_Search_Relative_Data() {
		log.info("Search_Relative_Data_01: click to search link");
		searchPage = homePage.clickToSearchLink("Search");
		
		log.info("Search_Relative_Data_02: enter relative data into search textbox");
		searchPage.enterSearchTextbox("lenovo");
		
		log.info("Search_Relative_Data_03: click to search button");
		searchPage.clickToSearchButton();
		
		log.info("Search_Relative_Data_04: Verify result");
		Assert.assertEquals(searchPage.getNumberProduct(), 2);
		Assert.assertTrue(searchPage.isProductDisplayed("Lenovo IdeaCentre 600 All-in-One PC"));
		Assert.assertTrue(searchPage.isProductDisplayed("Lenovo Thinkpad X1 Carbon Laptop"));
		
		
	}
	@Test
	public void TC_04_Search_Absolute_Data() {
		log.info("Search_Absolute_Data_01: click to search link");
		searchPage = homePage.clickToSearchLink("Search");
		
		log.info("Search_Absolute_Data_02: enter absolute data into search textbox");
		searchPage.enterSearchTextbox("ThinkPad X1 Carbon");
		
		log.info("Search_Absolute_Data_03: click to search button");
		searchPage.clickToSearchButton();
		
		log.info("Search_Absolute_Data_04: Verify result");
		Assert.assertEquals(searchPage.getNumberProduct(), 1);
		Assert.assertTrue(searchPage.isProductDisplayed("Lenovo Thinkpad X1 Carbon Laptop"));
	}
	@Test
	public void TC_05_Advanced_Search_With_Parent() {
		log.info("Advanced_Search_With_Parent_01: click to search link");
		searchPage = homePage.clickToSearchLink("Search");
		
		log.info("Advanced_Search_With_Parent_02: enter data  into search textbox");
		searchPage.enterSearchTextbox("Apple MacBook Pro");
		
		log.info("Advanced_Search_With_Parent_03: click search textbox");
		searchPage.clickToAdvancedCheckbox();
		
		log.info("Advanced_Search_With_Parent_04: select computers in dropdown");
		searchPage.selectValueInCategoryDropdown("Computers");
		
		log.info("Advanced_Search_With_Parent_05: click to search button");
		searchPage.clickToSearchButton();
		
		log.info("Advanced_Search_With_Parent_06: Verify error message");
		Assert.assertTrue(searchPage.isErrorMessageDisplayed("No products were found that matched your criteria."));
	}
	
	@Test
	public void TC_06_Advanced_Search_With_Sub() {
		log.info("Advanced_Search_With_Sub_01: click to search link");
		searchPage = homePage.clickToSearchLink("Search");
		
		log.info("Advanced_Search_With_Sub_02: enter data  into search textbox");
		searchPage.enterSearchTextbox("Apple MacBook Pro");
		
		log.info("Advanced_Search_With_Sub_03: click search textbox");
		searchPage.clickToAdvancedCheckbox();
		
		log.info("Advanced_Search_With_Sub_04: select computers in dropdown");
		searchPage.selectValueInCategoryDropdown("Computers");
		
		log.info("Advanced_Search_With_Sub_05: click Auto textbox");
		searchPage.clickToAutoCheckbox();
		
		log.info("Advanced_Search_With_Sub_06: click to search button");
		searchPage.clickToSearchButton();
		
		
		log.info("Advanced_Search_With_Sub_07: Verify result");
		Assert.assertEquals(searchPage.getNumberProduct(), 1);
		Assert.assertTrue(searchPage.isProductDisplayed("Apple MacBook Pro 13-inch"));
	}
	
	@Test
	public void TC_07_Advanced_Search_Incorrect_Manuafacturer() {
		log.info("Advanced_Search_Incorrect_Manuafacturer_01: click to search link");
		searchPage = homePage.clickToSearchLink("Search");
		
		log.info("Advanced_Search_Incorrect_Manuafacturer_02: enter data  into search textbox");
		searchPage.enterSearchTextbox("Apple MacBook Pro");
		
		log.info("Advanced_Search_Incorrect_Manuafacturer_03: click search textbox");
		searchPage.clickToAdvancedCheckbox();
		
		log.info("Advanced_Search_Incorrect_Manuafacturer_04: select computers in dropdown");
		searchPage.selectValueInCategoryDropdown("Computers");
		
		log.info("Advanced_Search_Incorrect_Manuafacturer_05: click Auto textbox");
		searchPage.clickToAutoCheckbox();
		
		log.info("Advanced_Search_Incorrect_Manuafacturer_06: select computers in dropdown");
		searchPage.selectValueInManuafacturerDropdown("HP");
		
		log.info("Advanced_Search_Incorrect_Manuafacturer_07: click to search button");
		searchPage.clickToSearchButton();
		
		
		log.info("Advanced_Search_Incorrect_Manuafacturer_08: Verify result");
		Assert.assertTrue(searchPage.isErrorMessageDisplayed("No products were found that matched your criteria."));
	}
	@Test
	public void TC_08_Advanced_Search_Correct_Manuafacturer() {
		log.info("Advanced_Search_Correct_Manuafacturer_01: click to search link");
		searchPage = homePage.clickToSearchLink("Search");
		
		log.info("Advanced_Search_Correct_Manuafacturer_02: enter data  into search textbox");
		searchPage.enterSearchTextbox("Apple MacBook Pro");
		
		log.info("Advanced_Search_Correct_Manuafacturer_03: click search textbox");
		searchPage.clickToAdvancedCheckbox();
		
		log.info("Advanced_Search_Correct_Manuafacturer_04: select computers in dropdown");
		searchPage.selectValueInCategoryDropdown("Computers");
		
		log.info("Advanced_Search_Correct_Manuafacturer_05: click Auto textbox");
		searchPage.clickToAutoCheckbox();
		
		log.info("Advanced_Search_Correct_Manuafacturer_06: select computers in dropdown");
		searchPage.selectValueInManuafacturerDropdown("Apple");
		
		log.info("Advanced_Search_Correct_Manuafacturer_07: click to search button");
		searchPage.clickToSearchButton();
		
		
		log.info("Advanced_Search_Incorrect_Manuafacturer_08: Verify result");
		Assert.assertEquals(searchPage.getNumberProduct(), 1);
		Assert.assertTrue(searchPage.isProductDisplayed("Apple MacBook Pro 13-inch"));
	}
	@AfterClass(alwaysRun = true)
	public void afterClass() {
		closeBrowserAndDriver();
	}

	private WebDriver driver;
	String email, password;
	RegisterPageObject registerPage;
	HomePageObject homePage;
	LoginPageObject loginPage;
	SearchPageObject searchPage;


}
