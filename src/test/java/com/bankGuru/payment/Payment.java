package com.bankGuru.payment;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;
import utilities.DataHelper;
import commons.BaseTest;
import commons.PageGeneratorManagerBankGuru;
import pageObjects.bankGuru.payment.AddCustomerPageObject;
import pageObjects.bankGuru.payment.LoginPageObject;
import pageObjects.bankGuru.payment.NewAccountPageObject;
import pageObjects.bankGuru.payment.editCustomerPageObject;
import pageObjects.bankGuru.payment.editNewAccountPageObject;
import pageObjects.bankGuru.payment.homePagePageObject;

public class Payment extends BaseTest {
	@Parameters({ "browser", "GuruUrl" })
	@BeforeClass
	public void beforeClass(String browserName, String GuruUrl) {
		username = "mngr439615";
		password = "upeqAgY";
		customerName = "Peter";
		dateOfBirthB = "01/01/1989";
		dateOfBirthA = "1989-01-01";
		address = "123 Peru";
		city = "Tampa";
		state = "FL";
		pin = "466250";
		mobile = "4555442476";
		
		editDate = "2000-01-01";
		editAddress = "123 Paris";
		editCity = "Newyork";
		editState = "CA";
		editPin = "123456";
		editMobile = "4555442999";
		amount = "5000";
		dataFaker = DataHelper.getDataHelper();
		email = dataFaker.getEmailAddress();
		editEmail = dataFaker.getEmailAddress();
		passwordC = dataFaker.getPassword();
		homePageUrl = "https://demo.guru99.com/v4/manager/Managerhomepage.php";
		driver = getBrowserDriver(browserName, GuruUrl);
		loginPage = PageGeneratorManagerBankGuru.getLoginPage(driver);
		log.info("CustomerPage - step 01: input UserID with value is " + username);
		loginPage.inputUserID(username);

		log.info("CustomerPage - step 03: input password with value is " + password);
		loginPage.inputPassword(password);

		log.info("CustomerPage - step 04: Click to login Button");
		homePage = loginPage.clickLoginPage();

	}

	@Test
	public void TC_01_Create_New_Customer() {

		addCustomerPage = homePage.clickToNewCustomerLink();
		log.info("CustomerPage - step 01: input CustomerName with value is " + customerName);
		addCustomerPage.inputCustomerName(customerName);

		log.info("CustomerPage - step 02: input Date of birth with value is " + dateOfBirthB);
		addCustomerPage.inputDateOfBirth(dateOfBirthB, "type");

		log.info("CustomerPage - step 03: input Address with value is " + address);
		addCustomerPage.inputAddress(address);

		log.info("CustomerPage - step 04: input City with value is " + city);
		addCustomerPage.inputCity(city);

		log.info("CustomerPage - step 05: input State with value is " + state);
		addCustomerPage.inputState(state);

		log.info("CustomerPage - step 06: input Pin with value is " + pin);
		addCustomerPage.inputPin(pin);

		log.info("CustomerPage - step 07: input Mobile with value is " + mobile);
		addCustomerPage.inputMobile(mobile);

		log.info("CustomerPage - step 08: input Email with value is " + email);
		addCustomerPage.inputEmail(email);

		log.info("CustomerPage - step 09: input pass with value is " + passwordC);
		addCustomerPage.inputpassword(passwordC);

		log.info("CustomerPage - step 10: Click to Submit Button");
		addCustomerPage.clickToSubmitButton();

		log.info("CustomerPage - step 11: Verify message is shown correct");
		Assert.assertTrue(addCustomerPage.isMessageSuccessDisplayed());

		log.info("CustomerPage - step 12: Get customerID");
		customerID = addCustomerPage.getCustomerID();

		log.info("CustomerPage - step 13: Verify CustomerName with value is " + customerName + " " + customerID);
		Assert.assertTrue(addCustomerPage.isDisplayedWithCustomerName(customerName));

		log.info("CustomerPage - step 14: Verify Date of birth with value is " + dateOfBirthA);
		Assert.assertTrue(addCustomerPage.isDisplayedWithDateOfBirthdate(dateOfBirthA));

		log.info("CustomerPage - step 15: Verify Address with value is " + address);
		Assert.assertTrue(addCustomerPage.isDisplayedWithAddress(address));

		log.info("CustomerPage - step 16: Verify City with value is " + city);
		Assert.assertTrue(addCustomerPage.isDisplayedWithCity(city));

		log.info("CustomerPage - step 17: Verify State with value is " + state);
		Assert.assertTrue(addCustomerPage.isDisplayedWithState(state));

		log.info("CustomerPage - step 18: Verify Pin with value is " + pin);
		Assert.assertTrue(addCustomerPage.isDisplayedWithPin(pin));

		log.info("CustomerPage - step 19: Verify Mobile with value is " + mobile);
		Assert.assertTrue(addCustomerPage.isDisplayedWithMobile(mobile));

		log.info("CustomerPage - step 20: Verify Email with value is " + email);
		Assert.assertTrue(addCustomerPage.isDisplayedWithEmail(email));

	}

	@Test
	public void TC_02_Edit_Customer() {
		log.info("EditCustomer - steps 01 : Click to edit customer link");
		editCustomerPage = addCustomerPage.clickToEditCustomerPage();

		log.info("EditCustomer - steps 02: Enter CustomerID");
		editCustomerPage.enterCustomerID(customerID);

		log.info("EditCustomer - steps 03: Click to submit button");
		editCustomerPage.clickToSubmitPage();

		log.info("CustomerPage - step 04: input Address with value is " + editAddress);
		addCustomerPage.inputAddress(editAddress);

		log.info("CustomerPage - step 05: input City with value is " + editCity);
		addCustomerPage.inputCity(editCity);

		log.info("CustomerPage - step 06: input State with value is " + editState);
		addCustomerPage.inputState(editState);

		log.info("CustomerPage - step 07: input Pin with value is " + editPin);
		addCustomerPage.inputPin(editPin);

		log.info("CustomerPage - step 08: input Mobile with value is " + editMobile);
		addCustomerPage.inputMobile(editMobile);

		log.info("CustomerPage - step 09: Click to Submit Button");
		addCustomerPage.clickToSubmitButton();

	}
	@Test
	public void TC_03_Create_New_Account() {
		log.info("Create New Account - steps 01 : Open url");
	    homePage.acceptAlert();
		
		log.info("Create New Account - steps 02 : click to New account link");
		newAccountPage = homePage.clickToNewAccount();
		
		log.info("Create New Account - steps 03 : Input customer id");
		newAccountPage.enterCustomerID(customerID);
		
		log.info("Create New Account - steps 04 : Input initial deposit");
		newAccountPage.enterAmountDeposit(amount);
		
		log.info("Create New Account - steps 05 : Click to submit");
		newAccountPage.clickToSubmitButton();
		
		log.info("Create New Account - steps 06 : Verify message is displayed that account is created success");
		Assert.assertTrue(newAccountPage.isMessageSuccessDisplayed());
		
		log.info("Create New Account - steps 07 : Currrent Amount is " + amount);
		Assert.assertTrue(newAccountPage.isCurrentAmountDisplayed(amount));
		accountID = newAccountPage.getAccountID();
		log.info("Create New Account - steps 08 : Get Account ID " + accountID);
		
	}
	


	@AfterClass(alwaysRun = true)
	public void afterClass() {
		closeBrowserAndDriver();
	}

	private WebDriver driver;
	private DataHelper dataFaker;
	String username, password, customerName, dateOfBirthB, dateOfBirthA, address, city, state, pin, mobile, email,
			passwordC, editEmail, editCustomerName, editDate, editAddress, editCity, editState, editPin, editMobile,
			homePageUrl, customerID,amount, accountID;
	LoginPageObject loginPage;
	AddCustomerPageObject addCustomerPage;
	homePagePageObject homePage;
	editCustomerPageObject editCustomerPage;
	NewAccountPageObject newAccountPage;
	editNewAccountPageObject editNewAccountPage;

}
