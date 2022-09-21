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
public class Login {
	public class Payment extends BaseTest {
		@Parameters({ "browser", "NopCommerceUrl" })
		@BeforeClass
		public void beforeClass(String browserName, String NopCommerceUrl) {
			invalidEmail = "test122";
			notExistEmail = "test45677@hotmail.com";
			inValidPassword = "123555";
			driver = getBrowserDriver(browserName, NopCommerceUrl);
			homePage = PageGeneratorManagerNopCommerce.getHomePage(driver);
			email = RegisterNopCommercePage.email;
			password = RegisterNopCommercePage.password;
			
		}

		@Test
		public void TC_01_Login_Empty_Data() {
			log.info("Login-Empty-Data-01: Click to login link");
			loginPage = homePage.clickToLoginLink();

			log.info("Login-Empty-Data-02: Click to login button");
			loginPage.clickToLoginButton();

			log.info("Login-Empty-Data-03: Verify error message is shown");
			Assert.assertTrue(loginPage.isErrorMessageDisplay("Please enter your email"));

		}

		@Test
		public void TC_02_Login_Invalid_Email() {
			log.info("Login-Invalid-Email-01: Click to login link");
			loginPage = homePage.clickToLoginLink();

			log.info("Login-Invalid-Email-02: Enter invalid email");
			loginPage.enterEmailTextbox(invalidEmail);

			log.info("Login-Invalid-Email-02: Click to login button");
			loginPage.clickToLoginButton();

			log.info("Login-Invalid-Email-03: Verify error message is shown");
			Assert.assertTrue(loginPage.isErrorMessageDisplay("Wrong email"));

		}
		
		@Test
		public void TC_03_Login_Not_Exists_Email() {
			log.info("Login-Not_Exists_Email-01: Click to login link");
			loginPage = homePage.clickToLoginLink();

			log.info("Login-Not_Exists_Email-02: Enter invalid email");
			loginPage.enterEmailTextbox(notExistEmail);

			log.info("Login-Not_Exists_Email-02: Click to login button");
			loginPage.clickToLoginButton();

			log.info("Login-Not_Exists_Email-03: Verify error message is shown");
			Assert.assertEquals(loginPage.isDisplayedNotExistsEmail(), "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found");

		}
		@Test
		public void TC_04_Login_Without_Password() {
			log.info("Login-Without_Password-01: Click to login link");
			loginPage = homePage.clickToLoginLink();

			log.info("Login-Without_Password-02: Enter  email" + email);
			loginPage.enterEmailTextbox(email);

			log.info("Login-Without_Password-03: Click to login button");
			loginPage.clickToLoginButton();
			
			log.info("Login-Without_Password-04: Verify error message is shown");
			Assert.assertEquals(loginPage.isDisplayedNotExistsEmail(), "Login was unsuccessful. Please correct the errors and try again.\nThe credentials provided are incorrect");

		}
		
		@Test
		public void TC_05_Login_Incorrect_Password() {
			log.info("Login-Incorrect_Password-01: Click to login link");
			loginPage = homePage.clickToLoginLink();

			log.info("Login-Incorrect_Password-02: Enter  email" + email);
			loginPage.enterEmailTextbox(email);
			
			log.info("Login-Incorrect_Password-02: Enter  pass" + inValidPassword);
			loginPage.enterPasswordTextbox(inValidPassword);

			log.info("Login-Incorrect_Password-03: Click to login button");
			loginPage.clickToLoginButton();
			
			log.info("Login-Incorrect_Password-04: Verify error message is shown");
			Assert.assertEquals(loginPage.isDisplayedNotExistsEmail(), "Login was unsuccessful. Please correct the errors and try again.\nThe credentials provided are incorrect");

		}
		
		@Test
		public void TC_06_Login_Success() {
			log.info("Login_Success-01: Click to login link");
			loginPage = homePage.clickToLoginLink();

			log.info("Login-Incorrect_Password-02: Enter  email" + email);
			loginPage.enterEmailTextbox(email);
			
			log.info("Login-Success-02: Enter  pass" + password);
			loginPage.enterPasswordTextbox(password);

			log.info("Login-Success-03: Click to login button");
			loginPage.clickToLoginButton();
			
			log.info("Login-Success-04: Verify displayed my account in home page");
			Assert.assertTrue(loginPage.isDisplayedMyAccount());
			
			
		}

		@AfterClass(alwaysRun = true)
		public void afterClass() {
			closeBrowserAndDriver();
		}

		private WebDriver driver;
		String email, password, invalidEmail, notExistEmail, inValidPassword;
		HomePageObject homePage;
		LoginPageObject loginPage;
	}
}
