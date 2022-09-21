package com.nopCommerce.user;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.PageGeneratorManagerNopCommerce;
import pageObjects.nopCommerce.user.RegisterPageObject;
import pageObjects.nopCommerce.user.HomePageObject;
import utilities.DataHelper;

public class Register {
	public class Payment extends BaseTest {
		@Parameters({ "browser", "NopCommerceUrl" })
		@BeforeClass
		public void beforeClass(String browserName, String NopCommerceUrl) {
			dataFaker = DataHelper.getDataHelper();
			firstName = dataFaker.getFirstName();
			lastName = dataFaker.getLastName();
			email = dataFaker.getEmailAddress();
			companyName = dataFaker.getCompanyName();
			password = dataFaker.getPassword();
			date = "10";
			month = "May";
			year = "1999";
			inValidEmail = "Test123";
			invalidPassword = "123";
			validEmail = dataFaker.getEmailAddress();
			driver = getBrowserDriver(browserName, NopCommerceUrl);
			homePage = PageGeneratorManagerNopCommerce.getHomePage(driver);

		}

		@Test
		public void TC_01_Register_Empty_Data() {
			log.info("Empty-data-01: click to register link");
			registerPage = homePage.clickToRegisterLink();

			log.info("Empty-data-02: click to register button");
			registerPage.clickToRegisterButton();

			log.info("Empty-data-03: Verify firstname error message is displayed");
			Assert.assertTrue(registerPage.isDisplayedRequireErrorMessage("First name is required."));

			log.info("Empty-data-04: Verify lastname error message is displayed");
			Assert.assertTrue(registerPage.isDisplayedRequireErrorMessage("Last name is required."));

			log.info("Empty-data-05: Verify email error message is displayed");
			Assert.assertTrue(registerPage.isDisplayedRequireErrorMessage("Email is required."));

			log.info("Empty-data-06: Verify password error message is displayed");
			Assert.assertTrue(registerPage.isDisplayedRequireErrorMessage("Password is required."));

			log.info("Empty-data-07: Verify confirm password error message is displayed");
			Assert.assertTrue(registerPage.isDisplayedRequireErrorMessage("Password is required."));

		}

		@Test
		public void TC_02_Register_Invalid_Email() {
			log.info("Invalid-Email-01: Refresh page");
			registerPage.refreshPage(driver);

			log.info("Invalid-Email-02: enter first name " + firstName);
			registerPage.enterFistNameTextbox(firstName);

			log.info("Invalid-Email-03: enter last name " + lastName);
			registerPage.enterLastNameTextbox(lastName);

			log.info("Invalid-Email-04: select date");
			registerPage.selectDate(date);

			log.info("Invalid-Email-05: select month");
			registerPage.selectMonth(month);

			log.info("Invalid-Email-06: select year");
			registerPage.selectYear(year);

			log.info("Invalid-Email-07: enter invalid email");
			registerPage.enterEmailTextbox(inValidEmail);

			log.info("Invalid-Email-08: click to register button");
			registerPage.clickToRegisterButton();

			log.info("Invalid-Email-09: Verify invalid Email error message is displayed");
			Assert.assertTrue(registerPage.isDisplayedRequireErrorMessage("Wrong email"));
		}

		@Test
		public void TC_03_Register_Success() {
			log.info("Register-01: Refresh page");
			registerPage.refreshPage(driver);

			log.info("Register-02: select gender is male");
			registerPage.selectGenderRadio();

			log.info("Register-02: enter first name " + firstName);
			registerPage.enterFistNameTextbox(firstName);

			log.info("Register-03: enter last name " + lastName);
			registerPage.enterLastNameTextbox(lastName);

			log.info("Register-04: select date");
			registerPage.selectDate(date);

			log.info("Register-05: select month");
			registerPage.selectMonth(month);

			log.info("Register-06: select year");
			registerPage.selectYear(year);

			log.info("Register-07: enter valid email " + email);
			registerPage.enterEmailTextbox(email);

			log.info("Register-08: enter companyName " + companyName);
			registerPage.enterCompanyNameTextbox(companyName);

			log.info("Register-09: enter password " + password);
			registerPage.enterPasswordTextbox(password);

			log.info("Register-10: enter confirm password " + password);
			registerPage.enterConfirmPasswordTextbox(password);

			log.info("Register-11: click to register button");
			registerPage.clickToRegisterButton();

			log.info("Register-12: click to logout button");
			registerPage.clickToLogoutButton();
		}

		@Test
		public void TC_04_Exists_Email() {
			log.info("Exists-Email-01: Click to register link");
			registerPage = homePage.clickToRegisterLink();
			
			log.info("Exists-Email-02: enter first name " + firstName);
			registerPage.enterFistNameTextbox(firstName);

			log.info("Exists-Email-03: enter last name " + lastName);
			registerPage.enterLastNameTextbox(lastName);

			log.info("Exists-Email-04: select date");
			registerPage.selectDate(date);

			log.info("Exists-Email-05: select month");
			registerPage.selectMonth(month);

			log.info("Exists-Email-06: select year");
			registerPage.selectYear(year);

			log.info("Exists-Email-07: enter exists email " + email);
			registerPage.enterEmailTextbox(email);

			log.info("Exists-07: enter companyName " + companyName);
			registerPage.enterCompanyNameTextbox(companyName);

			log.info("Exists-07: enter password " + password);
			registerPage.enterPasswordTextbox(password);

			log.info("Exists-07: enter confirm password " + password);
			registerPage.enterConfirmPasswordTextbox(password);

			log.info("Exists-Email-08: click to register button");
			registerPage.clickToRegisterButton();

			log.info("Exists-Email-09: Verify exists Email error message is displayed");
			Assert.assertTrue(registerPage.isDisplayedExistsErrorMessage());

		}

		@Test
		public void TC_05_Password_Less_Than_6() {
			log.info("Empty-data-01: click to register link");
			registerPage = homePage.clickToRegisterLink();
			registerPage.sleepInSecond(5);

			log.info("Register-02: enter first name " + firstName);
			registerPage.enterFistNameTextbox(firstName);

			log.info("Register-03: enter last name " + lastName);
			registerPage.enterLastNameTextbox(lastName);

			log.info("Register-04: select date");
			registerPage.selectDate(date);

			log.info("Register-05: select month");
			registerPage.selectMonth(month);

			log.info("Register-06: select year");
			registerPage.selectYear(year);

			log.info("Register-07: enter valid email " + validEmail);
			registerPage.enterEmailTextbox(validEmail);

			log.info("Register-08: enter companyName " + companyName);
			registerPage.enterCompanyNameTextbox(companyName);

			log.info("Register-09: enter password " + invalidPassword);
			registerPage.enterPasswordTextbox(invalidPassword);

			log.info("Register-11: click to register button");
			registerPage.clickToRegisterButton();

			log.info("Register-12: Verify error message" + registerPage.isDisplayedInvalidPasswordMessgae());
			Assert.assertEquals(registerPage.isDisplayedInvalidPasswordMessgae(),
					"Password must meet the following rules:\nmust have at least 6 characters");
		}

		@Test
		public void TC_06_ConfirmPassword_Not_Match_Passwords() {
			log.info("Register-01: Refresh page");
			registerPage.sleepInSecond(5);
			registerPage.refreshPage(driver);

			log.info("Register-02: enter first name " + firstName);
			registerPage.enterFistNameTextbox(firstName);

			log.info("Register-03: enter last name " + lastName);
			registerPage.enterLastNameTextbox(lastName);

			log.info("Register-04: select date");
			registerPage.selectDate(date);

			log.info("Register-05: select month");
			registerPage.selectMonth(month);

			log.info("Register-06: select year");
			registerPage.selectYear(year);

			log.info("Register-07: enter valid email " + validEmail);
			registerPage.enterEmailTextbox(validEmail);

			log.info("Register-08: enter companyName " + companyName);
			registerPage.enterCompanyNameTextbox(companyName);

			log.info("Register-09: enter password " + password);
			registerPage.enterPasswordTextbox(password);

			log.info("Register-10: enter confirm password " + invalidPassword);
			registerPage.enterConfirmPasswordTextbox(invalidPassword);

			log.info("Register-11: click to register button");
			registerPage.clickToRegisterButton();

			log.info("Register-12: Verify error message");
			Assert.assertTrue(registerPage
					.isDisplayedRequireErrorMessage("The password and confirmation password do not match."));
		}

		@AfterClass(alwaysRun = true)
		public void afterClass() {
			closeBrowserAndDriver();
		}

		private WebDriver driver;
		private DataHelper dataFaker;
		String email, firstName, lastName, date, month, year, inValidEmail, companyName, password, invalidPassword,
				validEmail;
		RegisterPageObject registerPage;
		HomePageObject homePage;
	}
}
