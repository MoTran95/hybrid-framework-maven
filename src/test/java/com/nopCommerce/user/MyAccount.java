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
import pageObjects.nopCommerce.user.CatetoryPageObject;
import pageObjects.nopCommerce.user.HomePageObject;
import pageObjects.nopCommerce.user.LoginPageObject;
import pageObjects.nopCommerce.user.MyAccountPageObject;
import pageObjects.nopCommerce.user.ProductDetailsPageObject;
import pageObjects.nopCommerce.user.ProductReviewPageObject;
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
			country = "China";
			state = "Other";
			city = dataFaker.getCity();
			address1 = dataFaker.getAddress();
			address2 = dataFaker.getAddress();
			zip = dataFaker.getZipCode();
			phone = dataFaker.getPhoneNumber();
			fax = dataFaker.getPhoneNumber();
			newPassword = dataFaker.getPassword();
			reviewTitle = "I write title" + randomNumber();
			reviewText = "I write text" + randomNumber();
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
		public void TC_01_Update_Customer_Infor() {
			log.info("Upadte_customer_infor_01: click to my account link");
			myAccountPage = homePage.clickToMyAccountLink();

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

		@Test
		public void TC_02_Add_Address() {
			log.info("Add_Address_01: click to my account link");
			myAccountPage = homePage.clickToMyAccountLink();

			log.info("Add_Address_02: click to addressess link");
			myAccountPage.clickToAddressLink();

			log.info("Add_Address_03: click to add button");
			myAccountPage.clickToAddButton();

			log.info("Add_Address_04: enter firstname textbox " + firstName);
			myAccountPage.enterFistNameAddressTextbox(firstName);

			log.info("Add_Address_05: enter lastname textbox " + lastName);
			myAccountPage.enterLastNameAddressTextbox(lastName);

			log.info("Add_Address_05: enter email textbox " + email);
			myAccountPage.enterEmailAddressTextbox(email);

			log.info("Add_Address_06: enter company textbox " + companyName);
			myAccountPage.enterCompanyAddressTextbox(companyName);

			log.info("Add_Address_07: enter country textbox " + country);
			myAccountPage.selectCountryAddressTextbox(country);

			log.info("Add_Address_08: enter state textbox " + state);
			myAccountPage.selectStateAddressTextbox(state);

			log.info("Add_Address_09: enter city textbox " + city);
			myAccountPage.enterCityAddressTextbox(city);

			log.info("Add_Address_10: enter address1 textbox " + address1);
			myAccountPage.enterAddress1AddressTextbox(address1);

			log.info("Add_Address_11: enter address2 textbox " + address2);
			myAccountPage.enterAddress2AddressTextbox(address2);

			log.info("Add_Address_12: enter zip textbox " + zip);
			myAccountPage.enterZipCodeAddressTextbox(zip);

			log.info("Add_Address_13: enter phone textbox " + phone);
			myAccountPage.enterPhoneAddressTextbox(phone);

			log.info("Add_Address_14: enter fax textbox " + fax);
			myAccountPage.enterFaxAddressTextbox(fax);

			log.info("Add_Address_15: click to save button ");
			myAccountPage.clickToSaveAddressButton();

			log.info("Add_Address_16: Verify name " + firstName + " " + lastName);
			Assert.assertEquals(myAccountPage.getTextInAddressPage(firstName + " " + lastName),
					firstName + " " + lastName);

			log.info("Add_Address_17: Verify email " + email);
			Assert.assertTrue(myAccountPage.getTextInEmailAddressPage(email).contains(email));

			log.info("Add_Address_18: Verify phone " + phone);
			Assert.assertTrue(myAccountPage.getTextInAddressPage(phone).contains(phone));

			log.info("Add_Address_19: Verify fax " + fax);
			Assert.assertTrue(myAccountPage.getTextInAddressPage(fax).contains(fax));

			log.info("Add_Address_20: Verify company " + companyName);
			Assert.assertTrue(myAccountPage.getTextInAddressPage(companyName).contains(companyName));

			log.info("Add_Address_21: Verify add1 " + address1);
			Assert.assertTrue(myAccountPage.getTextInAddressPage(address1).contains(address1));

			log.info("Add_Address_22: Verify add2 " + address2);
			Assert.assertTrue(myAccountPage.getTextInAddressPage(address2).contains(address2));

			log.info("Add_Address_23: Verify city-state-zip " + city + " " + zip);
			Assert.assertTrue(
					myAccountPage.getTextInAddressPage(city + "," + " " + zip).contains(city + "," + " " + zip));

			log.info("Add_Address_24: Verify country " + country);
			Assert.assertTrue(myAccountPage.getTextInAddressPage(country).contains(country));

		}

		@Test
		public void TC_03_Change_Password() {
			log.info("Change_Password_01: click to my account link");
			myAccountPage = homePage.clickToMyAccountLink();

			log.info("Change_Password_02: click to change password link");
			myAccountPage.clickToChangePasswordLink();

			log.info("Change_Password_03: enter old password " + password);
			myAccountPage.enterPasswordTextbox("Old password:", password);

			log.info("Change_Password_04: enter new password " + newPassword);
			myAccountPage.enterPasswordTextbox("New password:", newPassword);

			log.info("Change_Password_05: enter confirm password " + newPassword);
			myAccountPage.enterPasswordTextbox("Confirm password:", newPassword);

			log.info("Change_Password_06: click to change password button");
			myAccountPage.clickToChangePasswordButton();

			log.info("Change_Password_07: click to close button");
			myAccountPage.clickClosePopup();

			log.info("Change_Password_07: click to logout button");
			loginPage = myAccountPage.clickToLogoutButton();

			log.info("Change_Password_08: Click to login link");
			loginPage = homePage.clickToLoginLink();

			log.info("Change_Password_09: Enter  email" + updateEmail);
			loginPage.enterEmailTextbox(updateEmail);

			log.info("Change_Password_10: Enter  pass" + password);
			loginPage.enterPasswordTextbox(password);

			log.info("Change_Password_11: Click to login button");
			loginPage.clickToLoginButton();

			log.info("Change_Password_12: Verify error message is shown");
			Assert.assertEquals(loginPage.isDisplayedNotExistsEmail(),
					"Login was unsuccessful. Please correct the errors and try again.\nThe credentials provided are incorrect");

			log.info("Change_Password_13: Click to login link");
			loginPage = homePage.clickToLoginLink();

			log.info("Change_Password_14: Enter  email" + updateEmail);
			loginPage.enterEmailTextbox(updateEmail);

			log.info("Change_Password_15: Enter  pass" + newPassword);
			loginPage.enterPasswordTextbox(newPassword);

			log.info("Change_Password_16: Click to login button");
			homePage = loginPage.clickToLoginButton();

			log.info("Change_Password_17: Verify displayed my account in home page");
			Assert.assertTrue(homePage.isDisplayedMyAccount());

		}

		@Test
		public void TC_04_My_Product_Review() {
			log.info("My_Product_Review_01: Click to Computer link");
			catetoryPage = homePage.clickToCatetoryProduct("Computers");

			log.info("My_Product_Review_02: Click to Desktops link");
			productDetailsPage = catetoryPage.clickToProductsInCatetory("Show products in category Desktops");

			log.info("My_Product_Review_03: Click to a product");
			productDetailsPage.clickToProduct("Show details for Build your own computer");

			log.info("My_Product_Review_04: Click to add your review link");
			productReviewPage = productDetailsPage.clickToAddYourReview("Add your review");

			log.info("My_Product_Review_05: Enter review title " + reviewTitle);
			productReviewPage.enterReviewTitle(reviewTitle);

			log.info("My_Product_Review_06: Enter review text " + reviewText);
			productReviewPage.enterReviewText(reviewText);

			log.info("My_Product_Review_07: Click to submit button");
			homePage = productReviewPage.clickToSubmitButton();

			log.info("My_Product_Review_08: Click to my account link");
			myAccountPage = homePage.clickToMyAccountLink();

			log.info("My_Product_Review_09: Click to my product review ");
			myAccountPage.clickToMyProductReview();

			log.info("My_Product_Review_10: Verify review title " + reviewTitle);
			Assert.assertTrue(myAccountPage.getVerifyReviewTitle().contains(reviewTitle));

			log.info("My_Product_Review_11: Verify review text " + reviewText);
			Assert.assertTrue(myAccountPage.getVerifyReviewText().contains(reviewText));

		}

		@AfterClass(alwaysRun = true)
		public void afterClass() {
			closeBrowserAndDriver();
		}

		private WebDriver driver;
		private DataHelper dataFaker;
		String email, firstName, lastName, date, month, year, companyName, password, updateEmail, country, state,
				address1, address2, zip, phone, fax, city, newPassword, reviewText, reviewTitle;
		HomePageObject homePage;
		LoginPageObject loginPage;
		MyAccountPageObject myAccountPage;
		CatetoryPageObject catetoryPage;
		ProductDetailsPageObject productDetailsPage;
		ProductReviewPageObject productReviewPage;
	}
}
