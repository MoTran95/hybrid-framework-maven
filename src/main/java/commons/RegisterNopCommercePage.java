package commons;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.nopCommerce.user.HomePageObject;
import pageObjects.nopCommerce.user.RegisterPageObject;
import utilities.DataHelper;

public class RegisterNopCommercePage extends BaseTest {
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
		driver = getBrowserDriver(browserName, NopCommerceUrl);
		homePage = PageGeneratorManagerNopCommerce.getHomePage(driver);

	}

	@Test
	public void TC_01_Register_Success() {
		log.info("Empty-data-01: click to register link");
		registerPage = homePage.clickToRegisterLink();

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

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		closeBrowserAndDriver();
	}

	private WebDriver driver;
	private DataHelper dataFaker;
	String firstName, lastName, date, month, year, companyName;
	public static String email;
	public static String password;
	RegisterPageObject registerPage;
	HomePageObject homePage;
}
