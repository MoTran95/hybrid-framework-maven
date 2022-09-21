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
import pageObjects.nopCommerce.user.RegisterPageObject;
import pageObjects.nopCommerce.user.HomePageObject;
import pageObjects.nopCommerce.user.LoginPageObject;
import pageObjects.nopCommerce.user.MyAccountPageObject;
import utilities.DataHelper;

public class MyAccount {
	public class Payment extends BaseTest {
		@Parameters({ "browser", "NopCommerceUrl" })
		@BeforeClass
		public void beforeClass(String browserName, String NopCommerceUrl) {
			dataFaker = DataHelper.getDataHelper();
			firstName = dataFaker.getFirstName();
			lastName = dataFaker.getLastName();
			updateEmail = dataFaker.getEmailAddress();
			companyName = dataFaker.getCompanyName();
			date = "11";
			month = "July";
			year = "2000";
			email = RegisterNopCommercePage.email;
			password = RegisterNopCommercePage.password;

			driver = getBrowserDriver(browserName, NopCommerceUrl);
			homePage = PageGeneratorManagerNopCommerce.getHomePage(driver);

			log.info("Pre-condition-01: click to login link");
			loginPage = homePage.clickToLoginLink();

			log.info("Pre-condition-02: enter to email " + email);
			loginPage.enterEmailTextbox(email);

			log.info("Pre-condition-03: enter to password" + password);
			loginPage.enterPasswordTextbox(password);
			
			log.info("Pre-condition-04: click to Login Button");
			loginPage.clickToLoginButton();

		}

		@Test
		public void TC_01_Update_Customer_Infor() {
			log.info("Upadte_customer_infor_01: click to my account link");
			myAccountPage = loginPage.clickToMyAccountLink();

			log.info("Upadte_customer_infor_02: select Female radio");
			myAccountPage.selectGender();

			log.info("Upadte_customer_infor_03: enter fisrt name textbox");
			myAccountPage.enterFirstNameTextbox(firstName);

			log.info("Upadte_customer_infor_04: enter last name textbox");
			myAccountPage.enterLastNameTextbox(lastName);

			log.info("Upadte_customer_infor_05: select date");
			myAccountPage.selectDate(date);

			log.info("Upadte_customer_infor_06: select month");
			myAccountPage.selectMonth(month);

			log.info("Upadte_customer_infor_07: select year");
			myAccountPage.selectYear(year);

			log.info("Upadte_customer_infor_08: enter email textbox");
			myAccountPage.enterEmailTextbox(updateEmail);

			log.info("Upadte_customer_infor_09: enter company name textbox");
			myAccountPage.enterCompanyTextbox(companyName);

			log.info("Upadte_customer_infor_10: click save button");
			myAccountPage.clickToSaveButton();
			
			log.info("Upadte_customer_infor_11: Verify Gender is updated female");
			Assert.assertTrue(myAccountPage.isSelected());
			
			log.info("Upadte_customer_infor_12: Verify first name is updated successful " + firstName);
			Assert.assertTrue(myAccountPage.isDisplayedFirstNameText(firstName));
			
			
			log.info("Upadte_customer_infor_13: Verify last name is updated successful " + lastName);
			Assert.assertTrue(myAccountPage.isDisplayedLastNameText(lastName));
			
			log.info("Upadte_customer_infor_14: Verify date is updated successful " + date);
			Assert.assertEquals(myAccountPage.getDateDropdownText(), date);
			
			log.info("Upadte_customer_infor_15: Verify month is updated successful " + month);
			Assert.assertEquals(myAccountPage.getMonthDropdownText(), month);
			
			log.info("Upadte_customer_infor_16: Verify year is updated successful " + year);
			Assert.assertEquals(myAccountPage.getYearDropdownText(), year);
			
			log.info("Upadte_customer_infor_17: Verify email is updated successful " + updateEmail);
			Assert.assertTrue(myAccountPage.isDisplayedEmailText(updateEmail));
			
			log.info("Upadte_customer_infor_18: Verify company name is updated successful " + companyName);
			Assert.assertTrue(myAccountPage.isDisplayedCompanyText(companyName));
			

		}

		@AfterClass(alwaysRun = true)
		public void afterClass() {
			closeBrowserAndDriver();
		}

		private WebDriver driver;
		private DataHelper dataFaker;
		String email, firstName, lastName, date, month, year, companyName, password, updateEmail;
		HomePageObject homePage;
		LoginPageObject loginPage;
		MyAccountPageObject myAccountPage;
	}
}
